package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarInfoContactoReferencia;

public class ActualizarInfoContactoReferenciaUseCase extends UseCase<RequestCommand<ActualizarInfoContactoReferencia>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<ActualizarInfoContactoReferencia> actualizarInfoContactoReferenciaRequestCommandCommand) {
        var command = actualizarInfoContactoReferenciaRequestCommandCommand.getCommand();
        var perfil = Perfil.from(command.getPerfilId(), retrieveEvents());
        try {
            perfil.actualizarInformacionDeContactoReferencia(command.getReferenciaId(),command.getInformacionDeContacto());
            emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
        }catch (RuntimeException e){
            emit().onError(new BusinessException(perfil.identity().value(), e.getMessage()));
        }
    }

}
