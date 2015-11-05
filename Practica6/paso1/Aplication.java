/**
* Autor: Roberto Torres Jimenez
*
* Clase libro del primer ejercicio de la segunda practica de la materia Analisis
* y Diseño de Sistemas de Computación......
*/

public class Aplication{
	Bookstore bs = new Bookstore();
	DAOAuthor DAO = new DAOAuthor();
	Window win;
	AddBookWindow winb;
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
//Inicializa la clase
	public void init(){
		//crea una ventwna de tipo window que recibe como referencia esta clase
		win = new Window(this);
		
	}
	/*TODOS LOS METODOS SIGUIENTES IMPRIMEN UN MENSAJE PARA VER EL CORRECTO FUNCIONAMIENTO
	* DE LOS BOTONES DE LA CLASE WINDOW*/
	public void addAuthor(){
		AddAuthorControl authControl = new AddAuthorControl(DAO);
		authControl.init();
		System.out.println("Se añadio autor");
	}
	public void addBook(){
		AddBookControl bookControl = new AddBookControl(bs, DAO);
		bookControl.init();
		System.out.println("Se añadio un libro");
	}
	public void addMagazine(){
		//Se crea el control de la ventana agregar revista y se le pasa la libreria
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
		//Ciclo que imprime los materiales contenidos en la libreria
		for(Material mat : bs.getMaterials()){
			System.out.println(mat.toString());
		}
	}
	public void findMaterial(){
		System.out.println("Se busco material");
	}
}
