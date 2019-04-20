/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import assignment.Assignment;
import org.junit.Before;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/**
 *
 * @author pcc
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
 
    }
    Assignment myObj;
    @Before
    public void initTest(){
        myObj=new Assignment();
    }
    @Test
      public void testFactorial(){
          assertEquals(1,myObj.fact(0));
                    assertEquals(5,myObj.fact(125));

        /* JUnitCore runner=new JUnitCore();
         Result result=runner.run(Assignment.class);*/
         Assignment assignmentMock=mock(Assignment.class);
        when(assignmentMock.fact(1)).thenReturn(1);
        when(assignmentMock.fact(2)).thenReturn(2);

        assertEquals(2,assignmentMock.fact(2));
         assertEquals(1,assignmentMock.fact(1));

     
                
    }
}
