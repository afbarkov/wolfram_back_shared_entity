package ru.lexnasoft.wolfram.backend.shared.model.billing.notification;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class AppStoreNotification {
    @Expose
    private AppStoreNotificationType notificationType;
    @Expose
    private AppStoreNotificationSubType subtype;
    @Expose
    private UUID notificationUUID;
    @Expose
    private String notificationVersion;
    @Expose
    private String bundleId;
    @Expose
    private String bundleVersion;
    @Expose
    private String environment;
    @Expose
    private String appAppleId;
    @Expose
    private AppStoreTransaction transaction;
    @Expose
    private AppStoreRenewalInfo renewalInfo;
}
