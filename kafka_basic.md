# Kafka Basic

### start zookeeper
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

### start kafka server
```bash
bin/kafka-server-start.sh config/server.properties

### start as daemon
bin/kafka-server-start.sh -daemon config/server.properties
```

### create topic
```bash
bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
```

### list topic
```bash
bin/kafka-topics.sh --list --zookeeper localhost:2181
```

### decribe topic
```bash
bin/kafka-topics.sh --describe --zookeeper localhost:2181 --topic test
```

### produce messages
```bash
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
```

### consume messages
```bash
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
```
