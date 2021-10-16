package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.Command;
import com.hojadevida.retoHojaDeVida.domian.command.CrearPerfil;
import com.hojadevida.retoHojaDeVida.domian.event.PerfilCreado;
import com.hojadevida.retoHojaDeVida.domian.valueobject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePerfilUseCaseTest {

    @Test
    @DisplayName("Validando la funcionalidad de crear perfil")
    void crearPerfil(){
        //arrange
        var command = new CrearPerfil(PerfilId.of("A12"), new HojaDeVidaId(1),
                new InformacionDeContacto("Estudiante y Programador"),
                new FotoPerfil("Foto1"));

        var useCase = new CreatePerfilUseCase();

        //act
        var events = UseCaseHandler.getInstance().
                syncExecutor(useCase, new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert
        var event = (PerfilCreado)events.get(0);
        Assertions.assertEquals(1,event.getHojaDeVidaId().value());
        Assertions.assertEquals("Estudiante y Programador", event.getInformacionDeContacto().value());
        Assertions.assertEquals("Foto1", event.getFotoPerfil().value());

    };


}