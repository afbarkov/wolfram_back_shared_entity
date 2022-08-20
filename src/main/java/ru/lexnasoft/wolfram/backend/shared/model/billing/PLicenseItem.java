package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.enums.LicenseItemType;

@Getter
@Setter
public class PLicenseItem {
    @Expose
    private LicenseItemType type;
    @Expose
    private Integer value;
    @Expose
    private Integer used;
}
