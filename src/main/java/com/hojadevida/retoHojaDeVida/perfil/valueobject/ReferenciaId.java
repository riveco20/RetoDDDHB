package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.Identity;

public class ReferenciaId extends Identity {


    public ReferenciaId() {
    }

    public ReferenciaId(String id) {
        super(id);
    }

    public static ReferenciaId of(String id) {
        return new ReferenciaId(id);
    }
}
