package SE_Assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class getData extends JFrame {

	private JPanel contentPane;
	private JTextField textField_title;
	private JTextField textField_author;
	private JTextField textField_date;
	private JButton btn_addsection;
	public static assignment_SE obj = new assignment_SE();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					getData frame = new getData();
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
	public getData() {
		initcomponents();
		createevents();
	}
	public void initcomponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_title = new JTextField();
		textField_title.setBounds(148, 81, 255, 23);
		contentPane.add(textField_title);
		textField_title.setColumns(10);
		
		textField_author = new JTextField();
		textField_author.setBounds(148, 128, 255, 23);
		contentPane.add(textField_author);
		textField_author.setColumns(10);
		
		textField_date = new JTextField();
		textField_date.setBounds(148, 170, 255, 20);
		contentPane.add(textField_date);
		textField_date.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Add Title");
		lblNewLabel.setBounds(55, 85, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Author");
		lblNewLabel_1.setBounds(55, 129, 70, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Add Date");
		lblNewLabel_2.setBounds(55, 173, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		btn_addsection = new JButton("Add Section");
		btn_addsection.setBounds(207, 232, 115, 23);
		contentPane.add(btn_addsection);
		
		JLabel lblNewLabel_3 = new JLabel("LATEX CODE GENERATOR");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(148, 24, 255, 23);
		contentPane.add(lblNewLabel_3);
	}
	
	public void createevents() {
		
		btn_addsection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = textField_title.getText();
				String author = textField_author.getText();
				String date = textField_date.getText();
				
				//obj = new assignment_SE();
				//assignment_SE obj = new assignment_SE();
				obj.title(title, false);
				obj.author_date(author, date, false);
				
				section_frame obj1 = new section_frame();
		    	 obj1.setVisible(true);
		    	 dispose();
			}
		});
		
	}
}
