package statementCode;
import statementCode.DataTransfer;
/**
 * 
 * @author Matthew Bustamante
 * 
 *A statement class that creates two results statements one for the significant and one for non significant
 */
public class Statement{
	//Instance Variables
	/*
	private String group1Name;
	private String group2Name;
	private String mean1;
	private String mean2;
	private String stdev1;
	private String stdev2;
	private String tValue;
	private String dfValue;
	private String pValue;
	/*
	
	/**
	 * 
	 * @param Group 1 Name
	 * @param Group 2 Name
	 * @param Group 1 Mean
	 * @param Group 2 Mean
	 * @param Group 1 Standard Deviation
	 * @param Group 2 Standard Deviation
	 * @param t-value
	 * @param df value
	 * @param p-value
	 */
	public Statement() {
		
		
	}
	/**
	 * createSignificantStatement creates a string with the significant result statement and returns it
	 * @return Significant Result Statement
	 */
	public String createSignificantStatement(String group1Name, String group2Name, String mean1, String mean2, String stdev1, String stdev2, String tValue, String dfValue, String pValue) {
		DataTransfer pojo = new DataTransfer();
		pojo.setGroup1Name(group1Name);
		pojo.setGroup2Name(group2Name);
		pojo.setMean1(mean1);
		pojo.setMean2(mean2);
		pojo.setSD1(stdev1);
		pojo.setSD2(stdev2);
		pojo.setTValue(tValue);
		pojo.setDFValue(dfValue);
		pojo.setPValue(pValue);
		
		String statement = "The mean of " + group1Name +" (" + mean1 + " ± " + stdev1 + ")" +" is significantly different than that of "
	+ group2Name + " (" + mean2 + " ± " + stdev2 + ") (t-value =" + tValue + ", d.f. =" + dfValue + ", p =" + pValue + ")";
		
		return statement;
	}
	
	/**
	 * createNotSignificantStatement method that creates a string with the non significant result statement and returns it
	 * @return Non-significant result statement
	 */
	public String createNotSignificantStatment(String group1Name, String group2Name, String mean1, String mean2, String stdev1, String stdev2, String tValue, String dfValue, String pValue) {
		DataTransfer pojo = new DataTransfer();
		pojo.setGroup1Name(group1Name);
		pojo.setGroup2Name(group2Name);
		pojo.setMean1(mean1);
		pojo.setMean2(mean2);
		pojo.setSD1(stdev1);
		pojo.setSD2(stdev2);
		pojo.setTValue(tValue);
		pojo.setDFValue(dfValue);
		pojo.setPValue(pValue);
		String statement = "The mean of " + group1Name +" (" + mean1 + " ± " + stdev1 + ")" +" is not significantly different than that of "
	+ group2Name + " (" + mean2 + " ± " + stdev2 + ") (t-value =" + tValue + ", d.f. =" + dfValue + ", p =" + pValue + ")";
	
		return statement;
	}
}
