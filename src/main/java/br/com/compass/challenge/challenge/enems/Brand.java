package br.com.compass.challenge.challenge.enems;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Brand {

    @JsonProperty("Ford")
    FORD,

    @JsonProperty("Chevrolet")
    CHEVROLET,

    BMW,

    @JsonProperty("Volvo")
    VOLVO
}
