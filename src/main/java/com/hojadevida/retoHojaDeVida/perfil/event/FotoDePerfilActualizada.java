package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.FotoPerfil;

public class FotoDePerfilActualizada extends DomainEvent {
    private final FotoPerfil fotoPerfil;
    public FotoDePerfilActualizada(FotoPerfil fotoPerfil) {
        super("hojadevida.perfil.FotoPerfilActualizada");
        this.fotoPerfil=fotoPerfil;
    }

    public FotoPerfil getFotoPerfil() {
        return fotoPerfil;
    }
}
