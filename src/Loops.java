
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1
			int x = 0;
			while (x <= 100) {
				if (x % 2 == 0) {
					System.out.println(x + "is an even number");
				}
				x++;	
				
			}
//2			
			int y = 100;
			while (y >= 0) {
				System.out.println(y);
				y -= 3;
			}
//3		
			for (int z = 1; z <= 100; z += 2) {
				System.out.println(z);
			}
//4		
			for (int a = 0; a <= 100; a++) {
				if (a % 3 == 0 && a % 5 == 0) {
					System.out.println("Hello World");
				} else
				if (a % 3 == 0) {
					System.out.println("Hello");
				} else
				if (a % 5 == 0) {
					System.out.println("World");
				} else
				if (a % 3 != 0 && a % 5 != 0) {
					System.out.println(a);
				}
				
				
				
			}
				
	}

}
