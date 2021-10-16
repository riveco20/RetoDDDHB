package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.FotoPerfil;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;

public class ActualizarFotoPerfil extends Command {
    private final PerfilId perfilId;
    private final FotoPerfil fotoPerfil;


    public ActualizarFotoPerfil(PerfilId perfilId, FotoPerfil fotoPerfil) {
        this.perfilId = perfilId;
        this.fotoPerfil = fotoPerfil;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public FotoPerfil getFotoPerfil() {
        return fotoPerfil;
    }
}
