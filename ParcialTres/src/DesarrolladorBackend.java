//importar una biblioteca de Java
import java.util.ArrayList;

//clase de tipo publica con herencia de la clase Empleado
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado{

	//variables con modificador de acceso privada
	private String skill;
	private ArrayList<String> listaLenguajes = new ArrayList<String>();
	
	//constante de visibilidad "privada"
	private double AUMENTO_VARIABLE = 5;
	
	//métodos de los atributos (getter, setter)
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public ArrayList<String> getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(ArrayList<String> listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	
	//constructor por defecto
	public DesarrolladorBackend() {
	}
	
	//constructor con los atributos
	public DesarrolladorBackend(String skill, ArrayList<String> listaLenguajes) {
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
	}
	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		salario = ((SALARIO_MINIMO + AUMENTO_VARIABLE)*(DESCUENTO_EPS + DESCUENTO_FP))/100;
		return salario;
	}
	
}
