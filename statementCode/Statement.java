package statementCode;
/**
 * 
 * @author Matthew Bustamante
 * 
 *A statement class that creates two results statements one for the significant and one for non significant
 */
public class Statement{
	//Instance Variables
	private String group1Name;
	private String group2Name;
	private String mean1;
	private String mean2;
	private String stdev1;
	private String stdev2;
	private String tValue;
	private String dfValue;
	private String pValue;
	
	
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
	public Statement(String groupOneName, String groupTwoName, String g1Mean, String g2Mean, String g1SD, String g2SD, String tVal, String dfVal, String pVal) {
		group1Name = groupOneName;
		group2Name = groupTwoName;
		mean1 = g1Mean;
		mean2 = g2Mean;
		stdev1 = g1SD;
		stdev2 = g2SD;
		tValue = tVal;
		dfValue = dfVal;
		pValue = pVal;
		
		
	}
	/**
	 * createSignificantStatement creates a string with the significant result statement and returns it
	 * @return Significant Result Statement
	 */
	public String createSignificantStatement() {
		String statement = "The mean of " + group1Name +" (" + mean1 + " ± " + stdev1 + ")" +" is significantly different than that of "
	+ group2Name + " (" + mean2 + " ± " + stdev2 + ") (t-value =" + tValue + ", d.f. =" + dfValue + ", p =" + pValue + ")";
		
		return statement;
	}
	
	/**
	 * createNotSignificantStatement method that creates a string with the non significant result statement and returns it
	 * @return Non-significant result statement
	 */
	public String createNotSignificantStatment() {
		String statement = "The mean of " + group1Name +" (" + mean1 + " ± " + stdev1 + ")" +" is not significantly different than that of "
	+ group2Name + " (" + mean2 + " ± " + stdev2 + ") (t-value =" + tValue + ", d.f. =" + dfValue + ", p =" + pValue + ")";
	
		return statement;
	}
}
