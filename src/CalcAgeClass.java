import java.util.Scanner;

public class CalcAgeClass {
	private Scanner in = null ;
	int age; //age�� ���̸� �ǹ��Ѵ�.

	
	// ���� -> ������
	CalcAgeClass() {
		in = new Scanner(System.in);
	}
	public int calcAge(int inputID) {
		inputID = inputID / 10000;
		if (inputID <= 19) { //2000�� ���Ŀ� �¾ ������� ���̸� ���. 
			age = 2019 - (inputID + 2000) + 1;
		} else { //�ֹε�Ϲ�ȣ ���ڸ��� inputID�� 10000���� ���� ��, 1900�� ���ϰ� 2019���� ���ְ�, 1�� ���ϸ� ���̰� ���´�.
			age = 2019 - (inputID + 1900) + 1;
		}
		return age;
	}
	protected void finalize() throws Throwable{
		in.close();
	}
}