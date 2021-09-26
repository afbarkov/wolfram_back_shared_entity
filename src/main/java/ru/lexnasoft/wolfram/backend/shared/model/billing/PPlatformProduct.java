package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.enums.Platform;

import java.util.UUID;

@Getter
@Setter

public class PPlatformProduct extends PObject {
    @Expose
    private UUID productId;
    @Expose
    private Platform platform;
    @Expose
    private String externalId;

}
