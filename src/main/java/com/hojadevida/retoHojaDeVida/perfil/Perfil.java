package com.hojadevida.retoHojaDeVida.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import com.hojadevida.retoHojaDeVida.perfil.valueobject.*;

public class Perfil extends AggregateEvent<PerfilId> {


    public Perfil(PerfilId entityId, NombreCompleto nombreCompleto) {
        super(entityId);
    }
}
