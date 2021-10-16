package com.hojadevida.retoHojaDeVida.gestionCertificacion;


import co.com.sofka.domain.generic.AggregateEvent;
import com.hojadevida.retoHojaDeVida.gestionCertificacion.valueobject.CertificacionId;
import com.hojadevida.retoHojaDeVida.gestionCertificacion.valueobject.HojaDeVidad;
import com.hojadevida.retoHojaDeVida.gestionCertificacion.valueobject.Nombre;

public class GestionCertificacion extends AggregateEvent<CertificacionId> {

    protected Nombre nombre;
    protected HojaDeVidad hojaDeVidad;

    public GestionCertificacion(CertificacionId entityId, Nombre nombre) {
        super(entityId);
    }
}
