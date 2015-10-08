package mx.uam.ayd.practica4;
/**
* Author: Roberto Torres Jiménez
*
* Paso 1 de la segunda practica de la materia AyDSC clase author
*
*/

public class Author{
	String name;
	String lastName;
	int year;
	/**
	* Constructor de la clase vacio
	*/
	public Author(){
	// Nada que inicializar
	}
	/**
	* Constructor de la clase que recibe tres parametros
	*/
	public Author(String name, String lastName, int year){
		this.name = name;
		this.lastName = lastName;
		this.year = year;
	}
	/**
	* Metodo que devuelve el valor del nombre del autor
	*/
	public String getName(){
		return name;
	}
	/**
	* Metodo que devuelve el valor del apellido del author
	*/
	public String getLastName(){
		return lastName;
	}
	/**
	* Función que devuelve el año de nacimiento del autor
	*/
	public int getYear(){
		return year;
	}
	/**
	* Funcion toString
	*/
	public String toString(){
		return name+" "+lastName;
	}
}
