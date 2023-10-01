package com.testng;

import org.testng.annotations.Test;

public class OpenACTest {
     @Test
     public void openacTest()
     {
    	 System.out.println("OpenAc page is Dispayed");
     }
     @Test(priority = 1 )
     public void fundtransferTest()
     {
    	 System.out.println("Fund Transfer page is displayed");
     }
     
     @Test(dependsOnMethods ="fundtransferTest" )
     public void internetTest() {
    	 System.out.println("Internet Banking page is displyed ");
     }
}
