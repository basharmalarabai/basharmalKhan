package YoutubePract;

public class Day5 {

	
	public static void main(String[] args) {

		String x = "My name is khan";

		System.out.println(x.charAt(x.length() - 1));

		String fullAdd = "yummmm... my oh my chicken pot pie. now with 20% more chikn";
		System.out.println(fullAdd);

		String name = "basharmal";
		boolean welcome = name.equals("basharmal") ? true : false;
		if (name.equals("basharmal")) {
			welcome = true;
			
		}else {
			welcome = false;
		}
		
		System.out.println(welcome);
	}
}