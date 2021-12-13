package org.projectfloodlight.openflow.protocol;

public class OFWparamsConfigTLV {
    private OFWparamsConfigType type;
    private int length;
    private String value;
    
    public OFWparamsConfigTLV(OFWparamsConfigType type, String value){
        this.type = type;
        this.value = value;
    }
}
