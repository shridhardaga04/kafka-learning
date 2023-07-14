# kafka-learning

Done basic kafka POCs.

To run Kafka applications on local first we have to run below two commands, to start Zookeeper and kafka server.
`1. bin/zookeeper-server-start.sh config/zookeeper.properties`
`2. bin/kafka-server-start.sh config/server.properties`

To create topic:
`./bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --topic kafka-topic`

To create topic with partision and replication:
`./bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --topic topic1 --partitions 10 --replication-factor 2`

**Stage 1:**
  Created POC where application have 2 consumers, 1 topic, 1 producer
  
  Screenshots:
  
  ![image](https://github.com/shridhardaga04/kafka-learning/assets/47686682/f4f1d917-d9d7-4148-bc93-a004f0d6521f)
  
  ![image](https://github.com/shridhardaga04/kafka-learning/assets/47686682/b45531e3-073a-4bd5-bdd9-be98ff96a8c7)


**Stage 2:**
  Created POC where application have 5 producers, 5 topics (replication factor 2, 10 partitions each), and 5 consumers

  Screenshots:

  ![image](https://github.com/shridhardaga04/kafka-learning/assets/47686682/fbb851a4-de94-42c3-876e-08685e04f9c0)

  ![image](https://github.com/shridhardaga04/kafka-learning/assets/47686682/719ced59-aeb5-4daa-bb64-0f720630b0ee)

  To check if partitions and replications got created we can run below command
  `bin/kafka-topics.sh --describe --topic <topic-name> --bootstrap-server localhost:9092`
  
**Kafka + Spring Boot + MongoDB:**

Created POC where application have kafka producer, consumer, and MongoDB repository

![image](https://github.com/shridhardaga04/kafka-learning/assets/47686682/b56afdd4-92b7-4928-951d-51f0adf283ed)

![Uploading image.png…]()


