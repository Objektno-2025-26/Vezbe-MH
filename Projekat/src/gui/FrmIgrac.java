package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultListModel<String> dlm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
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
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(255, 255, 0));
		contentPane.add(panelNorth, BorderLayout.NORTH);

		JLabel lblTitle = new JLabel("Forma za unos igraca");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNorth.add(lblTitle);

		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(255, 217, 227));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[] { 0, 12, 30, 12, 60, 0, 0 };
		gbl_panelCenter.rowHeights = new int[] { 0, 12, 0, 12, 0, 40, 0, 40, 0, 70, 0, 0, 0 };
		gbl_panelCenter.columnWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 2.0, 0.0, Double.MIN_VALUE };
		gbl_panelCenter.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		panelCenter.setLayout(gbl_panelCenter);

		JButton btnMbape = new JButton("Mbape");
		JLabel lblMbape = new JLabel("Kilijan Mbape");
		btnMbape.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblMbape.getText());
			}
		});
		btnMbape.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnMbape = new GridBagConstraints();
		gbc_btnMbape.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnMbape.insets = new Insets(0, 0, 5, 5);
		gbc_btnMbape.gridx = 0;
		gbc_btnMbape.gridy = 0;
		panelCenter.add(btnMbape, gbc_btnMbape);

		lblMbape.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblMbape = new GridBagConstraints();
		gbc_lblMbape.insets = new Insets(0, 0, 5, 5);
		gbc_lblMbape.gridx = 2;
		gbc_lblMbape.gridy = 0;
		panelCenter.add(lblMbape, gbc_lblMbape);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 4;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);

		JList<String> list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		dlm = new DefaultListModel<String>();
		list.setModel(dlm);
		list.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(list);

		JButton btnHaland = new JButton("Haland");
		JLabel lblHaland = new JLabel("Erling Haland");
		btnHaland.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblHaland.getText());
			}
		});
		btnHaland.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnHaland = new GridBagConstraints();
		gbc_btnHaland.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHaland.insets = new Insets(0, 0, 5, 5);
		gbc_btnHaland.gridx = 0;
		gbc_btnHaland.gridy = 2;
		panelCenter.add(btnHaland, gbc_btnHaland);

		lblHaland.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblHaland = new GridBagConstraints();
		gbc_lblHaland.insets = new Insets(0, 0, 5, 5);
		gbc_lblHaland.gridx = 2;
		gbc_lblHaland.gridy = 2;
		panelCenter.add(lblHaland, gbc_lblHaland);

		JButton btnSalah = new JButton("Salah");
		JLabel lblSalah = new JLabel("Mohamed Salah");
		btnSalah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblSalah.getText());
			}
		});
		btnSalah.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnSalah = new GridBagConstraints();
		gbc_btnSalah.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalah.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalah.gridx = 0;
		gbc_btnSalah.gridy = 4;
		panelCenter.add(btnSalah, gbc_btnSalah);

		lblSalah.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblSalah = new GridBagConstraints();
		gbc_lblSalah.insets = new Insets(0, 0, 5, 5);
		gbc_lblSalah.gridx = 2;
		gbc_lblSalah.gridy = 4;
		panelCenter.add(lblSalah, gbc_lblSalah);

		JCheckBox chckbxUnosIgraca = new JCheckBox("Unos igraca");
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char input = e.getKeyChar();
				if (!((input >= 65 && input <= 90) || (input >= 97 && input <= 122) || input == KeyEvent.VK_ENTER
						|| input == KeyEvent.VK_SPACE)) {
//					System.out.println(input);
					e.consume();
				} else if (input == KeyEvent.VK_ENTER) {
					dlm.add(0, textField.getText());
					textField.setText("");
				}

			}
		});
		textField.setEnabled(false);
		chckbxUnosIgraca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(chckbxUnosIgraca.isSelected());
			}
		});
		chckbxUnosIgraca.setBackground(new Color(255, 217, 227));
		chckbxUnosIgraca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxUnosIgraca = new GridBagConstraints();
		gbc_chckbxUnosIgraca.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxUnosIgraca.gridx = 0;
		gbc_chckbxUnosIgraca.gridy = 6;
		panelCenter.add(chckbxUnosIgraca, gbc_chckbxUnosIgraca);

		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblIgraci = new JLabel("Igraci");
		lblIgraci.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIgraci = new GridBagConstraints();
		gbc_lblIgraci.insets = new Insets(0, 0, 5, 5);
		gbc_lblIgraci.gridx = 0;
		gbc_lblIgraci.gridy = 8;
		panelCenter.add(lblIgraci, gbc_lblIgraci);

		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Lamin Jamal", "Robert Levandovski", "Dusan Vlahovic" }));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 8;
		panelCenter.add(comboBox, gbc_comboBox);

		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(255, 217, 227));
		contentPane.add(panelSouth, BorderLayout.SOUTH);

		JButton btnDijalog = new JButton("Dijalog Igrac");
		btnDijalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgIgrac dlg = new DlgIgrac();
				dlg.setVisible(true);
				if (dlg.isOkay()) {
					dlm.add(0, dlg.getTextFieldIme().getText() + " " + dlg.getTextFieldPrezime().getText());
				}
			}
		});
		btnDijalog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnDijalog);

		JButton btnModifikacija = new JButton("Modifikacija");
		btnModifikacija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.isSelectionEmpty())
					return;
				String input = list.getSelectedValue();
				int index = list.getSelectedIndex();
				DlgIgrac dlg = new DlgIgrac();
				dlg.setTextFieldIme(input.split(" ")[0]);
				try {
					dlg.setTextFieldPrezime(input.split(" ")[1]);
				} catch (ArrayIndexOutOfBoundsException exc) {
					dlg.setTextFieldPrezime("");
				}
				
				
				dlg.setVisible(true);
				if (dlg.isOkay()) {
					dlm.set(index, dlg.getTextFieldIme().getText() 
							+ " " + dlg.getTextFieldPrezime().getText());
				}

			}
		});
		btnModifikacija.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnModifikacija);
	}

}
