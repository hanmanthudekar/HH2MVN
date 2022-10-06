package groupingPractice;

import org.testng.annotations.Test;

public class Grouping_2 {
	@Test(groups = {"A","B","D"})
	public void abc() {
		System.out.println("abc is running from class2");
	}
	@Test(groups = {"B","C"})
	public void xyz() {
		System.out.println("xyz is running from class2");
	}
	@Test(groups = {"D","C"})
	public void def() {
		System.out.println("def is running from class2");
	}
	@Test(groups = {"A","F"})
	public void pqr() {
		System.out.println("pqr is running from class2");
	}
	@Test(groups = {"G","D"})
	public void mno() {
		System.out.println("mno is running from class2");
	}
}

