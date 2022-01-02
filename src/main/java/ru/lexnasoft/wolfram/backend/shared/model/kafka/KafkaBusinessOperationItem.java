package ru.lexnasoft.wolfram.backend.shared.model.kafka;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
public class KafkaBusinessOperationItem {
    @Expose
    private String operationName;
    @Expose
    private Map<String,Object> parameters = new HashMap<>();
}
