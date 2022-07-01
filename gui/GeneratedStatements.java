package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeneratedStatements extends JFrame {

	private JPanel contentPane;
	private JTextField sigResultStatement;
	private JTextField nonSigResultStatement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneratedStatements frame = new GeneratedStatements();
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
	public GeneratedStatements() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sigResultLabel = new JLabel("Significant Result Statement: ");
		sigResultLabel.setBounds(46, 64, 169, 14);
		contentPane.add(sigResultLabel);
		
		JLabel nonSigLabel = new JLabel("Not Significant Statement:");
		nonSigLabel.setBounds(46, 222, 145, 14);
		contentPane.add(nonSigLabel);
		
		sigResultStatement = new JTextField();
		sigResultStatement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sigResultStatement.setBounds(218, 61, 86, 20);
		contentPane.add(sigResultStatement);
		sigResultStatement.setColumns(10);
		
		nonSigResultStatement = new JTextField();
		nonSigResultStatement.setBounds(207, 219, 86, 20);
		contentPane.add(nonSigResultStatement);
		nonSigResultStatement.setColumns(10);
	}

}
