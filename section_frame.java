package SE_Assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class section_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_sectionname;
	private JTextField textField_para;
	private JButton btn_addsubsection;
	public static section a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					section_frame frame = new section_frame();
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
	public section_frame() {
		initcomponents();
		createevents();
	}
	
	public void initcomponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_sectionname = new JTextField();
		textField_sectionname.setBounds(181, 62, 219, 20);
		contentPane.add(textField_sectionname);
		textField_sectionname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Section");
		lblNewLabel.setBounds(78, 65, 93, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Section Paragraph");
		lblNewLabel_1.setBounds(67, 160, 118, 14);
		contentPane.add(lblNewLabel_1);
		
		btn_addsubsection = new JButton("Add Subsection");
		btn_addsubsection.setBounds(216, 265, 134, 23);
		contentPane.add(btn_addsubsection);
		
		textField_para = new JTextField();
		textField_para.setBounds(181, 157, 219, 20);
		contentPane.add(textField_para);
		textField_para.setColumns(10);
	}
	
	public void createevents() {
		
		
		
		btn_addsubsection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String section = textField_sectionname.getText();
				String paragraph = textField_para.getText();
				
				a = getData.obj.addSection(section, paragraph, false);
				
				
				 subsection_frame obj1 = new subsection_frame();
		    	 obj1.setVisible(true);
		    	 dispose();
		    	 
			}
		});
		
	}
}
