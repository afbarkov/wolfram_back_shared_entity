package ru.lexnasoft.wolfram.backend.shared.model.trainings;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;

@Getter
@Setter
public class PWorkoutTemplate extends PObject {
    @Expose
    private String name;

}
