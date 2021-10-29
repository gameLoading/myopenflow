// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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
import org.projectfloodlight.openflow.protocol.OFBundleFailedCode;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFBundleFailedCodeSerializerVer14 {

    public final static short UNKNOWN_VAL = (short) 0x0;
    public final static short EPERM_VAL = (short) 0x1;
    public final static short BAD_ID_VAL = (short) 0x2;
    public final static short BUNDLE_EXIST_VAL = (short) 0x3;
    public final static short BUNDLE_CLOSED_VAL = (short) 0x4;
    public final static short OUT_OF_BUNDLES_VAL = (short) 0x5;
    public final static short BAD_TYPE_VAL = (short) 0x6;
    public final static short BAD_FLAGS_VAL = (short) 0x7;
    public final static short MSG_BAD_LEN_VAL = (short) 0x8;
    public final static short MSG_BAD_XID_VAL = (short) 0x9;
    public final static short MSG_UNSUP_VAL = (short) 0xa;
    public final static short MSG_CONFLICT_VAL = (short) 0xb;
    public final static short MSG_TOO_MANY_VAL = (short) 0xc;
    public final static short MSG_FAILED_VAL = (short) 0xd;
    public final static short TIMEOUT_VAL = (short) 0xe;
    public final static short BUNDLE_IN_PROGRESS_VAL = (short) 0xf;

    public static OFBundleFailedCode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBundleFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBundleFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBundleFailedCode ofWireValue(short val) {
        switch(val) {
            case UNKNOWN_VAL:
                return OFBundleFailedCode.UNKNOWN;
            case EPERM_VAL:
                return OFBundleFailedCode.EPERM;
            case BAD_ID_VAL:
                return OFBundleFailedCode.BAD_ID;
            case BUNDLE_EXIST_VAL:
                return OFBundleFailedCode.BUNDLE_EXIST;
            case BUNDLE_CLOSED_VAL:
                return OFBundleFailedCode.BUNDLE_CLOSED;
            case OUT_OF_BUNDLES_VAL:
                return OFBundleFailedCode.OUT_OF_BUNDLES;
            case BAD_TYPE_VAL:
                return OFBundleFailedCode.BAD_TYPE;
            case BAD_FLAGS_VAL:
                return OFBundleFailedCode.BAD_FLAGS;
            case MSG_BAD_LEN_VAL:
                return OFBundleFailedCode.MSG_BAD_LEN;
            case MSG_BAD_XID_VAL:
                return OFBundleFailedCode.MSG_BAD_XID;
            case MSG_UNSUP_VAL:
                return OFBundleFailedCode.MSG_UNSUP;
            case MSG_CONFLICT_VAL:
                return OFBundleFailedCode.MSG_CONFLICT;
            case MSG_TOO_MANY_VAL:
                return OFBundleFailedCode.MSG_TOO_MANY;
            case MSG_FAILED_VAL:
                return OFBundleFailedCode.MSG_FAILED;
            case TIMEOUT_VAL:
                return OFBundleFailedCode.TIMEOUT;
            case BUNDLE_IN_PROGRESS_VAL:
                return OFBundleFailedCode.BUNDLE_IN_PROGRESS;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBundleFailedCode in version 1.4: " + val);
        }
    }


    public static short toWireValue(OFBundleFailedCode e) {
        switch(e) {
            case UNKNOWN:
                return UNKNOWN_VAL;
            case EPERM:
                return EPERM_VAL;
            case BAD_ID:
                return BAD_ID_VAL;
            case BUNDLE_EXIST:
                return BUNDLE_EXIST_VAL;
            case BUNDLE_CLOSED:
                return BUNDLE_CLOSED_VAL;
            case OUT_OF_BUNDLES:
                return OUT_OF_BUNDLES_VAL;
            case BAD_TYPE:
                return BAD_TYPE_VAL;
            case BAD_FLAGS:
                return BAD_FLAGS_VAL;
            case MSG_BAD_LEN:
                return MSG_BAD_LEN_VAL;
            case MSG_BAD_XID:
                return MSG_BAD_XID_VAL;
            case MSG_UNSUP:
                return MSG_UNSUP_VAL;
            case MSG_CONFLICT:
                return MSG_CONFLICT_VAL;
            case MSG_TOO_MANY:
                return MSG_TOO_MANY_VAL;
            case MSG_FAILED:
                return MSG_FAILED_VAL;
            case TIMEOUT:
                return TIMEOUT_VAL;
            case BUNDLE_IN_PROGRESS:
                return BUNDLE_IN_PROGRESS_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBundleFailedCode in version 1.4: " + e);
        }
    }

}
