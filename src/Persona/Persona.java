package Persona;

public class Persona {
	int edad;
	String nombre;
	String apellido;
	String fecha_nacimiento;
	
	public Persona(int edad, String nombre, String apellido, String fecha_nac) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nac;
	}
	
	public Persona( ) {
		
	}
	
	public void caminar() {
		System.out.println("Esta caminando...");
	}
	
	public void dormir(int veces, String nombre) {
		System.out.println(nombre + " esta durmiendo " + veces + " veces a la semana ");
	}
	
	public double comer(double cantidad, String nombre) {
		double resultado;
		resultado = 78.55*cantidad;
		return resultado;
	}
	public static void main(String[] args) {
		Persona persona = new Persona();
		
		persona.caminar();
		persona.dormir(8,"An");
		double res = persona.comer(2, "Hola");
		
		Persona persona_con = new Persona(8,"LUIS","juan","01-10-1988");
		
		System.out.println(persona_con.fecha_nacimiento);
		
	
	}
	

}

