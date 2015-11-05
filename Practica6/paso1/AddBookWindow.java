
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
* Author: Roberto Torres Jiménez
* CLase AddBook para añadir libros de la practica 6 de la materia AyDSC
*/
public class AddBookWindow extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel jContentPane = null;
  private JLabel jLabel = null;
  private JLabel jLabel1 = null;
  private JTextField jTextFieldNombre = null;
  private JTextField jTextFieldPrecio = null;
  private JLabel jLabelAutor = null;
  private JLabel jLabelNombreAutor = null;
  private JButton jButtonBuscarAutor = null;
  private JButton jButtonAceptar = null;
  private JButton jButtonCancelar = null;
  private AddBookControl control; // Control del caso de uso
  private Author autor; // Autor actualmente seleccionado
  /**
  * This is the default constructor
  */
  public AddBookWindow (AddBookControl control) {
    super();
    this.control = control; // Guarda referencia al control
    initialize();
  }
  /**
  * This method initializes this
  *
  * @return void
  */
  private void initialize() {
    this.setSize(459, 268);
    this.setContentPane(getJContentPane());
    this.setTitle("Agregar Libro");
  }
  /**
  * This method initializes jContentPane
  *
  * @return javax.swing.JPanel
  */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      jLabelNombreAutor = new JLabel();
      jLabelNombreAutor.setBounds(new Rectangle(136, 121, 205, 38));
      jLabelNombreAutor.setText("");
      jLabelAutor = new JLabel();jLabelAutor.setBounds(new Rectangle(31, 121, 96, 37));
      jLabelAutor.setText("Autor");
      jLabel1 = new JLabel();
      jLabel1.setBounds(new Rectangle(32, 74, 192, 33));
      jLabel1.setText("Precio");
      jLabel = new JLabel();
      jLabel.setBounds(new Rectangle(31, 34, 195, 30));
      jLabel.setText("Nombre");
      jContentPane = new JPanel();
      jContentPane.setLayout(null);
      jContentPane.add(jLabel, null);
      jContentPane.add(jLabel1, null);
      jContentPane.add(getJTextFieldNombre(), null);
      jContentPane.add(getJTextFieldPrecio(), null);
      jContentPane.add(jLabelAutor, null);
      jContentPane.add(jLabelNombreAutor, null);
      jContentPane.add(getJButtonBuscarAutor(), null);
      jContentPane.add(getJButtonAceptar(), null);
      jContentPane.add(getJButtonCancelar(), null);
    }
    return jContentPane;
  }
  /**

  * This method initializes jTextFieldPrecio
  *
  * @return javax.swing.JTextField
  */
  private JTextField getJTextFieldNombre() {
    if (jTextFieldNombre == null) {
      jTextFieldNombre = new JTextField();
      jTextFieldNombre.setBounds(new Rectangle(235, 35, 199, 36));
    }
    return jTextFieldNombre;
  }
  /**
  * This method initializes jTextFieldPrecio
  *
  * @return javax.swing.JTextField
  */
  private JTextField getJTextFieldPrecio() {
    if (jTextFieldPrecio == null) {
      jTextFieldPrecio = new JTextField();
      jTextFieldPrecio.setBounds(new Rectangle(233, 76, 202, 31));
    }
    return jTextFieldPrecio;
  }
  /**
  * This method initializes jButtonBuscarAutor
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonBuscarAutor() {
    if (jButtonBuscarAutor == null) {
      jButtonBuscarAutor = new JButton();
      jButtonBuscarAutor.setBounds(new Rectangle(347, 120, 86, 40));
      jButtonBuscarAutor.setText("Buscar");
      jButtonBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          autor = control.buscarAutor();
          if(autor != null) {
            jLabelNombreAutor.setText(autor.toString()); //Muestra el nombre del autor actualmente seleccionado
          }
        }
      });
    }
    return jButtonBuscarAutor;
  }
  /**
  * This method initializes jButtonAceptar
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonAceptar() {
    if (jButtonAceptar == null) {
      jButtonAceptar = new JButton();
      jButtonAceptar.setBounds(new Rectangle(199, 170, 114, 37));
      jButtonAceptar.setText("Aceptar");
      jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          String nombre = jTextFieldNombre.getText(); // getText regresa el texto del campo
          // Validaciones
          if(nombre.equals("") || autor == null) {
            JOptionPane.showMessageDialog (null, "El nombre está vacio o no se selecciono autor");
          } else {
            double precio =
            Double.parseDouble(jTextFieldPrecio.getText()); //convierte a doble
            control.agregarLibro(nombre, autor, precio);
            setVisible(false); // cierra la ventana
          }
        }
      });
    }
    return jButtonAceptar;
  }
  /**
  * This method initializes jButtonCancelar
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonCancelar() {
    if (jButtonCancelar == null) {
      jButtonCancelar = new JButton();
      jButtonCancelar.setBounds(new Rectangle(328, 171, 104, 36));
      jButtonCancelar.setText("Cancelar");
      jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          setVisible(false);
        }
      });
    }
    return jButtonCancelar;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
