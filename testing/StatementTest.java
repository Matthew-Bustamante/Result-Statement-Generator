package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import statementCode.Statement;

class StatementTest {

	@Test
	/*
	 * Tests that the createSignificantStatement() method is creating the significant result statement correctly
	 */
	void testSigStatement() {
		Statement testGenerator = new Statement("group 1", "group 2", "7.352", "5.602", "6.078", "0.441", "2.1749", "88", "0.016");
		String expected = "The mean of group 1 (7.352 ± 6.078) is significantly different than that of group 2 (5.602 ± 0.441) (t-value =2.1749, d.f. =88, p =0.016)";	
		System.out.println(testGenerator.createSignificantStatement());
		assertEquals(expected, testGenerator.createSignificantStatement());
	}
	/*
	 * Tests that the createNotSignificantStatement() method is creating the non significant result statement correctly
	 */
	@Test
	void testNonSigStatement() {
		Statement testGenerator = new Statement("group 1", "group 2", "7.352", "5.602", "6.078", "0.441", "2.1749", "88", "0.016");
		String expected = "The mean of group 1 (7.352 ± 6.078) is not significantly different than that of group 2 (5.602 ± 0.441) (t-value =2.1749, d.f. =88, p =0.016)";
		assertEquals(expected, testGenerator.createNotSignificantStatment());
	}

}
