import java.util.Scanner;

public class CalcAgeClass {
	private Scanner in = null ;
	int age; //age는 나이를 의미한다.

	
	// 시작 -> 생성자
	CalcAgeClass() {
		in = new Scanner(System.in);
	}
	public int calcAge(int inputID) {
		inputID = inputID / 10000;
		if (inputID <= 19) { //2000년 이후에 태어난 사람들의 나이를 계산. 
			age = 2019 - (inputID + 2000) + 1;
		} else { //주민등록번호 앞자리인 inputID를 10000으로 나눈 후, 1900을 더하고 2019에서 빼주고, 1을 더하면 나이가 나온다.
			age = 2019 - (inputID + 1900) + 1;
		}
		return age;
	}
	protected void finalize() throws Throwable{
		in.close();
	}
}