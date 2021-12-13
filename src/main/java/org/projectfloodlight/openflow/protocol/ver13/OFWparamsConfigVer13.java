
package org.projectfloodlight.openflow.protocol.ver13;

import com.google.common.collect.ImmutableSet;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import io.netty.buffer.ByteBuf;
import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.types.U16;
import org.projectfloodlight.openflow.types.U32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class OFWparamsConfigVer13 implements OFWparamsConfig {
    private static final long DEFAULT_XID = 0L;
    private static final String DEFAULT_DEVICE = null;

    private long xid = DEFAULT_XID;
    private String targetDevice = DEFAULT_DEVICE;
    private HashMap<OFWparamsConfigType, String> tlvList;

    static final OFWparamsConfigVer13.Reader READER;
    static final OFWparamsConfigVer13.OFWparamsConfigVer13Funnel FUNNEL;
    static final OFWparamsConfigVer13.Writer WRITER;

    OFWparamsConfigVer13(long xid, String targetDevice, HashMap<OFWparamsConfigType, String> tlvList) {
        this.xid = xid;
        this.targetDevice = targetDevice;
        this.tlvList = new HashMap<>(tlvList);
    }

    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    public OFType getType() {
        return OFType.WPARAMS_SET_CONFIG;
    }

    public long getXid() {
        return this.xid;
    }

    @Override
    public String getTargetDevice() {
        return targetDevice;
    }

    @Override
    public String getWparamsConfigType(OFWparamsConfigType wparamsType) {
        return tlvList.containsKey(wparamsType) ? tlvList.get(wparamsType) : null;
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }
    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    @Override
    public OFWparamsConfig.Builder createBuilder() {
        return new Builder();
    }

    public static OFMessage.Builder builder() {
        return new OFWparamsConfigVer13.Builder();
    }

    public HashMap<OFWparamsConfigType, String> getTlvList() {
        return tlvList;
    }

    public String toString() {
        StringBuilder b = new StringBuilder("OFWparamsConfigReplyVer13(");
        b.append("xid=").append(this.xid);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OFWparamsConfigVer13 that = (OFWparamsConfigVer13) o;
        return xid == that.xid;
    }

    public boolean equalsIgnoreXid(Object obj) {
        return this.equals(obj);
    }

    public int hashCode() {
        int result = 31 * (int) (this.xid ^ this.xid >>> 32);
        return result;
    }

    public int hashCodeIgnoreXid() {
        return this.hashCode();
    }

    static {
        READER = new OFWparamsConfigVer13.Reader();
        FUNNEL = new OFWparamsConfigVer13.OFWparamsConfigVer13Funnel();
        WRITER = new OFWparamsConfigVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsConfigVer13> {
        Writer() {
        }

        public void write(ByteBuf bb, OFWparamsConfigVer13 message) {

            // write : device

            byte []bytes = new byte[20];
            if (message.targetDevice == null){
                Arrays.fill(bytes, (byte) 0);
            }else{
                try {
                    bytes = message.targetDevice.getBytes("UTF-8");
                    bytes = Arrays.copyOf(bytes, 20);
                }catch (Exception e){
                    bytes = new byte[20];
                    Arrays.fill(bytes, (byte) 0);
                }
            }

            HashMap<OFWparamsConfigType, String> tlvList = message.getTlvList();

            int tlvLength = 0;
            for (OFWparamsConfigType type : tlvList.keySet()){
                String value = tlvList.get(type);
                try {
                    byte []valueOfByte = value.getBytes("UTF-8");
//                    bb.writeByte(type.ordinal());
//                    bb.writeShort(valueOfByte.length);
//                    bb.writeBytes(valueOfByte.bytes);
                    tlvLength += 1+2+valueOfByte.length;
                }catch (Exception e){
                    e.printStackTrace();
                    continue;
                }
            }

            int startIndex = bb.writerIndex();
            // versiosn openflow 1.3
            bb.writeByte(4);
            // of type : 38
            bb.writeByte(38);
            // length = 16
            int lpad = tlvLength%8==0 ? 0 : 8-(tlvLength%8);
            bb.writeShort(8+24+tlvLength+lpad);
            // xid
            bb.writeInt(U32.t(message.xid));
            // targetDeviceName
            bb.writeBytes(bytes);
            // padding
            bb.writeZero(4);

            for (OFWparamsConfigType type : tlvList.keySet()){
                String value = tlvList.get(type);
                try {
                    byte []valueOfByte = value.getBytes("UTF-8");
                    bb.writeByte(type.ordinal());
                    bb.writeShort(valueOfByte.length);
                    bb.writeBytes(valueOfByte);
                }catch (Exception e){
                    e.printStackTrace();
                    continue;
                }
            }
            bb.writeZero(lpad);
        }
    }

    static class OFWparamsConfigVer13Funnel implements Funnel<OFWparamsConfigVer13> {
        private static final long serialVersionUID = 1L;

        OFWparamsConfigVer13Funnel() {
        }

        public void funnel(OFWparamsConfigVer13 message, PrimitiveSink sink) {
            //Openflow Version = 0x4 = Openflow 1.3
            sink.putByte((byte) 4);

            //Openflow Type =  Openflow Type
            sink.putByte((byte) 18);

            //length = 16
            sink.putShort((short) 16);

            //xid
            sink.putLong(message.xid);
        }
    }

    static class Reader implements OFMessageReader<OFWparamsConfigVer13> {
        Reader() {
        }

        public OFWparamsConfigVer13 readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            byte version = bb.readByte();
            if (version != 4) {
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got=" + version);
            } else {
                byte type = bb.readByte();
                if (type != 19) {
                    throw new OFParseError("Wrong type: Expected=OFType.WPARAMS_SET_CONFIG("+38+"), got=" + type);
                } else {
                    int length = U16.f(bb.readShort());
                    if (length <= 16) {
                        throw new OFParseError("Wrong length: Expected=16(16), got: " + length);
                    } else if (bb.readableBytes() + (bb.readerIndex() - start) < length) {
                        bb.readerIndex(start);
                        return null;
                    } else {
                        long xid = U32.f(bb.readInt());
                        OFWparamsConfigVer13 msg = new OFWparamsConfigVer13(xid, null, null);
                        return msg;
                    }
                }
            }
        }
    }

    static class Builder implements OFWparamsConfig.Builder {
        private long xid;
        private String targetDevice = "";
        private HashMap<OFWparamsConfigType, String> tlvList = new HashMap<>();

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.WPARAMS_SET_CONFIG;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsConfigVer13.Builder setXid(long xid) {
            this.xid = xid;
            return this;
        }

        @Override
        public String getWparamsConfigType(OFWparamsConfigType wparamsType) {
            return tlvList.containsKey(wparamsType) ? tlvList.get(wparamsType) : null;
        }

        @Override
        public OFWparamsConfig.Builder setWparamsConfigType(OFWparamsConfigType wparamsType, String value) {
            tlvList.put(wparamsType, value);
            return this;
        }

        @Override
        public String getTargetDevice() {
            return targetDevice;
        }

        @Override
        public OFWparamsConfig.Builder setTargetDevice(String deviceName) {
            this.targetDevice = deviceName;
            return this;
        }

        public OFWparamsConfigVer13 build() {
//            if (targetDevice == null) throw new Exception("3333");
            return new OFWparamsConfigVer13(xid, targetDevice, tlvList);
        }
    }
}
