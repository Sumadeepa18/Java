
public class TowerofHanoi {
	public static  void Solution(int n,char S,char H,char D) {
		if(n==1) {
			System.out.println("move disk 1 from "+" "+S+" "+"to"+" "+D);
			return;
		}
		Solution(n-1,S,D,H);
		System.out.println("move disk"+" "+n+" "+"from"+" "+S+" "+"to"+" "+D);
		Solution(n-1,H,S,D);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		char S='A';
		char H='B';
		char D='C';
		Solution(n,S,H,D);

	}

}
