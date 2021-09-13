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

class OFBsnTlvDecapVer15 implements OFBsnTlvDecap {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvDecapVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 6;


    // OF message fields
    private final OFBsnDecap value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvDecapVer15(OFBsnDecap value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvDecapVer15: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x55;
    }

    @Override
    public OFBsnDecap getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFBsnTlvDecap.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvDecap.Builder {
        final OFBsnTlvDecapVer15 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnDecap value;

        BuilderWithParent(OFBsnTlvDecapVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x55;
    }

    @Override
    public OFBsnDecap getValue() {
        return value;
    }

    @Override
    public OFBsnTlvDecap.Builder setValue(OFBsnDecap value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFBsnTlvDecap build() {
                OFBsnDecap value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvDecapVer15(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvDecap.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnDecap value;

    @Override
    public int getType() {
        return 0x55;
    }

    @Override
    public OFBsnDecap getValue() {
        return value;
    }

    @Override
    public OFBsnTlvDecap.Builder setValue(OFBsnDecap value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFBsnTlvDecap build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvDecapVer15(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvDecap> {
        @Override
        public OFBsnTlvDecap readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x55
            short type = bb.readShort();
            if(type != (short) 0x55)
                throw new OFParseError("Wrong type: Expected=0x55(0x55), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 6)
                throw new OFParseError("Wrong length: Expected=6(6), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            OFBsnDecap value = OFBsnDecapSerializerVer15.readFrom(bb);

            OFBsnTlvDecapVer15 bsnTlvDecapVer15 = new OFBsnTlvDecapVer15(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvDecapVer15);
            return bsnTlvDecapVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvDecapVer15Funnel FUNNEL = new OFBsnTlvDecapVer15Funnel();
    static class OFBsnTlvDecapVer15Funnel implements Funnel<OFBsnTlvDecapVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvDecapVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x55
            sink.putShort((short) 0x55);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            OFBsnDecapSerializerVer15.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvDecapVer15> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvDecapVer15 message) {
            // fixed value property type = 0x55
            bb.writeShort((short) 0x55);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            OFBsnDecapSerializerVer15.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvDecapVer15(");
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
        OFBsnTlvDecapVer15 other = (OFBsnTlvDecapVer15) obj;

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
