package com.hojadevida.retoHojaDeVida.perfil;

import co.com.sofka.domain.generic.EventChange;
import com.hojadevida.retoHojaDeVida.perfil.entity.Referencia;
import com.hojadevida.retoHojaDeVida.perfil.event.*;

public class PerfilChange extends EventChange {
    public PerfilChange(Perfil perfil){

        apply((PerfilCreado event)->{
            perfil.informacionDeContacto = event.getInformacionDeContacto();
            perfil.fotoPerfil = event.getFotoPerfil();
            perfil.hojaDeVidaId = event.getHojaDeVidaId();

        });

        apply((FotoDePerfilActualizada event)->{
            perfil.fotoPerfil=event.getFotoPerfil();

        });

        apply((InformacionDeContactoActualizado event)->{
            perfil.informacionDeContacto = event.getInformacionDeContacto();

        });

         apply((ReferenciaAgregada event)-> {
             perfil.referencia= new Referencia(event.getReferenciaId(),event.getInformacionDeContacto(), event.getNombreCompleto());
         });

         apply((InformacionDeContactoReferenciaActualizada event)->{
            perfil.referencia.actualizarInformacionDeContacto(event.getInformacionDeContacto());
                     });

         apply((NombreCompletoReferenciaActualizado event)->{
              perfil.referencia.actualizarNombreCompleto(event.getNombreCompleto());
         });

         apply((ReferenciaEliminada event)->{;

         });


    }
}
