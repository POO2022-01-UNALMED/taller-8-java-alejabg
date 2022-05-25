package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
	public byte dorsal;
	public Jugador(String nombre, int edad,String a, short golesMarcados, byte dorsal) {
		super(nombre, edad, a);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador( ) {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}


	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()
		+" con el dorsal "+dorsal+ ". Ha marcado "+golesMarcados;
	}
	public boolean jugarConLasManos() {
		if(this instanceof Futbolista) {
			return true;
		}
		else {
			return false;
		}
	}
	public int compareTo(Object o) {
		return(java.lang.Math.abs(((Jugador)o).getEdad()-this.getEdad()));
	}
	
	
	
	
	
	
	

}
    

