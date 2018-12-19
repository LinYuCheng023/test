package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testTest {
	private test Grade;

	@Before
	public void setUp() throws Exception {
		Grade = new test();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test public void test1() 
	{ 
		Assert.assertEquals('F', Grade.letterGrade(0));
	}
	@Test public void test2() 
	{ 
		Assert.assertEquals('F', Grade.letterGrade(59)); 
	}
	@Test public void test3() 
	{ 
		Assert.assertEquals('D', Grade.letterGrade(60)); 
	}
	@Test public void test4() 
	{ 
		Assert.assertEquals('D', Grade.letterGrade(69));  
	}
	@Test public void test5() 
	{ 
		Assert.assertEquals('C', Grade.letterGrade(70)); 
	}
	@Test public void test6() 
	{ 
		Assert.assertEquals('C', Grade.letterGrade(79)); 
	}
	@Test public void test7() 
	{ 
		Assert.assertEquals('B', Grade.letterGrade(80)); 
	}
	@Test public void test8() 
	{ 
		Assert.assertEquals('B', Grade.letterGrade(89)); 
	}
	@Test public void test9() 
	{ 
		Assert.assertEquals('A', Grade.letterGrade(90)); 
	}
	@Test public void test10() 
	{ 
		Assert.assertEquals('A', Grade.letterGrade(100)); 
	}
	@Test public void test11() 
	{ 
		Assert.assertEquals('X', Grade.letterGrade(-1)); 
	}
	@Test public void test12() 
	{ 
		Assert.assertEquals('X', Grade.letterGrade(101)); 
	}

}
