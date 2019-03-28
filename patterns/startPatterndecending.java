package patterns;

public class startPatterndecending {
	public static void main(String[] args) {
			int n = 6;	int x = 0;
			for (int i = 0; i < n ; i++) {
			
				for (int j = x; j < n; j++) {
					System.out.print("# ");
				}
				if(x < n) {
				System.out.println();
				System.out.println();
				System.out.println("# #");
				System.out.println();
				}
				x+=2;
			}
	}
}
