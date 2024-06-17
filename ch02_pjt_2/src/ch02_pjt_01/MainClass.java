package ch02_pjt_01;

public class MainClass {

	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator();
		calculator.calculate(10, 5, new CalAdd()); // 객체 생성 및 주입
		calculator.calculate(10, 5, new CalSub()); // 객체 생성 및 주입
		calculator.calculate(10, 5, new CalMul()); // 객체 생성 및 주입
		calculator.calculate(10, 5, new CalDiv()); // 객체 생성 및 주입
	}

}
