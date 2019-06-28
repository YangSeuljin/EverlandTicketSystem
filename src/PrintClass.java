import java.util.Scanner;

public class PrintClass {
	private Scanner in = null;
	int count;
	int totalPrice;
	String korInputType;;
	String korInputAdvantage ;
	String korAgeType ;

	// 시작 -> 생성자
	public PrintClass() {
		in = new Scanner(System.in);
		count = 0;

		korInputType = null;
		korInputAdvantage = "";
		korAgeType = null;
	}

	public void printTicket(int finalPrice, int inputType, int ageType, int inputAdvantage, int inputCount) {
		
		
		switch (inputType) {
		case 1:
			korInputType = "주간권";
			break;
		case 2:
			korInputType = "야간권";
			break;
		}
		switch (inputAdvantage) {

		case 2:
			korInputAdvantage = "장애인 우대적용";
			break;
		case 3:
			korInputAdvantage = "국가유공자 우대적용";
			break;
		case 4:
			korInputAdvantage = "다자녀 우대적용";
			break;
		case 5:
			korInputAdvantage = "임산부 우대적용";
			break;
		}
		switch (ageType) {
		case 0:
			korAgeType = "대인";
			break;
		case 1:
			korAgeType = "청소년";
			break;
		case 2:
			korAgeType = "소인,경로";
			break;
		}


	}


	// return count;


	protected void finalize() throws Throwable {
		in.close();
	}

}
