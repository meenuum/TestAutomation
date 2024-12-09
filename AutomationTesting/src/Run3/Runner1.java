package Run3;

import org.testng.annotations.Test;

import Generic3.Gener;
import POM3.POM;

public class Runner1 extends Gener {
	@Test
	public void test()
	{
		POM p=new POM(driver);
		p.user("admin");
		p.password("yuh");
		p.Button();
		
	}

}
