package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaEliminada extends DomainEvent {
    public ReferenciaEliminada() {
        super("hojadevida.perfil.referenciaeliminada");
    }
}
