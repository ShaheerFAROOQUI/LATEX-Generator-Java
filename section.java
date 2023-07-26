package SE_Assignment;

import java.util.ArrayList;
import java.util.List;

public class section {
	
	String section_text;
	String paragraph;
	int countitem = 0;
	ArrayList<subsection> subsection_list = new ArrayList<subsection>();
	//List<String> item = new ArrayList<String>();
	public static int count = 0;
	
	public section(String section, String para) {
		
		section_text = section;
		paragraph = para;
			
	}
	
//	public void additem (String text) {
//		countitem++;
//		item.add(text);
//	}
	
	public void add_subsection(String text) {
		count++;
		subsection e = new subsection(text);
		subsection_list.add(e);
	}
	
	public int get_length() {
		return count;
	}
	
	
	
	public String toString() {
		String res="";
		
		res = res + "\\section{"+section_text+"}\n";
		res = res + paragraph + "\n";
		
//		for (int i=0;i<countitem;i++) {
//			  res = res + "\\item "+item.get(i)+"\n";
//		    }
		
		return res;
	}

}
