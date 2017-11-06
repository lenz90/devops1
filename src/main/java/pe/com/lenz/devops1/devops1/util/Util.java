package pe.com.lenz.devops1.devops1.util;

import java.util.ArrayList;
import java.util.List;

public class Util {

	public static String desviacionEstandar(String datos, String separador){
		String [] dat = datos.split(separador);
		List<Double> listaDatos = new ArrayList<>();
		Double sum = Constantes.CERO_DOUBLE;
		Double sumCuadrados =Constantes.CERO_DOUBLE;
		for(String n:dat){
			if(esNumero(n)){
				Double num=Double.parseDouble(n);
				listaDatos.add(num);
				sum+=num;
			}
		}
		Double media=sum/listaDatos.size();
		for(Double n:listaDatos){
			sumCuadrados+=Math.pow((n-media), 2);
		}
		Double divraiz=Math.pow(sumCuadrados/listaDatos.size(),0.5);
		
		return String.valueOf(divraiz);
	}
	public static boolean esNumero(String numero){
		try {
			Double.parseDouble(numero);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}
