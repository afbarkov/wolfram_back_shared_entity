package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class PWorkout extends PObject {
    @Expose
    private String name;

    @Expose
    private LocalDate plannedDate;
    @Expose
    private Instant workoutBegin;
    @Expose
    private Instant workoutEnd;

    @Expose
    private String comments;
}
