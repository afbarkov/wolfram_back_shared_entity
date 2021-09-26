package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PLicense extends PObject {
    @Expose
    private UUID personId;
    @Expose
    private List<PLicenseItem> licenseItems;

}
