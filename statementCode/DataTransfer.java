package statementCode;

public class DataTransfer {
	
	private String group1Name;
	private String group2Name;
	private String mean1;
	private String mean2;
	private String stdev1;
	private String stdev2;
	private String tValue;
	private String dfValue;
	private String pValue;
	public DataTransfer() {
		group1Name = "";
		group2Name = "";
		mean1 = "";
		mean2 = "";
		stdev1 = "";
		stdev2 = "";
		tValue = "";
		dfValue = "";
		pValue = "";
		
	}
	
	public void setGroup1Name(String newgroup1Name) {
		group1Name = newgroup1Name;
	}
	
	public void setGroup2Name(String newgroup2Name) {
		group2Name = newgroup2Name;
	}
	
	public void setMean1(String newMean1) {
		mean1 = newMean1;
	}
	
	public void setMean2(String newMean2) {
		mean2 = newMean2;
	}
	
	public void setSD1(String newSD1) {
		stdev1 = newSD1;
	}
	
	public void setSD2(String newSD2) {
		stdev2 = newSD2;
	}
	
	public void setTValue(String newTValue) {
		tValue = newTValue;
	}
	
	public void setDFValue(String newDFValue) {
		dfValue = newDFValue;
	}
	
	public void setPValue(String newPValue) {
		pValue = newPValue;
	}
	
	public String getGroup1Name() {
		return group1Name;
	}
	
	public String getGroup2Name() {
		return group2Name;
	}
	
	public String getMean1() {
		return mean1;
	}
	
	public String getMean2() {
		return mean2;
	}
	
	public String getSD1() {
		return stdev1;
	}
	
	public String getSD2() {
		return stdev2;
	}
	
	public String getTValue() {
		return tValue;
	}
	
	public String getDFValue() {
		return dfValue;
	}
	
	public String getPValue() {
		return pValue;
	}
}
