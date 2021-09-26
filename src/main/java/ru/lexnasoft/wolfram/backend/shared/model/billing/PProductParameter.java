package ru.lexnasoft.wolfram.backend.shared.model.billing;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.enums.ParameterType;

@Getter
@Setter
public class PProductParameter {
    @Expose
    private String name;
    @Expose
    private String strValue;
    @Expose
    private Integer intValue;
    @Expose
    private Boolean booleanValue;
    @Expose
    private ParameterType parameterType;

}
