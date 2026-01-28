package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> dlm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setLocationRelativeTo(null); //Centrira prozor
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 64, 128));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Naslov");
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
		panelNorth.add(lblTitle);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(255, 245, 232));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{20, 0, 6, 0, 48, 0, 20, 0};
		gbl_panelCenter.rowHeights = new int[]{50, 0, 12, 0, 12, 0, 50, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblCrvena = new JLabel("Crvena");
		lblCrvena.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblCrvena = new GridBagConstraints();
		gbc_lblCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrvena.gridx = 1;
		gbc_lblCrvena.gridy = 1;
		panelCenter.add(lblCrvena, gbc_lblCrvena);
		
		JButton btnCrveno = new JButton("Crvena");
		btnCrveno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCrveno.setBackground(Color.red);
				btnCrveno.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCrveno.setBackground(Color.white);
				btnCrveno.setForeground(Color.red);
			}
		});
		btnCrveno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.red);
				dlm.add(0, dlm.size()+1 + ": " + btnCrveno.getText());
			}
		});
		btnCrveno.setForeground(new Color(255, 0, 0));
		btnCrveno.setBackground(new Color(255, 255, 255));
		btnCrveno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnCrveno = new GridBagConstraints();
		gbc_btnCrveno.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrveno.gridx = 3;
		gbc_btnCrveno.gridy = 1;
		panelCenter.add(btnCrveno, gbc_btnCrveno);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedIndex = 0;
				String selectedColor = "";
				
				try {
					selectedIndex = list.getSelectedIndex();
					selectedColor = dlm.get(selectedIndex).split(": ")[1];
				} catch (Exception e2) {
					return;
				}			
//				JOptionPane.showMessageDialog(null, dlm.get(selectedIndex));
				
				if(selectedColor.equals("Crvena")) {
					panelCenter.setBackground(Color.red);
				}else if(selectedColor.equals("Plava")) {
					panelCenter.setBackground(Color.blue);
				}else {
					panelCenter.setBackground(Color.yellow);
				}
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		dlm = new DefaultListModel<String>();
		list.setModel(dlm);
		scrollPane.setViewportView(list);
		
		JLabel lblPlava = new JLabel("Plava");
		lblPlava.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblPlava = new GridBagConstraints();
		gbc_lblPlava.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlava.gridx = 1;
		gbc_lblPlava.gridy = 3;
		panelCenter.add(lblPlava, gbc_lblPlava);
		
		JButton btnPlavo = new JButton("Plava");
		btnPlavo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlavo.setBackground(Color.blue);
				btnPlavo.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPlavo.setBackground(Color.white);
				btnPlavo.setForeground(Color.blue);
			}
		});
		btnPlavo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.blue);
				dlm.add(0, dlm.size()+1 + ": " + btnPlavo.getText());
			}
		});
		btnPlavo.setForeground(new Color(0, 0, 255));
		btnPlavo.setBackground(new Color(255, 255, 255));
		btnPlavo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPlavo = new GridBagConstraints();
		gbc_btnPlavo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlavo.gridx = 3;
		gbc_btnPlavo.gridy = 3;
		panelCenter.add(btnPlavo, gbc_btnPlavo);
		
		JLabel lblZuta = new JLabel("Zuta");
		lblZuta.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblZuta = new GridBagConstraints();
		gbc_lblZuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblZuta.gridx = 1;
		gbc_lblZuta.gridy = 5;
		panelCenter.add(lblZuta, gbc_lblZuta);
		
		JButton btnZuto = new JButton("Zuta");
		btnZuto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnZuto.setBackground(Color.yellow);
				btnZuto.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnZuto.setBackground(Color.white);
				btnZuto.setForeground(Color.yellow);
			}
		});
		btnZuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.yellow);
				dlm.add(0, dlm.size()+1 + ": " + btnZuto.getText());
			}
		});
		btnZuto.setForeground(new Color(255, 255, 0));
		btnZuto.setBackground(new Color(255, 255, 255));
		btnZuto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnZuto = new GridBagConstraints();
		gbc_btnZuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZuto.insets = new Insets(0, 0, 5, 5);
		gbc_btnZuto.gridx = 3;
		gbc_btnZuto.gridy = 5;
		panelCenter.add(btnZuto, gbc_btnZuto);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(0, 64, 128));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnAntistres = new JButton("Antristres dugme\r\n");
		btnAntistres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pritisnuli ste antistres dugme!");
			}
		});
		btnAntistres.setFont(new Font("Arial", Font.BOLD, 20));
		panelSouth.add(btnAntistres);
	}

}
