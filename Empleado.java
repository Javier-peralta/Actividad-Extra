public class Empleado{

	//atributos
	private int sueldo;
	private String email;
	private int numtel;

	//contructor
	public Empleado(int sueldo, String email, int numtel){
		this.sueldo = sueldo;
		this.email = email;
		this.numtel = numtel
	}

	//metodos
	public int getSueldo(){
		return sueldo;
	}

	public String  getEmail(){
                return email;
        }

	public int getNumtel(){
                return numtel;
        }


}
