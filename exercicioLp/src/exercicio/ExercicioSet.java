package exercicio;

import java.awt.EventQueue;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Autor: Vitor Assen

public class ExercicioSet {

	private JFrame frame;
	private Set<PalavraEn> palavra = new HashSet<PalavraEn>();
	private JTextField jTextFieldPalavra;
	private JTextField jTextFieldTraducao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioSet window = new ExercicioSet();
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
	public ExercicioSet() {
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
		
		jTextFieldPalavra = new JTextField();
		jTextFieldPalavra.setBounds(207, 60, 145, 20);
		frame.getContentPane().add(jTextFieldPalavra);
		jTextFieldPalavra.setColumns(10);
		
		jTextFieldTraducao = new JTextField();
		jTextFieldTraducao.setBounds(207, 117, 145, 20);
		frame.getContentPane().add(jTextFieldTraducao);
		jTextFieldTraducao.setColumns(10);
		
		JLabel lblPalavra = new JLabel("Palavra:");
		lblPalavra.setBounds(108, 63, 56, 14);
		frame.getContentPane().add(lblPalavra);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PalavraEn word = new PalavraEn(jTextFieldPalavra.getText(), jTextFieldTraducao.getText());
				if (palavra.contains(word)) {
					JOptionPane.showMessageDialog(frame, "Palavra já cadastrada!");
				}
				else {
				palavra.add(word);
				}
				System.out.println(palavra);
				jTextFieldPalavra.setText("");
				jTextFieldTraducao.setText("");
			}
		});
		btnSave.setBounds(108, 170, 89, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnTraduzir = new JButton("Traduzir");
		btnTraduzir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String word = jTextFieldPalavra.getText();
				Integer result = 0;
				for(Iterator<PalavraEn> itr = palavra.iterator(); itr.hasNext();) {
					PalavraEn compare = itr.next();
					if (compare.getWord().contains(word)) {
						JOptionPane.showMessageDialog(frame, "Palavra: " + word + "\nTradução: " + compare.getTrad().toString());
						result += 1;
						break;
					}
				}
				if (result == 0) {
					JOptionPane.showMessageDialog(frame, "Palavra não cadastrada");
				}
			}
		});
		btnTraduzir.setBounds(263, 170, 89, 23);
		frame.getContentPane().add(btnTraduzir);
		
		JLabel lblTraduo = new JLabel("Tradu\u00E7\u00E3o:");
		lblTraduo.setBounds(108, 120, 73, 14);
		frame.getContentPane().add(lblTraduo);
	}
}