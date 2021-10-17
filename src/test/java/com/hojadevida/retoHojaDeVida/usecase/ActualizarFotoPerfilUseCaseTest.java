package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.command.ActualizarFotoPerfil;
import com.hojadevida.retoHojaDeVida.domian.event.FotoDePerfilActualizada;
import com.hojadevida.retoHojaDeVida.domian.event.PerfilCreado;
import com.hojadevida.retoHojaDeVida.domian.valueobject.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ActualizarFotoPerfilUseCaseTest {

    private final String IDPERFIL="A2";

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Vamos a validar la actualizacion de informacion contacto")
    void actualizarFotoPerfil(){
        //arrange
        var command = new ActualizarFotoPerfil(PerfilId.of(IDPERFIL),
                new FotoPerfil("NuevaFoto"));

        var useCase = new ActualizarFotoPerfilUseCase();
        Mockito.when(repository.getEventsBy(IDPERFIL)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(IDPERFIL)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (FotoDePerfilActualizada) events.get(0);
        Assertions.assertEquals("NuevaFoto",event.getFotoPerfil().value());
        Mockito.verify(repository).getEventsBy(IDPERFIL);
    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new PerfilCreado(
                        new HojaDeVidaId(2),
                        new InformacionDeContacto("Vamos para playa a curanos el alma"),
                        new FotoPerfil("FotoAgregada")
                )
        );
    }


}