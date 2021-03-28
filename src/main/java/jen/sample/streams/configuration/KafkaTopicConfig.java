package jen.sample.streams.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public static final String TRAINING_EVENT = "TRAINING_EVENT";
    public static final String SELECTION_TOPIC = "SELECTION_TOPIC";

    @Bean
    public NewTopic trainingTopic() {
        return TopicBuilder.name(TRAINING_EVENT).build();
    }

    @Bean
    public NewTopic selectionTopic() {
        return TopicBuilder.name(SELECTION_TOPIC).build();
    }
}