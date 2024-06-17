package ch02_pjt_01;

public class CalAssembler { // 필드 선언 (클래스의 객체를 저장)
	MyCalculator calculator;
	CalAdd calAdd;
	CalSub calSub;
	CalMul calMul;
	CalDiv caldiv;
	
	public CalAssembler() { // 생성자 내부에서 각 클래스의 객체를 생성
		calculator = new MyCalculator();
		calAdd = new CalAdd();
		calSub = new CalSub();
		calMul = new CalMul();
		calDiv = new CalDiv(); // assemble() 메서드를 호출하여 계산을 수행
		
		assemble();
	}
	public void assemble() { // calculate 메서드를 호출
		calculator.calculate(10, 5, calAdd);
		calculator.calculate(10, 5, calSub);
		calculator.calculate(10, 5, calMul);
		calculator.calculate(10, 5, calDiv);
	}
}
