import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* Author: Roberto Torres Jim�nez
*
* Clase de tipo ventana AddAuthor de la practica 6 de la materia AyDSC
*/
//Clase que extiene de una clase jFrame
public class AddAuthor extends JFrame implements ActionListener{

  //Objeto creado para distinguir los eventos
  Object object;
  //Creación de las cajas de texto de la ventana
  JTextField jTextFieldName;
  JTextField jTextFieldLastName;
  JTextField jTextFieldBornYear;
  //Creación de las etiquetas de las cajas de texto de la ventana
  JLabel jLabelName;
  JLabel jLabelLastName;
  JLabel jLabelBornYear;
  //Creación de los botones utilizados en la ventana
  JButton jButtonAccept;
  JButton jButtonCancel;
  //Titulo de la ventana
  JLabel jLabelTitulo;
  //Creación de un panel donde se contendra todo el contenido de la ventana
  JPanel jPanelBody;
  //Creación de un objeto de la clase AddAuthorControl
  AddAuthorControl authControl;

  public AddAuthor (AddAuthorControl authControl)throws HeadlessException{
    this.authControl = authControl;
    //inicialización de las cajas de texto
		jTextFieldBornYear = new JTextField(10);
		jTextFieldLastName = new JTextField(10);
		jTextFieldName = new JTextField(10);
    //Inicialización de las etiquetas ya con su respectivo nombre
		jLabelName = new JLabel("Nombre:");
		jLabelLastName = new JLabel("Apellido:");
		jLabelBornYear= new JLabel("Año de nacimiento:");
    //Inicialización de los botones de la ventana con su respectivo nombre
		jButtonAccept = new JButton("Aceptar");
		jButtonCancel = new JButton("Cancelar");
    //Inicialización del titulo de la ventana
		jLabelTitulo = new JLabel("Agregar Autor");
		jPanelBody = new JPanel();//inicializacion del panel que contendra los elementos de la ventana
    //Se le retira el formato a el panel que contendra los elementos de la ventana
		jPanelBody.setLayout(null);
    //Coloca el titulo de la ventana en al parte superior de la ventana
		getContentPane().add(jLabelTitulo, BorderLayout.NORTH);
    //Coloca el panel principal en el centro de la ventana
		getContentPane().add(jPanelBody, BorderLayout.CENTER);
    //Asignación de la posición de los objetos contenidos en la ventana y su tamaño
		jTextFieldName.setBounds(200, 10, 150, 25);
		jTextFieldLastName.setBounds(200, 40, 150, 25);
		jTextFieldBornYear.setBounds(200, 70, 150, 25);

		jLabelName.setBounds(30,10,150,25);
		jLabelLastName.setBounds(30,40,150,25);
		jLabelBornYear.setBounds(30,70,150,25);

		jButtonAccept.setBounds(75,100,100,50);
		jButtonCancel.setBounds(225,100,100,50);
    //Colocación del texto contenido en la cabecera de la ventana
		setTitle("Agregar Autor");
    //Se establece el tamaño de la ventana
		setSize(400, 220);
    //Se colocan todos los elementos en el panel principal
		jPanelBody.add(jTextFieldName);
		jPanelBody.add(jTextFieldLastName);
		jPanelBody.add(jTextFieldBornYear);
		jPanelBody.add(jLabelName);
		jPanelBody.add(jLabelLastName);
		jPanelBody.add(jLabelBornYear);
		jPanelBody.add(jButtonAccept);
		jPanelBody.add(jButtonCancel);
    //Llamado al evento del boton aceptar
    jButtonAccept.addActionListener(this);
    jButtonCancel.addActionListener(this);
    //Centra la ventana en la parte central de la pantalla
    setLocationRelativeTo(null);
    //Hace visible la ventana
    setVisible(true);
    //Termina el programa al cerrar la ventana
    		/* NO UTILIZADO */
    //	setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent e){
    // Asigna la fuente del evento a un objeto
    object = e.getSource();
    // Pregunta si el boton precionado fue el de acpetar
    if(object == jButtonAccept){
      // Pregunta si alguno de los campos de texto esta vacio
      if(jTextFieldName.getText().isEmpty() || jTextFieldLastName.getText().isEmpty() || jTextFieldBornYear.getText().isEmpty()){
        // Si alguno de los campos esta vacio muestra una ventana con una advertencia
        JOptionPane.showMessageDialog (null, "Es necesario llenar los campos");
      }
      // En otro caso asigna los datos a las variables correspondientes
      else{
        String name = jTextFieldName.getText(); // getText regresa el texto del campo
        String lastName = jTextFieldLastName.getText(); //getText regresa el texto al campo
        int bornYear = Integer.parseInt(jTextFieldBornYear.getText()); // convierte a entero
        setVisible(false); // cierra la ventana
      }
    }
    if(object == jButtonCancel){
      setVisible(false); // cierra la ventana
    }
  }
}
