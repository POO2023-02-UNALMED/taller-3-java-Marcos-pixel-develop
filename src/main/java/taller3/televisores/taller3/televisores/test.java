package taller3.televisores;

public class test {

	public static void main(String[] args) {
		Control control1 = new Control();
		Marca marca1 = new Marca("x");
		TV tv1 = new TV(marca1,false);
		control1.enlazar(tv1);
		control1.setCanal(23);
		System.out.print(tv1.canal);
		
		
	}
}
