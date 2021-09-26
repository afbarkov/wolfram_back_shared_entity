package ru.lexnasoft.wolfram.backend.shared.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class PLocalizedString {

    private String language;

    private String value;
}
