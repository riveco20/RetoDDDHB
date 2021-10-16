package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HojaDeVidaId implements ValueObject<Integer> {
    private final Integer value;

    public HojaDeVidaId(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0) {
            throw new IllegalArgumentException("El id debe ser valido y mayor que cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        HojaDeVidaId hojaDeVidaId = (HojaDeVidaId) object;
        return Objects.equals(value, hojaDeVidaId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
