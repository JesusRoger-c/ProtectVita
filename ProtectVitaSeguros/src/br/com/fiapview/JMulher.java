package br.com.fiapview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JMulher extends JFrame {

	private JPanel contentPane;
	private JTextField txtNossosSeguros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMulher frame = new JMulher();
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
	public JMulher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1438, 788);
		contentPane = new JPanel();
		contentPane.setToolTipText("✔ Básica(Morte)");
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro de Vida Individual (Mulher)");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.ITALIC, 25));
		lblNewLabel.setBounds(559, 48, 475, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Contratar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnNewButton, "Contrato Concluído", "aviso",
						JOptionPane.INFORMATION_MESSAGE);
			}
			});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(908, 608, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMulher.this.dispose();
}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1.setBounds(1213, 671, 131, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(JMulher.class.getResource("/br/com/fiapview/Mulher.png")));
		lblNewLabel_1.setBounds(-61, 97, 873, 594);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("R$ 12,00");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_3.setBounds(882, 121, 172, 78);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ou Parcial Por Acidente");
		lblNewLabel_3_1.setBounds(852, 329, 130, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel(" ✔ Morte Acidental");
		lblNewLabel_3_2.setBounds(842, 289, 93, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel(" ✔ Funeral Familiar");
		lblNewLabel_3_3.setBounds(845, 381, 115, 23);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel(" ✔ Invalidez Permanente total");
		lblNewLabel_3_4.setBounds(842, 316, 257, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("/mês\r\n");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(938, 186, 53, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(" ✔ Doenças Graves");
		lblNewLabel_2_2.setBounds(842, 354, 140, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Este seguro esta por: \r\n");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(846, 93, 301, 46);
		contentPane.add(lblNewLabel_2_3);
		
		txtNossosSeguros = new JTextField();
		txtNossosSeguros.setForeground(Color.WHITE);
		txtNossosSeguros.setText("              Nossos seguros\r\n");
		txtNossosSeguros.setBackground(new Color(47, 79, 79));
		txtNossosSeguros.setBounds(868, 228, 171, 20);
		contentPane.add(txtNossosSeguros);
		txtNossosSeguros.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(JMulher.class.getResource("/br/com/fiapview/images.jpg")));
		lblNewLabel_4.setBounds(822, 98, 288, 142);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("✔ Básico(Morte)");
		lblNewLabel_5.setBounds(842, 264, 93, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JMulher.class.getResource("/br/com/fiapview/download.jpg")));
		lblNewLabel_2.setBounds(822, 238, 294, 413);
		contentPane.add(lblNewLabel_2);
	}
}
