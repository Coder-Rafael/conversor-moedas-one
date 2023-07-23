import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaConversoes extends JFrame {

	private JPanel contentPane;
	private JTextField campoReal;
	private JTextField campoMoeda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConversoes frame = new TelaConversoes();
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
	public TelaConversoes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1195, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Real para...");
		lblNewLabel.setBounds(413, 21, 356, 82);
		lblNewLabel.setFont(new Font("Cocogoose Pro", Font.BOLD, 48));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(52, 183, 500, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Real Brasileiro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(26, 31, 164, 26);
		panel.add(lblNewLabel_1);
		
		campoReal = new JTextField();
		campoReal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		campoReal.setText("Ex:10");
		campoReal.setBounds(26, 88, 446, 149);
		panel.add(campoReal);
		campoReal.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(604, 183, 526, 269);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dólar", "Dólar Canadense", "Euro", "Libra", "Peso Argentino"}));
		comboBox.setBounds(25, 31, 476, 31);
		panel_1.add(comboBox);
		
		campoMoeda = new JTextField();
		campoMoeda.setText("55.50");
		campoMoeda.setFont(new Font("Tahoma", Font.PLAIN, 30));
		campoMoeda.setBounds(25, 88, 476, 145);
		panel_1.add(campoMoeda);
		campoMoeda.setColumns(10);
		
		JButton btnConverte = new JButton("Converter");
		btnConverte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result;
				Double quantiaReal = Double.parseDouble(campoReal.getText());
				Double quantiaMoeda = Double.parseDouble(campoMoeda.getText());
				String valorSelecionado = (String) comboBox.getSelectedItem();
				
				ConversorMoedas conversor = new ConversorMoedas();
				
				result = Double.toString(conversor.converteQuantia(quantiaReal, quantiaMoeda,valorSelecionado));
				
				campoMoeda.setText(result);
			}
		});
		btnConverte.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConverte.setBounds(513, 113, 125, 44);
		contentPane.add(btnConverte);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				campoReal.setText("0");
				campoMoeda.setText("0");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLimpar.setBounds(526, 498, 107, 32);
		contentPane.add(btnLimpar);
	}
}
