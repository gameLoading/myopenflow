// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
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
import java.util.Set;
import java.util.List;


public class OFActionsVer14 implements OFActions {
    public final static OFActionsVer14 INSTANCE = new OFActionsVer14();




    public OFActionBsnChecksum.Builder buildBsnChecksum() {
        return new OFActionBsnChecksumVer14.Builder();
    }
    public OFActionBsnChecksum bsnChecksum(U128 checksum) {
        return new OFActionBsnChecksumVer14(
                checksum
                    );
    }

    public OFActionBsnMirror.Builder buildBsnMirror() {
        return new OFActionBsnMirrorVer14.Builder();
    }

    public OFActionBsnSetTunnelDst.Builder buildBsnSetTunnelDst() {
        return new OFActionBsnSetTunnelDstVer14.Builder();
    }
    public OFActionBsnSetTunnelDst bsnSetTunnelDst(long dst) {
        return new OFActionBsnSetTunnelDstVer14(
                dst
                    );
    }

    public OFActionEnqueue.Builder buildEnqueue() {
        throw new UnsupportedOperationException("OFActionEnqueue not supported in version 1.4");
    }
    public OFActionEnqueue enqueue(OFPort port, long queueId) {
        throw new UnsupportedOperationException("OFActionEnqueue not supported in version 1.4");
    }

    public OFActionNiciraDecTtl niciraDecTtl() {
        return OFActionNiciraDecTtlVer14.INSTANCE;
    }

    public OFActionNiciraLoad.Builder buildNiciraLoad() {
        return new OFActionNiciraLoadVer14.Builder();
    }

    public OFActionNiciraMove.Builder buildNiciraMove() {
        return new OFActionNiciraMoveVer14.Builder();
    }

    public OFActionNiciraPopNsh niciraPopNsh() {
        return OFActionNiciraPopNshVer14.INSTANCE;
    }

    public OFActionNiciraPopQueue niciraPopQueue() {
        return OFActionNiciraPopQueueVer14.INSTANCE;
    }

    public OFActionNiciraPushNsh niciraPushNsh() {
        return OFActionNiciraPushNshVer14.INSTANCE;
    }

    public OFActionNiciraResubmit.Builder buildNiciraResubmit() {
        return new OFActionNiciraResubmitVer14.Builder();
    }
    public OFActionNiciraResubmit niciraResubmit(int inPort, short table) {
        return new OFActionNiciraResubmitVer14(
                inPort,
                      table
                    );
    }

    public OFActionNiciraResubmitTable.Builder buildNiciraResubmitTable() {
        return new OFActionNiciraResubmitTableVer14.Builder();
    }
    public OFActionNiciraResubmitTable niciraResubmitTable(int inPort, short table) {
        return new OFActionNiciraResubmitTableVer14(
                inPort,
                      table
                    );
    }

    public OFActionNiciraSetQueue.Builder buildNiciraSetQueue() {
        return new OFActionNiciraSetQueueVer14.Builder();
    }
    public OFActionNiciraSetQueue niciraSetQueue(long queueId) {
        return new OFActionNiciraSetQueueVer14(
                queueId
                    );
    }

    public OFActionOutput.Builder buildOutput() {
        return new OFActionOutputVer14.Builder();
    }
    public OFActionOutput output(OFPort port, int maxLen) {
        return new OFActionOutputVer14(
                port,
                      maxLen
                    );
    }

    public OFActionSetDlDst.Builder buildSetDlDst() {
        throw new UnsupportedOperationException("OFActionSetDlDst not supported in version 1.4");
    }
    public OFActionSetDlDst setDlDst(MacAddress dlAddr) {
        throw new UnsupportedOperationException("OFActionSetDlDst not supported in version 1.4");
    }

    public OFActionSetDlSrc.Builder buildSetDlSrc() {
        throw new UnsupportedOperationException("OFActionSetDlSrc not supported in version 1.4");
    }
    public OFActionSetDlSrc setDlSrc(MacAddress dlAddr) {
        throw new UnsupportedOperationException("OFActionSetDlSrc not supported in version 1.4");
    }

    public OFActionSetNwDst.Builder buildSetNwDst() {
        throw new UnsupportedOperationException("OFActionSetNwDst not supported in version 1.4");
    }
    public OFActionSetNwDst setNwDst(IPv4Address nwAddr) {
        throw new UnsupportedOperationException("OFActionSetNwDst not supported in version 1.4");
    }

    public OFActionSetNwSrc.Builder buildSetNwSrc() {
        throw new UnsupportedOperationException("OFActionSetNwSrc not supported in version 1.4");
    }
    public OFActionSetNwSrc setNwSrc(IPv4Address nwAddr) {
        throw new UnsupportedOperationException("OFActionSetNwSrc not supported in version 1.4");
    }

