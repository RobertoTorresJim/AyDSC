/**
* Autor: Roberto Torres Jimenez
*
* Clase libro del primer ejercicio de la segunda practica de la materia Analisis
* y Diseño de Sistemas de Computación......
*/

public class Aplication{
	
	public static void main(String[] args){
		Aplication app = new Aplication();
		//inicia la aplicación
		app.init();
	}
/**
* Constructor de la clase
*/
	public Aplication(){
	//nada que incializar
	}
/**
* Este metodo inicia la aplicación
*/
	public void init(){
		Author author = new Author("Sergi","Llauger",1987);
		Book book1 = new Book("Diary of a Zombie", author,30);
		Book book2 = new Book("El Yermo", author, 40);
		System.out.println("Libro 1: "+book1.getName()+", "+book1.getAuthor().toString()+", "+book1.getCost());
		System.out.println("Libro 2: "+book2.getName()+", "+book2.getAuthor().toString()+", "+book1.getCost());
	}
}
