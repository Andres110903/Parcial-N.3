//clase de tipo público
public class Empleado{
	
	//varibles de tipo cadena de texto
	String nombre, apellidos, direccion, sexo;
	
	//variables de tipo entero
	int dni;
	
	//variable de tipo double
	double salario;
	
	//constantes de visibilidad "protected"
	protected double SALARIO_MINIMO = 980.000;
	protected double DESCUENTO_EPS = 4;
	protected double DESCUENTO_FP = 4;

	//método constructor por defecto vacío e
	public Empleado() {
	}
	
	//método con todos los atributos a
	public Empleado(String nombre, String apellidos, String direccion, String sexo, int dni, double salario,
			double sALARIO_MINIMO, double dESCUENTO_EPS, double dESCUENTO_FP) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.sexo = sexo;
		this.dni = dni;
		this.salario = salario;
		SALARIO_MINIMO = sALARIO_MINIMO;
		DESCUENTO_EPS = dESCUENTO_EPS;
		DESCUENTO_FP = dESCUENTO_FP;
	}
	
	//método constructor c
	public Empleado(String direccion, String sexo, int dni) {
		this.direccion = direccion;
		this.sexo = sexo;
		this.dni = dni;
	}

	//método constructor d
	public Empleado(String nombre, String apellidos, String sexo, int dni, double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.dni = dni;
		this.salario = salario;
	}

	//métodos de los atributos (getter, setter)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
