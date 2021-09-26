package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.enums.PurchasedProductStatus;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter

public class PPurchasedProduct extends PObject {

    @Expose
    private UUID platformProductId;
    @Expose
    private PurchasedProductStatus status;
    @Expose
    private Instant activeFrom;
    @Expose
    private Instant activeTill;
    @Expose
    private Instant nextBillingDate;
    @Expose
    private String externalPurchaseId;
    @Expose
    private UUID personId;
    @Expose
    private UUID productId;
}
