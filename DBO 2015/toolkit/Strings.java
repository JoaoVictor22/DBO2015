package toolkit;

public class Strings {

	public static int pot (int n) {
		int x = 1;
		for (int i = 0; i < n; i++) {
			x *= 10;
		}
		return x;
	}

	public static boolean startsWith (String x, String i) {
		char[] a = x.toCharArray();
		char[] y = i.toCharArray();
		for (int j = 0; j < y.length; j++) {
			if (a[j] != y[j]) return false;
		}
		return true;
	} 

	public static String cutZero (String x) {
		char[] r = x.toCharArray();
		if (r[0] == '0') {
			char[] r2 = {r[1]};
			return new String(r2);
		}
		return x;
	}

	public static boolean teste (char a) {
	
		switch (a) {
			case '1' : return true;	
			case '2' : return true;
			case '3' : return true;
			case '4' : return true;
			case '5' : return true;
			case '6' : return true;
			case '7' : return true;
			case '8' : return true;
			case '9' : return true;
			case ' ' : return false;
			default : return false;
		}
	}
	
	public static int toInt (String x) {
		
		
		char[] a = x.toCharArray();
		int n = a.length - 1, soma = 0;
		for (int i = 0; i < a.length; i++) {
			soma = (a[i] - 48) * pot(n) + soma;
			n--;
		}
		return soma;
	}

	public static int expoente (int n) {
		int i = 10, j = 1;
		if (n > 1000000000) return 10;
		while (i <= n) {
			i *= 10;
			j++;
		}
		return j;
	} 

	
	public static int realizapotencia (int base, int expoente) {
		int res = 1;
		for (int i = 0; expoente > i; i++) {
			res = res * base;
		}
		return res;
	}

	public static int[] converter (int num, int exp) {
		int[] n = new int[exp + 1];
		int res;
		for (int i = 0; exp >= 0; exp--, i++) {
			res = realizapotencia(10, exp);
			n[i] = num / res;
			num = num % res;
		}
		return n;
	}

	public static char intchar (int a) {
		switch (a) {
			case 0 : return 48;
			case 1 : return 49;
			case 2 : return 50;
			case 3 : return 51;
			case 4 : return 52;
			case 5 : return 53;
			case 6 : return 54;
			case 7 : return 55;
			case 8 : return 56;
			case 9 : return 57;
			default : return 0;
		}
	}

	public static String fromInt (int x) {
		int[] n1 = new int[expoente(x)];
		char[] a = new char[n1.length];
		n1 = converter (x, (expoente(x)-1));
		for (int i = 0; i < n1.length; i++) {
			a[i] =  intchar(n1[i]);
		}
		String b = new String(a);
		return b;
	}
}