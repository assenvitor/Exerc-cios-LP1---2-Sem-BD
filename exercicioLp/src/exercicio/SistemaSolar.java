package exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class SistemaSolar extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textDistanciaSol;
	private JLabel lblNewLabel_3;
	private JTextField textTemperatura;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaSolar frame = new SistemaSolar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SistemaSolar() {
		
		setTitle("Planetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distância do Sol:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 140, 172, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(106, 43, 228, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(40, 44, 56, 14);
		contentPane.add(lblNewLabel_1);
		
		textDistanciaSol = new JTextField();
		textDistanciaSol.setBounds(153, 134, 125, 20);
		contentPane.add(textDistanciaSol);
		textDistanciaSol.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Temperatura:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 165, 178, 19);
		contentPane.add(lblNewLabel_3);
		
		textTemperatura = new JTextField();
		textTemperatura.setBounds(153, 166, 74, 20);
		contentPane.add(textTemperatura);
		textTemperatura.setColumns(10);
		
		
		//Limpar
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(40, 214, 125, 36);
		contentPane.add(btnLimpar);
		
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				}
		});
		
		//Procurar
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(165, 74, 97, 27);
		contentPane.add(btnProcurar);
		
		
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurar();
			}
		});
		
		//Fechar
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(335, 214, 89, 36);
		contentPane.add(btnFechar);
				
	
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
		JLabel lblNewLabel_2 = new JLabel("INSIRA O NOME DO PLANETA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(87, 11, 247, 14);
		contentPane.add(lblNewLabel_2);
			}
		});
	}
	
	// Métodos
	
	public void limpar() {
		textNome.setText("");
		textDistanciaSol.setText("");
		textTemperatura.setText("");
	}
	
	// Array

	public void procurar() {
		
		Planetas[] planetas = new Planetas[8];
		
		planetas[0] = new Planetas("Mercurio", "57.910.000 Km", "550°C");
		planetas[1] = new Planetas("Vênus", "108.200.000 Km", "460°C");
		planetas[2] = new Planetas("Terra", "149.600.000 Km", "14°C");
		planetas[3] = new Planetas("Marte", "227.940.000 Km","-10°C");
		planetas[4] = new Planetas("Júpiter", "778.330.000 Km","-100°C");
		planetas[5] = new Planetas("Saturno", "1.429.400.000 Km","-140°C");
		planetas[6] = new Planetas("Urano", "2.880.990.000 Km","-200°C");
		planetas[7] = new Planetas("Netuno", "4.504.300.000 Km","-218°C");
		
		// Informações
		
		for (int i = 0; i < 9; i++) {
			if (textNome.getText().equals(planetas[i].getNome())) {
				textDistanciaSol.setText(planetas[i].getDistanciaSol());
				textTemperatura.setText(planetas[i].getTemperatura());
				break;
			}
		}
	}
}