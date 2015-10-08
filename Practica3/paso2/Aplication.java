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
		Author author1 = new Author("Whatts", "Humphrey", 1987);
		Author author2 = new Author("Ian", "Sommerville", 1960);
		Book book1 = new Book("Personal Software Process", author1,30);
		Book book2 = new Book("Team Software Process", author1, 40);
		Book book3 = new Book("Software Engieneering", author2, 90);
		bs.addMaterial(book1);
		bs.addMaterial(book2);
		bs.addMaterial(book3);
		System.out.println("Cantidad de Materiales: " + bs.materialsNumber());
		Material[] items = bs.getMaterials();

		for(Material m : items){
			System.out.println(m.getName());
		}
		System.out.println("Materiales que contienen Process: ");
		for(Material m : bs.findMaterialsByContentName("Process")){
			System.out.println(m.getName());
		}
	}
}
