package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.ReferenciaId;

public class NombreCompletoReferenciaActualizado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    private final ReferenciaId referenciaId;
    public NombreCompletoReferenciaActualizado(ReferenciaId referenciaId, NombreCompleto nombreCompleto) {
        super("hojadevida.perfil.NombreReferenicaActualizado");
        this.nombreCompleto=nombreCompleto;
        this.referenciaId = referenciaId;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}
