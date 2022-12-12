package logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Factura extends JFrame {
	private Productos venta;
	private Fecha realizada;
	private Empleado vendedor;
	private Cliente comprador;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	public Factura() {
		iniciarComponentes();
		manejadoresEventos();
	}
	


	public void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

		
		
	public void manejadoresEventos() {
		
	}

		

		

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura frame = new Factura();
					frame.setVisible(true);
			   }catch (Exception e) {
				   e.printStackTrace();
			   }
			}
		});
	}
}

