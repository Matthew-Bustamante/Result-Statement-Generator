package statementCode;
public class Statement{
	private String group1Name;
	private String group2Name;
	private String mean1;
	private String mean2;
	private String stdev1;
	private String stdev2;
	private String tValue;
	private String dfValue;
	private String pValue;
	
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
	
	public String createSignificantStatement() {
		String statement = "The mean of " + group1Name +"(" + mean1 + "±" + stdev1 + ")" +" is signifcantly different than that of "
	+ group2Name + "(" + mean2 + "±" + stdev2 + ") (t-value = " + tValue + ",d.f. = " + dfValue + ",p=" + pValue;
		
		return statement;
	}
	
	public String createNotSignificantStatment() {
		String statement = "The mean of " + group1Name +"(" + mean1 + "±" + stdev1 + ")" +" is not signifcantly different than that of "
	+ group2Name + "(" + mean2 + "±" + stdev2 + ") (t-value = " + tValue + ",d.f. = " + dfValue + ",p=" + pValue;
	
		return statement;
	}
}
