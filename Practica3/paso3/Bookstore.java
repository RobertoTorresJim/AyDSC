package mx.uam.ayd.practica4;
import java.util.ArrayList;
/**
* Esta clase representa una liberia
*
* @author humberto
*
*/
public class Bookstore {
	private ArrayList<Material> materials;
/**
* Constructor de la clase
*/
	public Bookstore() {
		
		materials = new ArrayList <Material> ();
	}
/**
* Permite agregar un libro a la librería
* @return true si el libro se agrego exitosamente, false sino
*/
	public boolean addMaterial(Material material) {
		return materials.add(material);
	}
/**
* Permite quitar un libro a la librería
* @return true si el libro se quito exitosamente, false sino
*/
	public boolean removeMaterial(Material material) {
		return materials.remove(material);
	}
/**
* Regresa los libros de la libreria como un arreglo de libros
* @return el arreglo de libros
*/
	public Material[] getMaterials() {
		// Creamos un arreglo de libros del tamaño del arrayList
		Material materialsTemp[]=new Material[materials.size()];
		// Se llena el arreglo a partir del arrayList
		materials.toArray(materialsTemp);
		return materialsTemp;
	}
/**
* Regresa los libros de la libreria del autor pasado como parámetro
* como un arreglo de libros
* @param Un autor
* @return un arreglo con libros de ese autor
*/
	public Material[] findMaterialsByContentName(String contentName) {
		Material[] mat;
		int i = 0;
		for(Material m : materials){
			if(m.getName().contains(contentName)){
				i++;
			}
		}
		mat = new Material[i];
		i = 0;
		int j = 0;
		for(Material m : materials){
			if(m.getName().contains(contentName)){
				mat[i] = materials.get(j);
				i++;
			}
			j++;
		}
		return mat;
	}
/**
* Regresa numero de libros en la libreria
* @return un entero con el numero de libros
*/
	public int materialsNumber() {
		return materials.size();
	}
}
