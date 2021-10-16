package com.hojadevida.retoHojaDeVida.gestionCertificacion.event;

import co.com.sofka.domain.generic.DomainEvent;

public class CertificacionEliminada extends DomainEvent {
    public CertificacionEliminada() {
        super("drawio.gestioncertificacion.certificacionEliminada");
    }
}
