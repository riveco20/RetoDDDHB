package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;

public class ReferenciaAgregada extends DomainEvent {
    public ReferenciaAgregada() {
        super("hojadevida.perfil.nuevareferenciaagregada");
    }
}
