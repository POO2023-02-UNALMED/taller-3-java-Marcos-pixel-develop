package taller3.televisores;

public class Marca {
	String nombre;
	Marca(String nombre){
		this.nombre = nombre;
		
	}
	String get() {
		return this.nombre;
	}
	void set(String nuevo_nombre) {
		nombre = nuevo_nombre;
	}
}
