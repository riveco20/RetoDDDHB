package com.hojadevida.retoHojaDeVida.perfil.valueobject;

import co.com.sofka.domain.generic.Identity;

public class PerfilId extends Identity {
    public PerfilId() {
    }

    public PerfilId(String id) {
        super(id);
    }

    public static PerfilId of(String id) {
        return new PerfilId(id);
    }
}


