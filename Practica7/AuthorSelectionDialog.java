import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.Rectangle;
import javax.swing.JButton;
/**
* Author: indefinido
*/
public class AuthorSelectionDialog extends JDialog {
  private static final long serialVersionUID = 1L;
  private JPanel jContentPane = null;
  private JList jListAutores = null;
  private JButton jButtonAceptar = null;
  private Author[] autors;
  /**
  * @param owner
  */
  public AuthorSelectionDialog(Frame owner, Author autors[]) {
    super(owner,true);
    initialize();
    DefaultListModel model = new DefaultListModel();
    for(Author a:autors) {
      System.out.println("Se entro al metodo AuthorSelectionDialog");
      model.addElement(a);
    }
    jListAutores.setModel(model);
  }
  /**
  * This method initializes this
  *
  * @return void
  */
  private void initialize() {
    this.setSize(406, 295);
    this.setTitle("Seleccionar Autor");
    this.setContentPane(getJContentPane());
  }
  /**
  * This method initializes jContentPane
  *
  * @return javax.swing.JPanel
  */
  private JPanel getJContentPane() {
    if (jContentPane == null) {
      jContentPane = new JPanel();
      jContentPane.setLayout(null);
      jContentPane.add(getJListAutores(), null);
      jContentPane.add(getJButtonAceptar(), null);
    }
    return jContentPane;
  }
  /**
  * This method initializes jListAutores
  *
  * @return javax.swing.JList
  */
  private JList getJListAutores() {
    if (jListAutores == null) {
      jListAutores = new JList();
      jListAutores.setBounds(new Rectangle(15, 15, 362, 190));
    }
    return jListAutores;
  }
  /**
  * This method initializes jButtonAceptar
  *
  * @return javax.swing.JButton
  */
  private JButton getJButtonAceptar() {
    if (jButtonAceptar == null) {
      jButtonAceptar = new JButton();
      jButtonAceptar.setBounds(new Rectangle(240, 214, 138, 28));
      jButtonAceptar.setText("Aceptar");
      jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
          setVisible(false);
        }
      });
    }
    return jButtonAceptar;
  }
  public Author getAutorSeleccionado() {
    return (Author) jListAutores.getSelectedValue();
  }
} // @jve:decl-index=0:visual-constraint="10,10"
