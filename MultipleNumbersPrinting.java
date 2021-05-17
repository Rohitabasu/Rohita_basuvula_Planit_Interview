
public class MultipleNumbersPrinting {

	public void displayNumbers() {
		for (int i = 1; i <= 100; i++) {
			String multipleVal = mulipleWithNumber(i);
			if (multipleVal != null) {
				if (multipleVal.equals("Planit") || multipleVal.equals("Testing")
						|| multipleVal.equals("PlanitTesting")) {
					System.out.print(multipleVal + " ");
				}
			} else {
				System.out.print(i + " ");
			}
		}
	}

	public String mulipleWithNumber(int num) {
		String result = null;
		int num1 = num % 3;
		int num2 = num % 5;
		if(num1 == 0 && num2 != 0){
			result = "Planit";
		}else if (num2 == 0 && num1 != 0) {
			result = "Testing";
		}else if (num1 == 0 && num2 == 0) {
			result = "PlanitTesting";
		}

		return result;
	}

	public static void main(String[] args) {
		MultipleNumbersPrinting mnp = new MultipleNumbersPrinting();
		mnp.displayNumbers();
	}

}
