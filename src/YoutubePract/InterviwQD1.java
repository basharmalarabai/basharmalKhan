package YoutubePract;

public class InterviwQD1 {

	public static void main(String[] args) {
		
	String b = "Afghanistan";
    StringBuffer R = new StringBuffer(b);
    System.out.println(R.reverse());
	
	
	int len = b.length();
	
	String rev = "";
	for (int i = len -1; i >= 0; i--) {
		 rev = rev + b.charAt(i);
		
	}
    
    
    System.out.println(rev);
	
	String b3 = "######Basharmal%%%%@@@";
	
	b3 = b3.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(b3);
	
	
	
	
int num = 12345;
int rev1 = 0;
while(num != 0) {
	num = num * 10 + num % 10;
	num = num / 10;
}
	
	System.out.println("this num:: " + rev1);
	}

}
