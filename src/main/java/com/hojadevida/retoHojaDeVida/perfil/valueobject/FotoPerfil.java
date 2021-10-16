package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FotoPerfil implements ValueObject<String> {
    private final String value;

    public FotoPerfil(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Debes Agregar una foto");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FotoPerfil fotoPerfil1 = (FotoPerfil) o;
        return Objects.equals(value, fotoPerfil1.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
