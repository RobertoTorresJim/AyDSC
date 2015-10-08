/**
*Autor: Roberto Torres Jimenez
*
* Clase libro del tercer ejercicio de la primer practica de la materia Analisis
* y Diseño de Sistemas de Computación.....Creación de dependencia y creación de
* varios objetos.
*/

public class Book{
	//creación de los atributos de la clase Book
	String name;
	String author;
	double cost;
/**
* Este metodo es el constructor por defecto
*/
	public Book(){
	//Constructor vacio
	}
/**
* Este metodo es el contructor que recibe todos los parametros para inicializar
* todos los atributos de la clase
*/
	public Book(String name, String author, double cost){
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
/**
* Este metodo devuelve el valor de la variable name
*/
	public String getName(){
		return name;
	}
/**
* Este metodo devuelve el valor de la variable author
*/
	public String getAuthor(){
		return author;
	}
/**
* Este metodo devuelve el valor de la variable cost
*/
	public double getCost(){
		return cost;
	}
/**
* Este metodo asigna un nuevo valor a la variable cost
*/





	public void setCost(double cost){
		//validación de costos negativos o con valor de 0.0
		if(cost<=0)
			System.out.println("Invalid price");
		else
			this.cost = cost;
	}
}
