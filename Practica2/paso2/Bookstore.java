import java.util.ArrayList;
/**
* Esta clase representa una liberia
*
* @author humberto
*
*/
public class Bookstore {
	private ArrayList <Book> books;
/**
* Constructor de la clase
*/
	public Bookstore() {
	books = new ArrayList <Book> ();
	}
/**
* Permite agregar un libro a la librería
* @return true si el libro se agrego exitosamente, false sino
*/
	public void addBook(Book book) {
		books.add(book);
	}
/**
* Permite quitar un libro a la librería
* @return true si el libro se quito exitosamente, false sino
*/
	public void removeBook(Book book) {
		books.remove(book);
	}
/**
* Regresa los libros de la libreria como un arreglo de libros
* @return el arreglo de libros
*/
	public Book[] getBooks() {
		// Creamos un arreglo de libros del tamaño del arrayList
		Book booksTemp[]=new Book[books.size()];
		// Se llena el arreglo a partir del arrayList
		books.toArray(booksTemp);
		return booksTemp;
	}
	public Book[] findBooksByAuthor(Author author) {
		int i = 0;
		for(Book b : books){
			if(b.getAuthor() == author)
				i++;
		}
		Book[] book = new Book[i];
		i = 0;
		for(Book b : books){
			if(b.getAuthor() == author){
				book[i]=b;
				i++;
			}
		}
		return book;
	}
	public int booksNumber() {
		return books.size();
	}
}
