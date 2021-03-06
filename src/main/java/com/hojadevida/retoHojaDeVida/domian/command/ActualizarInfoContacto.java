package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;

public class ActualizarInfoContacto extends Command {
    private final PerfilId perfilId;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInfoContacto(PerfilId perfilId, InformacionDeContacto informacionDeContacto) {
        this.perfilId = perfilId;
        this.informacionDeContacto = informacionDeContacto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
