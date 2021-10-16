package com.hojadevida.retoHojaDeVida.perfil.command;

import com.hojadevida.retoHojaDeVida.perfil.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.PerfilId;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.ReferenciaId;

public class ActualizarNombreCompletoReferencia {
    private final PerfilId perfilId;
    private final ReferenciaId referenciaId;
    private final NombreCompleto nombreCompleto;

    public ActualizarNombreCompletoReferencia(PerfilId perfilId, ReferenciaId referenciaId, NombreCompleto nombreCompleto) {
        this.perfilId = perfilId;
        this.referenciaId = referenciaId;
        this.nombreCompleto = nombreCompleto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }


}

