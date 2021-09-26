package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PLocalizedString;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class PProduct extends PObject {
    @Expose
    private List<PLocalizedString> displayName;
    @Expose
    private String productCode;
    @Expose
    private boolean onSale;
//    @Expose
//    private List<PProductParameter> productParameters=new ArrayList<>();
    @Expose
    private List<PProductLicenseParameter> licenseParameters=new ArrayList<>();

    @Expose
    private List<PLocalizedString> description;


}
