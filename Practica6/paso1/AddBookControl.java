/**
* Author: Roberto Torres Jiménez
* Clase de contro para la clase AddBook de la practica 6 de la materia AyDSC
*/import javax.swing.JFrame;

public class AddBookControl {
   Bookstore bookstore;
   DAOAuthor authors;
   AddBookWindow win;
  public AddBookControl(Bookstore bookstore, DAOAuthor authors) {
    // implementar
    this.bookstore = bookstore;
    this.authors = authors;
  }
  public void init() {
    // implementar
    win = new AddBookWindow(this);
    win.setVisible(true);
  }
  public Author buscarAutor() {
    Author arregloAutores[] = authors.getAuthors(); // Obtiene lista de autores
    AuthorSelectionDialog dialogo = new AuthorSelectionDialog(new JFrame(),arregloAutores); // Crea eldialogo con la lista de autores
    dialogo.setVisible(true); // Muestra el dialogo
    return dialogo.getAutorSeleccionado(); // Regresa el autor seleccionado en el dialogo
  }
  public boolean agregarLibro(String name, Author author, double cost) {
    // implementar
    Book book = new Book(name, author, cost);
    return bookstore.addMaterial(book);
  }
}
