import java.util.Scanner;

public class CalcOutputPriceClass {

	private Scanner in = null ;
	// ���� -> ������
	CalcOutputPriceClass() {
		in = new Scanner(System.in);
	}
	public int calcOutputPrice(int outputprice, int inputCount) {
		outputprice = outputprice * inputCount;
		return outputprice;

	}
	protected void finalize() throws Throwable{
		in.close();
	}
}