//���� Ÿ���� �����ϴ� Ŭ����
public class SetAgeTypeClass {


	public int setAgeType(int age) {
		int ageType = 0; //ageType ������ �ʱⰪ�� 0���� ����.
		
		if(age>18&&age<65) { //����
			ageType=0;

		}
		else if(age>13&&age<=18) {//û�ҳ�
			ageType=1;

		}
		else if (age>=3&&age<=12 ||age>=65){ //���� or ���
			ageType=2;
		}
		else if(age<=2) { //3������ ����
			ageType=3;
		}
		return ageType;
	}
}
