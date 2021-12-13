
package org.projectfloodlight.openflow.protocol.ver13;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import io.netty.buffer.ByteBuf;
import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.ver13.OFStatsRequestFlagsSerializerVer13;
import org.projectfloodlight.openflow.types.U16;
import org.projectfloodlight.openflow.types.U32;
import org.projectfloodlight.openflow.util.ChannelUtils;
import org.projectfloodlight.openflow.util.FunnelUtils;

import java.util.Arrays;
import java.util.Set;

class OFWparamsStatsRequestVer13 implements OFWparamsStatsRequest {
    private static final long DEFAULT_XID = 0L;
    private final static Set<OFStatsRequestFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsRequestFlags>of();
    private final static OFWparamsStatsType  DEFAULT_WPARMS = OFWparamsStatsType .DEVICES;

    private long xid = DEFAULT_XID;
    private OFWparamsStatsType  wparamsType = DEFAULT_WPARMS;
    private Set<OFStatsRequestFlags> flags = DEFAULT_FLAGS;
    private String targetDevice = null;

    static final OFWparamsStatsRequestVer13.Reader READER;
    static final OFWparamsStatsRequestVer13.OFWparamsStatsRequestVer13Funnel FUNNEL;
    static final OFWparamsStatsRequestVer13.Writer WRITER;

