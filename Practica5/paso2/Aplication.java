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
		Menu menu = new Menu();
		Window win = new Window(this);
		menu.despliegaMenu();
	}
	public void addAuthor(){
		System.out.println("Se añadio autor");
	}
	public void addBook(){
		System.out.println("Se añadio un libro");
	}
	public void addMagazine(){
		System.out.println("Se añadio una revista");
	}
	public void addMaterial(){
		System.out.println("Se añadio un material");
	}
	public void removeMaterial(){
		System.out.println("Se elimino un material");
	}
	public void showMaterial(){
		System.out.println("Se mostraron los materiales");
	}

}
