
public class LogicalOperators {
	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		int a=10, b=20, c=30;
		System.out.println("Logical AND");

		System.out.println((a<b)&&(a<c));
		System.out.println((a<b)&&(a>c));
		System.out.println((a==b)&&(a==c));
		System.out.println((a==b)&&(a<c));
		System.out.println("Logical OR");
		System.out.println((a<b)||(a<c));
		System.out.println((a<b)||(a>c));
		System.out.println((a==b)||(a==c));
		System.out.println((a==b)||(a<c));
		System.out.println("Logical NOT");
		System.out.println((a<b)!=(a<c));
		System.out.println((a<b)!=(a>c));
		System.out.println((a==b)!=(a==c));
		System.out.println((a==b)!=(a<c));
	}
}
