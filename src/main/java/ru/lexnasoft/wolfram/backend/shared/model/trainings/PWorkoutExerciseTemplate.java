package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.trainings.enums.ExerciseType;

import java.util.UUID;

@Getter
@Setter
public class PWorkoutExerciseTemplate extends PObject {
    @Expose
    private String name;
    @Expose
    private UUID workoutTemplate;
    @Expose
    private int orderNum;
    @Expose
    private ExerciseType exerciseType;
    @Expose
    private UUID parentExerciseId;


}
