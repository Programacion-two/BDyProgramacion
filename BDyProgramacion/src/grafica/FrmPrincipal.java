package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class FrmPrincipal extends JFrame {
	private JPanel contentPane;
	
	public FrmPrincipal() {
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	

	public void iniciarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar mnbPrincipal = new JMenuBar();
		setJMenuBar(mnbPrincipal);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnbPrincipal.add(mnCliente);
		
		JMenuItem ItemAgregarCliente = new JMenuItem("Agregar cliente");
		mnCliente.add(ItemAgregarCliente);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.YELLOW);
		desktopPane.setBounds(0, 0, 434, 239);
		contentPane.add(desktopPane);
	}
	
	public void iniciarManejadoresEventos() {
		
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
