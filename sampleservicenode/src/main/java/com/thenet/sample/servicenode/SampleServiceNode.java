package com.thenet.sample.servicenode;


import com.hazelcast.core.Message;
import com.thenet.abstractnode.domain.Call;
import com.thenet.abstractnode.domain.Response;
import com.thenet.datanode.ServiceNode;

import java.util.Arrays;

public class SampleServiceNode extends ServiceNode {


    private static final String TEST_TOPIC = "GET_ALL_PERSONS";


    public SampleServiceNode() {
        super("SampleServiceNode", 0, Arrays.asList(TEST_TOPIC));
    }


    public static void main(String[] args) {
        new SampleServiceNode();
    }

    @Override
    public void onMessage(Message<Call> call) {
        System.out.println("Message received !!, sending response !!");
        call.getMessageObject().setResponse(new Response());
        sendResponse(call);
    }
}
