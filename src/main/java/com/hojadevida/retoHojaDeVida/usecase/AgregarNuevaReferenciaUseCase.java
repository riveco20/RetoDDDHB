package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.AgregarNuevaReferencia;


public class AgregarNuevaReferenciaUseCase extends UseCase<RequestCommand<AgregarNuevaReferencia>, ResponseEvents>{


    @Override
    public void executeUseCase(RequestCommand<AgregarNuevaReferencia> agregarNuevaReferenciaRequestCommand) {
        var command = agregarNuevaReferenciaRequestCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(), retrieveEvents(command.getReferenciaId().value()));
        perfil.agregarNuevaReferencia(command.getReferenciaId(), command.getInformacionDeContacto(), command.getNombreCompleto());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
