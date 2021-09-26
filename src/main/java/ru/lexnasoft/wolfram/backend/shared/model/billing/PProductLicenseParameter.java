package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.enums.LicenseItemType;
import ru.lexnasoft.wolfram.backend.shared.model.enums.LicenseOperation;
import ru.lexnasoft.wolfram.backend.shared.model.enums.ParameterType;

import java.util.UUID;

@Getter
@Setter
public class PProductLicenseParameter {
    @Expose
    private LicenseItemType type;
    @Expose
    private LicenseOperation operation;
    @Expose
    private Integer value;

}
