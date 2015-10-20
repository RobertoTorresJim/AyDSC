import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
* Author: Roberto Torres Jiménez
* Clase ventana de la practica 5 de la materia AyDSC
*/
public class Ventana extends JFrame {

	JButton jButtonAddBook;
	JButton jButtonAddMagazine;
	JButton jButtonFindMaterial;
	JButton jButtonAddAuthor;
	JButton jButtonRemoveMaterial;
	JButton jButtonShowMaterial;
	JPanel jPanelBody;
	JLabel jTitle;

	public Ventana() throws HeadlessException{
				jButtonAddBook = new JButton("Agregar Libro");
				jButtonAddMagazine = new JButton("Agregar Revista");
				jButtonAddAuthor = new JButton("Agregar Author");
				jButtonFindMaterial = new JButton("Buscar Material");
				jButtonRemoveMaterial = new JButton("Eliminar Material");
				jButtonShowMaterial = new JButton("Listar Material");
				jTitle = new JLabel("Librería virtual");
				jPanelBody = new JPanel();

				setTitle("Librería virtual");
				setSize(510,200);

				jPanelBody.setLayout(new GridLayout(3, 2));
				getContentPane().add(jTitle, BorderLayout.NORTH);
				getContentPane().add(jPanelBody, BorderLayout.CENTER);

				jPanelBody.add(jButtonAddBook);
				jPanelBody.add(jButtonAddAuthor);
				jPanelBody.add(jButtonAddMagazine);
				jPanelBody.add(jButtonFindMaterial);
				jPanelBody.add(jButtonRemoveMaterial);
				jPanelBody.add(jButtonShowMaterial);
				setLocationRelativeTo(null);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
