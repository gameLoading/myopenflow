
package org.projectfloodlight.openflow.protocol.ver13;

import com.google.common.collect.ImmutableSet;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import io.netty.buffer.ByteBuf;
import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.types.U16;
import org.projectfloodlight.openflow.types.U32;

import java.util.Set;

public class OFWparamsGetConfigReplyVer13 implements OFWparamsGetConfigReply {
    private static final long DEFAULT_XID = 0L;
    private long xid = DEFAULT_XID;
    private String data = null;

    static final OFWparamsGetConfigReplyVer13.Reader READER;
    static final OFWparamsGetConfigReplyVer13.OFWparamsGetConfigReplyVer13Funnel FUNNEL;
    static final OFWparamsGetConfigReplyVer13.Writer WRITER;

    OFWparamsGetConfigReplyVer13(long xid, String data) {
        this.xid = xid;
        this.data = data;
    }

    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    public OFType getType() {
        return OFType.WPARAMS_GET_CONFIG_REPLY;
    }

    public long getXid() {
        return this.xid;
    }

    public String getData() { return this.data; }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }
    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    @Override
    public OFWparamsGetConfigReply.Builder createBuilder() {
        return new Builder();
    }

    public static OFMessage.Builder builder() {
        return new OFWparamsGetConfigReplyVer13.Builder();
    }

    public String toString() {
        StringBuilder b = new StringBuilder("OFWparamsGetConfigReplyVer13(");
        b.append("xid=").append(this.xid);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OFWparamsGetConfigReplyVer13 that = (OFWparamsGetConfigReplyVer13) o;
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
        READER = new OFWparamsGetConfigReplyVer13.Reader();
        FUNNEL = new OFWparamsGetConfigReplyVer13.OFWparamsGetConfigReplyVer13Funnel();
        WRITER = new OFWparamsGetConfigReplyVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsGetConfigReplyVer13> {
        Writer() {
        }

        public void write(ByteBuf bb, OFWparamsGetConfigReplyVer13 message) {
            int startIndex = bb.writerIndex();
            // versiosn openflow 1.3
            bb.writeByte(4);
            // of type : 18
            bb.writeByte(40);
            // length = 16
            bb.writeShort(16);
            // xid
            bb.writeInt(U32.t(message.xid));
        }
    }

    static class OFWparamsGetConfigReplyVer13Funnel implements Funnel<OFWparamsGetConfigReplyVer13> {
        private static final long serialVersionUID = 1L;

        OFWparamsGetConfigReplyVer13Funnel() {
        }

        public void funnel(OFWparamsGetConfigReplyVer13 message, PrimitiveSink sink) {
            //Openflow Version = 0x4 = Openflow 1.3
            sink.putByte((byte) 4);

            //Openflow Type =  Openflow Type
            sink.putByte((byte) 40);

            //length = 16
            sink.putShort((short) 16);

            //xid
            sink.putLong(message.xid);

            //sub type
            sink.putShort((short) OFStatsType.WPARAMS.ordinal());
        }
    }

    static class Reader implements OFMessageReader<OFWparamsGetConfigReplyVer13> {
        Reader() {
        }

        public OFWparamsGetConfigReplyVer13 readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            byte version = bb.readByte();
            if (version != 4) {
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got=" + version);
            } else {
                byte type = bb.readByte();
                if (type != 40) {
                    throw new OFParseError("Wrong type: Expected=OFType.WPARAMS_GET_CONFIG_REPLY("+40+"), got=" + type);
                } else {
                    int length = U16.f(bb.readShort());
                    if (length <= 16) {
                        throw new OFParseError("Wrong length: Expected=16(16), got: " + length);
                    } else if (bb.readableBytes() + (bb.readerIndex() - start) < length) {
                        bb.readerIndex(start);
                        return null;
                    } else {
                        long xid = U32.f(bb.readInt());
                        byte[] bytes = new byte[bb.readableBytes()];
                        bb.readBytes(bytes);
                        try{
                            String data = new String(bytes, "UTF-8");
                            OFWparamsGetConfigReplyVer13 msg = new OFWparamsGetConfigReplyVer13(xid, data);
                            return msg;
                        }catch (Exception e){
                            throw new OFParseError("Wrong data: "+e.toString());
                        }

                    }
                }
            }
        }
    }

    static class Builder implements OFWparamsGetConfigReply.Builder {
        private long xid;
        private String data = "";

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.WPARAMS_GET_CONFIG_REPLY;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsGetConfigReplyVer13.Builder setXid(long xid) {
            this.xid = xid;
            return this;
        }

        public void setData(String data){
            this.data = data;
        }

        public OFWparamsGetConfigReplyVer13 build() {
            return new OFWparamsGetConfigReplyVer13(xid, data);
        }
    }
}
