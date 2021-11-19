package ru.lexnasoft.wolfram.backend.shared.model.billing.notification;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class AppStoreRenewalInfo {
    @Expose
    private String originalTransactionId;
    @Expose
    private Integer autoRenewStatus;
    @Expose
    private Integer expirationIntent;

    @Expose
    private Instant gracePeriodExpiresDate;
    @Expose
    private Boolean isInBillingRetryPeriod;
    @Expose
    private String offerIdentifier;
    @Expose
    private Integer offerType;
    @Expose
    private Integer priceIncreaseStatus;
    @Expose
    private String autoRenewProductId;
    @Expose
    private String productId;

    @Expose
    private Instant signedDate;
}
