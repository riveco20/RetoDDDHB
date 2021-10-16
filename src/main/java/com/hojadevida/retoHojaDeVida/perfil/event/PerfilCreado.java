package com.hojadevida.retoHojaDeVida.perfil.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.NombreCompleto;

public class PerfilCreado extends DomainEvent {

    private final InformacionDeContacto informacionDeContacto;

    public PerfilCreado(InformacionDeContacto informacionDeContacto) {
        super("hojadevida.perfil.perfilcreado");
        this.informacionDeContacto=informacionDeContacto;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
