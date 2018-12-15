package com.thenet.sample.gateway;

import com.hazelcast.core.Message;
import com.thenet.abstractnode.domain.Call;
import com.thenet.abstractnode.domain.Request;
import com.thenet.gateway.Gateway;
import io.javalin.Javalin;

import java.util.List;

public class SampleGatewayWithJavalin extends Gateway {

    private static final String TEST_TOPIC = "GET_ALL_PERSONS";

    public SampleGatewayWithJavalin() {
        super("SampleGateway", 0);
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> {
            ctx.result(getAllPersons().toString());
        });
    }

    private List<?> getAllPersons() {
        return this.send(createCall());
    }

    private Call createCall() {
        return new Call(Call.RequestType.GET, TEST_TOPIC, getSource(), new Request());
    }

    @Override
    public void onMessage(Message<Call> call) {
        System.out.println("Response received from service node");
    }

    public static void main(String[] args) {
        new SampleGatewayWithJavalin();
    }




}
