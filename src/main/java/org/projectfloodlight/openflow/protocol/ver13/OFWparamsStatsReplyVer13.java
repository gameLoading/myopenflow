
package org.projectfloodlight.openflow.protocol.ver13;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import io.netty.buffer.ByteBuf;
import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.ver13.OFStatsReplyFlagsSerializerVer13;
import org.projectfloodlight.openflow.types.U16;
import org.projectfloodlight.openflow.types.U32;
import org.projectfloodlight.openflow.util.ChannelUtils;
import org.projectfloodlight.openflow.util.FunnelUtils;

import java.util.Set;

public class OFWparamsStatsReplyVer13 implements OFWparamsStatsReply {
    private static final long DEFAULT_XID = 0L;
    private final static Set<OFStatsReplyFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsReplyFlags>of();
    private final static OFWparamsStatsType DEFAULT_WPARMS = OFWparamsStatsType .DEVICES;

    private long xid = DEFAULT_XID;
    private Set<OFStatsReplyFlags> flags = DEFAULT_FLAGS;
    private String data = null;
    private OFWparamsStatsType wparamsType = DEFAULT_WPARMS;
    private String targetDevice = null;

    static final OFWparamsStatsReplyVer13.Reader READER;
    static final OFWparamsStatsReplyVer13.OFWparamsStatsReplyVer13Funnel FUNNEL;
    static final OFWparamsStatsReplyVer13.Writer WRITER;

    OFWparamsStatsReplyVer13(long xid, OFWparamsStatsType wparamsType, String targetDevice, String data) {
        this.xid = xid;
        this.flags = flags;
        this.wparamsType = wparamsType;
        this.targetDevice = targetDevice;
        this.data = new String(data);
    }

    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    public long getXid() {
        return this.xid;
    }

    public String getData() { return this.data; }

    @Override
    public OFStatsType getStatsType() { return OFStatsType.WPARAMS; }
    
    @Override
    public Set<OFStatsReplyFlags> getFlags() { return flags; }

