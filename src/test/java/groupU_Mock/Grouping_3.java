package groupU_Mock;

import org.testng.annotations.Test;

public class Grouping_3 {
	@Test(groups = {"A","B","H"})
	public void abc() {
		System.out.println("abc is running from class3");
	}
	@Test(groups = {"B","C"})
	public void xyz() {
		System.out.println("xyz is running from class3");
	}
	@Test(groups = {"D","K"})
	public void def() {
		System.out.println("def is running from class3");
	}
	@Test(groups = {"A","L"})
	public void pqr() {
		System.out.println("pqr is running from class3");
	}
	@Test(groups = {"G","M"})
	public void mno() {
		System.out.println("mno is running from class3");
	}
}

