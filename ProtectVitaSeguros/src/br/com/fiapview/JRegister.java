
package br.com.fiapview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JRegister {

	private JFrame frame;
	private JTextField textSenha;
	private JTextField textEmail;
	private JTextField textData;
	private JTextField textCPF;
	private JTextField textNome;
	private JTextField textSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRegister window = new JRegister();
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
	public JRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 11));
		frame.setBounds(100, 100, 1387, 793);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Cadastre-se");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(408, 161, 149, 47);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("Nome Completo:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(321, 219, 222, 33);
		frame.getContentPane().add(lblNewLabel_1);
		JPanel panel = new JPanel();
		panel.setBounds(48, 115, 85, 0);
		frame.getContentPane().add(panel);
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(321, 263, 46, 36);
		frame.getContentPane().add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("Data de Nascimento:\r\nhdydydh\r\n\r\n\r\n\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(321, 310, 249, 32);
		frame.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(321, 353, 189, 40);
		frame.getContentPane().add(lblNewLabel_4);
		JList list = new JList();
		list.setBounds(373, 135, -62, -65);
		frame.getContentPane().add(list);
		JLabel lblNewLabel_5 = new JLabel("Crie uma senha:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(321, 404, 162, 22);
		frame.getContentPane().add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("Gênero:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(857, 167, 189, 26);
		frame.getContentPane().add(lblNewLabel_6);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Homem");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(new Color(47, 79, 79));
		rdbtnNewRadioButton.setBounds(806, 210, 110, 20);
		frame.getContentPane().add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mulher");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBackground(new Color(47, 79, 79));
		rdbtnNewRadioButton_1.setBounds(934, 212, 130, 18);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		JLabel lblNewLabel_7 = new JLabel("      Bem-Vindo");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Bookman Old Style", Font.ITALIC, 46));
		lblNewLabel_7.setBounds(503, 38, 464, 42);
		frame.getContentPane().add(lblNewLabel_7);
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JLogin login = new JLogin();
				login.setVisible(true);
//				if(textField_4Senha.getText()!=null && 
//						!textField_4Senha.getText().isEmpty())
//						 {
//					JOptionPane.showMessageDialog(btnNewButton, "Informações válidas");
//				} else {
//					JOptionPane.showMessageDialog(btnNewButton, "Verifique as informações", "aviso", JOptionPane.WARNING_MESSAGE);
//					
//				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 139));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(499, 623, 122, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 limpar();
		}
 });

		btnLimpar.setForeground(new Color(0, 0, 139));
		btnLimpar.setBackground(new Color(32, 178, 170));
		btnLimpar.setBounds(806, 623, 122, 23);
		frame.getContentPane().add(btnLimpar);
		
		textSenha = new JTextField();
		textSenha.setBounds(321, 427, 366, 18);
		frame.getContentPane().add(textSenha);
		textSenha.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(321, 384, 366, 18);
		frame.getContentPane().add(textEmail);
		
		textData = new JTextField();
		textData.setColumns(10);
		textData.setBounds(321, 339, 366, 18);
		frame.getContentPane().add(textData);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(321, 292, 366, 18);
		frame.getContentPane().add(textCPF);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(321, 247, 366, 18);
		frame.getContentPane().add(textNome);
		
		JLabel lblNewLabel_4_1 = new JLabel("Salario:");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_4_1.setBounds(321, 456, 189, 22);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(321, 478, 366, 18);
		frame.getContentPane().add(textSalario);
	}
	
	private void limpar() {
        this.textNome.setText("");
        this.textEmail.setText("");
        this.textSenha.setText("");
        this.textData.setText("");
        this.textSalario.setText("");
        this.textCPF.setText("");
}
	
}