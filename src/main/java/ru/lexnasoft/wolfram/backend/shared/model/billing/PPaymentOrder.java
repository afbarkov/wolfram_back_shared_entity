package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

import java.time.Instant;

@Getter
@Setter

public class PPaymentOrder extends PObject {
    @Expose
    private String externalPlatformOrderId;
    @Expose
    private Float amount;
    @Expose
    private String currency;
    @Expose
    private Instant paymentDate;

}
