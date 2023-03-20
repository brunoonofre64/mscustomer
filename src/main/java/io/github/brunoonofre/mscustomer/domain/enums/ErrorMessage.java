package io.github.brunoonofre.mscustomer.domain.enums;

import lombok.Getter;

@Getter
public enum ErrorMessage {

    BUSINES_RULE("BUSINES_RULE"),
    BAD_REQUEST("BAD_REQUEST");

    final String value;

    ErrorMessage(String value) {
        this.value = value;
    }
}
