package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<String> {

    private final String nombre;
    private final String apllido;

    public NombreCompleto(String nombre, String apllido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apllido =Objects.requireNonNull(apllido);
    }

    @Override
    public String value() {
        return null;
    }
}
