package Tuto11;

public class Alumno {
	 
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void imprimir(){
		System.out.println();
		System.out.print("Nombre: " + this.nombre);
		System.out.println(" Edad: " + this.edad);
	}

}