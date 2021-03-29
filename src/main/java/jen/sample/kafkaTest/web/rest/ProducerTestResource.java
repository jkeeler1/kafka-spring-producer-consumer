package jen.sample.kafkaTest.web.rest;

import jen.sample.kafkaTest.configuration.KafkaTopicConfig;
import jen.sample.kafkaTest.domain.Event;
import jen.sample.kafkaTest.service.KafkaSenderTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/produce")
public class ProducerTestResource {

    private static final Logger logger = LoggerFactory.getLogger(ProducerTestResource.class);

    private KafkaSenderTemplate senderTemplate;

    @Inject
    public ProducerTestResource(KafkaSenderTemplate senderTemplate) {
        this.senderTemplate = senderTemplate;
    }

    @PostMapping
    public void sendEvent(Event event) {


        senderTemplate.sendMessage(KafkaTopicConfig.TRAINING_EVENT, event.getLearnerId(), event);
    }

}

