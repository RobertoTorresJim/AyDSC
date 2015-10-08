package mx.uam.ayd.practica4;
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
		//creación de los autores de los libros
		Author author1 = new Author("Whatts", "Humphrey", 1987);
		Author author2 = new Author("Ian", "Sommerville", 1960);
		//Creación d elos libros 
		Book book1 = new Book("Personal Software Process", author1,30);
		Book book2 = new Book("Team Software Process", author1, 40);
		Book book3 = new Book("Software Engieneering", author2, 90);
		//Colocación de los libros en la libreria
		bs.addMaterial(book1);
		bs.addMaterial(book2);
		bs.addMaterial(book3);
		//Creación de dos revistas
		Magazine mag1 = new Magazine("Process Magazine", 1, 100);
		Magazine mag2 = new Magazine("IEEE Software", 15, 150);
		//Colocación de las revistas en la libreria
		bs.addMaterial(mag1);
		bs.addMaterial(mag2);
		//imprime la cantidad de libros total 
		System.out.println("Cantidad de Materiales: " + bs.materialsNumber());
		//Creación de arreglo de tipo material
		Material[] items = bs.getMaterials();
		//imprime el numero total de los libros(materiales)
		for(Material m : items){
			System.out.println(m.getName());
		}
		
		System.out.println("Materiales que contienen Process: ");
		for(Material m : bs.findMaterialsByContentName("Process")){
			System.out.println(m.getName());
		}
	}
}
