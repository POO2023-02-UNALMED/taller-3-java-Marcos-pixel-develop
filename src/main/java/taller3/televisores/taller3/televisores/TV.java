package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	
	boolean estado=false;
	int volumen=1;
	Control control;
	static int  num_Tv;
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado=estado;
		num_Tv++;
		
	}
	
	public Marca getMarca(){
		return this.marca;
		
	}
	public int getCanal(){
		return canal;
	}
public int getPrecio(){
		return precio;
	}

 public int getVolumen(){
	return volumen;
	
}
 public Control getControl() {
	return control;
}

//
 public void setMarca(Marca new_marca){
	marca= new_marca;
	
}
  public void setCanal(int new_canal){
	canal=new_canal;
}
  public void setPrecio(int new_precio){
	precio =new_precio;
}

public void setVolumen(int new_volumen){
	volumen = new_volumen;

}
public void setControl(Control new_control) {
	control = new_control;
}
public static int getNumTV() {
	return num_Tv;
}

 public void turnOn() {
	estado = true;
	
}
 public void turnOff() {
	estado = false;
}

 public boolean getEstado() {
	return estado;
}
 public void canalUp() {
	if(estado==true && canal<120) {
		canal++;
	};
	return;
}
 
 public static void setNumTV(int num) {
	num_Tv = num; 
	 
 }
 public void canalDown() {
	if(estado==true && canal>1) {
		--canal;
	};
	return;
}public  void volumenUp() {
	if(estado==true && volumen<7) {
		++volumen;
	};
	return;
}
 public void volumenDown() {
	if(estado==true && volumen>0) {
		volumen--;
	};
	return;
	
}



}
