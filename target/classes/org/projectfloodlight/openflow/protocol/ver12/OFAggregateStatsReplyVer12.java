// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFAggregateStatsReplyVer12 implements OFAggregateStatsReply {
    private static final Logger logger = LoggerFactory.getLogger(OFAggregateStatsReplyVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 40;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsReplyFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsReplyFlags>of();
        private final static U64 DEFAULT_PACKET_COUNT = U64.ZERO;
        private final static U64 DEFAULT_BYTE_COUNT = U64.ZERO;
        private final static long DEFAULT_FLOW_COUNT = 0x0L;

    // OF message fields
    private final long xid;
    private final Set<OFStatsReplyFlags> flags;
    private final U64 packetCount;
    private final U64 byteCount;
    private final long flowCount;
//
    // Immutable default instance
    final static OFAggregateStatsReplyVer12 DEFAULT = new OFAggregateStatsReplyVer12(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_PACKET_COUNT, DEFAULT_BYTE_COUNT, DEFAULT_FLOW_COUNT
    );

    // package private constructor - used by readers, builders, and factory
    OFAggregateStatsReplyVer12(long xid, Set<OFStatsReplyFlags> flags, U64 packetCount, U64 byteCount, long flowCount) {
        if(flags == null) {
            throw new NullPointerException("OFAggregateStatsReplyVer12: property flags cannot be null");
        }
        if(packetCount == null) {
            throw new NullPointerException("OFAggregateStatsReplyVer12: property packetCount cannot be null");
        }
        if(byteCount == null) {
            throw new NullPointerException("OFAggregateStatsReplyVer12: property byteCount cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.packetCount = packetCount;
        this.byteCount = byteCount;
        this.flowCount = flowCount;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public long getFlowCount() {
        return flowCount;
    }

    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.2");
    }



    public OFAggregateStatsReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFAggregateStatsReply.Builder {
        final OFAggregateStatsReplyVer12 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean flowCountSet;
        private long flowCount;

        BuilderWithParent(OFAggregateStatsReplyVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAggregateStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFAggregateStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public long getFlowCount() {
        return flowCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setFlowCount(long flowCount) {
        this.flowCount = flowCount;
        this.flowCountSet = true;
        return this;
    }
    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.2");
    }

    @Override
    public OFAggregateStatsReply.Builder setStats(Stat stats) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property stats not supported in version 1.2");
    }


        @Override
        public OFAggregateStatsReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                U64 packetCount = this.packetCountSet ? this.packetCount : parentMessage.packetCount;
                if(packetCount == null)
                    throw new NullPointerException("Property packetCount must not be null");
                U64 byteCount = this.byteCountSet ? this.byteCount : parentMessage.byteCount;
                if(byteCount == null)
                    throw new NullPointerException("Property byteCount must not be null");
                long flowCount = this.flowCountSet ? this.flowCount : parentMessage.flowCount;

                //
                return new OFAggregateStatsReplyVer12(
                    xid,
                    flags,
                    packetCount,
                    byteCount,
                    flowCount
                );
        }

    }

    static class Builder implements OFAggregateStatsReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean packetCountSet;
        private U64 packetCount;
        private boolean byteCountSet;
        private U64 byteCount;
        private boolean flowCountSet;
        private long flowCount;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFAggregateStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.AGGREGATE;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFAggregateStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public U64 getPacketCount() {
        return packetCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setPacketCount(U64 packetCount) {
        this.packetCount = packetCount;
        this.packetCountSet = true;
        return this;
    }
    @Override
    public U64 getByteCount() {
        return byteCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setByteCount(U64 byteCount) {
        this.byteCount = byteCount;
        this.byteCountSet = true;
        return this;
    }
    @Override
    public long getFlowCount() {
        return flowCount;
    }

    @Override
    public OFAggregateStatsReply.Builder setFlowCount(long flowCount) {
        this.flowCount = flowCount;
        this.flowCountSet = true;
        return this;
    }
    @Override
    public Stat getStats()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property stats not supported in version 1.2");
    }

    @Override
    public OFAggregateStatsReply.Builder setStats(Stat stats) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property stats not supported in version 1.2");
    }
//
        @Override
        public OFAggregateStatsReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            U64 packetCount = this.packetCountSet ? this.packetCount : DEFAULT_PACKET_COUNT;
            if(packetCount == null)
                throw new NullPointerException("Property packetCount must not be null");
            U64 byteCount = this.byteCountSet ? this.byteCount : DEFAULT_BYTE_COUNT;
            if(byteCount == null)
                throw new NullPointerException("Property byteCount must not be null");
            long flowCount = this.flowCountSet ? this.flowCount : DEFAULT_FLOW_COUNT;


            return new OFAggregateStatsReplyVer12(
                    xid,
                    flags,
                    packetCount,
                    byteCount,
                    flowCount
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFAggregateStatsReply> {
        @Override
        public OFAggregateStatsReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 3
            byte version = bb.readByte();
            if(version != (byte) 0x3)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_12(3), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 40)
                throw new OFParseError("Wrong length: Expected=40(40), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property statsType == 2
            short statsType = bb.readShort();
            if(statsType != (short) 0x2)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.AGGREGATE(2), got="+statsType);
            Set<OFStatsReplyFlags> flags = OFStatsReplyFlagsSerializerVer12.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 packetCount = U64.ofRaw(bb.readLong());
            U64 byteCount = U64.ofRaw(bb.readLong());
            long flowCount = U32.f(bb.readInt());
            // pad: 4 bytes
            bb.skipBytes(4);

            OFAggregateStatsReplyVer12 aggregateStatsReplyVer12 = new OFAggregateStatsReplyVer12(
                    xid,
                      flags,
                      packetCount,
                      byteCount,
                      flowCount
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", aggregateStatsReplyVer12);
            return aggregateStatsReplyVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFAggregateStatsReplyVer12Funnel FUNNEL = new OFAggregateStatsReplyVer12Funnel();
    static class OFAggregateStatsReplyVer12Funnel implements Funnel<OFAggregateStatsReplyVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFAggregateStatsReplyVer12 message, PrimitiveSink sink) {
            // fixed value property version = 3
            sink.putByte((byte) 0x3);
            // fixed value property type = 19
            sink.putByte((byte) 0x13);
            // fixed value property length = 40
            sink.putShort((short) 0x28);
            sink.putLong(message.xid);
            // fixed value property statsType = 2
            sink.putShort((short) 0x2);
            OFStatsReplyFlagsSerializerVer12.putTo(message.flags, sink);
            // skip pad (4 bytes)
            message.packetCount.putTo(sink);
            message.byteCount.putTo(sink);
            sink.putLong(message.flowCount);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFAggregateStatsReplyVer12> {
        @Override
        public void write(ByteBuf bb, OFAggregateStatsReplyVer12 message) {
            // fixed value property version = 3
            bb.writeByte((byte) 0x3);
            // fixed value property type = 19
            bb.writeByte((byte) 0x13);
            // fixed value property length = 40
            bb.writeShort((short) 0x28);
            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 2
            bb.writeShort((short) 0x2);
            OFStatsReplyFlagsSerializerVer12.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.packetCount.getValue());
            bb.writeLong(message.byteCount.getValue());
            bb.writeInt(U32.t(message.flowCount));
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFAggregateStatsReplyVer12(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("packetCount=").append(packetCount);
        b.append(", ");
        b.append("byteCount=").append(byteCount);
        b.append(", ");
        b.append("flowCount=").append(flowCount);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFAggregateStatsReplyVer12 other = (OFAggregateStatsReplyVer12) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
        if( flowCount != other.flowCount)
            return false;
        return true;
    }

    @Override
    public boolean equalsIgnoreXid(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFAggregateStatsReplyVer12 other = (OFAggregateStatsReplyVer12) obj;

        // ignore XID
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (packetCount == null) {
            if (other.packetCount != null)
                return false;
        } else if (!packetCount.equals(other.packetCount))
            return false;
        if (byteCount == null) {
            if (other.byteCount != null)
                return false;
        } else if (!byteCount.equals(other.byteCount))
            return false;
        if( flowCount != other.flowCount)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        result = prime *  (int) (flowCount ^ (flowCount >>> 32));
        return result;
    }

    @Override
    public int hashCodeIgnoreXid() {
        final int prime = 31;
        int result = 1;

        // ignore XID
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((packetCount == null) ? 0 : packetCount.hashCode());
        result = prime * result + ((byteCount == null) ? 0 : byteCount.hashCode());
        result = prime *  (int) (flowCount ^ (flowCount >>> 32));
        return result;
    }

}
