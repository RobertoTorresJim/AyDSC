/**
* Author: Roberto Torres Jiménez
*
* Clase principal del tercer ejercicio de la materia Analisis y Diseño de
* Sistemas de Computación
*/
public class Aplication{
	public static void main (String []args){
		Aplication app = new Aplication();
		// La inicia
		app.init();
	}
/**
* Este metodo es el constructor
*/
	public Aplication() {
	// No hay nada que inicializar
	}
/**
* Este metodo inicia la aplicación
*/
	public void init() {
		//creación d elos tres libros
		Book book1 = new Book("Lord of the rings","J.R.R. Tolkien",40.0);
		Book book2 = new Book("Where the wild things are", "Maurice Sendak", 20.0);
		Book book3 = new Book("Diary of a zombie","Sergi Llauger",30.0);
		//Despligue de todos los libros con su descripción
		System.out.println("Name: " + book1.name + " Author: " + book1.author + " Cost: " + book1.cost);
		System.out.println("Name: " + book2.name + " Author: " + book2.author + " Cost: " + book2.cost);
		System.out.println("Name: " + book3.name + " Author: " + book3.author + " Cost: " + book3.cost);
		//Cambio de precio de dos de los libros llamando el precio actual
		book1.setCost(book1.getCost()+10);
		book2.setCost(book2.getCost()+10);
		//Despligue de todos los libros con precio actualizado
		System.out.println("Name: " + book1.name + " Author: " + book1.author + " Cost: " + book1.cost);
    		System.out.println("Name: " + book2.name + " Author: " + book2.author + " Cost: " + book2.cost);
		System.out.println("Name: " + book3.name + " Author: " + book3.author + " Cost: " + book3.cost);
		//Asignación de un precio con valor negativo
		book1.setCost(-50);
		}
}
