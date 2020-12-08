package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;


public class ExercicioMap {

	private JFrame frame;
	private JTextField jTextFieldPalavra;
	private JTextField jTextFieldTraducao;
	private Map<String, Palavra> words = new HashMap<String, Palavra>();
	
	//Autor: Vitor Assen

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioMap window = new ExercicioMap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExercicioMap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPalavra = new JLabel("Palavra:");
		lblPalavra.setBounds(70, 51, 46, 14);
		frame.getContentPane().add(lblPalavra);
		
		JLabel lblTraduo = new JLabel("Tradu\u00E7\u00E3o:");
		lblTraduo.setBounds(70, 111, 65, 14);
		frame.getContentPane().add(lblTraduo);
		
		jTextFieldPalavra = new JTextField();
		jTextFieldPalavra.setBounds(156, 48, 171, 20);
		frame.getContentPane().add(jTextFieldPalavra);
		jTextFieldPalavra.setColumns(10);
		
		jTextFieldTraducao = new JTextField();
		jTextFieldTraducao.setColumns(10);
		jTextFieldTraducao.setBounds(156, 108, 171, 20);
		frame.getContentPane().add(jTextFieldTraducao);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Palavra pt = new Palavra(jTextFieldTraducao.getText());
				String eng = jTextFieldPalavra.getText();
				words.put(eng, pt);
				System.out.println(words);
				jTextFieldPalavra.setText("");
				jTextFieldTraducao.setText("");
			}
		});
		btnSave.setBounds(82, 179, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnVoltar = new JButton("Consultar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Tradução da palavra " + jTextFieldPalavra.getText() + " é: " + words.get(jTextFieldPalavra.getText()));
			}
			
		});
		btnVoltar.setBounds(208, 179, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
	}
}
