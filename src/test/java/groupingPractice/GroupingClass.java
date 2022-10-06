package groupingPractice;

import org.testng.annotations.Test;

public class GroupingClass {
	@Test(groups = {"A"})
	public void abc() {
		System.out.println("abc is running from class1");
	}
	@Test(groups = {"A","B"})
	public void xyz() {
		System.out.println("xyz is running from class1");
	}
	@Test(groups = {"B","C"})
	public void def() {
		System.out.println("def is running from class1");
	}
	@Test(groups = {"A","C"})
	public void pqr() {
		System.out.println("pqr is running from class1");
	}
	@Test(groups = {"B","D"})
	public void mno() {
		System.out.println("mno is running from class1");
	}
}
