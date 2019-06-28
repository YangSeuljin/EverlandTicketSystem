//나이 타입을 결정하는 클래스
public class SetAgeTypeClass {


	public int setAgeType(int age) {
		int ageType = 0; //ageType 변수의 초기값을 0으로 설정.
		
		if(age>18&&age<65) { //대인
			ageType=0;

		}
		else if(age>13&&age<=18) {//청소년
			ageType=1;

		}
		else if (age>=3&&age<=12 ||age>=65){ //소인 or 경로
			ageType=2;
		}
		else if(age<=2) { //3세이하 무료
			ageType=3;
		}
		return ageType;
	}
}
