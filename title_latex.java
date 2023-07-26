package SE_Assignment;

public class title_latex {
	
	String title;
	boolean bold;
	
	public title_latex(String latex_title, boolean boldtext) {
		title = latex_title;
		bold = boldtext;
	}
	
	//public void addtitle(String title1) {
		//title = title1;
	//}
	
	public String toString() {
		
		String res = "";
		
		if(bold==false)
		res = "\\title{"+title+"}\n";
		
		else
			res = "\\title{\textbf{"+title+"}}\n";
		
		
		
		return res;
	}

}
