package com.hojadevida.retoHojaDeVida.domian.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionDeContacto implements ValueObject<String> {

    private final String value;

    public InformacionDeContacto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La informacion de contacto no debe estar vacia");
        }

        if (this.value.length() <= 2) {
            throw new IllegalArgumentException("la informacion de contacto debe tener mas caracteres ");
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
        InformacionDeContacto informacionDeContacto = (InformacionDeContacto) object;
        return Objects.equals(value,informacionDeContacto.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
