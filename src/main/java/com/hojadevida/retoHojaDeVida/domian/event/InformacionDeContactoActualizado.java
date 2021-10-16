package com.hojadevida.retoHojaDeVida.domian.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;

public class InformacionDeContactoActualizado extends DomainEvent {

    private final InformacionDeContacto informacionDeContacto;

    public InformacionDeContactoActualizado(InformacionDeContacto informacionDeContacto) {
        super("hojadevida.perfil.contacotactualizado");
        this.informacionDeContacto = informacionDeContacto;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}

