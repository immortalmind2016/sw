/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.util.Scanner;


/**
 *
 * @author mohamed
 */
public class demo3 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
       // junit test
        
        JUnitCore runner=new JUnitCore();
        Result result=runner.run(myJunitTest.class);
        System.out.println("run tests: "+result.getRunCount());
        System.out.println("failed tests: "+result.getFailureCount());
        System.out.println("ignored tests: "+result.getIgnoreCount());
        System.out.println("success: "+result.wasSuccessful());

        
        //normal run
       
        Scanner in=new Scanner(System.in);
        creation get=new creation();
        System.out.println("Enter Salary");
        int x=in.nextInt();
        int y =get.gettax(x);
        System.out.println("Tax = "+y);
      
        
        
        
    }
    
}
