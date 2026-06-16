import java.util.*;
public class Memo {
	static void pyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int  k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}}
	static void pascal(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1;j<i+1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void diamond(int n) {
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int  k=1;k<=2*i-1;k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i = n-1 ;i>=1;i--) {
			for(int j = n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				System.out.println("pattern generator tool");
				System.out.println("1.pyramid pattern");
				System.out.println("2.pascal pattern");
				System.out.println("3.diamond pattern");
				System.out.println("enter choice:");
				int choice = sc.nextInt();
				System.out.println("enter n value:");
				int n = sc.nextInt();
				switch(choice) {
					case 1 :
						pyramid(n);
						break;
					case 2:
					  pascal(n);
					  break;
					case 3:
                        diamond(n);
						break;
					default:
						System.out.println("None of these recognized");					
			}
		}
}
