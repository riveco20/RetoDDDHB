package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.InformacionDeContacto;

public class InformacionDeContactoReferenciaActualizada extends DomainEvent {
    private final InformacionDeContacto informacionDeContacto;

    public InformacionDeContactoReferenciaActualizada(InformacionDeContacto informacionDeContacto) {
        super("hojadevida.perfil.informacionDeContacoReferenciaActualizada");
        this.informacionDeContacto =informacionDeContacto;
    }


    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

}
