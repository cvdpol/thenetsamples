package com.thenet.sample.datanode;

import com.thenet.datanode.DataNode;

import java.util.Arrays;

public class SampleDataNode extends DataNode {

    public SampleDataNode() {
        super("SampleDataNode", 0, Arrays.asList("TEST_1"));
    }

    public static void main(String[] args) {
        new SampleDataNode();
    }

}
