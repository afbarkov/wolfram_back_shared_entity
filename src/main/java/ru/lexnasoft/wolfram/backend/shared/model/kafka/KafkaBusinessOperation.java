package ru.lexnasoft.wolfram.backend.shared.model.kafka;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class KafkaBusinessOperation {
   @Expose
   private UUID owner;
   @Expose
   private List<KafkaBusinessOperationItem> businessOperationItems = new LinkedList<>();
}
