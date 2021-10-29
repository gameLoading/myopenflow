// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFOxmTunGpeFlagsVer15 implements OFOxmTunGpeFlags {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmTunGpeFlagsVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 5;

        private final static U8 DEFAULT_VALUE = U8.ZERO;

    // OF message fields
    private final U8 value;
//
    // Immutable default instance
    final static OFOxmTunGpeFlagsVer15 DEFAULT = new OFOxmTunGpeFlagsVer15(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmTunGpeFlagsVer15(U8 value) {
        if(value == null) {
            throw new NullPointerException("OFOxmTunGpeFlagsVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x1e001L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.TUN_GPE_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<U8> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFOxmTunGpeFlags.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmTunGpeFlags.Builder {
        final OFOxmTunGpeFlagsVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U8 value;

        BuilderWithParent(OFOxmTunGpeFlagsVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x1e001L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmTunGpeFlags.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.TUN_GPE_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFOxmTunGpeFlags build() {
                U8 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmTunGpeFlagsVer15(
                    value
                );
        }

    }

    static class Builder implements OFOxmTunGpeFlags.Builder {
        // OF message fields
        private boolean valueSet;
        private U8 value;

    @Override
    public long getTypeLen() {
        return 0x1e001L;
    }

    @Override
    public U8 getValue() {
        return value;
    }

    @Override
    public OFOxmTunGpeFlags.Builder setValue(U8 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<U8> getMatchField() {
        return MatchField.TUN_GPE_FLAGS;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<U8> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.5");
    }

    @Override
    public U8 getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.5");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFOxmTunGpeFlags build() {
            U8 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmTunGpeFlagsVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmTunGpeFlags> {
        @Override
        public OFOxmTunGpeFlags readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x1e001L
            int typeLen = bb.readInt();
            if(typeLen != 0x1e001)
                throw new OFParseError("Wrong typeLen: Expected=0x1e001L(0x1e001L), got="+typeLen);
            U8 value = U8.of(bb.readByte());

            OFOxmTunGpeFlagsVer15 oxmTunGpeFlagsVer15 = new OFOxmTunGpeFlagsVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmTunGpeFlagsVer15);
            return oxmTunGpeFlagsVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmTunGpeFlagsVer15Funnel FUNNEL = new OFOxmTunGpeFlagsVer15Funnel();
    static class OFOxmTunGpeFlagsVer15Funnel implements Funnel<OFOxmTunGpeFlagsVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmTunGpeFlagsVer15 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x1e001L
            sink.putInt(0x1e001);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmTunGpeFlagsVer15> {
        @Override
        public void write(ByteBuf bb, OFOxmTunGpeFlagsVer15 message) {
            // fixed value property typeLen = 0x1e001L
            bb.writeInt(0x1e001);
            bb.writeByte(message.value.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmTunGpeFlagsVer15(");
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
        OFOxmTunGpeFlagsVer15 other = (OFOxmTunGpeFlagsVer15) obj;

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