    OFWparamsStatsRequestVer13(long xid, OFWparamsStatsType  wparamsType, String targetDevice) {
        this.xid = xid;
        this.wparamsType = wparamsType;
        this.targetDevice = targetDevice;
    }

    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    public long getXid() {
        return this.xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.WPARAMS;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFWparamsStatsType  getWparamsStatsType () {
        return wparamsType;
    }

    @Override
    public String getTargetDevice() {
        return targetDevice;
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    @Override
    public OFWparamsStatsRequest.Builder createBuilder() {
        return new Builder();
    }

    public static OFMessage.Builder builder() {
        return new OFWparamsStatsRequestVer13.Builder();
    }

    public String toString() {
        StringBuilder b = new StringBuilder("OFWparamsStatsRequestVer13(");
        b.append("xid=").append(this.xid);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OFWparamsStatsRequestVer13 that = (OFWparamsStatsRequestVer13) o;
        return xid == that.xid;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFWparamsStatsRequestVer13 other = (OFWparamsStatsRequestVer13) obj;

        // ignore XID
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 31 * (int) (this.xid ^ this.xid >>> 32);
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        return this.hashCode();
    }

    static {
        READER = new OFWparamsStatsRequestVer13.Reader();
        FUNNEL = new OFWparamsStatsRequestVer13.OFWparamsStatsRequestVer13Funnel();
        WRITER = new OFWparamsStatsRequestVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsStatsRequestVer13> {
        public void write(ByteBuf bb, OFWparamsStatsRequestVer13 message) {
            int startIndex = bb.writerIndex();
            // versiosn openflow 1.3
            bb.writeByte(4);
            // of type : 18
            bb.writeByte(18);
            // length = 16 + 21 + 3 = 37
            bb.writeShort(40);
            // xid
            bb.writeInt(U32.t(message.xid));
            // subType = WPARAMS
            bb.writeShort(21);
            OFStatsRequestFlagsSerializerVer13.writeTo(bb, message.flags);
            // pad: 3 bytes
            bb.writeZero(4);
            // wparamsType
            bb.writeByte(message.wparamsType.ordinal());
            // targetDevice
            if (message.targetDevice == null){
                byte []bytes = new byte[20];
                Arrays.fill(bytes, (byte) 0);
                bb.writeBytes(bytes);
            }else{
                try {
                    byte []bytes = message.targetDevice.getBytes("UTF-8");
                    bb.writeBytes(Arrays.copyOf(bytes, 20));
                }catch (Exception e){
                    byte []bytes = new byte[20];
                    Arrays.fill(bytes, (byte) 0);
                    bb.writeBytes(bytes);
                }
            }
            // pad: 3 bytes
            bb.writeZero(3);
        }
    }

    static class OFWparamsStatsRequestVer13Funnel implements Funnel<OFWparamsStatsRequestVer13> {
        private static final long serialVersionUID = 1L;

        OFWparamsStatsRequestVer13Funnel() {
        }

        public void funnel(OFWparamsStatsRequestVer13 message, PrimitiveSink sink) {
            //Openflow Version = 0x4 = Openflow 1.3
            sink.putByte((byte) 4);

            //Openflow Type =  Openflow Type
            sink.putByte((byte) 18);

            //length = 16
            sink.putShort((short) 16);

            //xid
            sink.putLong(message.xid);

            //sub type : OFStatsType.WPARAMS.ordinal()
            sink.putShort((short) 21);
            OFStatsRequestFlagsSerializerVer13.putTo(message.flags, sink);
            sink.putByte((byte) message.wparamsType.ordinal());
        }
    }

    static class Reader implements OFMessageReader<OFWparamsStatsRequestVer13> {
        Reader() {
        }

        public OFWparamsStatsRequestVer13 readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            byte version = bb.readByte();
            if (version != 4) {
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got=" + version);
            } else {
                byte type = bb.readByte();
                if (type != 18) {
                    throw new OFParseError("Wrong type: Expected=OFType.STATS_REQUEST(" + OFType.STATS_REQUEST.ordinal() + "), got=" + type);
                } else {
                    int length = U16.f(bb.readShort());
                    if (length != 16) {
                        throw new OFParseError("Wrong length: Expected=16(16), got: " + length);
                    } else if (bb.readableBytes() + (bb.readerIndex() - start) < length) {
                        bb.readerIndex(start);
                        return null;
                    } else {
                        long xid = U32.f(bb.readInt());
                        short statsType = bb.readShort();
                        if (statsType != OFStatsType.WPARAMS.ordinal())
                            throw new OFParseError("Wrong statsType: Expected=OFStatsType.WPARAMS(22), got=" + statsType);
                        Set<OFStatsRequestFlags> flags = OFStatsRequestFlagsSerializerVer13.readFrom(bb);
                        bb.skipBytes(4);

                        byte wparmsType = bb.readByte();
                        if (!(OFWparamsStatsType .DEVICES.ordinal() <= wparmsType && wparmsType <= OFWparamsStatsType .INFOS.ordinal()))
                            throw new OFParseError("Wrong wparamsType: got=" + wparmsType);

                        String targetDevice = null;
                        if (wparmsType != OFWparamsStatsType .DEVICES.ordinal()) {
                            byte[] bytes = new byte[20];
                            bb.readBytes(bytes);
                            try{
                                targetDevice = new String(bytes, "UTF-8");
                                return new OFWparamsStatsRequestVer13(xid, OFWparamsStatsType .values()[wparmsType], targetDevice);
                            }catch (Exception e){
                                throw new OFParseError("Wrong targetDevice="+e.toString());
                            }
                        }else{
                            return new OFWparamsStatsRequestVer13(xid, OFWparamsStatsType .values()[wparmsType], null);
                        }
                    }
                }
            }
        }
    }

    static class Builder implements OFWparamsStatsRequest.Builder {
        private long xid;
        private boolean xidSet;
        private Set<OFStatsRequestFlags> flags = DEFAULT_FLAGS;
        private boolean flagsSet = true;
        private OFWparamsStatsType  wparamsType = DEFAULT_WPARMS;
        private String targetDevice = null;

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.STATS_REQUEST;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsStatsRequestVer13.Builder setXid(long xid) {
            this.xid = xid;
            this.xidSet = true;
            return this;
        }

        @Override
        public OFStatsType getStatsType() {
            return OFStatsType.WPARAMS;
        }

        @Override
        public Set<OFStatsRequestFlags> getFlags() {
            return flags;
        }

        @Override
        public OFWparamsStatsType  getWparamsStatsType () {
            return wparamsType;
        }

        @Override
        public OFWparamsStatsRequest.Builder setWparamsStatsType (OFWparamsStatsType  wparamsType) {
            this.wparamsType = wparamsType;
            return this;
        }

        @Override
        public String getTargetDevice() {
            return targetDevice;
        }

        @Override
        public OFWparamsStatsRequest.Builder setTargetDevice(String deviceName) {
            this.targetDevice = deviceName;
            return this;
        }

        @Override
        public OFWparamsStatsRequest.Builder setFlags(Set set) {
            this.flags = set;
            this.flagsSet = true;
            return this;
        }

        public OFWparamsStatsRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if (flags == null)
                throw new NullPointerException("Property flags must not be null");

            return new OFWparamsStatsRequestVer13(xid, wparamsType, targetDevice);
        }
    }
}

