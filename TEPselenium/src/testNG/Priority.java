package testNG;

import org.testng.annotations.Test;

public class Priority {
	
	/*
	 * priority is very important. in testng test case most likely fail if class has chronological
	 * order. it is better practice to put priority before every test. without priority testng will
	 * execute tests at the alphabetical order.
	 */
@Test(priority=1)
public void login(){
	System.out.println("log in test is p1");
	
}
@Test(priority=4)

public void friendlist(){
	System.out.println("checking friendlist is p4");
}
@Test(priority=3)
public void group(){
	System.out.println("checking group is p3");
}
@Test(priority=2)
public void crises_responses(){
	System.out.println("checking what crises could happen is p2");
}

@Test(priority=5)
public void crises_manage(){
	System.out.println("checking how to manage crises is p5");
}
@Test(priority=6)
public void crises_controll(){
	System.out.println("checking is there any controll is p6");
}

}
