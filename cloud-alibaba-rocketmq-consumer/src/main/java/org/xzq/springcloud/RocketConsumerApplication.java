package org.xzq.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.binder.PollableMessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.messaging.SubscribableChannel;
import org.xzq.springcloud.service.MySink;
import org.xzq.springcloud.service.impl.ConsumerCustomRunner;

/**
 * Hello world!
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableBinding({ MySink.class })
public class RocketConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketConsumerApplication.class, args);
    }

    @Bean
    public ConsumerCustomRunner customRunner() {
        return new ConsumerCustomRunner();
    }
}
