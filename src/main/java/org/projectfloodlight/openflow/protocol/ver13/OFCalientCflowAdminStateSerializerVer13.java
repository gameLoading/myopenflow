// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFCalientCflowAdminState;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFCalientCflowAdminStateSerializerVer13 {

    public final static byte INSERVICE_VAL = (byte) 0x0;
    public final static byte OUTOFSERVICE_VAL = (byte) 0x1;
    public final static byte OOS_NP_VAL = (byte) 0x2;
    public final static byte UNDERMANAGEMENT_VAL = (byte) 0x3;
    public final static byte READY_VAL = (byte) 0x4;

    public static Set<OFCalientCflowAdminState> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFCalientCflowAdminState> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFCalientCflowAdminState> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFCalientCflowAdminState> ofWireValue(byte val) {
        EnumSet<OFCalientCflowAdminState> set = EnumSet.noneOf(OFCalientCflowAdminState.class);

        if((val & INSERVICE_VAL) != 0)
            set.add(OFCalientCflowAdminState.INSERVICE);
        if((val & OUTOFSERVICE_VAL) != 0)
            set.add(OFCalientCflowAdminState.OUTOFSERVICE);
        if((val & OOS_NP_VAL) != 0)
            set.add(OFCalientCflowAdminState.OOS_NP);
        if((val & UNDERMANAGEMENT_VAL) != 0)
            set.add(OFCalientCflowAdminState.UNDERMANAGEMENT);
        if((val & READY_VAL) != 0)
            set.add(OFCalientCflowAdminState.READY);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFCalientCflowAdminState> set) {
        byte wireValue = 0;

        for(OFCalientCflowAdminState e: set) {
            switch(e) {
                case INSERVICE:
                    wireValue |= INSERVICE_VAL;
                    break;
                case OUTOFSERVICE:
                    wireValue |= OUTOFSERVICE_VAL;
                    break;
                case OOS_NP:
                    wireValue |= OOS_NP_VAL;
                    break;
                case UNDERMANAGEMENT:
                    wireValue |= UNDERMANAGEMENT_VAL;
                    break;
                case READY:
                    wireValue |= READY_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFCalientCflowAdminState in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
