package lecture5;

public class PDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(5);

	}

	public static void PDI(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 == 0) {
			PDI(num - 1);
			System.out.println(num);
		} else {

			System.out.println(num);
			PDI(num - 1);
		}
	}

}
