package mx.uam.ayd.practica4;
/**
* Author: Roberto Torres Jiménez
*
* Clase Material del paso uno d ela practica 3 de la materia Análisis y Diseño de Sistemas de Computacion
*
*/

public class Material{
	
	String name;
	double cost;

	Material(){
	}
	
	Material(String name, double cost){
		this.name = name;
		this.cost = cost;
	}

	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}

	public void setCost(double cost){
		this.cost = cost;
	}
}
