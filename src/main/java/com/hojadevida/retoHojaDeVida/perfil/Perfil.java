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



    public void agregarNuevaReferencia(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){
        Objects.requireNonNull(referenciaId);
        Objects.requireNonNull(informacionDeContacto);
        Objects.requireNonNull(nombreCompleto);
       appendChange(new ReferenciaAgregada(referenciaId,informacionDeContacto,nombreCompleto)).apply();


    }

    public void eliminarReferencia(ReferenciaId referenciaId){

    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        Objects.requireNonNull(informacionDeContacto);
        appendChange(new InformacionDeContactoActualizado(informacionDeContacto)).apply();

    }

    public void actualizarForoPerfil(FotoPerfil fotoPerfil){
            Objects.requireNonNull(fotoPerfil);
            appendChange(new FotoDePerfilActualizada(fotoPerfil)).apply();
    }


    public void actualizarNombreCompletoReferencia(ReferenciaId referenciaId, NombreCompleto nombreCompleto){
        Objects.requireNonNull(referenciaId);
        Objects.requireNonNull(nombreCompleto);
        appendChange(new NombreCompletoReferenciaActualizado(referenciaId, nombreCompleto)).apply();

    }

    public void actualizarInformacionDeContactoReferencia(ReferenciaId referenciaId,InformacionDeContacto informacionDeContacto){
        Objects.requireNonNull(referenciaId);
        Objects.requireNonNull(informacionDeContacto);
        appendChange(new InformacionDeContactoReferenciaActualizada(referenciaId,informacionDeContacto)).apply();

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
