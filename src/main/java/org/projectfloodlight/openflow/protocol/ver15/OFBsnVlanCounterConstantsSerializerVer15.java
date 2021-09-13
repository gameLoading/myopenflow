// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFBsnVlanCounterConstants;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBsnVlanCounterConstantsSerializerVer15 {

    public final static short BSN_VLAN_ALL_VAL = (short) 0xffff;

    public static OFBsnVlanCounterConstants readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(U8.f(bb.readByte()));
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnVlanCounterConstants e) {
        bb.writeByte(U8.t(toWireValue(e)));
    }

    public static void putTo(OFBsnVlanCounterConstants e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBsnVlanCounterConstants ofWireValue(short val) {
        switch(val) {
            case BSN_VLAN_ALL_VAL:
                return OFBsnVlanCounterConstants.BSN_VLAN_ALL;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnVlanCounterConstants in version 1.5: " + val);
        }
    }


    public static short toWireValue(OFBsnVlanCounterConstants e) {
        switch(e) {
            case BSN_VLAN_ALL:
                return BSN_VLAN_ALL_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnVlanCounterConstants in version 1.5: " + e);
        }
    }

}