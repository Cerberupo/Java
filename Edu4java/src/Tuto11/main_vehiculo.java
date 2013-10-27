package Tuto11;

public class main_vehiculo {

	public static void main(String[] args) {
		
		vehiculo[] objeto = new vehiculo[4];
		
		String[] tipo = {"coche", "moto", "camión", "avión"};
		String[] color = {"rojo","negra", "multicolor", "blanco"};
		int[] ruedas = {4, 2, 4, 0};
		
		for (int i = 0; i < objeto.length; i++) {
			vehiculo automovil = new vehiculo();
			automovil.setTipo(tipo[i]);
			automovil.setColor(color[i]);
			automovil.setRuedas(ruedas[i]);
			
			objeto[i] = automovil;
			
			automovil.imprimir();
			
		}

	}

}
