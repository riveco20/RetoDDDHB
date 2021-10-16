package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<String> {

    private final String value;

    public NombreCompleto(String nombre , String apllido) {
        this.value = Objects.requireNonNull(nombre + apllido);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("debes ingresar un nombre y apellido");
        }
        if (this.value.length() <= 10) {
            throw new IllegalArgumentException("el nombre completo debe tener mas caracteres ");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        NombreCompleto nombreCompleto = (NombreCompleto) object;
        return Objects.equals(value, nombreCompleto.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
