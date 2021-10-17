package com.hojadevida.retoHojaDeVida.domian.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.ReferenciaId;

public class NombreCompletoReferenciaActualizado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    public NombreCompletoReferenciaActualizado(NombreCompleto nombreCompleto) {
        super("hojadevida.perfil.NombreReferenicaActualizado");
        this.nombreCompleto = nombreCompleto;

    }

        public NombreCompleto getNombreCompleto () {
            return nombreCompleto;
        }

}
