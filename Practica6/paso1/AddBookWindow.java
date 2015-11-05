import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
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
  private JTextField jTextFieldName  = null;
  private JTextField jTextFieldCost = null;
  private JLabel jLabelAuthor = null;
  private JLabel jLabelAuthorName = null;
  private JButton jButtonFindAuthor = null;
  private JButton jButtonAccept = null;
  private JButton jButtonCancel = null;
  private AddBookControl control; // Control del caso de uso
  private Author author; // Autor actualmente seleccionado
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
      jLabelNameAuthor = new JLabel();
      jLabelAuthorName.setBounds(new Rectangle(136, 121, 205, 38));
      jLabelAuthorName.setText("");
      jLabelAuthor = new JLabel();
      jLabelAuthor.setBounds(new Rectangle(31, 121, 96, 37));
      jLabelAuthor.setText("Autor");
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
      jCo.setBounds(new Rectangle(235, 35, 199, 36));
    }
    return jTextFieldNombre;
  }
  /**

  * This method initializes jTextFieldPrecio
  *
  * @return javax.swing.JTextField
  */
  private JTextField getJTextFieldPrecio() {
    if (jTextFieldCost == null) {
      jTextFieldCost = new JTextField();
      jTextFieldCost.setBounds(new Rectangle(233, 76, 202, 31));
    }
    return jTextFieldCost;
  }
  /**
  * This method initializes jButtonBuscarAutor
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonBuscarAutor() {
    if (jButtonFindAuthor == null) {
      jButtonFindAuthor= new JButton();
      jButtonFindAuthor.setBounds(new Rectangle(347, 120, 86, 40));
      jButtonFindAuthor.setText("Buscar");
      jButtonFindAuthor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          author = control.buscarAutor();
          if(author != null) {
            jLabelAuthorName.setText(author.toString()); //Muestra el nombre del autor actualmente seleccionad
          }
        }
      });
    }
    return jButtonFindAuthor;
  }
  /**
  * This method initializes jButtonAceptar
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonAceptar() {
    if (jButtonAceptar == null) {
      jButtonAccept = new JButton();
      jButtonAccept.setBounds(new Rectangle(199, 170, 114, 37));
      jButtonAccept.setText("Aceptar");
      jButtonAccept.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          String name = jTextFieldName.getText(); // getTextregresa el texto del campo
          // Validaciones
          if(name.equals("") || author == null) {
            JOptionPane.showMessageDialog (null, "El nombre está
            vacio o no se selecciono autor");
          } else {
            double cost =
            Double.parseDouble(jTextFieldPrecio.getText()); //convierte a doble
            control.addBook(name, cost, author);
            setVisible(false); // cierra la ventana
          }
        }
      });
    }
    return jButtonAccept;
  }
  /**
  * This method initializes jButtonCancelar
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonCancel() {
    if (jButtonCancel == null) {
      jButtonCancel = new JButton();
      jButtonCancel.setBounds(new Rectangle(328, 171, 104, 36));
      jButtonCancel.setText("Cancelar");
      jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          setVisible(false);
        }
      });
    }
    return jButtonCancel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
