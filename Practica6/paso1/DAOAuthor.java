
import java.util.ArrayList;
/**
* Author: Roberto Torres Jiménez
*
* Clase DAOAuthor de la practica 6 de la materia AyDSC
*/
public class DAOAuthor{
  private ArrayList<Author> authors;
  //Constructor de la clase
  public DAOAuthor(){
    //Inicializa la lista de autores
    authors = new ArrayList<Author> ();
  }
  // Agrega un autor a un autor
  //@return true si el autor se agrego correctamente
  public boolean addAuthor(Author author){
    return authors.add(author);
  }
  // Remueve un autor especifico de de la lista de autores
  // @return true si se elimino correctamente
  public boolean removeAuthor(Author author){
    return authors.remove(author);
  }
  // Regresa un arreglo de autores
  //@return arreglo de autores
  public Author [] getAuthors(){
    Author [] authorsTemp = new Author [authors.size()];
    authors.toArray(authorsTemp); // se llena el arreglo a partir del ArrayList
    return authorsTemp;
  }
  // Busca un autor de la lista y lo regresa en caso de existir en caso contrario
  // regresa null
  //@return Author
  public Author findAuthor(String name, String lastName){
    for(Author a : authors){ // se busca al autor dentro de la lista de autores
      //Si el nombre y el apellido coinciden con el de algun autor regresa al autor
      if(a.getName() == name && a.getLastName() == lastName){
        return a;
      }
    }
    //En caso de no encontrar ninguna coincidencia regresa null
    return null;
  }
  public int AuthorsNumber(){
    return authors.size();
  }
}
