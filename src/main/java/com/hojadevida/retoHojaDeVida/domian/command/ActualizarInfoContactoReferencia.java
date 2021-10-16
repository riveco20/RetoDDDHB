package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;
import com.hojadevida.retoHojaDeVida.domian.valueobject.ReferenciaId;

public class ActualizarInfoContactoReferencia extends Command {
   private final PerfilId perfilId;
    private final ReferenciaId referenciaId;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInfoContactoReferencia(PerfilId perfilId, ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto) {
        this.perfilId = perfilId;
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
