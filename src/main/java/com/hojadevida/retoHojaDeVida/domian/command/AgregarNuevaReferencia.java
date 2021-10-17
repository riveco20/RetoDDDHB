package com.hojadevida.retoHojaDeVida.domian.command;

import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.domian.valueobject.PerfilId;
import com.hojadevida.retoHojaDeVida.domian.valueobject.ReferenciaId;

public class AgregarNuevaReferencia extends Command {

    private final PerfilId perfilId;
   private final ReferenciaId referenciaId;
   private final InformacionDeContacto informacionDeContacto;
   private final NombreCompleto nombreCompleto;

    public AgregarNuevaReferencia(PerfilId perfilId, ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        this.perfilId = perfilId;
        this.referenciaId = referenciaId;
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
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

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