    @Override
    public OFWparamsStatsType getWparamsStatsType () {
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
    public OFWparamsStatsReply.Builder createBuilder() {
        return new Builder();
    }

    public static OFMessage.Builder builder() {
        return new OFWparamsStatsReplyVer13.Builder();
    }

    public String toString() {
        StringBuilder b = new StringBuilder("OFWparamsStatsReplyVer13(");
        b.append("xid=").append(this.xid);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OFWparamsStatsReplyVer13 that = (OFWparamsStatsReplyVer13) o;
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
        READER = new OFWparamsStatsReplyVer13.Reader();
        FUNNEL = new OFWparamsStatsReplyVer13.OFWparamsStatsReplyVer13Funnel();
        WRITER = new OFWparamsStatsReplyVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsStatsReplyVer13> {
        Writer() {
        }

        public void write(ByteBuf bb, OFWparamsStatsReplyVer13 message) {
            int startIndex = bb.writerIndex();
            // versiosn openflow 1.3
            bb.writeByte(4);
            // of type : 18
            bb.writeByte(18);
            // length = 16
            bb.writeShort(16);
            // xid
            bb.writeInt(U32.t(message.xid));
            // subType = WPARAMS
            bb.writeShort(OFStatsType.WPARAMS.ordinal());
            OFStatsReplyFlagsSerializerVer13.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
        }
    }

    static class OFWparamsStatsReplyVer13Funnel implements Funnel<OFWparamsStatsReplyVer13> {
        private static final long serialVersionUID = 1L;

        OFWparamsStatsReplyVer13Funnel() {
        }

        public void funnel(OFWparamsStatsReplyVer13 message, PrimitiveSink sink) {
            //Openflow Version = 0x4 = Openflow 1.3
            sink.putByte((byte) 4);

            //Openflow Type =  Openflow Type
            sink.putByte((byte) 18);

            //length = 16
            sink.putShort((short) 16);

            //xid
            sink.putLong(message.xid);

            //sub type
            sink.putShort((short) OFStatsType.WPARAMS.ordinal());
            OFStatsReplyFlagsSerializerVer13.putTo(message.flags, sink);
        }
    }

    static class Reader implements OFMessageReader<OFWparamsStatsReplyVer13> {
        Reader() {
        }

        public OFWparamsStatsReplyVer13 readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            byte version = bb.readByte();
            if (version != 4) {
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got=" + version);
            } else {
                byte type = bb.readByte();
                if (type != 19) {
                    throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY("+19+"), got=" + type);
                } else {
                    int length = U16.f(bb.readShort());
                    if (length <= 16) {
                        throw new OFParseError("Wrong length: Expected=16(16), got: " + length);
                    } else if (bb.readableBytes() + (bb.readerIndex() - start) < length) {
                        bb.readerIndex(start);
                        return null;
                    } else {
                        long xid = U32.f(bb.readInt());
                        short statsType = bb.readShort();
                        if(statsType != 21)
                            throw new OFParseError("Wrong statsType: Expected=OFStatsType.WPARAMS(21), got="+statsType);
                        Set<OFStatsReplyFlags> flags = OFStatsReplyFlagsSerializerVer13.readFrom(bb);
                        bb.skipBytes(4);
                        byte wparmsType = bb.readByte();
                        if (!(OFWparamsStatsType .DEVICES.ordinal() <= wparmsType && wparmsType <= OFWparamsStatsType.SURVEY.ordinal()))
                            throw new OFParseError("Wrong wparamsType: got=" + wparmsType);

                        String targetDevice = null;
                        if (wparmsType != OFWparamsStatsType .DEVICES.ordinal()) {
                            byte[] bytes = new byte[20];
                            bb.readBytes(bytes);
                            try{
                                targetDevice = new String(bytes, "UTF-8");
                            }catch (Exception e){
                                throw new OFParseError("Wrong targetDevice: "+e.toString());
                            }
                        }

                        byte[] bytes = new byte[bb.readableBytes()];
                        bb.readBytes(bytes);
                        try{
                            String data = new String(bytes, "UTF-8");
                            OFWparamsStatsReplyVer13 msg = new OFWparamsStatsReplyVer13(xid, OFWparamsStatsType.values()[wparmsType], targetDevice, data);
                            return msg;
                        }catch (Exception e){
                            throw new OFParseError("Wrong data: "+e.toString());
                        }

                    }
                }
            }
        }
    }

    static class Builder implements OFWparamsStatsReply.Builder {
        private long xid;
        private Set<OFStatsReplyFlags> flags = DEFAULT_FLAGS;
        private boolean flagsSet = true;
        private OFWparamsStatsType wparamsType = DEFAULT_WPARMS;
        private String targetDevice = "";
        private String data = "";

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.STATS_REPLY;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsStatsReplyVer13.Builder setXid(long xid) {
            this.xid = xid;
            return this;
        }

        @Override
        public OFStatsType getStatsType() {
            return OFStatsType.WPARAMS;
        }

        @Override
        public Set<OFStatsReplyFlags> getFlags() {
            return flags;
        }

        @Override
        public OFWparamsStatsType getWparamsStatsType () { return wparamsType; }

        @Override
        public Builder setWparamsStatsType (OFWparamsStatsType wparamsType) {
            this.wparamsType = wparamsType;
            return this;
        }

        @Override
        public String getTargetDevice() {
            return null;
        }

        @Override
        public OFWparamsStatsReply.Builder setTargetDevice(String deviceName) {
            return null;
        }

        @Override
        public Builder setFlags(Set set) {
            this.flags = set;
            this.flagsSet = true;
            return this;
        }

        public void setData(String data){
            this.data = data;
        }

        public OFWparamsStatsReplyVer13 build() {
            return new OFWparamsStatsReplyVer13(xid, wparamsType, targetDevice, data);
        }
    }
}
