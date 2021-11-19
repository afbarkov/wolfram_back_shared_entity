package ru.lexnasoft.wolfram.backend.shared.model.billing.notification;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class AppStoreTransaction {
    @Expose
    private UUID appAccountToken;
    @Expose
    private Boolean isUpgraded;
    @Expose
    private String offerIdentifier;
    @Expose
    private Integer offerType;
    @Expose
    private String transactionId;
    @Expose
    private String originalTransactionId;
    @Expose
    private String webOrderLineItemId;
    @Expose
    private String bundleId;
    @Expose
    private String productId;
    @Expose
    private Integer subscriptionGroupIdentifier;
    @Expose
    private Instant purchaseDate;
    @Expose
    private Instant originalPurchaseDate;
    @Expose
    private Instant expiresDate;
    @Expose
    private Integer quantity;
    @Expose
    private String type;
    @Expose
    private String inAppOwnershipType;
    @Expose
    private Instant signedDate;
    @Expose
    private Instant revocationDate;
    @Expose
    private Integer revocationReason;
}
