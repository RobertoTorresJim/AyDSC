/**
* Autor: Roberto Torres Jiménez
*
* Clase magazine del paso 3 de la practica 3 de la materia AyDSC
*/
public class Magazine extends Material{
	int number;
/**
* Constructor vacio de la clase
*/
	public Magazine(){
	//Nada que inicializar	
	}
/**
* Constructor de la clase que recibe tres parametros
*/
	public Magazine(String name, double cost, int number){
		super(name,cost);
		this.number = number;
	}
/**
* Método que regresa el numero de la revista
*/
	public int getNumber(){
		return number;
	}
/**
*Método que regresa el costo de la revista
*/
	@Override
	public double getCost(){
		return cost;
	}
/**
* Metodo toString que regresa los datos de la revista en forma de cadena
*/
	public String toString(){
		return "Revista: " +name+ " " +"Numero: " +number+ " " +cost;
	}
}
