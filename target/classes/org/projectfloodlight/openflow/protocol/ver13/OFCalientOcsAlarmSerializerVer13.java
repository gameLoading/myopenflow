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
import org.projectfloodlight.openflow.protocol.OFCalientOcsAlarm;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFCalientOcsAlarmSerializerVer13 {

    public final static byte UNKNOWN_VAL = (byte) 0x0;
    public final static byte NORMAL_VAL = (byte) 0x1;
    public final static byte MINOR_VAL = (byte) 0x2;
    public final static byte MAJOR_VAL = (byte) 0x3;
    public final static byte CRITICAL_VAL = (byte) 0x4;

    public static Set<OFCalientOcsAlarm> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFCalientOcsAlarm> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFCalientOcsAlarm> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFCalientOcsAlarm> ofWireValue(byte val) {
        EnumSet<OFCalientOcsAlarm> set = EnumSet.noneOf(OFCalientOcsAlarm.class);

        if((val & UNKNOWN_VAL) != 0)
            set.add(OFCalientOcsAlarm.UNKNOWN);
        if((val & NORMAL_VAL) != 0)
            set.add(OFCalientOcsAlarm.NORMAL);
        if((val & MINOR_VAL) != 0)
            set.add(OFCalientOcsAlarm.MINOR);
        if((val & MAJOR_VAL) != 0)
            set.add(OFCalientOcsAlarm.MAJOR);
        if((val & CRITICAL_VAL) != 0)
            set.add(OFCalientOcsAlarm.CRITICAL);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFCalientOcsAlarm> set) {
        byte wireValue = 0;

        for(OFCalientOcsAlarm e: set) {
            switch(e) {
                case UNKNOWN:
                    wireValue |= UNKNOWN_VAL;
                    break;
                case NORMAL:
                    wireValue |= NORMAL_VAL;
                    break;
                case MINOR:
                    wireValue |= MINOR_VAL;
                    break;
                case MAJOR:
                    wireValue |= MAJOR_VAL;
                    break;
                case CRITICAL:
                    wireValue |= CRITICAL_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFCalientOcsAlarm in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
