
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

import java.util.Set;

public class OFWparamsStatsRequestVer13 implements OFStatsRequest {
    private static final long DEFAULT_XID = 0L;
    private final static Set<OFStatsRequestFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsRequestFlags>of();

    private long xid = DEFAULT_XID;
    private Set<OFStatsRequestFlags> flags = DEFAULT_FLAGS;
    static final OFWparamsStatsRequestVer13.Reader READER;
    static final OFWparamsStatsRequestVer13.OFWparamsStatsRequestVer13Funnel FUNNEL;
    static final OFWparamsStatsRequestVer13.Writer WRITER;

    OFWparamsStatsRequestVer13(long xid, Set<OFStatsRequestFlags> flags) {
        this.xid = xid;
        this.flags = flags;
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

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    @Override
    public OFStatsRequest.Builder createBuilder() {
        return new OFWparamsStatsRequestVer13.Builder();
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
        READER = new OFWparamsStatsRequestVer13.Reader();
        FUNNEL = new OFWparamsStatsRequestVer13.OFWparamsStatsRequestVer13Funnel();
        WRITER = new OFWparamsStatsRequestVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsStatsRequestVer13> {
        Writer() {
        }

        public void write(ByteBuf bb, OFWparamsStatsRequestVer13 message) {
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
            OFStatsRequestFlagsSerializerVer13.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
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

            //sub type
            sink.putShort((short) OFStatsType.WPARAMS.ordinal());
            OFStatsRequestFlagsSerializerVer13.putTo(message.flags, sink);
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
                        OFWparamsStatsRequestVer13 msg = new OFWparamsStatsRequestVer13(xid, flags);
                        return msg;
                    }
                }
            }
        }
    }

    static class Builder implements OFStatsRequest.Builder {
        private long xid;
        private Set<OFStatsRequestFlags> flags = DEFAULT_FLAGS;
        private boolean flagsSet = true;

        Builder() {
        }

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.TXPOWER_GET_REQUEST;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsStatsRequestVer13.Builder setXid(long xid) {
            this.xid = xid;
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
        public OFStatsRequest.Builder setFlags(Set set) {
            this.flags = set;
            this.flagsSet = true;
            return this;
        }

        public OFWparamsStatsRequestVer13 build() {
            return new OFWparamsStatsRequestVer13(xid, flags);
        }
    }
}

