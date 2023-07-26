package SE_Assignment;

public class assignment_SE {
	
	String code;
	section object;
	
	public assignment_SE() {
		code="";
	}
	
	public String getpackages()
	{
		
		String code1 = "\\documentclass[a4paper]{article}\n\n\\usepackage[english]{babel}\n\\usepackage[utf8]{inputenc}\n\\usepackage{amsmath}\n\\usepackage{graphicx}\n\\usepackage[colorinlistoftodos]{todonotes}\n\\usepackage[obeyspaces]{url}\n%\\usepackage{hyperref}\n\n\\usepackage{setspace}\n\\usepackage{listings}\n\\usepackage{xcolor}\n";
		return code1;
	}
	
	public String definecolor() 
	{
		
		String code2 = "\\definecolor{codegreen}{rgb}{0,0.6,0}\n\\definecolor{codeblue}{rgb}{0,0,0.6}\n\\definecolor{codegray}{rgb}{0.5,0.5,0.5}\n\\definecolor{codepurple}{rgb}{0.58,0,0.82}\n\\definecolor{backcolour}{rgb}{0.95,0.95,0.92}\n";
		return code2;
	}
	
	public String lstset() 
	{
		String code3 = "\\lstset{language=Java,\n   backgroundcolor=\\color{backcolour},\n   backgroundcolor=\\color{backcolour},\n   commentstyle=\\color{codegreen},\n   keywordstyle=\\color{magenta},\n   numberstyle=\\tiny\\color{codegray},\n   stringstyle=\\color{codepurple},\n   basicstyle=\\ttfamily\\footnotesize,\n   breakatwhitespace=false,\n   breaklines=true,\n   captionpos=b,\n   keepspaces=true,\n   numbers=left,\n   numbersep=5pt,\n   showspaces=false,\n   showstringspaces=false,\n   showtabs=false,\n   tabsize=2\n}";
	    return code3;
	}
	
	public void author_date(String author, String date, boolean bold) 
	{
		author_date_latex obj = new author_date_latex(author,date,false);
		code = code + obj.toString();
	}
	
	public void title(String title, boolean bold )
	{
		title_latex obj = new title_latex(title, bold);
		code = code + obj.toString();
	}
	
	public section addSection(String sectionText, String para, boolean bold)
	{
		section obj = new section(sectionText, para);
		object = obj;
		code = code + obj.toString();
		
		return obj;
	}
	
	public void add_subsection(String text, section ob)
	{
		ob.add_subsection(text);
		code = code + object.subsection_list.get(ob.get_length()-1).subsection_code();
		//code = code + object.toString();
	}
	
	public void addItem(String itemText)
	{
		object.subsection_list.get(object.get_length()-1).additem(itemText);
		//code = code + object.subsection_list.get(object.get_length()-1).toString();
		//System.out.println(code);
	}
	
//	public void addItem_section(String itemText)
//	{
//		object.item.add(itemText);
//	}
	
//	public void getItemCode_section() {
//		//code = code + "\\begin{enumerate}\n";
//		code = code + object.item.toString();
//		code = code + "\\end{enumerate}\n";
//		
//	}
	
	public void getItemCode() {
		//code = code + "\\begin{enumerate}\n";
		code = code + object.subsection_list.get(object.get_length()-1).to_String();
		code = code + "\\end{enumerate}\n";
		
	}
	
	
	
	public String toString() {
        getItemCode();
        code = code + "\\end{document}";
		return code;
	}
	
	
	
	//public void title(String title, String author, String date) {
		
	//	code = code + "\\title{"+title+"}";
	//	code = code + "\\author{"+author+"}";
	//	code = code + "\\date{"+date+"}";
		
	//}
	
	//public void 
	
//	public static void main(String[] args) {
//		String res = getpackages()+ "\n" + definecolor() + "\n\n" + lstset();
//		System.out.println(res);
//	}
	
}
