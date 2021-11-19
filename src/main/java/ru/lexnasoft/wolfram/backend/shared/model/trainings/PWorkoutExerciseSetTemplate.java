package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.trainings.enums.SetType;

import java.util.UUID;

@Getter
@Setter
public class PWorkoutExerciseSetTemplate extends PObject {
    @Expose
    private Float plannedWeight;
    @Expose
    private Integer plannedReps;
    @Expose
    private UUID exerciseTemplateId;
    @Expose
    private int orderNum;

    @Expose
    private SetType setType;
    @Expose
    private UUID parentSet;
}
