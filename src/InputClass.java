import java.util.Scanner;

public class InputClass {
	private Scanner in = null ;

	// 시작 -> 생성자
	InputClass() {
		in = new Scanner(System.in);
	}
	//입력 메서드
	public int inputTypeCommand(int inputType) {
		// 권종 입력

		do {
			try {
				System.out.print("권종을 선택하세요\n1. 주간권\n2. 야간권\n99. 종료__");
				inputType = in.nextInt();
				if (inputType != 1 && inputType != 2 && inputType != 99) { 
					//입력한 숫자가 1, 2, 99가 모두 아니면 잘못 입력하셨습니다를 출력한다. 
					System.out.println("잘못 입력하셨습니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
			}
			in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);
		return inputType;
	}
	public int inputIDCommand(int inputID) {
		// 주민번호 입력

		String inputID_str;
		boolean isDigit = true;
		do {
			do {
				System.out.print("주민번호 앞자리를 입력하세요\n__");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6); //inputID_str(주민번호 앞자리)가 6자리가 아니면 재입력.
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false); //isDigit이 false라면 반복한다.
		
		return inputID;
	}
	public int inputCountCommand(int inputCount) {
		// 갯수 입력

		do {
			try {
				System.out.print("몇 개를 주문하시겠습니까?\n__");
				inputCount = in.nextInt(); //주문할 갯수 입력.
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount < 1 || inputCount > 9); //주문 갯수가 1보다 작거나 혹은 9보다 크다면 재입력.
		return inputCount;
	}
	public int inputAdvantageCommand(int inputAdvantage) {
		// 우대사항 입력

		do {
			try {
				System.out.print("우대사항을 입력하세요.\n1. 없음(나이는 자동처리)\n2. 장애인\n3. 국가유공자\n4. 다자녀\n5. 임산부\n__");
				inputAdvantage = in.nextInt();
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage < 1 || inputAdvantage > 5); //우대사항 입력 숫자가 1보다 작거나 5보다 크다면 재입력.
		return inputAdvantage;
	}

	//종료 -> 소멸자
	protected void finalize() throws Throwable{
		in.close();
	}

}
