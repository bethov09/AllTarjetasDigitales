package org.all.tarjetadigital.repository;

import java.util.ArrayList;

import java.util.List;

import org.all.tarjetadigital.model.Tarjeta;

public class TarjetaRepositoryImp implements TarjetaRepository{

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<Tarjeta>();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.print("Crear tarjeta::");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.print(":Obtener todas las tarjetas dgitales:");
		return tarjetasDigitales;
	}

}
