package br.com.fiapview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JHomem extends JFrame {

	private JPanel contentPane;
	private JTextField txtNossosSeguros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JHomem frame = new JHomem();
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
	public JHomem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1438, 788);
		contentPane = new JPanel();
		contentPane.setToolTipText("✔ Básica(Morte)");
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seguro de Vida Individual (Homem)");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.ITALIC, 25));
		lblNewLabel.setBounds(505, 38, 475, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Contratar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setBounds(874, 604, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JHomem.this.dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1.setBounds(1176, 666, 131, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("R$ 12,00");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel_3.setBounds(852, 139, 172, 59);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ou Parcial Por Acidente");
		lblNewLabel_3_1.setBounds(817, 323, 130, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel(" ✔ Morte Acidental");
		lblNewLabel_3_2.setBounds(807, 283, 93, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel(" ✔ Funeral Familiar");
		lblNewLabel_3_3.setBounds(810, 375, 115, 23);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel(" ✔ Invalidez Permanente total");
		lblNewLabel_3_4.setBounds(807, 310, 257, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("/mês\r\n");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(910, 183, 53, 23);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel(" ✔ Doenças Graves");
		lblNewLabel_2_2.setBounds(807, 348, 140, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Este seguro esta por: \r\n");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(807, 87, 301, 46);
		contentPane.add(lblNewLabel_2_3);
		
		txtNossosSeguros = new JTextField();
		txtNossosSeguros.setForeground(Color.WHITE);
		txtNossosSeguros.setText("              Nossos seguros\r\n");
		txtNossosSeguros.setBackground(new Color(47, 79, 79));
		txtNossosSeguros.setBounds(853, 227, 171, 20);
		contentPane.add(txtNossosSeguros);
		txtNossosSeguros.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(JHomem.class.getResource("/br/com/fiapview/images.jpg")));
		lblNewLabel_4.setBounds(787, 92, 288, 142);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("✔ Básico(Morte)");
		lblNewLabel_5.setBounds(807, 258, 93, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JHomem.class.getResource("/br/com/fiapview/download.jpg")));
		lblNewLabel_2.setBounds(817, 232, 264, 413);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("\r\n");
		lblNewLabel_1.setBounds(180, 187, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(238, 184, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(JHomem.class.getResource("/br/com/fiapview/RogeRgUSTAVO.jpg")));
		lblNewLabel_8.setBounds(270, 87, 467, 578);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(JHomem.class.getResource("/br/com/fiapview/download.jpg")));
		lblNewLabel_7.setBounds(797, 234, 287, 411);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(JHomem.class.getResource("/br/com/fiapview/cor verde.jpg")));
		lblNewLabel_9.setBounds(797, 87, 288, 147);
		contentPane.add(lblNewLabel_9);
	}
}