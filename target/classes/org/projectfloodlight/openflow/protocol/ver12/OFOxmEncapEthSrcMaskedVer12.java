// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver12;

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

class OFOxmEncapEthSrcMaskedVer12 implements OFOxmEncapEthSrcMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmEncapEthSrcMaskedVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 16;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;
        private final static MacAddress DEFAULT_VALUE_MASK = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
    private final MacAddress mask;
//
    // Immutable default instance
    final static OFOxmEncapEthSrcMaskedVer12 DEFAULT = new OFOxmEncapEthSrcMaskedVer12(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmEncapEthSrcMaskedVer12(MacAddress value, MacAddress mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmEncapEthSrcMaskedVer12: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmEncapEthSrcMaskedVer12: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x1f30cL;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public MacAddress getMask() {
        return mask;
    }

    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ENCAP_ETH_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<MacAddress> getCanonical() {
        if (MacAddress.NO_MASK.equals(mask)) {
            return new OFOxmEncapEthSrcVer12(value);
        } else if(MacAddress.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmEncapEthSrcMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmEncapEthSrcMasked.Builder {
        final OFOxmEncapEthSrcMaskedVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;
        private boolean maskSet;
        private MacAddress mask;

        BuilderWithParent(OFOxmEncapEthSrcMaskedVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x1f30cL;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmEncapEthSrcMasked.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MacAddress getMask() {
        return mask;
    }

    @Override
    public OFOxmEncapEthSrcMasked.Builder setMask(MacAddress mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ENCAP_ETH_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmEncapEthSrcMasked build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                MacAddress mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmEncapEthSrcMaskedVer12(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmEncapEthSrcMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;
        private boolean maskSet;
        private MacAddress mask;

    @Override
    public long getTypeLen() {
        return 0x1f30cL;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmEncapEthSrcMasked.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MacAddress getMask() {
        return mask;
    }

    @Override
    public OFOxmEncapEthSrcMasked.Builder setMask(MacAddress mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ENCAP_ETH_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmEncapEthSrcMasked build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            MacAddress mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmEncapEthSrcMaskedVer12(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmEncapEthSrcMasked> {
        @Override
        public OFOxmEncapEthSrcMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x1f30cL
            int typeLen = bb.readInt();
            if(typeLen != 0x1f30c)
                throw new OFParseError("Wrong typeLen: Expected=0x1f30cL(0x1f30cL), got="+typeLen);
            MacAddress value = MacAddress.read6Bytes(bb);
            MacAddress mask = MacAddress.read6Bytes(bb);

            OFOxmEncapEthSrcMaskedVer12 oxmEncapEthSrcMaskedVer12 = new OFOxmEncapEthSrcMaskedVer12(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmEncapEthSrcMaskedVer12);
            return oxmEncapEthSrcMaskedVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmEncapEthSrcMaskedVer12Funnel FUNNEL = new OFOxmEncapEthSrcMaskedVer12Funnel();
    static class OFOxmEncapEthSrcMaskedVer12Funnel implements Funnel<OFOxmEncapEthSrcMaskedVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmEncapEthSrcMaskedVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x1f30cL
            sink.putInt(0x1f30c);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmEncapEthSrcMaskedVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmEncapEthSrcMaskedVer12 message) {
            // fixed value property typeLen = 0x1f30cL
            bb.writeInt(0x1f30c);
            message.value.write6Bytes(bb);
            message.mask.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmEncapEthSrcMaskedVer12(");
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
        OFOxmEncapEthSrcMaskedVer12 other = (OFOxmEncapEthSrcMaskedVer12) obj;

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