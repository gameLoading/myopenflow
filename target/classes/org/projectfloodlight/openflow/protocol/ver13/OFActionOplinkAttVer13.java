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

class OFActionOplinkAttVer13 implements OFActionOplinkAtt {
    private static final Logger logger = LoggerFactory.getLogger(OFActionOplinkAttVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 20;


    // OF message fields
    private final OFOxm<?> field;
//

    // package private constructor - used by readers, builders, and factory
    OFActionOplinkAttVer13(OFOxm<?> field) {
        if(field == null) {
            throw new NullPointerException("OFActionOplinkAttVer13: property field cannot be null");
        }
        this.field = field;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0xff000088L;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public int getHlength() {
        return 0x10;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFActionOplinkAtt.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionOplinkAtt.Builder {
        final OFActionOplinkAttVer13 parentMessage;

        // OF message fields
        private boolean fieldSet;
        private OFOxm<?> field;

        BuilderWithParent(OFActionOplinkAttVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0xff000088L;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public int getHlength() {
        return 0x10;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFActionOplinkAtt.Builder setField(OFOxm<?> field) {
        this.field = field;
        this.fieldSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFActionOplinkAtt build() {
                OFOxm<?> field = this.fieldSet ? this.field : parentMessage.field;
                if(field == null)
                    throw new NullPointerException("Property field must not be null");

                //
                return new OFActionOplinkAttVer13(
                    field
                );
        }

    }

    static class Builder implements OFActionOplinkAtt.Builder {
        // OF message fields
        private boolean fieldSet;
        private OFOxm<?> field;

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0xff000088L;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public int getHlength() {
        return 0x10;
    }

    @Override
    public OFOxm<?> getField() {
        return field;
    }

    @Override
    public OFActionOplinkAtt.Builder setField(OFOxm<?> field) {
        this.field = field;
        this.fieldSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFActionOplinkAtt build() {
            if(!this.fieldSet)
                throw new IllegalStateException("Property field doesn't have default value -- must be set");
            if(field == null)
                throw new NullPointerException("Property field must not be null");


            return new OFActionOplinkAttVer13(
                    field
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionOplinkAtt> {
        @Override
        public OFActionOplinkAtt readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0xff000088L
            int experimenter = bb.readInt();
            if(experimenter != (int) 0xff000088)
                throw new OFParseError("Wrong experimenter: Expected=0xff000088L(0xff000088L), got="+experimenter);
            // fixed value property subtype == 0x1
            short subtype = bb.readShort();
            if(subtype != (short) 0x1)
                throw new OFParseError("Wrong subtype: Expected=0x1(0x1), got="+subtype);
            // fixed value property hlength == 0x10
            short hlength = bb.readShort();
            if(hlength != (short) 0x10)
                throw new OFParseError("Wrong hlength: Expected=0x10(0x10), got="+hlength);
            OFOxm<?> field = OFOxmVer13.READER.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);

            OFActionOplinkAttVer13 actionOplinkAttVer13 = new OFActionOplinkAttVer13(
                    field
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionOplinkAttVer13);
            return actionOplinkAttVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionOplinkAttVer13Funnel FUNNEL = new OFActionOplinkAttVer13Funnel();
    static class OFActionOplinkAttVer13Funnel implements Funnel<OFActionOplinkAttVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionOplinkAttVer13 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // FIXME: skip funnel of length
            // fixed value property experimenter = 0xff000088L
            sink.putInt((int) 0xff000088);
            // fixed value property subtype = 0x1
            sink.putShort((short) 0x1);
            // fixed value property hlength = 0x10
            sink.putShort((short) 0x10);
            message.field.putTo(sink);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionOplinkAttVer13> {
        @Override
        public void write(ByteBuf bb, OFActionOplinkAttVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // fixed value property experimenter = 0xff000088L
            bb.writeInt((int) 0xff000088);
            // fixed value property subtype = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property hlength = 0x10
            bb.writeShort((short) 0x10);
            message.field.writeTo(bb);
            // pad: 4 bytes
            bb.writeZero(4);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionOplinkAttVer13(");
        b.append("field=").append(field);
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
        OFActionOplinkAttVer13 other = (OFActionOplinkAttVer13) obj;

        if (field == null) {
            if (other.field != null)
                return false;
        } else if (!field.equals(other.field))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((field == null) ? 0 : field.hashCode());
        return result;
    }

}