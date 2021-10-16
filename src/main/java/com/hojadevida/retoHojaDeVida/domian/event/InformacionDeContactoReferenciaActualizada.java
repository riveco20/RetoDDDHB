package com.hojadevida.retoHojaDeVida.domian.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.ReferenciaId;

public class InformacionDeContactoReferenciaActualizada extends DomainEvent {
    private final InformacionDeContacto informacionDeContacto;
    private final ReferenciaId referenciaId;

    public InformacionDeContactoReferenciaActualizada(ReferenciaId referenciaId ,InformacionDeContacto informacionDeContacto) {
        super("hojadevida.perfil.informacionDeContacoReferenciaActualizada");
        this.informacionDeContacto =informacionDeContacto;
        this.referenciaId =referenciaId;
    }


    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}