    public OFActionSetNwTos.Builder buildSetNwTos() {
        throw new UnsupportedOperationException("OFActionSetNwTos not supported in version 1.4");
    }
    public OFActionSetNwTos setNwTos(short nwTos) {
        throw new UnsupportedOperationException("OFActionSetNwTos not supported in version 1.4");
    }

    public OFActionSetTpDst.Builder buildSetTpDst() {
        throw new UnsupportedOperationException("OFActionSetTpDst not supported in version 1.4");
    }
    public OFActionSetTpDst setTpDst(TransportPort tpPort) {
        throw new UnsupportedOperationException("OFActionSetTpDst not supported in version 1.4");
    }

    public OFActionSetTpSrc.Builder buildSetTpSrc() {
        throw new UnsupportedOperationException("OFActionSetTpSrc not supported in version 1.4");
    }
    public OFActionSetTpSrc setTpSrc(TransportPort tpPort) {
        throw new UnsupportedOperationException("OFActionSetTpSrc not supported in version 1.4");
    }

    public OFActionSetVlanPcp.Builder buildSetVlanPcp() {
        throw new UnsupportedOperationException("OFActionSetVlanPcp not supported in version 1.4");
    }
    public OFActionSetVlanPcp setVlanPcp(VlanPcp vlanPcp) {
        throw new UnsupportedOperationException("OFActionSetVlanPcp not supported in version 1.4");
    }

    public OFActionSetVlanVid.Builder buildSetVlanVid() {
        throw new UnsupportedOperationException("OFActionSetVlanVid not supported in version 1.4");
    }
    public OFActionSetVlanVid setVlanVid(VlanVid vlanVid) {
        throw new UnsupportedOperationException("OFActionSetVlanVid not supported in version 1.4");
    }

    public OFActionStripVlan stripVlan() {
        throw new UnsupportedOperationException("OFActionStripVlan not supported in version 1.4");
    }

    public OFActionCopyTtlIn copyTtlIn() {
        return OFActionCopyTtlInVer14.INSTANCE;
    }

    public OFActionCopyTtlOut copyTtlOut() {
        return OFActionCopyTtlOutVer14.INSTANCE;
    }

    public OFActionDecMplsTtl decMplsTtl() {
        return OFActionDecMplsTtlVer14.INSTANCE;
    }

    public OFActionDecNwTtl decNwTtl() {
        return OFActionDecNwTtlVer14.INSTANCE;
    }

    public OFActionGroup.Builder buildGroup() {
        return new OFActionGroupVer14.Builder();
    }
    public OFActionGroup group(OFGroup group) {
        return new OFActionGroupVer14(
                group
                    );
    }

    public OFActionPopMpls.Builder buildPopMpls() {
        return new OFActionPopMplsVer14.Builder();
    }
    public OFActionPopMpls popMpls(EthType ethertype) {
        return new OFActionPopMplsVer14(
                ethertype
                    );
    }

    public OFActionPopVlan popVlan() {
        return OFActionPopVlanVer14.INSTANCE;
    }

    public OFActionPushMpls.Builder buildPushMpls() {
        return new OFActionPushMplsVer14.Builder();
    }
    public OFActionPushMpls pushMpls(EthType ethertype) {
        return new OFActionPushMplsVer14(
                ethertype
                    );
    }

    public OFActionPushVlan.Builder buildPushVlan() {
        return new OFActionPushVlanVer14.Builder();
    }
    public OFActionPushVlan pushVlan(EthType ethertype) {
        return new OFActionPushVlanVer14(
                ethertype
                    );
    }

    public OFActionSetMplsLabel.Builder buildSetMplsLabel() {
        throw new UnsupportedOperationException("OFActionSetMplsLabel not supported in version 1.4");
    }
    public OFActionSetMplsLabel setMplsLabel(long mplsLabel) {
        throw new UnsupportedOperationException("OFActionSetMplsLabel not supported in version 1.4");
    }

    public OFActionSetMplsTc.Builder buildSetMplsTc() {
        throw new UnsupportedOperationException("OFActionSetMplsTc not supported in version 1.4");
    }
    public OFActionSetMplsTc setMplsTc(short mplsTc) {
        throw new UnsupportedOperationException("OFActionSetMplsTc not supported in version 1.4");
    }

    public OFActionSetMplsTtl.Builder buildSetMplsTtl() {
        return new OFActionSetMplsTtlVer14.Builder();
    }
    public OFActionSetMplsTtl setMplsTtl(short mplsTtl) {
        return new OFActionSetMplsTtlVer14(
                mplsTtl
                    );
    }

