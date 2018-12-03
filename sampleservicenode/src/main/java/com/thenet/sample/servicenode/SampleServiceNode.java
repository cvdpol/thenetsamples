package com.thenet.sample.servicenode;


import com.thenet.datanode.ServiceNode;

import java.util.Arrays;

public class SampleServiceNode extends ServiceNode {

    public SampleServiceNode() {
        super("SampleServiceNode", 0, Arrays.asList("TEST_1"));
    }

    public static void main(String[] args) {
        new SampleServiceNode();
    }

}
