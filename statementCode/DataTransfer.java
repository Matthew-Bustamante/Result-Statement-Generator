package statementCode;
/**
 * DataTransfer Class that transfers data of the statements using getters and setters
 * 
 *
 */
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
	/**
	 * stores group 1 name
	 * @param new group 1 name
	 */
	public void setGroup1Name(String newgroup1Name) {
		group1Name = newgroup1Name;
	}
	
	/**
	 * stores group 2 name
	 * @param new group2 name
	 */
	public void setGroup2Name(String newgroup2Name) {
		group2Name = newgroup2Name;
	}
	
	/**
	 * stores group 1 mean
	 * @param group 1 mean
	 */
	public void setMean1(String newMean1) {
		mean1 = newMean1;
	}
	/**
	 * stores group 2 mean
	 * @param group 2 mean
	 */
	public void setMean2(String newMean2) {
		mean2 = newMean2;
	}
	
	/**
	 * stores group 1 standard deviation
	 * @param new group 1 standard deviation
	 */
	public void setSD1(String newSD1) {
		stdev1 = newSD1;
	}
	/**
	 * stores group 2 standard deviation
	 * @param new group 2 standard deviation
	 */
	public void setSD2(String newSD2) {
		stdev2 = newSD2;
	}
	
	/**
	 * Stores t-value
	 * @param new t-value
	 */
	public void setTValue(String newTValue) {
		tValue = newTValue;
	}
	/**
	 * stores d.f. value
	 * @param new d.f. value
	 */
	public void setDFValue(String newDFValue) {
		dfValue = newDFValue;
	}
	
	/**
	 * stores p-value
	 * @param new p-value
	 */
	public void setPValue(String newPValue) {
		pValue = newPValue;
	}
	/**
	 * retrieves group 1 name
	 * @return group 1 name
	 */
	public String getGroup1Name() {
		return group1Name;
	}
	
	/**
	 * retrieves group 2 name
	 * @return group 2 name
	 */
	public String getGroup2Name() {
		return group2Name;
	}
	
	/**
	 * retrieves group 1 mean
	 * @return group 1 mean
	 */
	public String getMean1() {
		return mean1;
	}
	
	/**
	 * retrieves group 2 mean
	 * @return group 2 mean
	 */
	public String getMean2() {
		return mean2;
	}
	
	/**
	 * retrieves group 1 standard deviation
	 * @return group 1 standard deviation
	 */
	public String getSD1() {
		return stdev1;
	}
	
	/**
	 * retrieves group 2 standard deviation
	 * @return group 2 standard deviation
	 */
	public String getSD2() {
		return stdev2;
	}
	
	/**
	 * retrieves t-value
	 * @return t-value
	 */
	public String getTValue() {
		return tValue;
	}
	
	/**
	 * retrieves d.f. value
	 * @return d.f. value
	 */
	public String getDFValue() {
		return dfValue;
	}
	
	/**
	 * retrieves p-value
	 * @return p-value
	 */
	public String getPValue() {
		return pValue;
	}
}
