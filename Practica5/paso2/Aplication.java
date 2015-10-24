/**
* Autor: Roberto Torres Jimenez
*
* Clase libro del primer ejercicio de la segunda practica de la materia Analisis
* y Diseño de Sistemas de Computación......
*/

public class Aplication{
	Bookstore bs = new Bookstore();
	Window win;
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
		win = new Window(this);
	}
	public void addAuthor(){
		System.out.println("Se añadio autor");
	}
	public void addBook(){
		System.out.println("Se añadio un libro");
	}
	public void addMagazine(){
		AddMagazineControl magControl = new AddMagazineControl(bs);
		magControl.init();
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
	public void findMaterial(){
		System.out.println("Se busco material");
	}

}
