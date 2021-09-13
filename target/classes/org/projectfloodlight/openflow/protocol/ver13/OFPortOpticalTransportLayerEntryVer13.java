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

class OFPortOpticalTransportLayerEntryVer13 implements OFPortOpticalTransportLayerEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFPortOpticalTransportLayerEntryVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static short DEFAULT_LAYER_CLASS = (short) 0x0;
        private final static short DEFAULT_SIGNAL_TYPE = (short) 0x0;
        private final static short DEFAULT_ADAPTATION = (short) 0x0;

    // OF message fields
    private final short layerClass;
    private final short signalType;
    private final short adaptation;
//
    // Immutable default instance
    final static OFPortOpticalTransportLayerEntryVer13 DEFAULT = new OFPortOpticalTransportLayerEntryVer13(
        DEFAULT_LAYER_CLASS, DEFAULT_SIGNAL_TYPE, DEFAULT_ADAPTATION
    );

    // package private constructor - used by readers, builders, and factory
    OFPortOpticalTransportLayerEntryVer13(short layerClass, short signalType, short adaptation) {
        this.layerClass = layerClass;
        this.signalType = signalType;
        this.adaptation = adaptation;
    }

    // Accessors for OF message fields
    @Override
    public short getLayerClass() {
        return layerClass;
    }

    @Override
    public short getSignalType() {
        return signalType;
    }

    @Override
    public short getAdaptation() {
        return adaptation;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFPortOpticalTransportLayerEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortOpticalTransportLayerEntry.Builder {
        final OFPortOpticalTransportLayerEntryVer13 parentMessage;

        // OF message fields
        private boolean layerClassSet;
        private short layerClass;
        private boolean signalTypeSet;
        private short signalType;
        private boolean adaptationSet;
        private short adaptation;

        BuilderWithParent(OFPortOpticalTransportLayerEntryVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public short getLayerClass() {
        return layerClass;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setLayerClass(short layerClass) {
        this.layerClass = layerClass;
        this.layerClassSet = true;
        return this;
    }
    @Override
    public short getSignalType() {
        return signalType;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setSignalType(short signalType) {
        this.signalType = signalType;
        this.signalTypeSet = true;
        return this;
    }
    @Override
    public short getAdaptation() {
        return adaptation;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setAdaptation(short adaptation) {
        this.adaptation = adaptation;
        this.adaptationSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFPortOpticalTransportLayerEntry build() {
                short layerClass = this.layerClassSet ? this.layerClass : parentMessage.layerClass;
                short signalType = this.signalTypeSet ? this.signalType : parentMessage.signalType;
                short adaptation = this.adaptationSet ? this.adaptation : parentMessage.adaptation;

                //
                return new OFPortOpticalTransportLayerEntryVer13(
                    layerClass,
                    signalType,
                    adaptation
                );
        }

    }

    static class Builder implements OFPortOpticalTransportLayerEntry.Builder {
        // OF message fields
        private boolean layerClassSet;
        private short layerClass;
        private boolean signalTypeSet;
        private short signalType;
        private boolean adaptationSet;
        private short adaptation;

    @Override
    public short getLayerClass() {
        return layerClass;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setLayerClass(short layerClass) {
        this.layerClass = layerClass;
        this.layerClassSet = true;
        return this;
    }
    @Override
    public short getSignalType() {
        return signalType;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setSignalType(short signalType) {
        this.signalType = signalType;
        this.signalTypeSet = true;
        return this;
    }
    @Override
    public short getAdaptation() {
        return adaptation;
    }

    @Override
    public OFPortOpticalTransportLayerEntry.Builder setAdaptation(short adaptation) {
        this.adaptation = adaptation;
        this.adaptationSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFPortOpticalTransportLayerEntry build() {
            short layerClass = this.layerClassSet ? this.layerClass : DEFAULT_LAYER_CLASS;
            short signalType = this.signalTypeSet ? this.signalType : DEFAULT_SIGNAL_TYPE;
            short adaptation = this.adaptationSet ? this.adaptation : DEFAULT_ADAPTATION;


            return new OFPortOpticalTransportLayerEntryVer13(
                    layerClass,
                    signalType,
                    adaptation
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortOpticalTransportLayerEntry> {
        @Override
        public OFPortOpticalTransportLayerEntry readFrom(ByteBuf bb) throws OFParseError {
            short layerClass = U8.f(bb.readByte());
            short signalType = U8.f(bb.readByte());
            short adaptation = U8.f(bb.readByte());
            // pad: 5 bytes
            bb.skipBytes(5);

            OFPortOpticalTransportLayerEntryVer13 portOpticalTransportLayerEntryVer13 = new OFPortOpticalTransportLayerEntryVer13(
                    layerClass,
                      signalType,
                      adaptation
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portOpticalTransportLayerEntryVer13);
            return portOpticalTransportLayerEntryVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortOpticalTransportLayerEntryVer13Funnel FUNNEL = new OFPortOpticalTransportLayerEntryVer13Funnel();
    static class OFPortOpticalTransportLayerEntryVer13Funnel implements Funnel<OFPortOpticalTransportLayerEntryVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortOpticalTransportLayerEntryVer13 message, PrimitiveSink sink) {
            sink.putShort(message.layerClass);
            sink.putShort(message.signalType);
            sink.putShort(message.adaptation);
            // skip pad (5 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortOpticalTransportLayerEntryVer13> {
        @Override
        public void write(ByteBuf bb, OFPortOpticalTransportLayerEntryVer13 message) {
            bb.writeByte(U8.t(message.layerClass));
            bb.writeByte(U8.t(message.signalType));
            bb.writeByte(U8.t(message.adaptation));
            // pad: 5 bytes
            bb.writeZero(5);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortOpticalTransportLayerEntryVer13(");
        b.append("layerClass=").append(layerClass);
        b.append(", ");
        b.append("signalType=").append(signalType);
        b.append(", ");
        b.append("adaptation=").append(adaptation);
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
        OFPortOpticalTransportLayerEntryVer13 other = (OFPortOpticalTransportLayerEntryVer13) obj;

        if( layerClass != other.layerClass)
            return false;
        if( signalType != other.signalType)
            return false;
        if( adaptation != other.adaptation)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + layerClass;
        result = prime * result + signalType;
        result = prime * result + adaptation;
        return result;
    }

}
