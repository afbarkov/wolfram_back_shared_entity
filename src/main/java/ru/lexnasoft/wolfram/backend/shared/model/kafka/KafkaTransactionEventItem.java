package ru.lexnasoft.wolfram.backend.shared.model.kafka;

import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class KafkaTransactionEventItem {
    @Expose
    private KafkaEventType eventType;
    @Expose
    private UUID entityId;
    @Expose
    private String entityType;
    @Expose
    private UUID owner;
    @Expose
    private JsonElement entity;

}
