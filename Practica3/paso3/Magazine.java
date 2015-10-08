package mx.uam.ayd.practica4;
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
		this.name = name;
	}
/**
* Método que regresa el numero de la revista
*/
	public int getNumber(){
		return number;
	}
}
