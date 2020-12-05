public class Main{

	public static void main(String[] args){

	Persona NuevaPersona = new Persona (32, "Omar", 176);
	Persona NuevaPersona2 = new Persona (28, "Diana", 166);

	System.out.println("El nombre de la persona 1 es:" + NuevaPersona.getNombre());
	System.out.println("La edad de la persona 1 es:" + NuevaPersona.getEdad());
	System.out.println("La estatura de la persona 2 es:" + NuevaPersona2.getEstatura);

	Empleado NuevoEmpleado = new Empleado (20000, "ejemploempleado@gmail.com", 5547879621,27, "Luis",165);
	Empleado NuevoEmpleado2 = new Empleado (35000, "ejemploempleado2@gmail.com", 5578142598, 35, "Laura", 168);

	System.out.println("Para el emleado 1" +NuevoEmpleado.Puesto("Marketing");
	System.out.println("Para el empleado 2"+ NuevoEmpleado2.Empresa("Empresaejemplo"));

	}

}
