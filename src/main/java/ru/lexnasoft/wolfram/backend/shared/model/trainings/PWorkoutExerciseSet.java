package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

import java.time.Duration;
import java.util.UUID;

@Getter
@Setter
public class PWorkoutExerciseSet extends PObject {
    @Expose
    private Float plannedWeight;
    @Expose
    private Integer plannedReps;
    @Expose
    private Float actualWeight;
    @Expose
    private Integer actualReps;
    @Expose
    private UUID exerciseId;
    @Expose
    private int orderNum;
    @Expose
    private Duration restDuration;
}
