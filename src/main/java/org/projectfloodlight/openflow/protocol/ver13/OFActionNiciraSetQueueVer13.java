// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionNiciraSetQueueVer13 implements OFActionNiciraSetQueue {
    private static final Logger logger = LoggerFactory.getLogger(OFActionNiciraSetQueueVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 16;

        private final static long DEFAULT_QUEUE_ID = 0x0L;

    // OF message fields
    private final long queueId;
//
    // Immutable default instance
    final static OFActionNiciraSetQueueVer13 DEFAULT = new OFActionNiciraSetQueueVer13(
        DEFAULT_QUEUE_ID
    );

    // package private constructor - used by readers, builders, and factory
    OFActionNiciraSetQueueVer13(long queueId) {
        this.queueId = queueId;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x4;
    }

    @Override
    public long getQueueId() {
        return queueId;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFActionNiciraSetQueue.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionNiciraSetQueue.Builder {
        final OFActionNiciraSetQueueVer13 parentMessage;

        // OF message fields
        private boolean queueIdSet;
        private long queueId;

        BuilderWithParent(OFActionNiciraSetQueueVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x4;
    }

    @Override
    public long getQueueId() {
        return queueId;
    }

    @Override
    public OFActionNiciraSetQueue.Builder setQueueId(long queueId) {
        this.queueId = queueId;
        this.queueIdSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFActionNiciraSetQueue build() {
                long queueId = this.queueIdSet ? this.queueId : parentMessage.queueId;

                //
                return new OFActionNiciraSetQueueVer13(
                    queueId
                );
        }

    }

    static class Builder implements OFActionNiciraSetQueue.Builder {
        // OF message fields
        private boolean queueIdSet;
        private long queueId;

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x4;
    }

    @Override
    public long getQueueId() {
        return queueId;
    }

    @Override
    public OFActionNiciraSetQueue.Builder setQueueId(long queueId) {
        this.queueId = queueId;
        this.queueIdSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFActionNiciraSetQueue build() {
            long queueId = this.queueIdSet ? this.queueId : DEFAULT_QUEUE_ID;


            return new OFActionNiciraSetQueueVer13(
                    queueId
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionNiciraSetQueue> {
        @Override
        public OFActionNiciraSetQueue readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x2320L
            int experimenter = bb.readInt();
            if(experimenter != 0x2320)
                throw new OFParseError("Wrong experimenter: Expected=0x2320L(0x2320L), got="+experimenter);
            // fixed value property subtype == 0x4
            short subtype = bb.readShort();
            if(subtype != (short) 0x4)
                throw new OFParseError("Wrong subtype: Expected=0x4(0x4), got="+subtype);
            // pad: 2 bytes
            bb.skipBytes(2);
            long queueId = U32.f(bb.readInt());

            OFActionNiciraSetQueueVer13 actionNiciraSetQueueVer13 = new OFActionNiciraSetQueueVer13(
                    queueId
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionNiciraSetQueueVer13);
            return actionNiciraSetQueueVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionNiciraSetQueueVer13Funnel FUNNEL = new OFActionNiciraSetQueueVer13Funnel();
    static class OFActionNiciraSetQueueVer13Funnel implements Funnel<OFActionNiciraSetQueueVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionNiciraSetQueueVer13 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            // fixed value property experimenter = 0x2320L
            sink.putInt(0x2320);
            // fixed value property subtype = 0x4
            sink.putShort((short) 0x4);
            // skip pad (2 bytes)
            sink.putLong(message.queueId);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionNiciraSetQueueVer13> {
        @Override
        public void write(ByteBuf bb, OFActionNiciraSetQueueVer13 message) {
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            // fixed value property experimenter = 0x2320L
            bb.writeInt(0x2320);
            // fixed value property subtype = 0x4
            bb.writeShort((short) 0x4);
            // pad: 2 bytes
            bb.writeZero(2);
            bb.writeInt(U32.t(message.queueId));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionNiciraSetQueueVer13(");
        b.append("queueId=").append(queueId);
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
        OFActionNiciraSetQueueVer13 other = (OFActionNiciraSetQueueVer13) obj;

        if( queueId != other.queueId)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (queueId ^ (queueId >>> 32));
        return result;
    }

}
