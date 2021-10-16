package com.hojadevida.retoHojaDeVida.perfil.entity;

import co.com.sofka.domain.generic.Entity;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.InformacionDeContacto;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.NombreCompleto;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.ReferenciaId;

import java.util.Objects;

public class Referencia extends Entity<ReferenciaId> {

    private InformacionDeContacto informacionDeContacto;
    private NombreCompleto nombreCompleto;

    public Referencia(ReferenciaId entityId, InformacionDeContacto informacionDeContacto,NombreCompleto nombreCompleto){
        super(entityId);
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }
    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto) {

        this.informacionDeContacto = Objects.requireNonNull(informacionDeContacto);

    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto){
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto);
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}

