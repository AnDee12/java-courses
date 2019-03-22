public class Calculator {

	private int result;
	private int first;

	public void add(int ... params){
		for (Integer param : params) {
			this.result += param;
		}
	}

	public void subs(int ... params){
		for (Integer param : params) {
			this.result = first - param;
			first = param;
		}
	}

	public void pow(int ... params){
		for (Integer param : params) {
			this.result = first * param;
			first = param;
		}
	}

	public void divis(int ... params){
		for (Integer param : params) {
			this.result = first / param;
			first = param;
		}
	}

	public int getResult() {

		return this.result;
	}

	public void cleanResult() {

		this.result = 0;
	}
}
