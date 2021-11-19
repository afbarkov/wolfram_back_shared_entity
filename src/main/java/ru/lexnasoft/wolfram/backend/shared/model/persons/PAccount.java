package ru.lexnasoft.wolfram.backend.shared.model.persons;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import ru.lexnasoft.wolfram.backend.shared.model.PObject;
import ru.lexnasoft.wolfram.backend.shared.model.persons.enums.AccountType;

import java.util.UUID;
@Getter
@Setter
public class PAccount extends PObject {
    @Expose
    private UUID personId;
    @Expose
    private AccountType accountType;
    @Expose
    private String externalId;
}
