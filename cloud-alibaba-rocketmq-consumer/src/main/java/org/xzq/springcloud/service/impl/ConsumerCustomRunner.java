package org.xzq.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.xzq.springcloud.service.MySink;

@Service
public class ConsumerCustomRunner implements CommandLineRunner {

    @Autowired
    private MySink mySink;

    @Override
    public void run(String... args) throws InterruptedException {
        while (true) {
            mySink.input5().poll(m -> {
                String payload = (String) m.getPayload();
                System.out.println("pull msg: " + payload);
            }, new ParameterizedTypeReference<String>() {
            });
            Thread.sleep(2_000);
        }
    }
}
