package j0041_VT3;

public class Persona {
	public String nombre;
	private String apellido1;
	private String apellido2;
	private char sexo;
	private int edad;

	// Constructor con 1 parámetro de tipo String
	public Persona(String n) {
		this.nombre = n;
	}

	// Constructor con 3 parámetros de tipo String
	public Persona(String n, String a1, String a2) {
		this.nombre = n;
		this.apellido1 = a1;
		this.apellido2 = a2;
	}
	// Constructor con 5 parámetros
	public Persona(String n, String a1, String a2, char s, int e) {
		this.nombre = n;
		this.apellido1 = a1;
		this.apellido2 = a2;
		this.setSexo(s);
		this.setEdad(e);
	}

	// Getters y Setters que nos interesan
	public String getNombre() {		return nombre;	}
	public String getApellido1() {		return apellido1;	}
	public String getApellido2() {		return apellido2;	}
	public char getSexo() {		return sexo;	}
	public void setSexo(char sexo) {		this.sexo = sexo;	}
	public int getEdad() {		return edad;	}
	public void setEdad(int edad) {		this.edad = edad;	}

	//Resto de métodos
	public void mayorEdad() {
		if (this.getEdad() >= 18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("Es menor de edad");
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Apellidos: "+this.getApellido1()+ " "+ this.getApellido2());
		System.out.println("Sexo: "+this.getSexo());
		System.out.println("Edad: "+this.getEdad());
	}

	
}

