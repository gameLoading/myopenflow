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

class OFOxmOvsTcpFlagsMaskedVer14 implements OFOxmOvsTcpFlagsMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmOvsTcpFlagsMaskedVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 12;

        private final static U16 DEFAULT_VALUE = U16.ZERO;
        private final static U16 DEFAULT_VALUE_MASK = U16.ZERO;

    // OF message fields
    private final U16 value;
    private final U16 mask;
//
    // Immutable default instance
    final static OFOxmOvsTcpFlagsMaskedVer14 DEFAULT = new OFOxmOvsTcpFlagsMaskedVer14(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmOvsTcpFlagsMaskedVer14(U16 value, U16 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmOvsTcpFlagsMaskedVer14: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmOvsTcpFlagsMaskedVer14: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0xffff5508L;
    }

    @Override
    public long getExperimenterId() {
        return 0x4f4e4600L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.OVS_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U16> getCanonical() {
        if (U16.NO_MASK.equals(mask)) {
            return new OFOxmOvsTcpFlagsVer14(value);
        } else if(U16.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmOvsTcpFlagsMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmOvsTcpFlagsMasked.Builder {
        final OFOxmOvsTcpFlagsMaskedVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

        BuilderWithParent(OFOxmOvsTcpFlagsMaskedVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0xffff5508L;
    }

    @Override
    public long getExperimenterId() {
        return 0x4f4e4600L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmOvsTcpFlagsMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmOvsTcpFlagsMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.OVS_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmOvsTcpFlagsMasked build() {
                U16 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U16 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmOvsTcpFlagsMaskedVer14(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmOvsTcpFlagsMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

    @Override
    public long getTypeLen() {
        return 0xffff5508L;
    }

    @Override
    public long getExperimenterId() {
        return 0x4f4e4600L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmOvsTcpFlagsMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmOvsTcpFlagsMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.OVS_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmOvsTcpFlagsMasked build() {
            U16 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U16 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmOvsTcpFlagsMaskedVer14(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmOvsTcpFlagsMasked> {
        @Override
        public OFOxmOvsTcpFlagsMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0xffff5508L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0xffff5508)
                throw new OFParseError("Wrong typeLen: Expected=0xffff5508L(0xffff5508L), got="+typeLen);
            // fixed value property experimenterId == 0x4f4e4600L
            int experimenterId = bb.readInt();
            if(experimenterId != 0x4f4e4600)
                throw new OFParseError("Wrong experimenterId: Expected=0x4f4e4600L(0x4f4e4600L), got="+experimenterId);
            U16 value = U16.of(bb.readShort());
            U16 mask = U16.of(bb.readShort());

            OFOxmOvsTcpFlagsMaskedVer14 oxmOvsTcpFlagsMaskedVer14 = new OFOxmOvsTcpFlagsMaskedVer14(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmOvsTcpFlagsMaskedVer14);
            return oxmOvsTcpFlagsMaskedVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmOvsTcpFlagsMaskedVer14Funnel FUNNEL = new OFOxmOvsTcpFlagsMaskedVer14Funnel();
    static class OFOxmOvsTcpFlagsMaskedVer14Funnel implements Funnel<OFOxmOvsTcpFlagsMaskedVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmOvsTcpFlagsMaskedVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0xffff5508L
            sink.putInt((int) 0xffff5508);
            // fixed value property experimenterId = 0x4f4e4600L
            sink.putInt(0x4f4e4600);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmOvsTcpFlagsMaskedVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmOvsTcpFlagsMaskedVer14 message) {
            // fixed value property typeLen = 0xffff5508L
            bb.writeInt((int) 0xffff5508);
            // fixed value property experimenterId = 0x4f4e4600L
            bb.writeInt(0x4f4e4600);
            bb.writeShort(message.value.getRaw());
            bb.writeShort(message.mask.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmOvsTcpFlagsMaskedVer14(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmOvsTcpFlagsMaskedVer14 other = (OFOxmOvsTcpFlagsMaskedVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
