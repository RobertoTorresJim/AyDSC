/**
* Author: Roberto Torres Jiménez
*
* Clase AddWindow de la practica 5 de la materia AyDSC
*/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddWindow extends JFrame{
	private static final long serialVersionUID = 4L;
	JTextField jTextFieldName;
	JTextField jTextFieldCost;
	JTextField jTextFieldNumber;

	JLabel jLabelName;
	JLabel jLabelCost;
	JLabel jLabelNumber;

	JButton jButtonAccept;
	JButton jButtonCancel;
	JLabel jLabelTitulo;
	JPanel jPanelBody;

	public AddWindow() throws HeadlessException{
		jTextFieldNumber = new JTextField(10);
		jTextFieldCost = new JTextField(10);
		jTextFieldName = new JTextField(10);

		jLabelName = new JLabel("Nombre:");
		jLabelCost = new JLabel("Precio:");
		jLabelNumber = new JLabel("Numero:");

		jButtonAccept = new JButton("Aceptar");
		jButtonCancel = new JButton("Cancelar");

		jLabelTitulo = new JLabel("Agregar Revista");
		jPanelBody = new JPanel();

		jPanelBody.setLayout(null);

		getContentPane().add(jLabelTitulo, BorderLayout.NORTH);
		getContentPane().add(jPanelBody, BorderLayout.CENTER);

		jTextFieldName.setBounds(200, 10, 150, 25);
		jTextFieldCost.setBounds(200, 40, 150, 25);
		jTextFieldNumber.setBounds(200, 70, 150, 25);

		jLabelName.setBounds(30,10,150,25);
		jLabelCost.setBounds(30,40,150,25);
		jLabelNumber.setBounds(30,70,150,25);

		jButtonAccept.setBounds(75,100,100,50);
		jButtonCancel.setBounds(225,100,100,50);

		setTitle("Agregar Revista");
		setSize(400, 200);

		jPanelBody.add(jTextFieldName);
		jPanelBody.add(jTextFieldCost);
		jPanelBody.add(jTextFieldNumber);
		jPanelBody.add(jLabelName);
		jPanelBody.add(jLabelCost);
		jPanelBody.add(jLabelNumber);
		jPanelBody.add(jButtonAccept);
		jPanelBody.add(jButtonCancel);

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
