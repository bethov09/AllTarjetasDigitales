package org.all.tarjetadigital.service;

import java.util.List;
import javax.jws.WebService;

import org.all.tarjetadigital.model.Tarjeta;
import org.all.tarjetadigital.repository.TarjetaRepository;
import org.all.tarjetadigital.repository.TarjetaRepositoryImp;

@WebService(endpointInterface = "org.all.tarjetadigital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService{

	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImp();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

}
