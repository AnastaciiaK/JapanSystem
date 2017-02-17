package servlet;

public class taskGeneration {
	int MinNumber = 1;
	int MaxNumber = 15;

	protected String[] task() {
		String mathSign = "";
		String[] task = new String[2];
		Integer answer = 0;
		int a = generationNumber(MaxNumber, MinNumber);
		int b = generationNumber(MaxNumber, MinNumber);

		switch (generationNumber(4, 1)) {
		case 1:
			mathSign = "+";
			answer = a + b;
			break;
		case 2:
			mathSign = "-";
			answer = a - b;
			break;
		case 3:
			mathSign = "*";
			answer = a * b;
			break;
		case 4:
			mathSign = ":";
			answer = a / b;
			break;
		default:
		}
		task[0] = Integer.toString(a) + mathSign + Integer.toString(b)+"=";
		task[1] = Integer.toString(answer);
		return task;
	}

	protected int generationNumber(int MaxNumber, int MinNumber) {
		int generationNumber = MinNumber + (int) (Math.random() * ((MaxNumber - MinNumber) + 1));
		return generationNumber;
	}

}
