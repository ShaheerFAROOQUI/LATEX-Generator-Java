package SE_Assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class subsection_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_subsection;
	private JButton btn_addItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subsection_frame frame = new subsection_frame();
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
	public subsection_frame() {
		initcomponents();
		createevents();
	}
	
	public void initcomponents() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_subsection = new JTextField();
		textField_subsection.setBounds(213, 113, 113, 20);
		contentPane.add(textField_subsection);
		textField_subsection.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Subsection");
		lblNewLabel.setBounds(144, 116, 59, 14);
		contentPane.add(lblNewLabel);
		
		btn_addItem = new JButton("Add Item");
		btn_addItem.setBounds(188, 205, 166, 23);
		contentPane.add(btn_addItem);
	}
	
	public void createevents()
	{
		btn_addItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String subsection = textField_subsection.getText();
				
				
				getData.obj.add_subsection(subsection, section_frame.a);
				//System.out.println(getData.obj.toString());
			
				additem ob = new additem();
				ob.setVisible(true);
		    	dispose();
				
			}
		});
	}

}
