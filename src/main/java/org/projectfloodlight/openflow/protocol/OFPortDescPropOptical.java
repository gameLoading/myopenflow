// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package org.projectfloodlight.openflow.protocol;

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
import io.netty.buffer.ByteBuf;

public interface OFPortDescPropOptical extends OFObject, OFPortDescProp {
    int getType();
    long getSupported();
    long getTxMinFreqLmda();
    long getTxMaxFreqLmda();
    long getTxGridFreqLmda();
    long getRxMinFreqLmda();
    long getRxMaxFreqLmda();
    long getRxGridFreqLmda();
    int getTxPwrMin();
    int getTxPwrMax();
    OFVersion getVersion();

    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFPortDescProp.Builder {
        OFPortDescPropOptical build();
        int getType();
        long getSupported();
        Builder setSupported(long supported);
        long getTxMinFreqLmda();
        Builder setTxMinFreqLmda(long txMinFreqLmda);
        long getTxMaxFreqLmda();
        Builder setTxMaxFreqLmda(long txMaxFreqLmda);
        long getTxGridFreqLmda();
        Builder setTxGridFreqLmda(long txGridFreqLmda);
        long getRxMinFreqLmda();
        Builder setRxMinFreqLmda(long rxMinFreqLmda);
        long getRxMaxFreqLmda();
        Builder setRxMaxFreqLmda(long rxMaxFreqLmda);
        long getRxGridFreqLmda();
        Builder setRxGridFreqLmda(long rxGridFreqLmda);
        int getTxPwrMin();
        Builder setTxPwrMin(int txPwrMin);
        int getTxPwrMax();
        Builder setTxPwrMax(int txPwrMax);
        OFVersion getVersion();
    }
}
