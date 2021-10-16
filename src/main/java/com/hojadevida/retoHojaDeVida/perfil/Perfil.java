package com.hojadevida.retoHojaDeVida.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.perfil.entity.Referencia;
import com.hojadevida.retoHojaDeVida.perfil.event.*;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.*;

import java.util.List;
import java.util.Objects;

public class Perfil extends AggregateEvent<PerfilId> {

    protected InformacionDeContacto informacionDeContacto;
    protected FotoPerfil fotoPerfil;
    protected Referencia referencia;
    protected HojaDeVidaId hojaDeVidaId;

    public Perfil(PerfilId entityId,HojaDeVidaId hojaDeVidaId,InformacionDeContacto informacionDeContacto, FotoPerfil fotoPerfil) {
        super(entityId);
        appendChange(new PerfilCreado(hojaDeVidaId,informacionDeContacto, fotoPerfil)).apply();
    }

    private Perfil(PerfilId perfilId){
        super(perfilId);
        subscribe(new PerfilChange(this));
    }

    public static Perfil from(PerfilId perfilId, List<DomainEvent>events){
        var perfil = new Perfil(perfilId);
        events.forEach(perfil::applyEvent);
        return perfil;
    }

    public void agregarNuevaReferencia(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){
        Objects.requireNonNull(referenciaId);
        Objects.requireNonNull(informacionDeContacto);
        Objects.requireNonNull(nombreCompleto);
        appendChange(new ReferenciaAgregada(referenciaId,informacionDeContacto,nombreCompleto)).apply();
    }

    public void eliminarReferencia(ReferenciaId referenciaId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){
        Objects.requireNonNull(referenciaId);
        Objects.requireNonNull(informacionDeContacto);
        Objects.requireNonNull(nombreCompleto);
        appendChange(new ReferenciaEliminada(referenciaId, informacionDeContacto , nombreCompleto)).apply();
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        Objects.requireNonNull(informacionDeContacto);
        appendChange(new InformacionDeContactoActualizado(informacionDeContacto)).apply();

    }

    public void actualizarForoPerfil(FotoPerfil fotoPerfil){
            Objects.requireNonNull(fotoPerfil);
            appendChange(new FotoDePerfilActualizada(fotoPerfil)).apply();
    }


    public void actualizarNombreCompletoReferencia(NombreCompleto nombreCompleto){
        Objects.requireNonNull(nombreCompleto);
        appendChange(new NombreCompletoReferenciaActualizado(nombreCompleto)).apply();

    }

    public void actualizarInformacionDeContactoReferencia(InformacionDeContacto informacionDeContacto){
        Objects.requireNonNull(informacionDeContacto);
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

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }
}
