package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.FotoPerfil;
import com.hojadevida.retoHojaDeVida.domian.valueobject.HojaDeVidaId;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;

public class CrearPerfil extends Command {
    private final PerfilId entityId;
    private final HojaDeVidaId hojaDeVidaId;
    private final InformacionDeContacto informacionDeContacto;
    private final FotoPerfil fotoPerfil;

    public CrearPerfil(PerfilId entityId, HojaDeVidaId hojaDeVidaId, InformacionDeContacto informacionDeContacto, FotoPerfil fotoPerfil) {
        this.entityId = entityId;
        this.hojaDeVidaId = hojaDeVidaId;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoPerfil = fotoPerfil;
    }

    public PerfilId getEntityId() {
        return entityId;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoPerfil getFotoPerfil() {
        return fotoPerfil;
    }
}
