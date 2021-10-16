package com.hojadevida.retoHojaDeVida.gestionCertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class PeriodoCertificacionModificado extends DomainEvent {
    public PeriodoCertificacionModificado() {
        super("drawio.gestioncertificacion.periodocertificacionmodificado");
    }
}
