package com.hojadevida.retoHojaDeVida.domian.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.valueobject.FotoPerfil;
import com.hojadevida.retoHojaDeVida.domian.valueobject.HojaDeVidaId;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;

public class PerfilCreado extends DomainEvent {

    private final InformacionDeContacto informacionDeContacto;
    private final FotoPerfil fotoPerfil;
    private final HojaDeVidaId hojaDeVidaId;
    public PerfilCreado(HojaDeVidaId hojaDeVidaId,InformacionDeContacto informacionDeContacto, FotoPerfil fotoPerfil) {
        super("hojadevida.perfil.perfilcreado");
        this.informacionDeContacto=informacionDeContacto;
        this.fotoPerfil= fotoPerfil;
        this.hojaDeVidaId = hojaDeVidaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoPerfil getFotoPerfil() {
        return fotoPerfil;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
