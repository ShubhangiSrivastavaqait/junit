package Test33.junit;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class AppTest 
   {
    
      
    @Test
    public void testApp()
    {
    	 App obj = new App();
        ArrayList <String> inputlist = new ArrayList<String>();
        inputlist.add("abc");
        inputlist.add("hello");
        inputlist.add("apple");
        ArrayList <String> outputlist = new ArrayList<String>();
        outputlist.add("hello");
        outputlist.add("apple");
        List l = obj.check(inputlist);
            assertEquals(l,outputlist);
        }
    
    @Test
    public void testApp2()
    {
    	 App obj = new App();
      
        ArrayList <String> outputlist = new ArrayList<String>();
        outputlist.add("hello");
        outputlist.add("apple");
      
            assertEquals("ram",outputlist,"failed this case because list input expected");
        }
    
    
}