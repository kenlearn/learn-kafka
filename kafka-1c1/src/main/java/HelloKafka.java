//package me.kenqcl.kafka;

/*
    a simple kafka producer
*/

import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;


public class HelloKafka {

    private static KafkaProducer<String, String> producer;

    public HelloKafka() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "master:9092, worker1:9092, worker2:9092");
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "HelloKafka");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName());

        producer = new KafkaProducer<String, String>(props);
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

