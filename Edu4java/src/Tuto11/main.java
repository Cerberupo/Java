package Tuto11;

public class main {

	public static void main(String[] args) {
		
		Alumno[] alumnos = new Alumno[4];
		
		String [] nombre = {"pepe", "juan", "elena", "lorena"};
		int [] edad = {22, 50, 26, 18};
		
		for (int i = 0; i < alumnos.length; i++) {
			Alumno alumno = new Alumno();
			alumno.setNombre(nombre[i]);
			alumno.setEdad(edad[i]);
			alumnos[i] = alumno;
			alumno.imprimir();
	
		}
		
	}

}
