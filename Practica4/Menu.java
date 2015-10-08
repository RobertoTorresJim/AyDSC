package mx.uam.ayd.practica4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* Esta clase representa una menu
*
* @author humberto
*
*/
	public class Menu {
	// La libreria
	private Bookstore bookstore;
	// Atributo necesario para leer entrada desde la consola
	private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
	public Menu() {
		bookstore = new Bookstore();
	}
	public void despliegaMenu() {
		int opcion = 0;
		do {
			System.out.println("1.- Agregar un material");
			System.out.println("2.- Buscar un material");
			System.out.println("3.- Eliminar un material");
			System.out.println("4.- Listar todos los materiales");
		do {
			System.out.println("Escoge una opcion (0 para salir)?");
			opcion = leeEntero();
		} while(opcion < 0 || opcion > 4);
			switch(opcion) {
				case 1:
					System.out.println("¿Que tipo de material desea agregar?");
					System.out.println("1.- Libro");
					System.out.println("2.- Revista");
					
					break;
				case 2:
					// Completar
					break;
				case 3:
					// Completar
					break;
				case 4:
					listaMateriales(bookstore.getMaterials());
					break;
			}
		}while(opcion != 0);
	}
/**
* Este metodo imprime los materiales de un arreglo de materiales
*
*/
	private void listaMateriales(Material[] materiales) {
		for(Material m:materiales) {
			System.out.println(m);
		}
	}
/**
* Este metodo lee un entero a partir de la consola
*
* @return el entero que se leyo
*/
	private int leeEntero()
	{
		String entrada = "" ;
		try
		{
			entrada = in.readLine() ;
		}
		catch (IOException e) {}
		int val = 0 ;
		try
		{
			val = Integer.parseInt(entrada) ;
		}
		catch (NumberFormatException e) {}
		return val ;
		}
/**
* Este metodo lee una cadena desde la consola
*
* @return La cadena que se leyo
*/
	private String leeCadena()
	{
		String s = "";
		try
		{
			s = in.readLine() ;
		}
		catch (IOException e) {
			System.out.println("Error en la lectura de entero");
		}
		return s ;
	}
/**
* Este metodo lee un 'double' a partir de la consola
*
* @return el double que se leyo
*/
	private double leeDoble()
	{
		String entrada = "" ;
		try
		{
			entrada = in.readLine() ;
	}
		catch (IOException e) {}
		double val = 0 ;
		try
		{
			val = Double.parseDouble(entrada) ;
		}
		catch (NumberFormatException e) {
			System.out.println("Error en la lectura de doble");
		}
		return val ;
	}
}
