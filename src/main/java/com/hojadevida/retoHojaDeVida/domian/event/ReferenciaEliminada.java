package com.hojadevida.retoHojaDeVida.domian.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.ReferenciaId;

public class ReferenciaEliminada extends DomainEvent {
    private final ReferenciaId referenciaId;
    private final InformacionDeContacto informacionDeContacto;
    private final NombreCompleto nombreCompleto;

    public ReferenciaEliminada(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super("hojadevida.perfil.referenciaeliminada");
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
