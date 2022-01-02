package ru.lexnasoft.wolfram.backend.shared.model.kafka;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
public class KafkaTransactionEvent {
    @Expose
    private UUID owner;
    @Expose
    private UUID transactionId=UUID.randomUUID();
    @Expose
    private List<KafkaTransactionEventItem> transactionEventItems=new LinkedList<>();

}
