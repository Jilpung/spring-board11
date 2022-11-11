package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("ROLE_AMDIN"),
    USER("ROLE_USER");

    private String value;
}
