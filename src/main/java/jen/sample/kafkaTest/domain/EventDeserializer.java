package jen.sample.kafkaTest.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

public class EventDeserializer implements Deserializer {

    @Override
    public Object deserialize(String s, byte[] bytes) {
        ObjectMapper mapper = new ObjectMapper();
        Event event = null;
        try {
            event = mapper.readValue(bytes, Event.class);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return event;
    }
}
