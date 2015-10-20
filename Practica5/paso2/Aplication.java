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
		menu.despliegaMenu();
		new Ventana();
	}
}
