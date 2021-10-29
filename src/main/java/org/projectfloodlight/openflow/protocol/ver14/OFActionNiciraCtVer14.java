// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFActionNiciraCtVer14 implements OFActionNiciraCt {
    private static final Logger logger = LoggerFactory.getLogger(OFActionNiciraCtVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 24;

        private final static int DEFAULT_FLAGS = 0x0;
        private final static long DEFAULT_ZONE_SRC = 0x0L;
        private final static int DEFAULT_ZONE = 0x0;
        private final static short DEFAULT_RECIRC_TABLE = (short) 0x0;
        private final static int DEFAULT_ALG = 0x0;
        private final static List<OFAction> DEFAULT_ACTIONS = ImmutableList.<OFAction>of();

    // OF message fields
    private final int flags;
    private final long zoneSrc;
    private final int zone;
    private final short recircTable;
    private final int alg;
    private final List<OFAction> actions;
//
    // Immutable default instance
    final static OFActionNiciraCtVer14 DEFAULT = new OFActionNiciraCtVer14(
        DEFAULT_FLAGS, DEFAULT_ZONE_SRC, DEFAULT_ZONE, DEFAULT_RECIRC_TABLE, DEFAULT_ALG, DEFAULT_ACTIONS
    );

    // package private constructor - used by readers, builders, and factory
    OFActionNiciraCtVer14(int flags, long zoneSrc, int zone, short recircTable, int alg, List<OFAction> actions) {
        if(actions == null) {
            throw new NullPointerException("OFActionNiciraCtVer14: property actions cannot be null");
        }
        this.flags = flags;
        this.zoneSrc = zoneSrc;
        this.zone = zone;
        this.recircTable = recircTable;
        this.alg = alg;
        this.actions = actions;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x23;
    }

    @Override
    public int getFlags() {
        return flags;
    }

    @Override
    public long getZoneSrc() {
        return zoneSrc;
    }

    @Override
    public int getZone() {
        return zone;
    }

    @Override
    public short getRecircTable() {
        return recircTable;
    }

    @Override
    public int getAlg() {
        return alg;
    }

    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFActionNiciraCt.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionNiciraCt.Builder {
        final OFActionNiciraCtVer14 parentMessage;

        // OF message fields
        private boolean flagsSet;
        private int flags;
        private boolean zoneSrcSet;
        private long zoneSrc;
        private boolean zoneSet;
        private int zone;
        private boolean recircTableSet;
        private short recircTable;
        private boolean algSet;
        private int alg;
        private boolean actionsSet;
        private List<OFAction> actions;

        BuilderWithParent(OFActionNiciraCtVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x23;
    }

    @Override
    public int getFlags() {
        return flags;
    }

    @Override
    public OFActionNiciraCt.Builder setFlags(int flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getZoneSrc() {
        return zoneSrc;
    }

    @Override
    public OFActionNiciraCt.Builder setZoneSrc(long zoneSrc) {
        this.zoneSrc = zoneSrc;
        this.zoneSrcSet = true;
        return this;
    }
    @Override
    public int getZone() {
        return zone;
    }

    @Override
    public OFActionNiciraCt.Builder setZone(int zone) {
        this.zone = zone;
        this.zoneSet = true;
        return this;
    }
    @Override
    public short getRecircTable() {
        return recircTable;
    }

    @Override
    public OFActionNiciraCt.Builder setRecircTable(short recircTable) {
        this.recircTable = recircTable;
        this.recircTableSet = true;
        return this;
    }
    @Override
    public int getAlg() {
        return alg;
    }

    @Override
    public OFActionNiciraCt.Builder setAlg(int alg) {
        this.alg = alg;
        this.algSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFActionNiciraCt.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFActionNiciraCt build() {
                int flags = this.flagsSet ? this.flags : parentMessage.flags;
                long zoneSrc = this.zoneSrcSet ? this.zoneSrc : parentMessage.zoneSrc;
                int zone = this.zoneSet ? this.zone : parentMessage.zone;
                short recircTable = this.recircTableSet ? this.recircTable : parentMessage.recircTable;
                int alg = this.algSet ? this.alg : parentMessage.alg;
                List<OFAction> actions = this.actionsSet ? this.actions : parentMessage.actions;
                if(actions == null)
                    throw new NullPointerException("Property actions must not be null");

                //
                return new OFActionNiciraCtVer14(
                    flags,
                    zoneSrc,
                    zone,
                    recircTable,
                    alg,
                    actions
                );
        }

    }

    static class Builder implements OFActionNiciraCt.Builder {
        // OF message fields
        private boolean flagsSet;
        private int flags;
        private boolean zoneSrcSet;
        private long zoneSrc;
        private boolean zoneSet;
        private int zone;
        private boolean recircTableSet;
        private short recircTable;
        private boolean algSet;
        private int alg;
        private boolean actionsSet;
        private List<OFAction> actions;

    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x2320L;
    }

    @Override
    public int getSubtype() {
        return 0x23;
    }

    @Override
    public int getFlags() {
        return flags;
    }

    @Override
    public OFActionNiciraCt.Builder setFlags(int flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getZoneSrc() {
        return zoneSrc;
    }

    @Override
    public OFActionNiciraCt.Builder setZoneSrc(long zoneSrc) {
        this.zoneSrc = zoneSrc;
        this.zoneSrcSet = true;
        return this;
    }
    @Override
    public int getZone() {
        return zone;
    }

    @Override
    public OFActionNiciraCt.Builder setZone(int zone) {
        this.zone = zone;
        this.zoneSet = true;
        return this;
    }
    @Override
    public short getRecircTable() {
        return recircTable;
    }

    @Override
    public OFActionNiciraCt.Builder setRecircTable(short recircTable) {
        this.recircTable = recircTable;
        this.recircTableSet = true;
        return this;
    }
    @Override
    public int getAlg() {
        return alg;
    }

    @Override
    public OFActionNiciraCt.Builder setAlg(int alg) {
        this.alg = alg;
        this.algSet = true;
        return this;
    }
    @Override
    public List<OFAction> getActions() {
        return actions;
    }

    @Override
    public OFActionNiciraCt.Builder setActions(List<OFAction> actions) {
        this.actions = actions;
        this.actionsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFActionNiciraCt build() {
            int flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            long zoneSrc = this.zoneSrcSet ? this.zoneSrc : DEFAULT_ZONE_SRC;
            int zone = this.zoneSet ? this.zone : DEFAULT_ZONE;
            short recircTable = this.recircTableSet ? this.recircTable : DEFAULT_RECIRC_TABLE;
            int alg = this.algSet ? this.alg : DEFAULT_ALG;
            List<OFAction> actions = this.actionsSet ? this.actions : DEFAULT_ACTIONS;
            if(actions == null)
                throw new NullPointerException("Property actions must not be null");


            return new OFActionNiciraCtVer14(
                    flags,
                    zoneSrc,
                    zone,
                    recircTable,
                    alg,
                    actions
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionNiciraCt> {
        @Override
        public OFActionNiciraCt readFrom(ByteBuf bb) throws OFParseError {
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
            // fixed value property experimenter == 0x2320L
            int experimenter = bb.readInt();
            if(experimenter != 0x2320)
                throw new OFParseError("Wrong experimenter: Expected=0x2320L(0x2320L), got="+experimenter);
            // fixed value property subtype == 0x23
            short subtype = bb.readShort();
            if(subtype != (short) 0x23)
                throw new OFParseError("Wrong subtype: Expected=0x23(0x23), got="+subtype);
            int flags = U16.f(bb.readShort());
            long zoneSrc = U32.f(bb.readInt());
            int zone = U16.f(bb.readShort());
            short recircTable = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            int alg = U16.f(bb.readShort());
            List<OFAction> actions = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFActionVer14.READER);

            OFActionNiciraCtVer14 actionNiciraCtVer14 = new OFActionNiciraCtVer14(
                    flags,
                      zoneSrc,
                      zone,
                      recircTable,
                      alg,
                      actions
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionNiciraCtVer14);
            return actionNiciraCtVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionNiciraCtVer14Funnel FUNNEL = new OFActionNiciraCtVer14Funnel();
    static class OFActionNiciraCtVer14Funnel implements Funnel<OFActionNiciraCtVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionNiciraCtVer14 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // FIXME: skip funnel of length
            // fixed value property experimenter = 0x2320L
            sink.putInt(0x2320);
            // fixed value property subtype = 0x23
            sink.putShort((short) 0x23);
            sink.putInt(message.flags);
            sink.putLong(message.zoneSrc);
            sink.putInt(message.zone);
            sink.putShort(message.recircTable);
            // skip pad (3 bytes)
            sink.putInt(message.alg);
            FunnelUtils.putList(message.actions, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionNiciraCtVer14> {
        @Override
        public void write(ByteBuf bb, OFActionNiciraCtVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // fixed value property experimenter = 0x2320L
            bb.writeInt(0x2320);
            // fixed value property subtype = 0x23
            bb.writeShort((short) 0x23);
            bb.writeShort(U16.t(message.flags));
            bb.writeInt(U32.t(message.zoneSrc));
            bb.writeShort(U16.t(message.zone));
            bb.writeByte(U8.t(message.recircTable));
            // pad: 3 bytes
            bb.writeZero(3);
            bb.writeShort(U16.t(message.alg));
            ChannelUtils.writeList(bb, message.actions);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionNiciraCtVer14(");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("zoneSrc=").append(zoneSrc);
        b.append(", ");
        b.append("zone=").append(zone);
        b.append(", ");
        b.append("recircTable=").append(recircTable);
        b.append(", ");
        b.append("alg=").append(alg);
        b.append(", ");
        b.append("actions=").append(actions);
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
        OFActionNiciraCtVer14 other = (OFActionNiciraCtVer14) obj;

        if( flags != other.flags)
            return false;
        if( zoneSrc != other.zoneSrc)
            return false;
        if( zone != other.zone)
            return false;
        if( recircTable != other.recircTable)
            return false;
        if( alg != other.alg)
            return false;
        if (actions == null) {
            if (other.actions != null)
                return false;
        } else if (!actions.equals(other.actions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + flags;
        result = prime *  (int) (zoneSrc ^ (zoneSrc >>> 32));
        result = prime * result + zone;
        result = prime * result + recircTable;
        result = prime * result + alg;
        result = prime * result + ((actions == null) ? 0 : actions.hashCode());
        return result;
    }

}
