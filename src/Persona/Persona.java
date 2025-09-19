package Persona;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;
	protected String fecha_nacimiento;
	
	public Persona(int edad, String nombre, String apellido, String fecha_nac) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nac;
	}
	
	public Persona( ) {
		
	}
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void caminar() {
		System.out.println("Esta caminando...");
	}
	
	protected void dormir(int veces, String nombre) {
		System.out.println(nombre + " esta durmiendo " + veces + " veces a la semana ");
	}
	
	private double comer(double cantidad, String nombre) {
		double resultado;
		resultado = 78.55*cantidad;
		return resultado;
	}
	private static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.caminar();
		persona.dormir(8,"An");
		double res = persona.comer(2, "Hola");
		
		Persona persona_con = new Persona(8,"LUIS","juan","01-10-1988");
		
		System.out.println(persona_con.fecha_nacimiento);
		
		Alumno alumno = new Alumno(); 
		
		
	}
	

}

