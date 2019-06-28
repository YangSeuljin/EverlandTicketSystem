import java.util.Scanner;

public class InputClass {
	private Scanner in = null ;

	// ���� -> ������
	InputClass() {
		in = new Scanner(System.in);
	}
	//�Է� �޼���
	public int inputTypeCommand(int inputType) {
		// ���� �Է�

		do {
			try {
				System.out.print("������ �����ϼ���\n1. �ְ���\n2. �߰���\n99. ����__");
				inputType = in.nextInt();
				if (inputType != 1 && inputType != 2 && inputType != 99) { 
					//�Է��� ���ڰ� 1, 2, 99�� ��� �ƴϸ� �߸� �Է��ϼ̽��ϴٸ� ����Ѵ�. 
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} catch (Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);
		return inputType;
	}
	public int inputIDCommand(int inputID) {
		// �ֹι�ȣ �Է�

		String inputID_str;
		boolean isDigit = true;
		do {
			do {
				System.out.print("�ֹι�ȣ ���ڸ��� �Է��ϼ���\n__");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6); //inputID_str(�ֹι�ȣ ���ڸ�)�� 6�ڸ��� �ƴϸ� ���Է�.
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false); //isDigit�� false��� �ݺ��Ѵ�.
		
		return inputID;
	}
	public int inputCountCommand(int inputCount) {
		// ���� �Է�

		do {
			try {
				System.out.print("�� ���� �ֹ��Ͻðڽ��ϱ�?\n__");
				inputCount = in.nextInt(); //�ֹ��� ���� �Է�.
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount < 1 || inputCount > 9); //�ֹ� ������ 1���� �۰ų� Ȥ�� 9���� ũ�ٸ� ���Է�.
		return inputCount;
	}
	public int inputAdvantageCommand(int inputAdvantage) {
		// ������ �Է�

		do {
			try {
				System.out.print("�������� �Է��ϼ���.\n1. ����(���̴� �ڵ�ó��)\n2. �����\n3. ����������\n4. ���ڳ�\n5. �ӻ��\n__");
				inputAdvantage = in.nextInt();
			} catch (Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage < 1 || inputAdvantage > 5); //������ �Է� ���ڰ� 1���� �۰ų� 5���� ũ�ٸ� ���Է�.
		return inputAdvantage;
	}

	//���� -> �Ҹ���
	protected void finalize() throws Throwable{
		in.close();
	}

}
