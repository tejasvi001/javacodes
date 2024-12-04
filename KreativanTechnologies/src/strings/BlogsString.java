package strings;

public class BlogsString {

	public BlogsString() {
		// TODO Auto-generated constructor stub
		String title;
		String article;
		int day,month,year;
		String date;
		String author;
		title = "Fundamentals of java";
		article ="";
		//date=join(day, "/", month, "/",year);
		date=String.join("/","day","month", "year");
		System.out.println(date);
		
		
		
		
	}
	public static void main(String args[]) {
		BlogsString obj=new BlogsString();
	}
}
