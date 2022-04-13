package br.com.sorteadoraleatorio.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField textNumAle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.RED);
		contentPane.add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sorteador de N\u00FAmeros Aleat\u00F3rios");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblNewLabel_1.setBounds(97, 11, 455, 37);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sortear n\u00FAmero entre");
		lblNewLabel_2.setForeground(new Color(204, 204, 255));
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblNewLabel_2.setBounds(26, 118, 302, 49);
		layeredPane.add(lblNewLabel_2);
		
		txtN1 = new JTextField();
		txtN1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		txtN1.setBounds(319, 133, 108, 29);
		layeredPane.add(txtN1);
		txtN1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("e");
		lblNewLabel_3.setForeground(new Color(204, 204, 204));
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 25));
		lblNewLabel_3.setBounds(437, 129, 51, 27);
		layeredPane.add(lblNewLabel_3);
		
		txtN2 = new JTextField();
		txtN2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		txtN2.setBounds(461, 133, 108, 29);
		layeredPane.add(txtN2);
		txtN2.setColumns(10);
		
		JButton btnCalcular = new JButton("Sortear Agora");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int nMinimo = Integer.parseInt(txtN1.getText()),
						nMaximo = Integer.parseInt(txtN2.getText());				
		        double nAleatorio = Math.random();
		        
		      //METODO 
		        nMaximo++; // esse procedimento de autoincremento serve para que o número máximo que o usuário escolheu seja sorteado
		        int resultado = (int) (nMinimo + nAleatorio * (nMaximo - nMinimo));
		        textNumAle.setText(Integer.toString(resultado));				
				
				
				
			}
		});
		btnCalcular.setForeground(new Color(0, 0, 51));
		btnCalcular.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		btnCalcular.setBounds(241, 195, 163, 37);
		layeredPane.add(btnCalcular);
		
		JLabel lblNewLabel_4 = new JLabel("Resultado");
		lblNewLabel_4.setForeground(new Color(204, 204, 204));
		lblNewLabel_4.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lblNewLabel_4.setBounds(241, 275, 163, 37);
		layeredPane.add(lblNewLabel_4);
		
		textNumAle = new JTextField();
		textNumAle.setHorizontalAlignment(SwingConstants.CENTER);
		textNumAle.setForeground(new Color(0, 0, 0));
		textNumAle.setBackground(new Color(255, 255, 255));
		textNumAle.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		textNumAle.setBounds(241, 323, 163, 37);
		layeredPane.add(textNumAle);
		textNumAle.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Voucher da Sorte!");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(187, 61, 278, 46);
		layeredPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Java\\Pictures\\pngtree-dazzling-red-streamers-ad-background-backgroundwarmreddazzlingribbonbeautifulsimplelight-image_68870.jpg"));
		lblNewLabel.setBounds(10, 11, 669, 377);
		layeredPane.add(lblNewLabel);
	}
}
