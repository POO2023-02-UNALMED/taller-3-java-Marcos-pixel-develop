package taller3.televisores;

public class Control {
	TV tv;
	void turnOn() {
		tv.turnOn();
	}
	void turnOff() {
		tv.turnOff();
	}
	void canalUp() {
		tv.canalUp();
	}
	void canalDown() {
		tv.canalDown();
	}
	void volumenUp() {
		tv.volumenUp();
	}
	void volumenDown() {
		tv.volumenDown();
	}
	void setCanal(int canal) {
		tv.setCanal(canal);
	}
	void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
	void enlazar(TV tv) {
		this.tv = tv;
		this.tv.control=this;
	}

}
