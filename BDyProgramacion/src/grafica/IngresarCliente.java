package grafica;
import logica.Cliente;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logica.Articulo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

public class IngresarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JCheckBox chkEsPref;
	private JButton btnGuardar;
	private JButton btnCancelar;
	
	
	public IngresarCliente() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}

	
	public void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(88, 11, 236, 206);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(23, 37, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(23, 77, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBounds(23, 124, 46, 14);
		panel.add(lblCedula);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(80, 34, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(80, 77, 86, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(80, 121, 86, 20);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		chkEsPref = new JCheckBox("¿Es preferencial?");
		chkEsPref.setBounds(6, 161, 125, 23);
		panel.add(chkEsPref);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
			{
				btnGuardar = new JButton("Guardar");
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}


		
	
	
	
	public void iniciarManejadoresEventos(){
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=txtNombre.getText();
				String apellido=txtApellido.getText();
				String cedula=txtCedula.getText();			
			    boolean preferencial;
			    JFrame d= new JFrame();

						
				if(chkEsPref.isSelected()) {
				    preferencial=true;
					JOptionPane.showMessageDialog(d,"Eres preferencial");
				        
				}else {
					preferencial=false;
					JOptionPane.showMessageDialog(d,"No eres preferencial");


				        }
				            	 
				Cliente c = new Cliente(nombre,apellido,cedula,preferencial);

						
			}
		});
				
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				
				
			
		
		}
	public static void main(String[] args) {
		try {
			IngresarCliente dialog = new IngresarCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


