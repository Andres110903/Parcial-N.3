//clase de tipo pública con herencia de la clase Empleado
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado{

	//variable de tipo entero
	int aniosExperienciaBootstrap;
	
	//variable de tipo boolean
	boolean experienciaCloud;
	
	//constante de visibilidad "privada"
	private double AUMENTO_VARIABLE = 3;

	//métodos de los atributos (getter, setter)
	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}

	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}

	public boolean isExperienciaCloud() {
		return experienciaCloud;
	}

	public void setExperienciaCloud(boolean experienciaCloud) {
		this.experienciaCloud = experienciaCloud;
	}

	//método constructor por defecto
	public DesarrolladorFrontend() {
	}

	//método constructor con los atributos
	public DesarrolladorFrontend(int aniosExperienciaBootstrap, boolean experienciaCloud) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.experienciaCloud = experienciaCloud;
	}

	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		salario = SALARIO_MINIMO + AUMENTO_VARIABLE;
		salario = DESCUENTO_EPS + DESCUENTO_FP;
		salario = salario/100;
		return salario;
	}
	
}
