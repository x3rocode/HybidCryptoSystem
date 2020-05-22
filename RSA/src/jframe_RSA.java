import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;

public class jframe_RSA extends JFrame {

	private JPanel contentPane;

	String plain, cipher1, decrypt;
	int p, q, n, l, e, d,  x, sessionkey, decsessionkey, cipher2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe_RSA frame = new jframe_RSA();
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
	public jframe_RSA() {
		setTitle("RSA-201810841 \uC9C4\uD61C\uB9B0");

		this.setBounds(100, 100, 585, 471);
		getContentPane().setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("P : ");
		lblNewLabel_2.setBounds(28, 175, 57, 15);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Q :");
		lblNewLabel_3.setBounds(286, 172, 57, 21);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(137, 173, 117, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(402, 173, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("\uACF5\uAC1C\uD0A4 \uC0DD\uC131");
		btnNewButton.setBounds(28, 123, 97, 28);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uC554\uD638\uD654");
		btnNewButton_1.setBounds(157, 123, 97, 28);
		getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uBCF5\uD638\uD654");
		btnNewButton_2.setBounds(286, 123, 97, 28);
		getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("N(P * Q) :");
		lblNewLabel.setBounds(28, 217, 97, 15);
		getContentPane().add(lblNewLabel);

		textField_2 = new JTextField();
		textField_2.setBounds(137, 214, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("L(lcm(P-1, Q-1)) :");
		lblNewLabel_1.setBounds(286, 217, 130, 15);
		getContentPane().add(lblNewLabel_1);

		textField_3 = new JTextField();
		textField_3.setBounds(402, 214, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(138, 258, 116, 21);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("E(gcd(E, L) = 1) :");
		lblNewLabel_4.setBounds(29, 261, 122, 15);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("D(E * D % L = 1) :");
		lblNewLabel_5.setBounds(286, 261, 108, 15);
		getContentPane().add(lblNewLabel_5);

		textField_5 = new JTextField();
		textField_5.setBounds(402, 258, 116, 21);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\uACF5\uAC1C\uD0A4 : ");
		lblNewLabel_6.setBounds(28, 337, 57, 15);
		getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("\uAC1C\uC778\uD0A4 : ");
		lblNewLabel_7.setBounds(28, 378, 57, 15);
		getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("E");
		lblNewLabel_8.setBounds(112, 337, 29, 15);
		getContentPane().add(lblNewLabel_8);

		textField_6 = new JTextField();
		textField_6.setBounds(138, 334, 116, 21);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("N");
		lblNewLabel_9.setBounds(286, 337, 29, 15);
		getContentPane().add(lblNewLabel_9);

		textField_7 = new JTextField();
		textField_7.setBounds(317, 334, 116, 21);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("D");
		lblNewLabel_10.setBounds(112, 378, 29, 15);
		getContentPane().add(lblNewLabel_10);

		textField_8 = new JTextField();
		textField_8.setBounds(137, 375, 116, 21);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("N");
		lblNewLabel_11.setBounds(286, 378, 29, 15);
		getContentPane().add(lblNewLabel_11);

		textField_9 = new JTextField();
		textField_9.setBounds(317, 375, 116, 21);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("\uD3C9\uBB38 : ");
		lblNewLabel_12.setBounds(28, 33, 57, 15);
		getContentPane().add(lblNewLabel_12);

		textField_10 = new JTextField();
		textField_10.setBounds(97, 30, 297, 21);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);

		JButton btnNewButton_3 = new JButton("\uBD88\uB7EC\uC624\uAE30");

		btnNewButton_3.setBounds(421, 29, 97, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_16 = new JLabel("\uC138\uC158 \uD0A4 : ");
		lblNewLabel_16.setBounds(28, 78, 57, 15);
		getContentPane().add(lblNewLabel_16);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(97, 75, 297, 21);
		getContentPane().add(textField_14);
		
		JButton btnNewButton_3_1 = new JButton("\uC0DD\uC131");


		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent a) {

				do {
					List<Integer> li = new ArrayList<Integer>();
					li = RandPrime.getRandPrime();

					p = li.get(0);
					q = li.get(1);
					n = p * q;
					l = LcmGcd.getLcm(p - 1, q - 1);
					e = LcmGcd.getE(l);
					d = LcmGcd.getD(e, l);

				} while (Rsa.EncDec(12, e, n) == 12);

				textField.setText(Integer.toString(p));
				textField_1.setText(Integer.toString(q));
				textField_2.setText(Integer.toString(n));
				textField_3.setText(Integer.toString(l));
				textField_4.setText(Integer.toString(e));
				textField_5.setText(Integer.toString(d));
				textField_6.setText(Integer.toString(e));
				textField_7.setText(Integer.toString(n));
				textField_8.setText(Integer.toString(d));
				textField_9.setText(Integer.toString(n));

			}
		});

		btnNewButton_1.addActionListener(new ActionListener() { // 아모와

			public void actionPerformed(ActionEvent a) {

				if (textField_10.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "암호문을 불러오세요", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					//대칭(암호문)
					plain = textField_10.getText();
					cipher1 = Symmetric.Enc(plain, sessionkey);
					
					//비대칭(세션키)
					cipher2 = Rsa.EncDec(sessionkey, e, n);
					
					//저장
					JFileChooser chooser = new JFileChooser();

					chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
					chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					chooser.showSaveDialog(null);

					String path = chooser.getSelectedFile().getAbsolutePath();

					try {
						PrintWriter ku = new PrintWriter(new File(path, "암호화.txt"));

						ku.write("암호화 된 세션키 : " + cipher2 + "\r\n");
						ku.write("암호화 된 평문 : " + cipher1 + "\r\n");
						ku.write("결합(완성 암호문) : " + cipher2 + cipher1 + "\r\n");

						ku.close();
					} catch (FileNotFoundException ex) {
						Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
					}
				}

			}
		});

		btnNewButton_2.addActionListener(new ActionListener() { // 보코화

			public void actionPerformed(ActionEvent a) {
				
				//세션키 보코와
				decsessionkey = Rsa.EncDec(cipher2, d, n);
				
				//대칭키 평문 복호화
				decrypt =  Symmetric.Dec(cipher1, decsessionkey);
				
				//저장
				JFileChooser chooser = new JFileChooser();

				chooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				chooser.showSaveDialog(null);

				String path = chooser.getSelectedFile().getAbsolutePath();

				try {
					PrintWriter ku = new PrintWriter(new File(path, "복호화.txt"));

					ku.write("복호화 된 암호문 : " + decrypt + "\r\n");

					ku.close();
				} catch (FileNotFoundException ex) {
					Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() { // 불러옥이
			public void actionPerformed(ActionEvent e) {

				JFrame window = new JFrame();
				JFileChooser fileChooser = new JFileChooser();

				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "//" + "Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("txt 파일", "txt");
				fileChooser.addChoosableFileFilter(filter);

				int result = fileChooser.showOpenDialog(window);

				if (result == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();

					System.out.println(selectedFile);

					try {
						BufferedReader in;
						in = new BufferedReader(new FileReader(selectedFile));
						String line = in.readLine();
						while (line != null) {
							textField_10.setText(line);
							line = in.readLine();
						
						in.close();
						}
					} catch (FileNotFoundException ex) {
						Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
					} catch (IOException ex) {
						Logger.getLogger(jframe_RSA.class.getName()).log(Level.SEVERE, null, ex);
					}

				}

			}
		});
		
		btnNewButton_3_1.addActionListener(new ActionListener() {  //세션키 생성
			public void actionPerformed(ActionEvent e) {
				sessionkey = MakeSessionKey.numberGen();
				textField_14.setText(Integer.toString(sessionkey));
				
			}
		});
		btnNewButton_3_1.setBounds(421, 74, 97, 23);
		getContentPane().add(btnNewButton_3_1);

	}
}
