package ru.lexnasoft.wolfram.backend.shared.model;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class PObject implements Serializable {

    @Expose
    private UUID id = UUID.randomUUID();
    @Expose
    private Instant created = Instant.now();
    @Expose
    private Instant updated = Instant.now();
    @Expose
    private UUID createdBy;
    @Expose
    private UUID updatedBy;
    @Expose
    private UUID owner;

}
