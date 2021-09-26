package ru.lexnasoft.wolfram.backend.shared.model.frontback;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.lexnasoft.wolfram.backend.shared.model.enums.LicenseItemType;
import ru.lexnasoft.wolfram.backend.shared.model.enums.LicenseOperation;
import ru.lexnasoft.wolfram.backend.shared.model.enums.Platform;
import ru.lexnasoft.wolfram.backend.shared.model.enums.PurchasedProductStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@Accessors(chain = true)
public class OwnedProductDTO implements Serializable {
    @Expose
    private UUID productId;
    @Expose
    private UUID purchasedProductId;
    @Expose
    private UUID platformProductId;
    @Expose
    private Platform purchasePlatform;
    @Expose
    private String platformProductExternalId;
    @Expose
    private String localizedDisplayName;
    @Expose
    private String localizedDescription;
    @Expose
    private Instant activeTill;
    @Expose
    private PurchasedProductStatus status;
    @Expose
    private List<LicenseParameter> licenseParameters=new ArrayList<>();

    @Getter
    @Setter
    public static
    class LicenseParameter
    {
        @Expose
       private LicenseItemType type;
        @Expose
        private LicenseOperation operation;
        @Expose
        private Integer value;
    }
}



