import java.util.Scanner;

public class SetTicketTypeClass {
	private Scanner in = null ;
	// ���� -> ������
	SetTicketTypeClass() {
		in = new Scanner(System.in);
	}


	//���� �ܰ� �޼���
	public int setTicketType(int inputType,int ageType,int inputAdvantage) {
		int outputprice = 0;

		//���� ����
		final int OLD = 65;
		final int BABY = 3;
		final int BOY = 12;
		final int TEEN = 18;
		final int ADULT = 19;		
		int older = ADULT;

		//��� ���̺�
		//���� �Ϲݿ��
		final int DAY_ADULT = 54000;
		final int DAY_TEEN = 46000;
		final int DAY_BOY = 43000;
		final int NIGHT_ADULT = 45000;
		final int NIGHT_TEEN = 39000;
		final int NIGHT_BOY = 36000;
		final int TWO_DAY_ADULT = 84000;
		final int TWO_DAY_TEEN = 71000;
		final int TWO_DAY_BOY = 67000;

		//�����
		final int DISABLED_DAY_ADULT = 33000;
		final int DISABLED_DAY_TEEN = 28000;
		final int DISABLED_DAY_BOY = 26000;
		final int DISABLED_NIGHT_ADULT = 27000;
		final int DISABLED_NIGHT_TEEN = 24000;
		final int DISABLED_NIGHT_BOY = 23000;

		//������
		final int MERIT_DAY_ADULT = 27000;
		final int MERIT_DAY_TEEN = 23000;
		final int MERIT_DAY_BOY = 21500;
		final int MERIT_NIGHT_ADULT = 22500;
		final int MERIT_NIGHT_TEEN = 19500;
		final int MERIT_NIGHT_BOY = 18000;

		//���ڳ�
		final int MULTI_DAY_ADULT = 43000;
		final int MULTI_DAY_TEEN = 36000;
		final int MULTI_DAY_BOY = 34000;
		final int MULTI_NIGHT_ADULT = 36000;
		final int MULTI_NIGHT_TEEN = 31000;
		final int MULTI_NIGHT_BOY = 28000;

		//�ӻ��
		final int PREGNANT_DAY = 45000;
		final int PREGNANT_NIGHT = 36000;

		if(inputType==1) { //�ְ���

			switch(ageType) {

			case 0:  //����
				switch(inputAdvantage) {

				case 1: 
					outputprice = DAY_ADULT;
					break;
				case 2: //�����
					outputprice = DISABLED_DAY_ADULT;
					break;
				case 3: //����������
					outputprice = MERIT_DAY_ADULT;
					break;
				case 4: //���ڳ�
					outputprice = MULTI_DAY_ADULT;
					break;
				case 5: //�ӻ��
					outputprice = PREGNANT_DAY; 
					break;
				}
				break;
			case 1:  //û�ҳ�
				switch(inputAdvantage) {
				case 1: 
					outputprice = DAY_TEEN; 
					break;
				case 2: //�����
					outputprice = DISABLED_DAY_ADULT; 
					break;
				case 3: //����������
					outputprice = MERIT_DAY_TEEN;
					break;
				case 4: //���ڳ�
					outputprice = MULTI_DAY_TEEN;
					break;
				case 5: //�ӻ��
					outputprice = PREGNANT_DAY;
					break;
				}
				break;
			case 2:  //����,���
				switch(inputAdvantage) {
				case 1: 
					outputprice = DAY_BOY; 
					break;
				case 2: //�����
					outputprice = DISABLED_DAY_BOY;
					break;
				case 3: //����������
					outputprice = MERIT_DAY_BOY;
					break;
				case 4: //���ڳ�
					outputprice = MULTI_DAY_BOY;
					break;
				case 5: //�ӻ��
					outputprice = PREGNANT_DAY;
					break;
				}
				break;
			case 3:  //����
				switch(inputAdvantage) {
				case 1: 
					outputprice = 0; 
					break;
				case 2: //�����
					outputprice = 0; 
					break;
				case 3: //����������
					outputprice = 0; 
					break;
				case 4: //���ڳ�
					outputprice = 0; 
					break;
				case 5: //�ӻ��
					outputprice = 0; 
					break;	

				}
				break;
			}
		} else if(inputType==2) { //�߰���

			switch(ageType) {
			case 0:  //����
				switch(inputAdvantage) {
				case 1: 
					outputprice = NIGHT_ADULT; 
					break;
				case 2: //�����
					outputprice = DISABLED_NIGHT_ADULT; 
					break;
				case 3: //����������
					outputprice = MERIT_NIGHT_ADULT; 
					break;
				case 4: //���ڳ�
					outputprice = MULTI_NIGHT_ADULT; 
					break;
				case 5: //�ӻ��
					outputprice = PREGNANT_NIGHT; 
					break;
				}
				break;
			case 1:  //û�ҳ�
				switch(inputAdvantage) {
				case 1: 
					outputprice = 54000; break;
				case 2: //�����
					outputprice = DISABLED_NIGHT_TEEN; 
					break;
				case 3: //����������
					outputprice = MERIT_NIGHT_TEEN; 
					break;
				case 4: //���ڳ�
					outputprice = MULTI_NIGHT_TEEN; 
					break;
				case 5: //�ӻ��
					outputprice =  PREGNANT_NIGHT; 
					break;
				}
				break;
			case 2:  //����,���
				switch(inputAdvantage) {
				case 1: 
					outputprice = 54000; break;
				case 2: //�����
					outputprice = DISABLED_NIGHT_BOY; 
					break;
				case 3: //����������
					outputprice = MERIT_NIGHT_BOY; 
					break;
				case 4: //���ڳ�
					outputprice = MULTI_NIGHT_BOY; 
					break;
				case 5: //�ӻ��
					outputprice = PREGNANT_NIGHT; 
					break;
				}
				break;
			case 3:  //����
				switch(inputAdvantage) {
				case 1: 
					outputprice = 0; break;
				case 2: //�����
					outputprice = 0; 
					break;
				case 3: //����������
					outputprice = 0; 
					break;
				case 4: //���ڳ�
					outputprice = 0; 
					break;
				case 5: //�ӻ��
					outputprice = 0; 
					break;					
				}
				break;
			}
		}
		return outputprice;
	}//���� -> �Ҹ���
	protected void finalize() throws Throwable{
		in.close();
	}
}