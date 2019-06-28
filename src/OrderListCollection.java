
public class OrderListCollection {
	private int finalPrice;
	private String inputType ;
	private String ageType;
	private String inputAdvantage;
	private int inputCount;
	
	OrderListCollection(int finalPrice, String korInputType, String korAgeType, String korInputAdvantage,int inputCount){
	this.finalPrice = finalPrice;
	this.inputType = korInputType;
	this.ageType = korAgeType;
	this.inputAdvantage = korInputAdvantage;
	this.inputCount = inputCount;
	}
	
	
	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getAgeType() {
		return ageType;
	}

	public void setAgeType(String ageType) {
		this.ageType = ageType;
	}

	public String getInputAdvantage() {
		return inputAdvantage;
	}

	public void setInputAdvantage(String inputAdvantage) {
		this.inputAdvantage = inputAdvantage;
	}

	public int getInputCount() {
		return inputCount;
	}

	public void setInputCount(int inputCount) {
		this.inputCount = inputCount;
	}
}
