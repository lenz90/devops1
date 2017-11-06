package pe.com.lenz.devops1.devops1.service;

import org.springframework.stereotype.Service;

import pe.com.lenz.devops1.devops1.util.Util;

@Service
public class DevopsRestServiceImpl implements DevopsRestService {

	@Override
	public String calcularDesviacionEstandar(String datos, String separador) {
		
		return Util.desviacionEstandar(datos, separador);
	}

}
