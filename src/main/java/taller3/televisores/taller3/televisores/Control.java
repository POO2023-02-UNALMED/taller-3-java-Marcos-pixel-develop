package taller3.televisores;

public class Control {
	TV tv;
	public void turnOn() {
		tv.turnOn();
	}
	public TV getTv() {
		return tv;
	}
	public void turnOff() {
		tv.turnOff();
	}
	public void canalUp() {
		tv.canalUp();
	}
	public void canalDown() {
		tv.canalDown();
	}
	public void volumenUp() {
		tv.volumenUp();
	}
	public void volumenDown() {
		tv.volumenDown();
	}
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control=this;
	}

}
