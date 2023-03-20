package io.github.brunoonofre.mscustomer.domain.exception;

import io.github.brunoonofre.mscustomer.domain.enums.ErrorMessage;

public class BusinesRuleException extends RuntimeException {

    final ErrorMessage message;

    public BusinesRuleException(ErrorMessage message) {
        this.message = message;
    }
}
