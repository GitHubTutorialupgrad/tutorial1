import java.util.*;

class Example{
	public int add(int a,int b) {
		return (a+b);
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		Example e = new Example();
		int sum = e.add(n1,n2);
		System.out.println(sum);
	}
}