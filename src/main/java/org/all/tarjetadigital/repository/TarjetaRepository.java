package org.all.tarjetadigital.repository;

import java.util.List;

import org.all.tarjetadigital.model.Tarjeta;

public interface TarjetaRepository {
	
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTodas();

}
