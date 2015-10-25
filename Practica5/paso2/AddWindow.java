import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
* Author: Roberto Torres Jiménez
*
* Clase AddWindow de la practica 5 de la materia AyDSC
*/

//Clase que extiene de una clase JFrame para funcionar como una ventana
public class AddWindow extends JFrame implements ActionListener{
	private static final long serialVersionUID = 4L;
//Objeto creado para distinguir los eventos
	Object object;
//Creación de las cajas de texto de la ventana
	JTextField jTextFieldName;
	JTextField jTextFieldCost;
	JTextField jTextFieldNumber;
//Creación de las etiquetas de las cajas de texto de la ventana
	JLabel jLabelName;
	JLabel jLabelCost;
	JLabel jLabelNumber;
//Creación de los botones utilizados en la ventana
	JButton jButtonAccept;
	JButton jButtonCancel;
//Titulo de la ventana
	JLabel jLabelTitulo;
//Creación de un panel donde se contendra todo el contenido de la ventana
	JPanel jPanelBody;
//Creación de un objeto de la clase AddMagazineControl
	AddMagazineControl magControl;
//constructor de la clase
	public AddWindow(AddMagazineControl magControl) throws HeadlessException{
		this.magControl = magControl;
//inicialización de las cajas de texto
		jTextFieldNumber = new JTextField(10);
		jTextFieldCost = new JTextField(10);
		jTextFieldName = new JTextField(10);
//Inicialización de las etiquetas ya con su respectivo nombre
		jLabelName = new JLabel("Nombre:");
		jLabelCost = new JLabel("Precio:");
		jLabelNumber = new JLabel("Numero:");
//Inicialización de los botones de la ventana con su respectivo nombre
		jButtonAccept = new JButton("Aceptar");
		jButtonCancel = new JButton("Cancelar");
//Inicialización del titulo de la ventana
		jLabelTitulo = new JLabel("Agregar Revista");
		jPanelBody = new JPanel();//inicializacion del panel que contendra los elementos de la ventana
//Se le retira el formato a el panel que contendra los elementos de la ventana
		jPanelBody.setLayout(null);
//Coloca el titulo de la ventana en al parte superior de la ventana
		getContentPane().add(jLabelTitulo, BorderLayout.NORTH);
//Coloca el panel principal en el centro de la ventana
		getContentPane().add(jPanelBody, BorderLayout.CENTER);
//Asignación de la posición de los objetos contenidos en la ventana y su tamaño
		jTextFieldName.setBounds(200, 10, 150, 25);
		jTextFieldCost.setBounds(200, 40, 150, 25);
		jTextFieldNumber.setBounds(200, 70, 150, 25);

		jLabelName.setBounds(30,10,150,25);
		jLabelCost.setBounds(30,40,150,25);
		jLabelNumber.setBounds(30,70,150,25);

		jButtonAccept.setBounds(75,100,100,50);
		jButtonCancel.setBounds(225,100,100,50);
//Colocación del texto contenido en la cabecera de la ventana
		setTitle("Agregar Revista");
//Se establece el tamaño de la ventana
		setSize(400, 200);
//Se colocan todos los elementos en el panel principal
		jPanelBody.add(jTextFieldName);
		jPanelBody.add(jTextFieldCost);
		jPanelBody.add(jTextFieldNumber);
		jPanelBody.add(jLabelName);
		jPanelBody.add(jLabelCost);
		jPanelBody.add(jLabelNumber);
		jPanelBody.add(jButtonAccept);
		jPanelBody.add(jButtonCancel);
//Llamado al evento del boton aceptar
		jButtonAccept.addActionListener(this);
		jButtonCancel.addActionListener(this);
//Centra la ventana en la parte central de la pantalla
		setLocationRelativeTo(null);
//Hace visible la ventana
		setVisible(true);
		/* NO UTILIZADO */
//Termina el programa al cerrar la ventana
//	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		object = e.getSource();
		if(object == jButtonAccept){
			String name = jTextFieldName.getText(); // getText regresa el texto del campo
			double cost = Double.parseDouble(jTextFieldCost.getText()); //convierte a doble
			int number = Integer.parseInt(jTextFieldNumber.getText()); // convierte a entero
			magControl.addMagazine(name, cost, number);
			setVisible(false); // cierra la ventana
		}
		if(object == jButtonCancel){
			setVisible(false);
		}
	}
}
