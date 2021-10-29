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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmMplsTcMaskedVer13 implements OFOxmMplsTcMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmMplsTcMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 6;

        private final static U8 DEFAULT_VALUE = U8.ZERO;
        private final static U8 DEFAULT_VALUE_MASK = U8.ZERO;

    // OF message fields
    private final U8 value;
    private final U8 mask;
//
    // Immutable default instance
    final static OFOxmMplsTcMaskedVer13 DEFAULT = new OFOxmMplsTcMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmMplsTcMaskedVer13(U8 value, U8 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmMplsTcMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmMplsTcMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004702L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public U8 getMask() {
        return mask;
    }

    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.MPLS_TC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U8> getCanonical() {
        if (U8.NO_MASK.equals(mask)) {
            return new OFOxmMplsTcVer13(value);
        } else if(U8.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmMplsTcMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmMplsTcMasked.Builder {
        final OFOxmMplsTcMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U8 value;
        private boolean maskSet;
        private U8 mask;

        BuilderWithParent(OFOxmMplsTcMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004702L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmMplsTcMasked.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U8 getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsTcMasked.Builder setMask(U8 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.MPLS_TC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmMplsTcMasked build() {
                U8 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U8 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmMplsTcMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmMplsTcMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U8 value;
        private boolean maskSet;
        private U8 mask;

    @Override
    public long getTypeLen() {
        return 0x80004702L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmMplsTcMasked.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U8 getMask() {
        return mask;
    }

    @Override
    public OFOxmMplsTcMasked.Builder setMask(U8 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.MPLS_TC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmMplsTcMasked build() {
            U8 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U8 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmMplsTcMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmMplsTcMasked> {
        @Override
        public OFOxmMplsTcMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80004702L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004702)
                throw new OFParseError("Wrong typeLen: Expected=0x80004702L(0x80004702L), got="+typeLen);
            U8 value = U8.of(bb.readByte());
            U8 mask = U8.of(bb.readByte());

            OFOxmMplsTcMaskedVer13 oxmMplsTcMaskedVer13 = new OFOxmMplsTcMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmMplsTcMaskedVer13);
            return oxmMplsTcMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmMplsTcMaskedVer13Funnel FUNNEL = new OFOxmMplsTcMaskedVer13Funnel();
    static class OFOxmMplsTcMaskedVer13Funnel implements Funnel<OFOxmMplsTcMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmMplsTcMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004702L
            sink.putInt((int) 0x80004702);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmMplsTcMaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmMplsTcMaskedVer13 message) {
            // fixed value property typeLen = 0x80004702L
            bb.writeInt((int) 0x80004702);
            bb.writeByte(message.value.getRaw());
            bb.writeByte(message.mask.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmMplsTcMaskedVer13(");
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
        OFOxmMplsTcMaskedVer13 other = (OFOxmMplsTcMaskedVer13) obj;

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
