import java.util.*;
import java.util.random.*;
public class Thamboalagame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		System.out.println("enter number of players");
		int players=sc.nextInt();
		if(players<2&&players>5) {
			System.out.println("invalid number of players");
		}
		;
int [][]ticket=new int[players][9];
for(int i=0;i<players;i++) {
	System.out.println("player"+(i+1)+" ");
	for(int j=0;j<9;j++) {
		ticket[i][j]=random.nextInt(101);
		System.out.println(ticket[i][j]);
	}
}
System.out.println("enter user values");
int ele[]=new int[9];
for(int i=0;i<=8;i++) {
	 ele[i]=sc.nextInt();
}
int count[]=new int[players];
for(int i=0;i<players;i++) {
	for(int j=0;j<9;j++) {
		for(int s=0;s<9;s++) {
		if(ticket[i][j]==ele[s]) {
		count[i]++;	
			
		}
	}
}
	System.out.println("player"+" "+(i+1)+" "+"matchs is"+count[i]);}

int winner=0;
for(int k=1;k<players;k++) {
	if(count[k]>count[winner]) {
	winner=k;	
	}
}
System.out.println("the winner is"+winner);



	}


}