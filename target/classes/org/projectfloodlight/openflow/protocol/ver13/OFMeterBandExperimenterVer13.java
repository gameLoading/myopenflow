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

class OFMeterBandExperimenterVer13 implements OFMeterBandExperimenter {
    private static final Logger logger = LoggerFactory.getLogger(OFMeterBandExperimenterVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 16;

        private final static long DEFAULT_RATE = 0x0L;
        private final static long DEFAULT_BURST_SIZE = 0x0L;
        private final static long DEFAULT_EXPERIMENTER = 0x0L;

    // OF message fields
    private final long rate;
    private final long burstSize;
    private final long experimenter;
//
    // Immutable default instance
    final static OFMeterBandExperimenterVer13 DEFAULT = new OFMeterBandExperimenterVer13(
        DEFAULT_RATE, DEFAULT_BURST_SIZE, DEFAULT_EXPERIMENTER
    );

    // package private constructor - used by readers, builders, and factory
    OFMeterBandExperimenterVer13(long rate, long burstSize, long experimenter) {
        this.rate = rate;
        this.burstSize = burstSize;
        this.experimenter = experimenter;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFMeterBandExperimenter.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFMeterBandExperimenter.Builder {
        final OFMeterBandExperimenterVer13 parentMessage;

        // OF message fields
        private boolean rateSet;
        private long rate;
        private boolean burstSizeSet;
        private long burstSize;
        private boolean experimenterSet;
        private long experimenter;

        BuilderWithParent(OFMeterBandExperimenterVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public OFMeterBandExperimenter.Builder setRate(long rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public OFMeterBandExperimenter.Builder setBurstSize(long burstSize) {
        this.burstSize = burstSize;
        this.burstSizeSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public OFMeterBandExperimenter.Builder setExperimenter(long experimenter) {
        this.experimenter = experimenter;
        this.experimenterSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFMeterBandExperimenter build() {
                long rate = this.rateSet ? this.rate : parentMessage.rate;
                long burstSize = this.burstSizeSet ? this.burstSize : parentMessage.burstSize;
                long experimenter = this.experimenterSet ? this.experimenter : parentMessage.experimenter;

                //
                return new OFMeterBandExperimenterVer13(
                    rate,
                    burstSize,
                    experimenter
                );
        }

    }

    static class Builder implements OFMeterBandExperimenter.Builder {
        // OF message fields
        private boolean rateSet;
        private long rate;
        private boolean burstSizeSet;
        private long burstSize;
        private boolean experimenterSet;
        private long experimenter;

    @Override
    public int getType() {
        return 0xffff;
    }

    @Override
    public long getRate() {
        return rate;
    }

    @Override
    public OFMeterBandExperimenter.Builder setRate(long rate) {
        this.rate = rate;
        this.rateSet = true;
        return this;
    }
    @Override
    public long getBurstSize() {
        return burstSize;
    }

    @Override
    public OFMeterBandExperimenter.Builder setBurstSize(long burstSize) {
        this.burstSize = burstSize;
        this.burstSizeSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return experimenter;
    }

    @Override
    public OFMeterBandExperimenter.Builder setExperimenter(long experimenter) {
        this.experimenter = experimenter;
        this.experimenterSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFMeterBandExperimenter build() {
            long rate = this.rateSet ? this.rate : DEFAULT_RATE;
            long burstSize = this.burstSizeSet ? this.burstSize : DEFAULT_BURST_SIZE;
            long experimenter = this.experimenterSet ? this.experimenter : DEFAULT_EXPERIMENTER;


            return new OFMeterBandExperimenterVer13(
                    rate,
                    burstSize,
                    experimenter
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFMeterBandExperimenter> {
        @Override
        public OFMeterBandExperimenter readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xffff
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=0xffff(0xffff), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long rate = U32.f(bb.readInt());
            long burstSize = U32.f(bb.readInt());
            long experimenter = U32.f(bb.readInt());

            OFMeterBandExperimenterVer13 meterBandExperimenterVer13 = new OFMeterBandExperimenterVer13(
                    rate,
                      burstSize,
                      experimenter
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", meterBandExperimenterVer13);
            return meterBandExperimenterVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFMeterBandExperimenterVer13Funnel FUNNEL = new OFMeterBandExperimenterVer13Funnel();
    static class OFMeterBandExperimenterVer13Funnel implements Funnel<OFMeterBandExperimenterVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFMeterBandExperimenterVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0xffff
            sink.putShort((short) 0xffff);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            sink.putLong(message.rate);
            sink.putLong(message.burstSize);
            sink.putLong(message.experimenter);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFMeterBandExperimenterVer13> {
        @Override
        public void write(ByteBuf bb, OFMeterBandExperimenterVer13 message) {
            // fixed value property type = 0xffff
            bb.writeShort((short) 0xffff);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            bb.writeInt(U32.t(message.rate));
            bb.writeInt(U32.t(message.burstSize));
            bb.writeInt(U32.t(message.experimenter));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFMeterBandExperimenterVer13(");
        b.append("rate=").append(rate);
        b.append(", ");
        b.append("burstSize=").append(burstSize);
        b.append(", ");
        b.append("experimenter=").append(experimenter);
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
        OFMeterBandExperimenterVer13 other = (OFMeterBandExperimenterVer13) obj;

        if( rate != other.rate)
            return false;
        if( burstSize != other.burstSize)
            return false;
        if( experimenter != other.experimenter)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (rate ^ (rate >>> 32));
        result = prime *  (int) (burstSize ^ (burstSize >>> 32));
        result = prime *  (int) (experimenter ^ (experimenter >>> 32));
        return result;
    }

}
