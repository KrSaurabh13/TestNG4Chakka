package DemoTestNG;

import org.junit.Before;
import org.junit.Test;

public class Demo3_jUnit {
	
	@Before
	public void BF() {
		// TODO Auto-generated method stub
		System.out.println( "Before ");
	}

	@Test
	public void Test(){
		System.out.println( " Test ");
		
	}
	
	
}
