package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.trainings.enums.ExerciseType;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class PWorkoutExercise extends PObject {
    @Expose
    private String name;
    @Expose
    private Instant exerciseBegin;
    @Expose
    private Instant exerciseEnd;
    @Expose
    private String comments;
    @Expose
    private Integer orderNum;
    @Expose
    private UUID workoutId;
    @Expose
    private ExerciseType exerciseType;
    @Expose
    private UUID parentExerciseId;

}
