//package me.kenqcl.kafka;

/*
    a simple kafka producer
*/

import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.kafka.common.serialization.LongSerializer;


public class HelloKafka {

    private static Producer<Long, String> producer;
    private static String TOPIC = "test1";
    private static String BOOTSTRAP_SERVERS = "k8c1:9092,k8c1:9093,k8c1:9094";


    public HelloKafka() {
        Properties props = new Properties();
        props.put("metadata.broker.list", "master:9092, worker1:9092, worker2:9092");
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("request.required.acks", "1");

        ProducerConfig config = new ProducerConfig(props);
        producer = new Producer<String, String>(config);
    }

    private static Producer<Long, String> createProducer() {
        Properties props = new Properties();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS
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

