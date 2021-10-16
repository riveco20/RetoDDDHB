package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.NombreCompleto;

public class NombreCompletoReferenciaActualizado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    public NombreCompletoReferenciaActualizado(NombreCompleto nombreCompleto) {
        super("hojadevida.perfil.NombreReferenicaActualizado");
        this.nombreCompleto=nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
