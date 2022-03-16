
package org.projectfloodlight.openflow.protocol.ver13;

import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;
import io.netty.buffer.ByteBuf;
import org.projectfloodlight.openflow.exceptions.OFParseError;
import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.types.U16;
import org.projectfloodlight.openflow.types.U32;

import java.util.Arrays;
import java.util.HashMap;

public class OFWparamsGetConfigRequestVer13 implements OFWparamsGetConfigRequest {
    private static final long DEFAULT_XID = 0L;

    private long xid = DEFAULT_XID;

    static final OFWparamsGetConfigRequestVer13.Reader READER;
    static final OFWparamsGetConfigRequestVer13.OFWparamsGetConfigRequestVer13Funnel FUNNEL;
    static final OFWparamsGetConfigRequestVer13.Writer WRITER;

    OFWparamsGetConfigRequestVer13(long xid) {
        this.xid = xid;
    }

    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    public OFType getType() {
        return OFType.WPARAMS_GET_CONFIG_REQUEST;
    }

    public long getXid() {
        return this.xid;
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }
    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    @Override
    public OFWparamsGetConfigRequest.Builder createBuilder() {
        return new Builder();
    }

    public static OFMessage.Builder builder() {
        return new OFWparamsGetConfigRequestVer13.Builder();
    }

    public String toString() {
        StringBuilder b = new StringBuilder("OFWparamsGetConfigRequestReplyVer13(");
        b.append("xid=").append(this.xid);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OFWparamsGetConfigRequestVer13 that = (OFWparamsGetConfigRequestVer13) o;
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
        READER = new OFWparamsGetConfigRequestVer13.Reader();
        FUNNEL = new OFWparamsGetConfigRequestVer13.OFWparamsGetConfigRequestVer13Funnel();
        WRITER = new OFWparamsGetConfigRequestVer13.Writer();
    }

    static class Writer implements OFMessageWriter<OFWparamsGetConfigRequestVer13> {
        Writer() {
        }

        public void write(ByteBuf bb, OFWparamsGetConfigRequestVer13 message) {
            int startIndex = bb.writerIndex();
            // versiosn openflow 1.3
            bb.writeByte(4);
            // of type : 39
            bb.writeByte(39);
            // length = 16
            bb.writeShort(16);
            // xid
            bb.writeInt(U32.t(message.xid));
        }
    }

    static class OFWparamsGetConfigRequestVer13Funnel implements Funnel<OFWparamsGetConfigRequestVer13> {
        private static final long serialVersionUID = 1L;

        OFWparamsGetConfigRequestVer13Funnel() {
        }

        public void funnel(OFWparamsGetConfigRequestVer13 message, PrimitiveSink sink) {
            //Openflow Version = 0x4 = Openflow 1.3
            sink.putByte((byte) 4);

            //Openflow Type =  Openflow Type
            sink.putByte((byte) 39);

            //length = 16
            sink.putShort((short) 16);

            //xid
            sink.putLong(message.xid);
        }
    }

    static class Reader implements OFMessageReader<OFWparamsGetConfigRequestVer13> {
        Reader() {
        }

        public OFWparamsGetConfigRequestVer13 readFrom(ByteBuf bb) throws OFParseError {
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
                        OFWparamsGetConfigRequestVer13 msg = new OFWparamsGetConfigRequestVer13(xid);
                        return msg;
                    }
                }
            }
        }
    }

    static class Builder implements OFWparamsGetConfigRequest.Builder {
        private long xid;
        private String targetDevice = "";

        public OFVersion getVersion() {
            return OFVersion.OF_13;
        }

        public OFType getType() {
            return OFType.WPARAMS_GET_CONFIG_REQUEST;
        }

        public long getXid() {
            return this.xid;
        }

        public OFWparamsGetConfigRequestVer13.Builder setXid(long xid) {
            this.xid = xid;
            return this;
        }

        public OFWparamsGetConfigRequestVer13 build() {
//            if (targetDevice == null) throw new Exception("3333");
            return new OFWparamsGetConfigRequestVer13(xid);
        }
    }
}
