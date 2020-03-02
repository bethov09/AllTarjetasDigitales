package org.all.tarjetadigital.service;

import java.util.List;

import javax.jws.WebService;

import org.all.tarjetadigital.model.Tarjeta;

@WebService
public interface TarjetaService {
	
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTodas();
}
