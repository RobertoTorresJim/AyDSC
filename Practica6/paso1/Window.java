
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Author: Roberto Torres Jiménez
* Clase ventana de la practica 5 de la materia AyDSC
*/
//Inicio de la clase Window
public class Window extends JFrame implements ActionListener{
/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	//Creación de los elementos contenidos en la ventana
	JButton jButtonAddBook;
	JButton jButtonAddMagazine;
	JButton jButtonFindMaterial;
	JButton jButtonAddAuthor;
	JButton jButtonRemoveMaterial;
	JButton jButtonShowMaterial;
	JPanel jPanelBody;
	JLabel jTitle;
//Referencia a la aplicación
	Aplication app;
//Objeto para interactuar con los eventos de la ventana
	Object object;
//Constructor de la clase que recibe una aplicación como parametro
	public Window(Aplication app) throws HeadlessException{
		this.app = app;
//Inicialización de los botones de la ventana con su respectivo nombre
		jButtonAddBook = new JButton("Agregar Libro");
		jButtonAddMagazine = new JButton("Agregar Revista");
		jButtonAddAuthor = new JButton("Agregar Autor");
		jButtonFindMaterial = new JButton("Buscar Material");
		jButtonRemoveMaterial = new JButton("Eliminar Material");
		jButtonShowMaterial = new JButton("Listar Material");
//Inicialización del titulo de la ventana
		jTitle = new JLabel("Librería virtual");
//Inicialización del panel que contendra los elementos de la ventana
		jPanelBody = new JPanel();
//Colocación de la cabecera de la ventana
		setTitle("Librería virtual");
//Definición del tamaño de la ventana
		setSize(510,200);
//Cambio del panel aun formato 3x2 para contener los botones
		jPanelBody.setLayout(new GridLayout(3, 2));
//Asignación del titulo de la ventana en la parte superior
		getContentPane().add(jTitle, BorderLayout.NORTH);
//Asignación del panel principal de la ventana en el centro
		getContentPane().add(jPanelBody, BorderLayout.CENTER);
//Colocación de los botones de la ventana (uno por cada celda del grid)
		jPanelBody.add(jButtonAddBook);
		jPanelBody.add(jButtonAddAuthor);
		jPanelBody.add(jButtonAddMagazine);
		jPanelBody.add(jButtonFindMaterial);
		jPanelBody.add(jButtonRemoveMaterial);
		jPanelBody.add(jButtonShowMaterial);
//Llamado a los eventos de cada boton de la ventana
		jButtonAddBook.addActionListener(this);
		jButtonAddAuthor.addActionListener(this);
		jButtonAddMagazine.addActionListener(this);
		jButtonRemoveMaterial.addActionListener(this);
		jButtonFindMaterial.addActionListener(this);
		jButtonShowMaterial.addActionListener(this);
//Coloca la ventana en el centro de la pantalla
		setLocationRelativeTo(null);
//Hace la ventana visible
		setVisible(true);
//Termina el programa al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
//Metodo que llama a la acción de presionar un boton
	public void actionPerformed(ActionEvent e){
//Se llama a la fuente del evento y se almacena en un objeto
		object = e.getSource();
//Se pregunta si el objeto corresponde a cada uno de los botones
		if(object == jButtonAddBook){
			//En este caso se llama al metodo addBook
			app.addBook();
		}
		if(object == jButtonAddAuthor){
			//En este caso se llama al metodo addAuthor
			app.addAuthor();
		}
		if(object == jButtonAddMagazine){
			//En este caso se llama al metodo addMagazine
			app.addMagazine();
		}
		if(object == jButtonFindMaterial){
			//En este caso se llama al metodo findMaterial
			app.findMaterial();
		}
		if(object == jButtonShowMaterial){
			//En este caso se llama al metodo showMaterial
			app.showMaterial();
		}
		if(object == jButtonRemoveMaterial){
			//En este caso se llama al metodo removeMaterial
			app.removeMaterial();
		}
	}
}
