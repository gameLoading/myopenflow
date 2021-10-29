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

class OFOxmBsnTcpFlagsMaskedVer13 implements OFOxmBsnTcpFlagsMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnTcpFlagsMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static U16 DEFAULT_VALUE = U16.ZERO;
        private final static U16 DEFAULT_VALUE_MASK = U16.ZERO;

    // OF message fields
    private final U16 value;
    private final U16 mask;
//
    // Immutable default instance
    final static OFOxmBsnTcpFlagsMaskedVer13 DEFAULT = new OFOxmBsnTcpFlagsMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnTcpFlagsMaskedVer13(U16 value, U16 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnTcpFlagsMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnTcpFlagsMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32104L;
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
        return MatchField.BSN_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U16> getCanonical() {
        if (U16.NO_MASK.equals(mask)) {
            return new OFOxmBsnTcpFlagsVer13(value);
        } else if(U16.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnTcpFlagsMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnTcpFlagsMasked.Builder {
        final OFOxmBsnTcpFlagsMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

        BuilderWithParent(OFOxmBsnTcpFlagsMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32104L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnTcpFlagsMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnTcpFlagsMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.BSN_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnTcpFlagsMasked build() {
                U16 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U16 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnTcpFlagsMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnTcpFlagsMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

    @Override
    public long getTypeLen() {
        return 0x32104L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnTcpFlagsMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnTcpFlagsMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.BSN_TCP_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnTcpFlagsMasked build() {
            U16 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U16 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnTcpFlagsMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnTcpFlagsMasked> {
        @Override
        public OFOxmBsnTcpFlagsMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32104L
            int typeLen = bb.readInt();
            if(typeLen != 0x32104)
                throw new OFParseError("Wrong typeLen: Expected=0x32104L(0x32104L), got="+typeLen);
            U16 value = U16.of(bb.readShort());
            U16 mask = U16.of(bb.readShort());

            OFOxmBsnTcpFlagsMaskedVer13 oxmBsnTcpFlagsMaskedVer13 = new OFOxmBsnTcpFlagsMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnTcpFlagsMaskedVer13);
            return oxmBsnTcpFlagsMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnTcpFlagsMaskedVer13Funnel FUNNEL = new OFOxmBsnTcpFlagsMaskedVer13Funnel();
    static class OFOxmBsnTcpFlagsMaskedVer13Funnel implements Funnel<OFOxmBsnTcpFlagsMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnTcpFlagsMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32104L
            sink.putInt(0x32104);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnTcpFlagsMaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnTcpFlagsMaskedVer13 message) {
            // fixed value property typeLen = 0x32104L
            bb.writeInt(0x32104);
            bb.writeShort(message.value.getRaw());
            bb.writeShort(message.mask.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnTcpFlagsMaskedVer13(");
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
        OFOxmBsnTcpFlagsMaskedVer13 other = (OFOxmBsnTcpFlagsMaskedVer13) obj;

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
