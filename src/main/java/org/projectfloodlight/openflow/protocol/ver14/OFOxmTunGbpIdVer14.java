// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmTunGbpIdVer14 implements OFOxmTunGbpId {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmTunGbpIdVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 6;

        private final static U16 DEFAULT_VALUE = U16.ZERO;

    // OF message fields
    private final U16 value;
//
    // Immutable default instance
    final static OFOxmTunGbpIdVer14 DEFAULT = new OFOxmTunGbpIdVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmTunGbpIdVer14(U16 value) {
        if(value == null) {
            throw new NullPointerException("OFOxmTunGbpIdVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x14c02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.TUN_GBP_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<U16> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmTunGbpId.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmTunGbpId.Builder {
        final OFOxmTunGbpIdVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U16 value;

        BuilderWithParent(OFOxmTunGbpIdVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x14c02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmTunGbpId.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.TUN_GBP_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmTunGbpId build() {
                U16 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmTunGbpIdVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmTunGbpId.Builder {
        // OF message fields
        private boolean valueSet;
        private U16 value;

    @Override
    public long getTypeLen() {
        return 0x14c02L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmTunGbpId.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.TUN_GBP_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public U16 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmTunGbpId build() {
            U16 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmTunGbpIdVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmTunGbpId> {
        @Override
        public OFOxmTunGbpId readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x14c02L
            int typeLen = bb.readInt();
            if(typeLen != 0x14c02)
                throw new OFParseError("Wrong typeLen: Expected=0x14c02L(0x14c02L), got="+typeLen);
            U16 value = U16.of(bb.readShort());

            OFOxmTunGbpIdVer14 oxmTunGbpIdVer14 = new OFOxmTunGbpIdVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmTunGbpIdVer14);
            return oxmTunGbpIdVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmTunGbpIdVer14Funnel FUNNEL = new OFOxmTunGbpIdVer14Funnel();
    static class OFOxmTunGbpIdVer14Funnel implements Funnel<OFOxmTunGbpIdVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmTunGbpIdVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x14c02L
            sink.putInt(0x14c02);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmTunGbpIdVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmTunGbpIdVer14 message) {
            // fixed value property typeLen = 0x14c02L
            bb.writeInt(0x14c02);
            bb.writeShort(message.value.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmTunGbpIdVer14(");
        b.append("value=").append(value);
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
        OFOxmTunGbpIdVer14 other = (OFOxmTunGbpIdVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
