package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import statementCode.Statement;

public class ResultStatementGenerator extends JFrame {

	private JPanel contentPane;
	private JTextField group1NameInput;
	private JTextField group1MeanInput;
	private JTextField group1SDInput;
	private JTextField group2NameInput;
	private JTextField group2MeanInput;
	private JTextField group2SDInput;
	private JTextField tValueInput;
	private JTextField dfValueInput;
	private JTextField pValueInput;
	private JTextField sigStatement;
	private JTextField nonSigStatement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultStatementGenerator frame = new ResultStatementGenerator();
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
	public ResultStatementGenerator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 798);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//group 1 name label
		JLabel group1NameLabel = new JLabel("Enter Group 1 Name");
		group1NameLabel.setBounds(137, 78, 115, 14);
		contentPane.add(group1NameLabel);
		
		//group 1 mean label
		JLabel group1MeanLabel = new JLabel("Enter Group 1 Mean");
		group1MeanLabel.setBounds(137, 165, 104, 14);
		contentPane.add(group1MeanLabel);
		
		//group 1 standard deviation label
		JLabel group1SDLabel = new JLabel("Enter Group 1 Standard Deviation");
		group1SDLabel.setBounds(101, 302, 205, 14);
		contentPane.add(group1SDLabel);
		
		//group 2 name label
		JLabel group2NameLabel = new JLabel("Enter Group 2 Name");
		group2NameLabel.setBounds(680, 78, 104, 14);
		contentPane.add(group2NameLabel);
		
		//group 2 mean label
		JLabel group2MeanLabel = new JLabel("Enter Group 2 Mean");
		group2MeanLabel.setBounds(680, 179, 115, 14);
		contentPane.add(group2MeanLabel);
		
		//group 2 standard deviation label
		JLabel group2STDLabel = new JLabel("Enter Group 2 Standard Deviation");
		group2STDLabel.setBounds(661, 302, 221, 14);
		contentPane.add(group2STDLabel);
		
		//p-value label
		JLabel pValueLabel = new JLabel("Enter p-value");
		pValueLabel.setBounds(444, 302, 93, 14);
		contentPane.add(pValueLabel);
		
		//t-value label
		JLabel tValueLabel = new JLabel("Enter t-value");
		tValueLabel.setBounds(452, 78, 85, 14);
		contentPane.add(tValueLabel);
		
		//d.f. label
		JLabel dfValueLabel = new JLabel("Enter d.f Value");
		dfValueLabel.setBounds(436, 165, 93, 14);
		contentPane.add(dfValueLabel);
		
		//title label
		JLabel title = new JLabel("Result Statement Generator");
		title.setFont(new Font("Times New Roman", Font.BOLD, 17));
		title.setBounds(372, 27, 237, 14);
		contentPane.add(title);
		
		//group 1 name
		group1NameInput = new JTextField();
		group1NameInput.setBounds(134, 113, 86, 20);
		contentPane.add(group1NameInput);
		group1NameInput.setColumns(10);
		
		//group 1 mean
		group1MeanInput = new JTextField();
		group1MeanInput.setBounds(137, 204, 86, 20);
		contentPane.add(group1MeanInput);
		group1MeanInput.setColumns(10);
		
		//group 1 standard deviation
		group1SDInput = new JTextField();
		group1SDInput.setBounds(137, 327, 86, 20);
		contentPane.add(group1SDInput);
		group1SDInput.setColumns(10);
		
		//group 2 name
		group2NameInput = new JTextField();
		group2NameInput.setBounds(690, 113, 86, 20);
		contentPane.add(group2NameInput);
		group2NameInput.setColumns(10);
		
		//group 2 mean
		group2MeanInput = new JTextField();
		group2MeanInput.setBounds(692, 218, 86, 20);
		contentPane.add(group2MeanInput);
		group2MeanInput.setColumns(10);
		
		//group 2 standard deviation
		group2SDInput = new JTextField();
		group2SDInput.setBounds(692, 340, 86, 20);
		contentPane.add(group2SDInput);
		group2SDInput.setColumns(10);
		
		//t-value
		tValueInput = new JTextField();
		tValueInput.setBounds(436, 113, 86, 20);
		contentPane.add(tValueInput);
		tValueInput.setColumns(10);
		
		//d.f. value
		dfValueInput = new JTextField();
		dfValueInput.setBounds(436, 204, 86, 20);
		contentPane.add(dfValueInput);
		dfValueInput.setColumns(10);
		
		//p-value
		pValueInput = new JTextField();
		pValueInput.setBounds(436, 327, 86, 20);
		contentPane.add(pValueInput);
		pValueInput.setColumns(10);
		
		JLabel resultStatement1Label = new JLabel("Significant Result Statement");
		resultStatement1Label.setBounds(426, 538, 294, 14);
		contentPane.add(resultStatement1Label);
		
		JLabel resultStatement2 = new JLabel("Not Significant Result Statement");
		resultStatement2.setBounds(402, 617, 361, 14);
		contentPane.add(resultStatement2);
		
		sigStatement = new JTextField();
		sigStatement.setBounds(154, 563, 675, 20);
		contentPane.add(sigStatement);
		sigStatement.setColumns(10);
		
		nonSigStatement = new JTextField();
		nonSigStatement.setBounds(154, 661, 675, 20);
		contentPane.add(nonSigStatement);
		nonSigStatement.setColumns(10);
		
		//Generate Button
		JButton generateButton = new JButton("Generate");
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String group1Name = group1NameInput.getText();
				String group2Name = group2NameInput.getText();
				String group1Mean = group1MeanInput.getText();
				String group2Mean = group2MeanInput.getText();
				String group1SD = group1SDInput.getText();
				String group2SD = group2SDInput.getText();
				String tValue = tValueInput.getText();
				String dfValue = dfValueInput.getText();
				String pValue = pValueInput.getText();
			
				Statement generator = new Statement();
				
				sigStatement.setText(generator.createSignificantStatement(group1Name, group2Name, group1Mean, group2Mean, group1SD, group2SD, tValue, dfValue, pValue));
				nonSigStatement.setText(generator.createNotSignificantStatment(group1Name, group2Name, group1Mean, group2Mean, group1SD, group2SD, tValue, dfValue, pValue));
				
			}
		});
		generateButton.setBounds(436, 371, 97, 41);
		contentPane.add(generateButton);
		
		
	}
}
