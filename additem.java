package SE_Assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class additem extends JFrame {

	private JPanel contentPane;
	private JTextField textField_item;
	private JButton btn_addanother;
	private JButton btn_latexcode;
	private JButton btn_addsubsection;
	private JButton btn_addSection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					additem frame = new additem();
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
	public additem() {
		initcomponents();
		createevents();
	}
	
	public void initcomponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_item = new JTextField();
		textField_item.setBounds(231, 82, 171, 20);
		contentPane.add(textField_item);
		textField_item.setColumns(10);
		
		JLabel label_item = new JLabel("Item Text");
		label_item.setBounds(162, 85, 59, 14);
		contentPane.add(label_item);
		
		btn_addanother = new JButton("Add Item");
		btn_addanother.setBounds(147, 222, 119, 23);
		contentPane.add(btn_addanother);
		
		btn_latexcode = new JButton("Generate latex Code");
		btn_latexcode.setBounds(309, 222, 133, 23);
		contentPane.add(btn_latexcode);
		
		btn_addsubsection = new JButton("Add Subsection");
		btn_addsubsection.setBounds(238, 264, 107, 23);
		contentPane.add(btn_addsubsection);
		
		btn_addSection = new JButton("Add Section");
		btn_addSection.setBounds(61, 264, 107, 23);
		contentPane.add(btn_addSection);
	}
	
	public void createevents() {
		
		btn_addanother.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String item = textField_item.getText();
				
				getData.obj.addItem(item);
				//System.out.println(getData.obj.toString());
				
				textField_item.setText("");
				
				JOptionPane.showMessageDialog(null, "ITEM ADDED! CLICK ON GENERATE LATEX or ADD ANOTHER ITEM");
			}
		});
		
		btn_addsubsection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				getData.obj.getItemCode();
				
				subsection_frame ab = new subsection_frame();
				ab.setVisible(true);
				dispose();
				
			}
		});
		
		btn_latexcode.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "CODE GENERATED! PLEASE CHECK THE CONSOLE");
				
                String latex = getData.obj.getpackages()+getData.obj.definecolor()+getData.obj.lstset();
                latex = latex + getData.obj.toString();
				System.out.println(latex);
				
			}
		});
		
		btn_addSection.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				section_frame ab = new section_frame();
				ab.setVisible(true);
				dispose();
				
			}
		});
		
	}

}
