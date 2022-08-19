package hoho;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class thuvien extends JFrame {
	ArrayList<book> sach=new ArrayList<book>();
	int id=1;
	

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thuvien frame = new thuvien();
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
	public thuvien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 616);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 906, 559);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("thong tin sach", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ma sach");
		lblNewLabel.setBounds(564, 62, 70, 37);
		lblNewLabel.setBackground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		panel.add(lblNewLabel);
		
		JLabel lblTenSach = new JLabel("Ten sach");
		lblTenSach.setBounds(564, 109, 70, 37);
		lblTenSach.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTenSach.setBackground(new Color(30, 144, 255));
		panel.add(lblTenSach);
		
		JLabel lblChuyenNganh = new JLabel("Chuyen nganh");
		lblChuyenNganh.setBounds(564, 156, 84, 37);
		lblChuyenNganh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChuyenNganh.setBackground(new Color(30, 144, 255));
		panel.add(lblChuyenNganh);
		
		JLabel lblTacGia = new JLabel("Tac gia");
		lblTacGia.setBounds(564, 203, 70, 37);
		lblTacGia.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTacGia.setBackground(new Color(30, 144, 255));
		panel.add(lblTacGia);
		
		JLabel lblNamXuatBan = new JLabel("Nam xuat ban");
		lblNamXuatBan.setBounds(564, 250, 84, 37);
		lblNamXuatBan.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNamXuatBan.setBackground(new Color(30, 144, 255));
		panel.add(lblNamXuatBan);
		
		JLabel lblChuyenNganh_1 = new JLabel("So luong");
		lblChuyenNganh_1.setBounds(564, 297, 70, 37);
		lblChuyenNganh_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblChuyenNganh_1.setBackground(new Color(30, 144, 255));
		panel.add(lblChuyenNganh_1);
		
		textField = new JTextField();
		textField.setText("10000");
		textField.setEditable(false);
		textField.setBounds(673, 62, 176, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(673, 118, 176, 28);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(673, 212, 176, 28);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(673, 259, 176, 28);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(673, 306, 176, 28);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("Them");
		btnNewButton.setBounds(42, 384, 92, 37);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(100, 149, 237));
		panel.add(btnNewButton);
		
		JButton btnSua = new JButton("Sua");
		btnSua.setBounds(167, 384, 92, 37);
		btnSua.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSua.setBackground(new Color(100, 149, 237));
		panel.add(btnSua);
		
		JButton btnCapNhat = new JButton("Cap nhat");
		btnCapNhat.setBounds(283, 384, 92, 37);
		btnCapNhat.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCapNhat.setBackground(new Color(100, 149, 237));
		panel.add(btnCapNhat);
		
		JButton btnBoQua = new JButton("Bo qua");
		btnBoQua.setBounds(400, 384, 92, 37);
		btnBoQua.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnBoQua.setBackground(new Color(100, 149, 237));
		panel.add(btnBoQua);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.setBounds(108, 431, 92, 37);
		btnXoa.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnXoa.setBackground(new Color(100, 149, 237));
		panel.add(btnXoa);
		
		JButton btnDocFile = new JButton("Doc file");
		btnDocFile.setBounds(232, 431, 92, 37);
		btnDocFile.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDocFile.setBackground(new Color(100, 149, 237));
		panel.add(btnDocFile);
		
		JButton btnGhiFile = new JButton("Ghi file");
		btnGhiFile.setBounds(347, 431, 92, 37);
		btnGhiFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGhiFile.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnGhiFile.setBackground(new Color(100, 149, 237));
		panel.add(btnGhiFile);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 10, 389, 316);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setBackground(new Color(255, 240, 245));
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ma sach", "Ten sach", "Chuyen nganh", "Tac gia", "Nam xuat ban", "So luong"
			}
		));
		
		JComboBox CBoxoption = new JComboBox();
		CBoxoption.setFont(new Font("Times New Roman", Font.BOLD, 12));
		CBoxoption.setModel(new DefaultComboBoxModel(new String[] {"Khoa hoc tu nhien", "Van hoc - nghe thuat", "Dien tu vien thong", "Cong nghe thong tin"}));
		CBoxoption.setBounds(673, 164, 176, 29);
		panel.add(CBoxoption);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("thong tin nguoi doc", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("quan li muon sach", null, panel_2, null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					book thu=new book();
					thu.setMasach(thu.getMasach()+id);
					textField.setText(String.valueOf(thu.getMasach()));
					thu.setTensach(textField_1.getText());
					thu.setTacgia(textField_3.getText());
					thu.setNamxuatban(Integer.parseInt(textField_4.getText()));
					thu.setSoluong(Integer.parseInt(textField_5.getText()));
					thu.setChuyennganh((String) CBoxoption.getSelectedItem());
					DefaultTableModel model= (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							thu.getMasach(),thu.getTensach(),thu.getChuyennganh()
							,thu.getTacgia(),thu.getNamxuatban(),thu.getSoluong()
					});
					id++;
					sach.add(thu);
				}
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel d1= (DefaultTableModel) table.getModel();
				int selectindex= table.getSelectedRow();
				textField.setText(d1.getValueAt(selectindex, 0).toString());
				textField_1.setText(d1.getValueAt(selectindex, 1).toString());
				CBoxoption.setSelectedItem(d1.getValueAt(selectindex, 2));
				textField_3.setText(d1.getValueAt(selectindex, 3).toString());
				textField_4.setText(d1.getValueAt(selectindex, 4).toString());
				textField_5.setText(d1.getValueAt(selectindex, 5).toString());
				btnNewButton.setEnabled(false);;
			}
		});
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
				
			}
		});
	}
}
