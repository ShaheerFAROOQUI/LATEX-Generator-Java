package SE_Assignment;

public class author_date_latex {
	
	String author;
	String date;
	boolean bold;
	
	public author_date_latex(String author_name, String Date, boolean b) {
		author = author_name;
		date = Date;
		bold = b;
	}
	
	public String toString() {
		String res="";
		
		if(bold==false) {
			res = "\\author{"+author+"}\n";
			res = res + "\\date{"+date+"}\n\n";
		}
		else {
			res = "\\author{\textbf{"+author+"}}\n";
			res = res + "\\date{"+date+"}\n";
		}
		
		return res;
	}

}
