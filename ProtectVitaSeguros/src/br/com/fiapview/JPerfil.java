package br.com.fiapview;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

//import br.com.fiap.repository.UsuarioDAO;
import javax.swing.SwingConstants;

public class JPerfil extends JFrame {

	private JPanel contentPane;
	private JPasswordField NomeCompleto;
	private JPasswordField CPF;
	private JLabel lblNewLabel_1_2;
	private JPasswordField Data;
	private JLabel lblNewLabel_1_3;
	private JPasswordField EMAIL;
	private JLabel lblNewLabel_1_4;
	private JPasswordField GENERO;
	private JLabel lblNewLabel_1_5;
	private JPasswordField SENHA;
	private JButton AlterarDados;
	private JButton DeletarDados;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	//private UsuarioDAO dao = new UsuarioDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPerfil frame = new JPerfil();
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
	public JPerfil()  throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1377, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NomeCompleto = new JPasswordField();
		NomeCompleto.setBounds(374, 160, 378, 23);
		contentPane.add(NomeCompleto);
		
		JLabel lblNewLabel_1 = new JLabel("Nome completo:");
		lblNewLabel_1.setBounds(375, 127, 226, 23);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblNewLabel = new JLabel("Dados do Cliente");
		lblNewLabel.setBounds(558, 39, 406, 55);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.ITALIC, 46));
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1.setBounds(375, 209, 226, 23);
		contentPane.add(lblNewLabel_1_1);
		
		CPF = new JPasswordField();
		CPF.setBounds(374, 243, 378, 23);
		contentPane.add(CPF);
		
		lblNewLabel_1_2 = new JLabel("Data de nascimento:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2.setBounds(374, 291, 226, 23);
		contentPane.add(lblNewLabel_1_2);
		
		Data = new JPasswordField();
		Data.setBounds(374, 325, 378, 23);
		contentPane.add(Data);
		
		lblNewLabel_1_3 = new JLabel("E-mail:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3.setBounds(375, 372, 226, 23);
		contentPane.add(lblNewLabel_1_3);
		
		EMAIL = new JPasswordField();
		EMAIL.setBounds(375, 406, 378, 23);
		contentPane.add(EMAIL);
		
		lblNewLabel_1_4 = new JLabel("Gênero:");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_4.setBounds(375, 457, 226, 23);
		contentPane.add(lblNewLabel_1_4);
		
		GENERO = new JPasswordField();
		GENERO.setBounds(374, 491, 378, 23);
		contentPane.add(GENERO);
		
		lblNewLabel_1_5 = new JLabel("Senha:");
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_5.setBounds(374, 538, 226, 23);
		contentPane.add(lblNewLabel_1_5);
		
		SENHA = new JPasswordField();
		SENHA.setBounds(374, 568, 378, 23);
		contentPane.add(SENHA);
		
		AlterarDados = new JButton("    Alterar dado(s)\r\n");
		AlterarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				alterar();
			}
		});
		AlterarDados.setHorizontalAlignment(SwingConstants.LEFT);
		AlterarDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		AlterarDados.setBackground(new Color(32, 178, 170));
		AlterarDados.setBounds(869, 425, 150, 32);
		contentPane.add(AlterarDados);
		
		DeletarDados = new JButton("Excluir Conta");
		DeletarDados.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//						deletar();

			}
		});
		DeletarDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		DeletarDados.setBackground(new Color(32, 178, 170));
		DeletarDados.setBounds(869, 516, 150, 31);
		contentPane.add(DeletarDados);
		
		lblNewLabel_3 = new JLabel("\r\n");
		lblNewLabel_3.setIcon(new ImageIcon(JPerfil.class.getResource("/br/com/fiapview/User.png")));
		lblNewLabel_3.setBounds(815, 147, 226, 267);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Salvar Mudanças\r\n");
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(889, 462, 114, 23);
		contentPane.add(btnNewButton);
		
	}
	
//	private void deletar() {
//			this.dao.delete(id);
//			JOptionPane.showMessageDialog(this, "Conta excluída com sucesso!");
//		
//			
//}
//	
//	private void alterar() {
//			this.dao.update(usuario);
//			JOptionPane.showMessageDialog(this, "Item alterado com sucesso!");
//	}
  }
