package homework;

public class patternmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 2*, value = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(value + "\t");
				value++;
			}
			value = 1;

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			value = i;

			for (int j = 1; j <= i; j++) {
               
				System.out.print(value + "\t");
				value--;
			}
			value = 1;

			System.out.println();
			space = space - 2;
		}

	}

}
