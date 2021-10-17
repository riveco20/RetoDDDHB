package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarInfoContactoReferencia;

public class ActualizarInfoContactoReferenciaUseCase extends UseCase<RequestCommand<ActualizarInfoContactoReferencia>, ResponseEvents>{


    @Override
    public void executeUseCase(RequestCommand<ActualizarInfoContactoReferencia> actualizarInfoContactoReferenciaRequestCommand) {
        var command = actualizarInfoContactoReferenciaRequestCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(),retrieveEvents(command.getPerfilId().value()));
        perfil.actualizarInformacionDeContactoReferencia(command.getInformacionDeContacto());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
