import java.util.Scanner;

public class PrintClass {
	private Scanner in = null;
	int count;
	int totalPrice;
	String korInputType;;
	String korInputAdvantage ;
	String korAgeType ;

	// ���� -> ������
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
			korInputType = "�ְ���";
			break;
		case 2:
			korInputType = "�߰���";
			break;
		}
		switch (inputAdvantage) {

		case 2:
			korInputAdvantage = "����� �������";
			break;
		case 3:
			korInputAdvantage = "���������� �������";
			break;
		case 4:
			korInputAdvantage = "���ڳ� �������";
			break;
		case 5:
			korInputAdvantage = "�ӻ�� �������";
			break;
		}
		switch (ageType) {
		case 0:
			korAgeType = "����";
			break;
		case 1:
			korAgeType = "û�ҳ�";
			break;
		case 2:
			korAgeType = "����,���";
			break;
		}


	}


	// return count;


	protected void finalize() throws Throwable {
		in.close();
	}

}
