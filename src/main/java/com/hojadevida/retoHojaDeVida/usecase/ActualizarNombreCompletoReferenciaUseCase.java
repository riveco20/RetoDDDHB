package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarNombreCompletoReferencia;

public class ActualizarNombreCompletoReferenciaUseCase extends UseCase<RequestCommand<ActualizarNombreCompletoReferencia>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCompletoReferencia> actualizarNombreCompletoReferenciaRequestCommand) {
        var command = actualizarNombreCompletoReferenciaRequestCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(),retrieveEvents(command.getPerfilId().value()));
        perfil.actualizarNombreCompletoReferencia(command.getNombreCompleto());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
