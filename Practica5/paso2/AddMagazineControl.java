/**
* Author: Roberto Torres Jiménez
*
* Clase AddMagazineControl de la practica 5 de la materia AyDSC
*/
public class AddMagazineControl{
  Bookstore bs;
  AddWindow win;
  public AddMagazineControl(Bookstore bs){
    this.bs = bs;
  }
  public void init(){
    win = new AddWindow(this);
  }
  public boolean addMagazine(String name, double cost, int number){
    System.out.println("Entro al metodo");
    return true;
  }
}
