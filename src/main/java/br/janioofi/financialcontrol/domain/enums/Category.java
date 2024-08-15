package br.janioofi.financialcontrol.domain.enums;

import lombok.Getter;

@Getter
public enum Category {
    STUDIES(0, "Estudos"),
    LEISURE(1, "Lazer"),
    FOOD(2, "Alimentação"),
    HOUSING(3, "Moradia"),
    TRANSPORT(4, "Transporte"),
    TRIPS(5, "Viagens"),
    HEALTH(6, "Saúde");

    private final Integer code;
    private final String description;

    Category(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
