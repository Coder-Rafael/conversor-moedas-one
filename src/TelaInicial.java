import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1195, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Cocogoose Pro", Font.PLAIN, 40));
		lblNewLabel.setBounds(447, 166, 256, 77);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("O que você deseja converter?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(402, 275, 462, 51);
		contentPane.add(lblNewLabel_1);
		
		JButton btnMoeda = new JButton("Moedas");
		btnMoeda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaConversoes telaConversor = new TelaConversoes();
				telaConversor.setVisible(true);
			}
		});
		btnMoeda.setForeground(new Color(0, 0, 51));
		btnMoeda.setBackground(new Color(204, 255, 255));
		btnMoeda.setFont(new Font("Cocogoose Pro", Font.PLAIN, 20));
		btnMoeda.setBounds(465, 369, 210, 45);
		contentPane.add(btnMoeda);
	}
}
