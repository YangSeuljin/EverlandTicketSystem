import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		InputClass ic = new InputClass(); //입력
		CalcAgeClass cc = new CalcAgeClass(); //나이계산
		SetAgeTypeClass satc = new SetAgeTypeClass(); //나이 타입
		SetTicketTypeClass sc = new SetTicketTypeClass(); //티켓 타입
		CalcOutputPriceClass copc = new CalcOutputPriceClass(); // 가격 계산
		PrintClass pc = new PrintClass(); // 출력

		int inputType = 1, inputID = 0, inputCount = 0, inputAdvantage = 0; // 키보드로 부터 입력받는 값 선언
		int outputPrice = 0; int finalPrice= 0;// 최종 출력 금액 선언
		int age, ageType = 0;
		List<OrderListCollection> data = new ArrayList<OrderListCollection>();
		OrderListCollection orderList = null;

		while(true) {


			inputType = ic.inputTypeCommand(inputType); // InputClass에서 권종 입력값을 받아온다.
			inputID = ic.inputIDCommand(inputID); // InputClass에서 주민번호 앞자리를 받아온다.
			inputCount = ic.inputCountCommand(inputCount); 
			// InputClass에서 주문 갯수를 받아온다.
			inputAdvantage = ic.inputAdvantageCommand(inputAdvantage);
			//우대사항 입력값을 받아온다.


			// 나이 계산 클래스.

			age = cc.calcAge(inputID); //inputID(주민번호 앞자리)를 매개변수로 전달하여 age변수에 입력.

			//나이 타입 결정 클래스

			ageType = satc.setAgeType(age); //age(나이)를 매개변수로 전달하여 ageType 값을 입력.


			//단가 결정 클래스

			outputPrice = sc.setTicketType(inputType, ageType, inputAdvantage);
			//SetTicketTypeClass 클래스의 setTicketType 매서드에 매개변수로 inputType,ageType,inputAdvantage를 전달하여
			// outputPrice를 가져온다.

			// 최종 가격 결정 클래스

			finalPrice = copc.calcOutputPrice(outputPrice, inputCount);

			//출력 클래스

			pc.printTicket(finalPrice , inputType, ageType, inputAdvantage,inputCount);



			OrderListCollection orderlist = new OrderListCollection(finalPrice, pc.korInputType , pc.korAgeType, pc.korInputAdvantage,inputCount);

			data.add(orderlist);

			for(OrderListCollection order : data) {
				System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", order.getFinalPrice());
				System.out.println("================= 에버랜드 ========================");
				System.out.printf("%5s %5s X%5d %10d원 %s\n", order.getInputType(), order.getAgeType()
						, order.getInputCount(), order.getFinalPrice() ,order.getInputAdvantage());
				System.out.println("================================================");
			}


		}		
	}
}

