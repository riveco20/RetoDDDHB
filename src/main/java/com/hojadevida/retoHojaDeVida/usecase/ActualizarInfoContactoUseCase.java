package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarInfoContacto;

public class ActualizarInfoContactoUseCase extends UseCase<RequestCommand<ActualizarInfoContacto>, ResponseEvents> {

@Override
public void executeUseCase(RequestCommand<ActualizarInfoContacto> actualizarInfoContactoRequestCommandCommand) {
        var command = actualizarInfoContactoRequestCommandCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(), retrieveEvents());
        try {
        perfil.actualizarInformacionDeContacto(command.getInformacionDeContacto());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
        }catch (RuntimeException e){
        emit().onError(new BusinessException(perfil.identity().value(), e.getMessage()));
        }

        }
}
