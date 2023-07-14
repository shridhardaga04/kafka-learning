package com.example.kafka.stage2;

import com.example.kafka.stage2.kafka.producer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        Producer1 producer1 = context.getBean(Producer1.class);
        Producer2 producer2 = context.getBean(Producer2.class);
        Producer3 producer3 = context.getBean(Producer3.class);
        Producer4 producer4 = context.getBean(Producer4.class);
        Producer5 producer5 = context.getBean(Producer5.class);

        // Sending messages
        producer1.sendMessage("Message from producer 1");
        producer2.sendMessage("Message from producer 2");
        producer3.sendMessage("Message from producer 3");
        producer4.sendMessage("Message from producer 4");
        producer5.sendMessage("Message from producer 5");

        // Wait for the messages to be processed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the application context
        context.close();
    }

}
