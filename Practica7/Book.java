/**
* Author: Roberto Torres Jimenez
*
* Clase libro del primer ejercicio de la segunda practica de la materia Analisis
* y Diseño de Sistemas de Computación......
*/

public class Book extends Material{
	//creación de los atributos de la clase Book
	Author author;
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
	public Book(String name, Author author, double cost){
		//Llama al constructor de la clase material
		super(name,cost);
		this.author = author;
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
	public Author getAuthor(){
		return author;
	}
/**
* Este metodo devuelve el valor de la variable cost
*/
	@Override
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
/**
* Método que regresa los datos del libro en una sola cadena
*/
	public String toString(){
		return "Libro: " +name+ " " +author.getName()+ " " +author.getLastName()+ " " +cost;
	}
}
