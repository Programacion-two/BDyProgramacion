package grafica;

import logica.Empleado;
import logica.Fecha;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class IngresarEmpleado extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtSalario;
	private JTextField txtSA;
	private JButton btnSA;
	private JTextField txtCedula;
	private JButton btnPresentismo;
	private JDateChooser dateChooser;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JComboBox cmbCategoria;

	public IngresarEmpleado() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	

	/**
	 * Create the dialog.
	 */
	public void iniciarComponentes() {
		setBounds(100, 100, 450, 295);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(50, 205, 50));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos del empleado", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(20, 11, 195, 201);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNombre = new JLabel("Nombre");
				lblNombre.setBounds(10, 22, 46, 14);
				panel.add(lblNombre);
			}
			{
				JLabel lblApellido = new JLabel("Apellido");
				lblApellido.setBounds(10, 47, 46, 14);
				panel.add(lblApellido);
			}
			{
				JLabel lblSalario = new JLabel("Salario");
				lblSalario.setBounds(10, 100, 46, 14);
				panel.add(lblSalario);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(81, 19, 86, 20);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				txtApellido = new JTextField();
				txtApellido.setBounds(81, 44, 86, 20);
				panel.add(txtApellido);
				txtApellido.setColumns(10);
			}
			
			JLabel lblCategoria = new JLabel("Categoria");
			lblCategoria.setBounds(10, 131, 66, 14);
			panel.add(lblCategoria);
			
			JLabel lblCedula = new JLabel("Cedula");
			lblCedula.setBounds(10, 72, 46, 14);
			panel.add(lblCedula);
			
			txtCedula = new JTextField();
			txtCedula.setBounds(81, 69, 86, 20);
			panel.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblAntiguedad = new JLabel("Fecha de ingreso");
			lblAntiguedad.setBounds(10, 163, 91, 14);
			panel.add(lblAntiguedad);
			
			dateChooser = new JDateChooser();
			dateChooser.setBounds(99, 157, 86, 20);
			panel.add(dateChooser);
			{
				txtSalario = new JTextField();
				txtSalario.setBounds(81, 97, 86, 20);
				panel.add(txtSalario);
				txtSalario.setColumns(10);
			}
			
			cmbCategoria = new JComboBox();
			cmbCategoria.setModel(new DefaultComboBoxModel(new String[] {"1. Jefe de vendedores", "2. Vendedor senior", "3. Vendedor junior", "4. Cadete"}));
			cmbCategoria.setBounds(67, 127, 118, 22);
			panel.add(cmbCategoria);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(30, 144, 255));
			panel.setBorder(new TitledBorder(null, "Sueldo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(235, 11, 189, 156);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			txtSA = new JTextField();
			txtSA.setBounds(10, 60, 169, 20);
			panel.add(txtSA);
			txtSA.setColumns(10);
			
			btnPresentismo = new JButton("Presentismo");
			btnPresentismo.setBounds(48, 93, 100, 23);
			panel.add(btnPresentismo);
			
			btnSA = new JButton("Salario anual");
			btnSA.setBounds(48, 26, 100, 23);
			panel.add(btnSA);
		}
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
	
	public void iniciarManejadoresEventos() {
		btnSA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String nombre=txtNombre.getText();
				String apellido=txtApellido.getText();
				String cedula=txtCedula.getText();
				double salario=Double.valueOf(txtSalario.getText());
				int dia=dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes=dateChooser.getCalendar().get(Calendar.MONTH)+1;
				int anio=dateChooser.getCalendar().get(Calendar.YEAR);
				String categoria=cmbCategoria.getSelectedItem().toString();
				Fecha antiguedad=new Fecha(dia,mes,anio);
				Empleado e1=new Empleado(nombre,apellido,cedula,salario,antiguedad,categoria);
				txtSA.setText(String.valueOf(e1.sueldoAnual()));
				
				}catch(Exception ex) {
					txtSA.setText("No se pudo");
					JOptionPane.showMessageDialog(null,ex);
				}

			}
		});
			
		
		
		btnPresentismo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String nombre=txtNombre.getText();
				String apellido=txtApellido.getText();
				String cedula=txtCedula.getText();
				double salario=Double.valueOf(txtSalario.getText());
				int dia=dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes=dateChooser.getCalendar().get(Calendar.MONTH)+1;
				int anio=dateChooser.getCalendar().get(Calendar.YEAR);
				String categoria=cmbCategoria.getSelectedItem().toString();
				Fecha antiguedad=new Fecha(dia,mes,anio);
				Empleado e1=new Empleado(nombre,apellido,cedula,salario,antiguedad,categoria);
				txtSA.setText(String.valueOf(e1.presentismo()));
				
				}catch(Exception ex ) {
					txtSA.setText("No se pudo");
					JOptionPane.showMessageDialog(null,ex);
					
				}
				
				
				
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
			IngresarEmpleado dialog = new IngresarEmpleado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
