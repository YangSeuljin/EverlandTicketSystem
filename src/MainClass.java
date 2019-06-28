import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		InputClass ic = new InputClass(); //�Է�
		CalcAgeClass cc = new CalcAgeClass(); //���̰��
		SetAgeTypeClass satc = new SetAgeTypeClass(); //���� Ÿ��
		SetTicketTypeClass sc = new SetTicketTypeClass(); //Ƽ�� Ÿ��
		CalcOutputPriceClass copc = new CalcOutputPriceClass(); // ���� ���
		PrintClass pc = new PrintClass(); // ���

		int inputType = 1, inputID = 0, inputCount = 0, inputAdvantage = 0; // Ű����� ���� �Է¹޴� �� ����
		int outputPrice = 0; int finalPrice= 0;// ���� ��� �ݾ� ����
		int age, ageType = 0;
		List<OrderListCollection> data = new ArrayList<OrderListCollection>();
		OrderListCollection orderList = null;

		while(true) {


			inputType = ic.inputTypeCommand(inputType); // InputClass���� ���� �Է°��� �޾ƿ´�.
			inputID = ic.inputIDCommand(inputID); // InputClass���� �ֹι�ȣ ���ڸ��� �޾ƿ´�.
			inputCount = ic.inputCountCommand(inputCount); 
			// InputClass���� �ֹ� ������ �޾ƿ´�.
			inputAdvantage = ic.inputAdvantageCommand(inputAdvantage);
			//������ �Է°��� �޾ƿ´�.


			// ���� ��� Ŭ����.

			age = cc.calcAge(inputID); //inputID(�ֹι�ȣ ���ڸ�)�� �Ű������� �����Ͽ� age������ �Է�.

			//���� Ÿ�� ���� Ŭ����

			ageType = satc.setAgeType(age); //age(����)�� �Ű������� �����Ͽ� ageType ���� �Է�.


			//�ܰ� ���� Ŭ����

			outputPrice = sc.setTicketType(inputType, ageType, inputAdvantage);
			//SetTicketTypeClass Ŭ������ setTicketType �ż��忡 �Ű������� inputType,ageType,inputAdvantage�� �����Ͽ�
			// outputPrice�� �����´�.

			// ���� ���� ���� Ŭ����

			finalPrice = copc.calcOutputPrice(outputPrice, inputCount);

			//��� Ŭ����

			pc.printTicket(finalPrice , inputType, ageType, inputAdvantage,inputCount);



			OrderListCollection orderlist = new OrderListCollection(finalPrice, pc.korInputType , pc.korAgeType, pc.korInputAdvantage,inputCount);

			data.add(orderlist);

			for(OrderListCollection order : data) {
				System.out.printf("������ %d�� �Դϴ�.\n�����մϴ�.\n", order.getFinalPrice());
				System.out.println("================= �������� ========================");
				System.out.printf("%5s %5s X%5d %10d�� %s\n", order.getInputType(), order.getAgeType()
						, order.getInputCount(), order.getFinalPrice() ,order.getInputAdvantage());
				System.out.println("================================================");
			}


		}		
	}
}

