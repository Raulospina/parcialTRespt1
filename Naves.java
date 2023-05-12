package primeraParte;

public class Naves {

	
	public Naves(String combustible, String nombre, int peso, int velocidad, int potencia) {
	}

	public abstract class Lanzadera {

		public int Velocidad;
		public int peso;
		public int potencia;
		public String nombre;
		public String combustible;

		public Lanzadera(int velocidad, int peso, int potencia, String nombre,String combustible) {
			super();
		//Constructors
			this.Velocidad = velocidad;
			this.peso = peso;
			this.nombre = nombre;
			this.combustible = combustible;
			this.potencia = potencia;
		}
 //getter y setter
		public String getnombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getcombustible() {
			return combustible;
		}
		public void setcombustible(String combustible) {
			this.combustible = combustible;
		}
		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}
		
		public int getvelocidad() {
			return Velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.Velocidad = velocidad;
		}

		public int getpotencia() {
			return potencia;
		}

		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}

	}
}