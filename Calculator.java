public class Calculator {

	private int result;

	public void add(int ... paramo){
		for (Integer param : paramo) {
			this.result += param;
		}
	}

	public int getResult() {
		return this.result;
	}

	public void cleanResult() {
		this.result = 0;
	}
}
