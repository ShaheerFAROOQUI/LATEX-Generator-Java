package SE_Assignment;

import java.util.ArrayList;
import java.util.List;

public class subsection {
	
	String subsection;
	List<String> item = new ArrayList<String>();
	int countitem = 0;
	
	public subsection(String sub) {
		subsection = sub;
	}
	
	public void additem (String text) {
		countitem++;
		item.add(text);
	}
	
	public String subsection_code() {
		String a = "";
		a = "\\subsection{"+subsection+"}\n";
		
		return a;
	}
	
	public String to_String() {
		String res="";
		//res = res + "\\subsection{"+subsection+"}\n";
		if(countitem>0) {
			res = res + "\\begin{enumerate}\n";
		    for (int i=0;i<countitem;i++) {
			  res = res + "\\item "+item.get(i)+"\n";
		    }
		}
		
		return res;
	}
	
}
