package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;

public class ActualizarNombreCompletoReferencia extends Command {
    private final PerfilId perfilId;
    private final NombreCompleto nombreCompleto;

    public ActualizarNombreCompletoReferencia(PerfilId perfilId,NombreCompleto nombreCompleto) {
        this.perfilId = perfilId;
        this.nombreCompleto = nombreCompleto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }


}

