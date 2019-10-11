import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalancedExpressionsTest {
	private BalancedExpressions balancedExpression;
	
	@Before
	public void beforeTest() {
		balancedExpression = new BalancedExpressions();
	}
	@Test
	public void test1() {
		balancedExpression.findBalancedExpression("<some[random]<text>(here)>");
		Assert.assertEquals("YES", balancedExpression.isBalancedExpression);
		Assert.assertEquals(4, balancedExpression.matchCount);
	}
	
	@Test
	public void test2() {
		balancedExpression.findBalancedExpression("<two>{pairs}before.mismatch(");
		Assert.assertEquals("NO", balancedExpression.isBalancedExpression);
		Assert.assertEquals(2, balancedExpression.matchCount);
	}
	
	@Test
	public void test3() {
		balancedExpression.findBalancedExpression("]yet(another)");
		Assert.assertEquals("NO", balancedExpression.isBalancedExpression);
		Assert.assertEquals(1, balancedExpression.matchCount);
	}
	
	@Test
	public void test4() {
		balancedExpression.findBalancedExpression("<and>yet(another[one)");
		Assert.assertEquals("NO", balancedExpression.isBalancedExpression);
		Assert.assertEquals(2, balancedExpression.matchCount);
	}

}
