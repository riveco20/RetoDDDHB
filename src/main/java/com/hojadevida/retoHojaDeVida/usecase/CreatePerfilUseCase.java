package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.hojadevida.retoHojaDeVida.domian.Perfil;
import com.hojadevida.retoHojaDeVida.domian.command.CrearPerfil;

public class CreatePerfilUseCase extends UseCase<RequestCommand<CrearPerfil>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPerfil> crearPerfilRequestCommand) {
        var command = crearPerfilRequestCommand.getCommand();

        var perfil = new Perfil(
                command.getEntityId(),
                command.getHojaDeVidaId(),
                command.getInformacionDeContacto(),
                command.getFotoPerfil()
        );
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
