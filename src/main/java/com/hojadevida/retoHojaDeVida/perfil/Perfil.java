package com.hojadevida.retoHojaDeVida.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import com.hojadevida.retoHojaDeVida.perfil.entity.Referencia;
import com.hojadevida.retoHojaDeVida.perfil.event.*;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.*;

import java.util.Objects;

public class Perfil extends AggregateEvent<PerfilId> {

    protected InformacionDeContacto informacionDeContacto;
    protected FotoPerfil fotoPerfil;
    protected Referencia referencia;

    public Perfil(PerfilId entityId, InformacionDeContacto informacionDeContacto) {
        super(entityId);
        appendChange(new PerfilCreado(informacionDeContacto)).apply();
    }

    public void agregarNuevaReferencia(ReferenciaId entityId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacionDeContacto);
        Objects.requireNonNull(nombreCompleto);
       // appendChange(new ReferenciaAgregada(entityId,informacionDeContacto,nombreCompleto)).apply();


    }

    public void eliminarReferencia(ReferenciaId referenciaId){

    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){

        appendChange(new InformacionDeContactoActualizado(informacionDeContacto)).apply();

    }

    public void actualizarForoPerfil(FotoPerfil fotoPerfil){
            appendChange(new FotoDePerfilActualizada(fotoPerfil)).apply();
    }


    public void actualizarNombreCompletoReferencia(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoReferenciaActualizado(nombreCompleto)).apply();

    }

    public void actualizarInformacionDeContactoReferencia(InformacionDeContacto informacionDeContacto){
        appendChange(new InformacionDeContactoReferenciaActualizada(informacionDeContacto)).apply();

    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoPerfil getFotoPerfil() {
        return fotoPerfil;
    }

    public Referencia getReferencia() {
        return referencia;
    }
}
