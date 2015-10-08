/**
* Autor: Roberto Torres Jimenez
*
* Clase libro del primer ejercicio de la segunda practica de la materia Analisis
* y Diseño de Sistemas de Computación......
*/

public class Aplication{
	Bookstore bs = new Bookstore();	
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
		Author author1 = new Author("Sergi", "Llauger", 1987);
		Author author2 = new Author("J.R.R", "Tolkien", 1960);
		Book book1 = new Book("Diary of a Zombie", author1,30);
		Book book2 = new Book("El Yermo", author1, 40);
		Book book3 = new Book("Lord of the rings", author2, 90);
		bs.addBook(book1);
		bs.addBook(book2);
		bs.addBook(book3);
		System.out.println("Cantidad de libros: " + bs.booksNumber());
		Book[] galery = bs.getBooks();
		for(int i = 0; i<galery.length; i++){
			System.out.println(galery[i].getName());
		}
		System.out.println("Libros del Autor: " + author1.toString());
		galery = bs.findBooksByAuthor(author1);
		for(int i = 0; i<galery.length; i++){
			System.out.println(galery[i].getName());
		}		
	}
}
