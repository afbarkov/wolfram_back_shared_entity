package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.trainings.enums.MeasurementType;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Accessors(chain = true)
public class PMeasurements extends PObject {
    @Expose
    private LocalDate measurementDate;
    @Expose
    private Set<PMeasurementItem> measurementsItems=new HashSet<>();


}
