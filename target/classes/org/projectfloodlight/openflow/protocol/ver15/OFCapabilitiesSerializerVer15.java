// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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
import org.projectfloodlight.openflow.protocol.OFCapabilities;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFCapabilitiesSerializerVer15 {

    public final static int FLOW_STATS_VAL = 0x1;
    public final static int TABLE_STATS_VAL = 0x2;
    public final static int PORT_STATS_VAL = 0x4;
    public final static int IP_REASM_VAL = 0x20;
    public final static int QUEUE_STATS_VAL = 0x40;
    public final static int GROUP_STATS_VAL = 0x8;
    public final static int PORT_BLOCKED_VAL = 0x100;
    public final static int BUNDLES_VAL = 0x200;
    public final static int FLOW_MONITORING_VAL = 0x400;

    public static Set<OFCapabilities> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFCapabilities> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFCapabilities> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFCapabilities> ofWireValue(int val) {
        EnumSet<OFCapabilities> set = EnumSet.noneOf(OFCapabilities.class);

        if((val & FLOW_STATS_VAL) != 0)
            set.add(OFCapabilities.FLOW_STATS);
        if((val & TABLE_STATS_VAL) != 0)
            set.add(OFCapabilities.TABLE_STATS);
        if((val & PORT_STATS_VAL) != 0)
            set.add(OFCapabilities.PORT_STATS);
        if((val & IP_REASM_VAL) != 0)
            set.add(OFCapabilities.IP_REASM);
        if((val & QUEUE_STATS_VAL) != 0)
            set.add(OFCapabilities.QUEUE_STATS);
        if((val & GROUP_STATS_VAL) != 0)
            set.add(OFCapabilities.GROUP_STATS);
        if((val & PORT_BLOCKED_VAL) != 0)
            set.add(OFCapabilities.PORT_BLOCKED);
        if((val & BUNDLES_VAL) != 0)
            set.add(OFCapabilities.BUNDLES);
        if((val & FLOW_MONITORING_VAL) != 0)
            set.add(OFCapabilities.FLOW_MONITORING);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFCapabilities> set) {
        int wireValue = 0;

        for(OFCapabilities e: set) {
            switch(e) {
                case FLOW_STATS:
                    wireValue |= FLOW_STATS_VAL;
                    break;
                case TABLE_STATS:
                    wireValue |= TABLE_STATS_VAL;
                    break;
                case PORT_STATS:
                    wireValue |= PORT_STATS_VAL;
                    break;
                case IP_REASM:
                    wireValue |= IP_REASM_VAL;
                    break;
                case QUEUE_STATS:
                    wireValue |= QUEUE_STATS_VAL;
                    break;
                case GROUP_STATS:
                    wireValue |= GROUP_STATS_VAL;
                    break;
                case PORT_BLOCKED:
                    wireValue |= PORT_BLOCKED_VAL;
                    break;
                case BUNDLES:
                    wireValue |= BUNDLES_VAL;
                    break;
                case FLOW_MONITORING:
                    wireValue |= FLOW_MONITORING_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFCapabilities in version 1.5: " + e);
            }
        }
        return wireValue;
    }

}
