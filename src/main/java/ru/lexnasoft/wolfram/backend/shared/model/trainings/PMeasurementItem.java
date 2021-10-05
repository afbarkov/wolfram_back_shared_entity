package ru.lexnasoft.wolfram.backend.shared.model.trainings;


import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.lexnasoft.wolfram.backend.shared.model.trainings.enums.MeasurementType;

@Getter
@Setter
@Accessors(chain = true)
public class PMeasurementItem
{
    @Expose
    private MeasurementType measurementType;
    @Expose
    private Float measurementValue;
}
