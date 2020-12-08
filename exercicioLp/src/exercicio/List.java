package exercicio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Autor: Vitor Assen

public class List {

	private JFrame frmListNome;
	private ArrayList<Palavra> nome = new ArrayList<Palavra>();;
	private JTextField txt_word;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
					window.frmListNome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public List() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmListNome = new JFrame();
		frmListNome.setTitle("LIST");
		frmListNome.setBounds(100, 100, 450, 300);
		frmListNome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmListNome.getContentPane().setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Palavra word = new Palavra(txt_word.getText());
				nome.add(word);
			}
		});
		btnSalvar.setBounds(98, 149, 89, 23);
		frmListNome.getContentPane().add(btnSalvar);
		
		JLabel lblPalavra = new JLabel("Nome:");
		lblPalavra.setBounds(98, 63, 70, 14);
		frmListNome.getContentPane().add(lblPalavra);
		
		txt_word = new JTextField();
		txt_word.setBounds(141, 60, 191, 20);
		frmListNome.getContentPane().add(txt_word);
		txt_word.setColumns(10);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word = txt_word.getText();
				Integer result = 0;
				for (int i = 0; i < nome.size(); i++) {
					String compare = nome.get(i).toString();
					if (compare.equals(word)) {
						result += 1;
					}
					else {
						result += 0;
					}
				}
				if (result == 0) {
					JOptionPane.showMessageDialog(frmListNome, "Nome " + txt_word.getText() + " ainda não foi cadastrada! ");
				}
				else if (result == 1) {
					JOptionPane.showMessageDialog(frmListNome, "O nome '" + txt_word.getText() + "' já foi cadastrada " + result + " vez.");
				}
				else {
					JOptionPane.showMessageDialog(frmListNome, "O nome'" + txt_word.getText() + "' já foi cadastrada " + result + " vezes.");
				}
				System.out.println(nome);
			}
		});
		btnVerificar.setBounds(243, 149, 89, 23);
		frmListNome.getContentPane().add(btnVerificar);
	}


}
