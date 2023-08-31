package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	
	boolean estado;
	int volumen=1;
	Control control;
	static int  num_Tv;
	public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado=estado;
		num_Tv++;
		
	}
	
	Marca getMarca(){
		return marca;
		
	}
	int getCanal(){
		return canal;
	}
int getPrecio(){
		return precio;
	}

 int getVolumen(){
	return volumen;
	
}
 Control getControl() {
	return control;
}

//
 void setMarca(Marca new_marca){
	marca= new_marca;
	
}
  void setCanal(int new_canal){
	canal=new_canal;
}
 void setPrecio(int new_precio){
	precio =new_precio;
}

 void setVolumen(int new_volumen){
	volumen = new_volumen;

}
 void setControl(Control new_control) {
	control = new_control;
}
 int getTv() {
	return num_Tv;
}

 void turnOn() {
	estado = true;
	
}
 void turnOff() {
	estado = false;
}

 boolean getEstado() {
	return estado;
}
 void canalUp() {
	if(estado==true && canal<=119) {
		canal++;
	};
	return;
}
 void canalDown() {
	if(estado==true && canal>0) {
		canal--;
	};
	return;
} void volumenUp() {
	if(estado==true && volumen<=7) {
		volumen++;
	};
	return;
}
 void volumenDown() {
	if(estado==true && volumen>=0) {
		volumen--;
	};
	return;
	
}



}
