package pe.com.lenz.devops1.devops1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.com.lenz.devops1.devops1.service.DevopsRestService;

@RestController
public class DevopsRestController {

	@Autowired
	public DevopsRestService servicio;
	
	@RequestMapping("/desviacionEstandar")
	public String calcularDesviacionEstandar(@RequestParam(name="datos") String datos,@RequestParam(name="separador") String separador){
		
		return servicio.calcularDesviacionEstandar(datos, separador);
	}
}
