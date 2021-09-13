// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
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
import io.netty.buffer.ByteBuf;

abstract class OFExpExtAdIdVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 8;


    public final static OFExpExtAdIdVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFExpExtAdId> {
        @Override
        public OFExpExtAdId readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            U16.f(bb.readShort());
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            // fixed value property namespace == 0x0
            short namespace = bb.readShort();
            if(namespace != (short) 0x0)
                throw new OFParseError("Wrong namespace: Expected=0x0(0x0), got="+namespace);
            short nsType = bb.readShort();
            bb.readerIndex(start);
            switch(nsType) {
               case (short) 0x1:
                   // discriminator value 0x1=0x1 for class OFExpExtAdidSonetVer13
                   return OFExpExtAdidSonetVer13.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value 0x0=0x0 for class OFExpPortAdidOtnVer13
                   return OFExpPortAdidOtnVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator nsType of class OFExpExtAdIdVer13: " + nsType);
            }
        }
    }
}
