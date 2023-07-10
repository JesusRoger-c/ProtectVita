package br.com.fiapview;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;

public class JLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLogin frame = new JLogin();
				frame.setLocationRelativeTo(null);//Faz com que a janela de login abra no centro da tela.
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
	public JLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1377, 776);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel plane = new JPanel();
		plane.setBounds(239, 270, 1228, 594);
		plane.setBackground(new Color(47, 79, 79));
		contentPane.add(plane);
		plane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(317, 22, 46, 23);
		lblNewLabel.setForeground(Color.WHITE);
		plane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(317, 43, 281, 20);
		plane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(317, 80, 60, 26);
		lblNewLabel_1.setForeground(Color.WHITE);
		plane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 104, 281, 20);
		plane.add(passwordField);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(386, 326, 155, 23);
		plane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Fazer Login\r\n");
		lblNewLabel_2.setBounds(572, 117, 731, 63);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.ITALIC, 46));
		lblNewLabel_2.setForeground(Color.WHITE);
	}
}
