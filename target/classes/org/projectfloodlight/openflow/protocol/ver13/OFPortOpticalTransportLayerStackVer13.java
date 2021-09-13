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
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortOpticalTransportLayerStackVer13 implements OFPortOpticalTransportLayerStack {
    private static final Logger logger = LoggerFactory.getLogger(OFPortOpticalTransportLayerStackVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 8;

        private final static int DEFAULT_FEATURE_TYPE = 0x0;
        private final static List<OFPortOpticalTransportLayerEntry> DEFAULT_ENTRIES = ImmutableList.<OFPortOpticalTransportLayerEntry>of();

    // OF message fields
    private final int featureType;
    private final List<OFPortOpticalTransportLayerEntry> entries;
//
    // Immutable default instance
    final static OFPortOpticalTransportLayerStackVer13 DEFAULT = new OFPortOpticalTransportLayerStackVer13(
        DEFAULT_FEATURE_TYPE, DEFAULT_ENTRIES
    );

    // package private constructor - used by readers, builders, and factory
    OFPortOpticalTransportLayerStackVer13(int featureType, List<OFPortOpticalTransportLayerEntry> entries) {
        if(entries == null) {
            throw new NullPointerException("OFPortOpticalTransportLayerStackVer13: property entries cannot be null");
        }
        this.featureType = featureType;
        this.entries = entries;
    }

    // Accessors for OF message fields
    @Override
    public int getFeatureType() {
        return featureType;
    }

    @Override
    public List<OFPortOpticalTransportLayerEntry> getEntries() {
        return entries;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFPortOpticalTransportLayerStack.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortOpticalTransportLayerStack.Builder {
        final OFPortOpticalTransportLayerStackVer13 parentMessage;

        // OF message fields
        private boolean featureTypeSet;
        private int featureType;
        private boolean entriesSet;
        private List<OFPortOpticalTransportLayerEntry> entries;

        BuilderWithParent(OFPortOpticalTransportLayerStackVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getFeatureType() {
        return featureType;
    }

    @Override
    public OFPortOpticalTransportLayerStack.Builder setFeatureType(int featureType) {
        this.featureType = featureType;
        this.featureTypeSet = true;
        return this;
    }
    @Override
    public List<OFPortOpticalTransportLayerEntry> getEntries() {
        return entries;
    }

    @Override
    public OFPortOpticalTransportLayerStack.Builder setEntries(List<OFPortOpticalTransportLayerEntry> entries) {
        this.entries = entries;
        this.entriesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFPortOpticalTransportLayerStack build() {
                int featureType = this.featureTypeSet ? this.featureType : parentMessage.featureType;
                List<OFPortOpticalTransportLayerEntry> entries = this.entriesSet ? this.entries : parentMessage.entries;
                if(entries == null)
                    throw new NullPointerException("Property entries must not be null");

                //
                return new OFPortOpticalTransportLayerStackVer13(
                    featureType,
                    entries
                );
        }

    }

    static class Builder implements OFPortOpticalTransportLayerStack.Builder {
        // OF message fields
        private boolean featureTypeSet;
        private int featureType;
        private boolean entriesSet;
        private List<OFPortOpticalTransportLayerEntry> entries;

    @Override
    public int getFeatureType() {
        return featureType;
    }

    @Override
    public OFPortOpticalTransportLayerStack.Builder setFeatureType(int featureType) {
        this.featureType = featureType;
        this.featureTypeSet = true;
        return this;
    }
    @Override
    public List<OFPortOpticalTransportLayerEntry> getEntries() {
        return entries;
    }

    @Override
    public OFPortOpticalTransportLayerStack.Builder setEntries(List<OFPortOpticalTransportLayerEntry> entries) {
        this.entries = entries;
        this.entriesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFPortOpticalTransportLayerStack build() {
            int featureType = this.featureTypeSet ? this.featureType : DEFAULT_FEATURE_TYPE;
            List<OFPortOpticalTransportLayerEntry> entries = this.entriesSet ? this.entries : DEFAULT_ENTRIES;
            if(entries == null)
                throw new NullPointerException("Property entries must not be null");


            return new OFPortOpticalTransportLayerStackVer13(
                    featureType,
                    entries
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortOpticalTransportLayerStack> {
        @Override
        public OFPortOpticalTransportLayerStack readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            int featureType = U16.f(bb.readShort());
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
            // pad: 4 bytes
            bb.skipBytes(4);
            List<OFPortOpticalTransportLayerEntry> entries = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFPortOpticalTransportLayerEntryVer13.READER);

            OFPortOpticalTransportLayerStackVer13 portOpticalTransportLayerStackVer13 = new OFPortOpticalTransportLayerStackVer13(
                    featureType,
                      entries
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portOpticalTransportLayerStackVer13);
            return portOpticalTransportLayerStackVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortOpticalTransportLayerStackVer13Funnel FUNNEL = new OFPortOpticalTransportLayerStackVer13Funnel();
    static class OFPortOpticalTransportLayerStackVer13Funnel implements Funnel<OFPortOpticalTransportLayerStackVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortOpticalTransportLayerStackVer13 message, PrimitiveSink sink) {
            sink.putInt(message.featureType);
            // FIXME: skip funnel of length
            // skip pad (4 bytes)
            FunnelUtils.putList(message.entries, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortOpticalTransportLayerStackVer13> {
        @Override
        public void write(ByteBuf bb, OFPortOpticalTransportLayerStackVer13 message) {
            int startIndex = bb.writerIndex();
            bb.writeShort(U16.t(message.featureType));
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // pad: 4 bytes
            bb.writeZero(4);
            ChannelUtils.writeList(bb, message.entries);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortOpticalTransportLayerStackVer13(");
        b.append("featureType=").append(featureType);
        b.append(", ");
        b.append("entries=").append(entries);
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
        OFPortOpticalTransportLayerStackVer13 other = (OFPortOpticalTransportLayerStackVer13) obj;

        if( featureType != other.featureType)
            return false;
        if (entries == null) {
            if (other.entries != null)
                return false;
        } else if (!entries.equals(other.entries))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + featureType;
        result = prime * result + ((entries == null) ? 0 : entries.hashCode());
        return result;
    }

}
