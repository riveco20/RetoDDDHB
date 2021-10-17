package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarFotoPerfil;

public class ActualizarFotoPerfilUseCase extends UseCase<RequestCommand<ActualizarFotoPerfil>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarFotoPerfil> actualizarFotoPerfilRequestCommand) {
        var command = actualizarFotoPerfilRequestCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(),retrieveEvents(command.getPerfilId().value()));
        perfil.actualizarForoPerfil(command.getFotoPerfil());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));

    }
}
