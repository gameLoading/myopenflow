// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

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
import io.netty.buffer.ByteBuf;

abstract class OFStatsReplyVer10 {
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int MINIMUM_LENGTH = 12;


    public final static OFStatsReplyVer10.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFStatsReply> {
        @Override
        public OFStatsReply readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 17
            byte type = bb.readByte();
            if(type != (byte) 0x11)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(17), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            short statsType = bb.readShort();
            bb.readerIndex(start);
            switch(statsType) {
               case (short) 0x2:
                   // discriminator value OFStatsType.AGGREGATE=2 for class OFAggregateStatsReplyVer10
                   return OFAggregateStatsReplyVer10.READER.readFrom(bb);
               case (short) 0xffff:
                   // discriminator value OFStatsType.EXPERIMENTER=65535 for class OFExperimenterStatsReplyVer10
                   return OFExperimenterStatsReplyVer10.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFStatsType.DESC=0 for class OFDescStatsReplyVer10
                   return OFDescStatsReplyVer10.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFStatsType.FLOW=1 for class OFFlowStatsReplyVer10
                   return OFFlowStatsReplyVer10.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFStatsType.PORT=4 for class OFPortStatsReplyVer10
                   return OFPortStatsReplyVer10.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFStatsType.QUEUE=5 for class OFQueueStatsReplyVer10
                   return OFQueueStatsReplyVer10.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFStatsType.TABLE=3 for class OFTableStatsReplyVer10
                   return OFTableStatsReplyVer10.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator statsType of class OFStatsReplyVer10: " + statsType);
            }
        }
    }
}