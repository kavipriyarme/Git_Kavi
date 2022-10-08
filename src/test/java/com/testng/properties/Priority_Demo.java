package com.testng.properties;

import org.testng.annotations.Test;

public class Priority_Demo {
	
@Test
private void ug() {
	System.out.println("ug");

}
@Test(priority=-2)
private void sslc() {
	System.out.println("sslc");

}
@Test(priority=-1)
private void hsc() {
	System.out.println("hsc");
}
@Test(priority=1)
private void pg() {
	System.out.println("pg");
}
}


// priority based on ASCII order
//Default of Priority is zero
//if we give value for priority like -1,-2,-3,0,1,2,3
//if we give priority value is same for two different methods then it will run based on ASCII