
/**
* Author: Roberto Torres Jiménez
*
* Clase control de la ventana AddAuthor de la practica 6 de la materia AyDSC
*/
public class AddAuthorControl{
  DAOAuthor DAO;
  AddAuthor win;
  //Constructor de la clase recibe como parametro un objeto DAOAuthor
  public AddAuthorControl(DAOAuthor DAO){
    this.DAO = DAO;
  }
  //metodo que inicia la centana de AddAuthor
  public void init(){
    win = new AddAuthor(this);
  }
  //Metodo que guarda un author en DAOAuthor
  //@return true si se añadio correctamente el autor
  public boolean AddAuthor(String name, String lastName, int bornYear){
    Author author = new Author(name, lastName, bornYear);
    return DAO.addAuthor(author);
  }
}
