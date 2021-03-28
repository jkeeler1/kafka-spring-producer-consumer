package jen.sample.streams.service;

import jen.sample.streams.domain.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class KafkaSenderTemplate {

    private static final Logger logger = LoggerFactory.getLogger(KafkaSenderTemplate.class);
    private KafkaTemplate<UUID, Event> kafkaTemplate;

    @Autowired
    KafkaSenderTemplate(KafkaTemplate<UUID, Event> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topicName, UUID key, Event event) {
        logger.debug("{}: {}={}", topicName, key, event);
        this.kafkaTemplate.send(topicName, key, event);
    }
}