    public OFActionSetNwEcn.Builder buildSetNwEcn() {
        throw new UnsupportedOperationException("OFActionSetNwEcn not supported in version 1.4");
    }
    public OFActionSetNwEcn setNwEcn(IpEcn nwEcn) {
        throw new UnsupportedOperationException("OFActionSetNwEcn not supported in version 1.4");
    }

    public OFActionSetNwTtl.Builder buildSetNwTtl() {
        return new OFActionSetNwTtlVer14.Builder();
    }
    public OFActionSetNwTtl setNwTtl(short nwTtl) {
        return new OFActionSetNwTtlVer14(
                nwTtl
                    );
    }

    public OFActionSetQueue.Builder buildSetQueue() {
        return new OFActionSetQueueVer14.Builder();
    }
    public OFActionSetQueue setQueue(long queueId) {
        return new OFActionSetQueueVer14(
                queueId
                    );
    }

    public OFActionNiciraCt.Builder buildNiciraCt() {
        return new OFActionNiciraCtVer14.Builder();
    }

    public OFActionNiciraCtClear niciraCtClear() {
        return OFActionNiciraCtClearVer14.INSTANCE;
    }

    public OFActionNiciraNat.Builder buildNiciraNat() {
        return new OFActionNiciraNatVer14.Builder();
    }

    public OFActionSetField.Builder buildSetField() {
        return new OFActionSetFieldVer14.Builder();
    }
    public OFActionSetField setField(OFOxm<?> field) {
        return new OFActionSetFieldVer14(
                field
                    );
    }

    public OFActionBsnGentable.Builder buildBsnGentable() {
        return new OFActionBsnGentableVer14.Builder();
    }
    public OFActionBsnGentable bsnGentable(long tableId, List<OFBsnTlv> key) {
        return new OFActionBsnGentableVer14(
                tableId,
                      key
                    );
    }

    public OFActionCircuit.Builder buildCircuit() {
        throw new UnsupportedOperationException("OFActionCircuit not supported in version 1.4");
    }
    public OFActionCircuit circuit(OFOxm<?> field) {
        throw new UnsupportedOperationException("OFActionCircuit not supported in version 1.4");
    }

    public OFActionOfdpaPopCw ofdpaPopCw() {
        throw new UnsupportedOperationException("OFActionOfdpaPopCw not supported in version 1.4");
    }

    public OFActionOfdpaPopL2Header ofdpaPopL2Header() {
        throw new UnsupportedOperationException("OFActionOfdpaPopL2Header not supported in version 1.4");
    }

    public OFActionOfdpaPushCw ofdpaPushCw() {
        throw new UnsupportedOperationException("OFActionOfdpaPushCw not supported in version 1.4");
    }

    public OFActionOfdpaPushL2Header ofdpaPushL2Header() {
        throw new UnsupportedOperationException("OFActionOfdpaPushL2Header not supported in version 1.4");
    }

    public OFActionOfdpaSetVlanTranslation ofdpaSetVlanTranslation() {
        throw new UnsupportedOperationException("OFActionOfdpaSetVlanTranslation not supported in version 1.4");
    }

    public OFActionOnfCopyField.Builder buildOnfCopyField() {
        throw new UnsupportedOperationException("OFActionOnfCopyField not supported in version 1.4");
    }

    public OFActionOplinkAtt.Builder buildOplinkAtt() {
        throw new UnsupportedOperationException("OFActionOplinkAtt not supported in version 1.4");
    }
    public OFActionOplinkAtt oplinkAtt(OFOxm<?> field) {
        throw new UnsupportedOperationException("OFActionOplinkAtt not supported in version 1.4");
    }

    public OFActionPopPbb popPbb() {
        return OFActionPopPbbVer14.INSTANCE;
    }

    public OFActionPushPbb.Builder buildPushPbb() {
        return new OFActionPushPbbVer14.Builder();
    }
    public OFActionPushPbb pushPbb(EthType ethertype) {
        return new OFActionPushPbbVer14(
                ethertype
                    );
    }

    public OFActionMeter.Builder buildMeter() {
        throw new UnsupportedOperationException("OFActionMeter not supported in version 1.4");
    }
    public OFActionMeter meter(long meterId) {
        throw new UnsupportedOperationException("OFActionMeter not supported in version 1.4");
    }

    public OFMessageReader<OFAction> getReader() {
        return OFActionVer14.READER;
    }


    public OFVersion getVersion() {
            return OFVersion.OF_14;
    }
}