package reccurssion;

public class Count8 {
	public int count8(int n) {
		if (n == 0)
			return 0;
		else {
			if ((n % 10) == 8) {
				if ((n % 100) == 88) {
					return 2+count8(n/10);
				}
				else {
					return 1+count8(n/10);
				}
			}
			else
				return 0+count8(n/10);

		}
	}

	public static void main(String[] args) {
		System.out.println((new Count8()).count8(8818));
	}
}
