package com.hojadevida.retoHojaDeVida.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.hojadevida.retoHojaDeVida.domian.command.AgregarNuevaReferencia;
import com.hojadevida.retoHojaDeVida.domian.event.PerfilCreado;
import com.hojadevida.retoHojaDeVida.domian.event.ReferenciaAgregada;
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
class AgregarNuevaReferenciaUseCaseTest {

    private static final String IDREFERENCIA ="1234";
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Vamos a probar la funcionalidad para agregar referencia")
    void executeUseCase() {
        //arrange
        var command = new AgregarNuevaReferencia(PerfilId.of("A23"),
                new ReferenciaId(IDREFERENCIA),
                new InformacionDeContacto("Tienda de electrodomesticos"),
                new NombreCompleto("LoricaTecnologia"));

        var useCase = new AgregarNuevaReferenciaUseCase();
        Mockito.when(repository.getEventsBy(IDREFERENCIA)).thenReturn(EventStorued());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance().
                setIdentifyExecutor(IDREFERENCIA).
                syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        //assert

        var event = (ReferenciaAgregada) events.get(0);
        Assertions.assertEquals(IDREFERENCIA,event.getReferenciaId().value());
        Assertions.assertEquals("Tienda de electrodomesticos",event.getInformacionDeContacto().value());
        Assertions.assertEquals("LoricaTecnologia",event.getNombreCompleto().value());
        Mockito.verify(repository).getEventsBy(IDREFERENCIA);
    }

    private List<DomainEvent> EventStorued() {
        return List.of(
                new PerfilCreado(
                        new HojaDeVidaId(2),
                        new InformacionDeContacto("Empleado con honores"),
                        new FotoPerfil("NuevaFoto")
                )
        );
    }
}