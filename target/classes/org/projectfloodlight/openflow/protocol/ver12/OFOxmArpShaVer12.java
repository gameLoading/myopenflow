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

class OFOxmArpShaVer12 implements OFOxmArpSha {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmArpShaVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 10;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
//
    // Immutable default instance
    final static OFOxmArpShaVer12 DEFAULT = new OFOxmArpShaVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmArpShaVer12(MacAddress value) {
        if(value == null) {
            throw new NullPointerException("OFOxmArpShaVer12: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003006L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_SHA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<MacAddress> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmArpSha.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmArpSha.Builder {
        final OFOxmArpShaVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;

        BuilderWithParent(OFOxmArpShaVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003006L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmArpSha.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_SHA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmArpSha build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmArpShaVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmArpSha.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;

    @Override
    public long getTypeLen() {
        return 0x80003006L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmArpSha.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_SHA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmArpSha build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmArpShaVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmArpSha> {
        @Override
        public OFOxmArpSha readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003006L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003006)
                throw new OFParseError("Wrong typeLen: Expected=0x80003006L(0x80003006L), got="+typeLen);
            MacAddress value = MacAddress.read6Bytes(bb);

            OFOxmArpShaVer12 oxmArpShaVer12 = new OFOxmArpShaVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmArpShaVer12);
            return oxmArpShaVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmArpShaVer12Funnel FUNNEL = new OFOxmArpShaVer12Funnel();
    static class OFOxmArpShaVer12Funnel implements Funnel<OFOxmArpShaVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmArpShaVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003006L
            sink.putInt((int) 0x80003006);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmArpShaVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmArpShaVer12 message) {
            // fixed value property typeLen = 0x80003006L
            bb.writeInt((int) 0x80003006);
            message.value.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmArpShaVer12(");
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
        OFOxmArpShaVer12 other = (OFOxmArpShaVer12) obj;

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
