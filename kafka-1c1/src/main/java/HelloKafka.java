//package me.kenqcl.kafka;

/*
    a simple kafka producer
*/

import java.util.Date;
import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class HelloKafka {

    private static Producer<String, String> producer;

    public HelloKafka() {
        Properties props = new Properties();
        props.put("metadata.broker.list", "master:9092, worker1:9092, worker2:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("request.required.acks", "1");

        ProducerConfig config = new ProducerConfig(props);
        producer = new Producer<String, String>(config);
    }

    public static void main(String[] args) {
        System.out.println("Hello Kafka");

        int argsCount = args.length;
        if (argsCount <= 1) 
            throw new IllegalArgumentException(
                "Please provide topic name and message count"
            );
        String topic = (String) args[0];
        int count = Integer.parseInt( (String) args[1] );

        System.out.println("Topic Name: " + topic);
        System.out.println("Message Count:" + count);

    }

    
}

