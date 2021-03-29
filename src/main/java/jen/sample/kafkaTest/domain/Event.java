package jen.sample.kafkaTest.domain;

import java.io.Serializable;
import java.util.UUID;

public class Event implements Serializable {

    private UUID learnerId;
    private int sequenceId;

    public Event(UUID learnerId, int sequenceId) {
        this.learnerId = learnerId;
        this.sequenceId = sequenceId;
    }

    public UUID getLearnerId() {
        return learnerId;
    }

    public void setLearnerId(UUID learnerId) {
        this.learnerId = learnerId;
    }

    public int getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
    }

    @Override
    public String toString() {
        return "Event{" +
                "learnerId=" + learnerId +
                ", sequenceId=" + sequenceId +
                '}';
    }
}
