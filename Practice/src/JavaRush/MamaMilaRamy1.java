package JavaRush;
public class MamaMilaRamy1 {

	public static String a, b, c;

	public static void mamaMila(String s) {

		a = "Mama";
		b = "Ramy";
		c = "Mila";
		;
		System.out.println(a+b+c);

	}

	public static void Mama2(String s) {
		a = "Mama";
		b = "Ramy";
		c = "Mila";

		System.out.println(a+c+b);
	}

	public static void Mama3(String s) {
		a = "Mama";
		b = "Ramy";
		c = "Mila";
		System.out.println(b + c + a);
	}
public static void Mama4(String s) {
	a="Mama";
	  b="Ramy";
	  c="Mila";
	  System.out.println(b+a+c);
}
public static void Mama5(String s) {
	a="Mama";
	  b="Ramy";
	  c="Mila";
	  System.out.println(c+a+b);
}
public static void Mama6(String s) {
	a="Mama";
	  b="Ramy";
	  c="Mila";
	  System.out.println(c+b+a);
}
	public static void main(String[] args) {

		mamaMila(a);
		Mama2(a);
		Mama3(a);
		Mama4(a);
		Mama5(a);
		Mama6(a);
	}
}
