package com.thenet.gateway;

import com.thenet.gateway.Gateway;

public class SampleGateway extends Gateway {

    public SampleGateway() {
        super("SampleGateway", 0);
    }

    public static void main(String[] args) {
        new SampleGateway();
    }

}
