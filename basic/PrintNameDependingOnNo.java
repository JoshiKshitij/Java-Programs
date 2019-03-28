package basic;

public class PrintNameDependingOnNo {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
				
			if(i%3==0 && i%7==0){
				System.out.println("Kshitij Joshi");
			}
			else {
				if(i%3==0) {
					System.out.println("Kshitij");
				}
				else if(i%7==0) {
					System.out.println("Joshi");
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
}
