public class Empleado extends Persona implements InEmpleados{

	//atributos
	private int sueldo;
	private String email;
	private int numtel;

	//contructor
	public Empleado(int sueldo, String email, int numtel, int edad, String nombre, float estatura){
		super(edad, nombre, estatura);
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


	//metodos interface
	@Override
	public String Puesto (String puesto){
	this.puesto = puesto;
	return ("El puesto del empleado es: "+ puesto);
	}

	@Override
        public String Empresa (String empresa){
        this.empresa = empresa;
        return ("La empresa donde trabaja es: "+ empresa);
        }

}
