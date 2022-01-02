package ru.lexnasoft.wolfram.backend.shared.model.kafka;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KafkaMessage {
    @Expose
    private KafkaMessageType messageType;
    @Expose
    private KafkaTransactionEvent transactionEvent;
    @Expose
    private KafkaBusinessOperation businessOperation;
}
