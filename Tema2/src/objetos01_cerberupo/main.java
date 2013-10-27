package objetos01_cerberupo;

public class main {

	public static void main(String[] args) {
		
		Clase01 objeto = new Clase01();

		objeto.clase();
		
		Alumno objeto02 = new Alumno();
		
		Alumno juan, pepe;
		
		juan = new Alumno();
		pepe = new Alumno();
		
		juan.alumno = "juan";
		pepe.alumno = "pepe";
		
		juan.mensaje();
		pepe.mensaje();
	}

}
