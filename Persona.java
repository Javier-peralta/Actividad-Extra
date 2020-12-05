public class Persona{

	//atributos
	private int edad;
	private String nombre;
	private float estatura;

	//contructor
	public Persona (int edad, String nombre, float estatura){
		this.edad = edad;
		this.nombre = nombre;
		this.estatura = estatura
	}

	//metodos
	public int getEdad(){
		return edad;
	}

	public String getNombre(){
                return nombre;
        }

	public float getEstatura(){
                return estatura;
        }
}
