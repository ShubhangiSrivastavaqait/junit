package Test33.junit;

import java.util.*;
public class App 
{
    public static List <String> check(List<String> mylist )
    {
    	ArrayList <String> list =new ArrayList <String>();
       int l = mylist.size();
       String[] words = mylist.toArray(new String[mylist.size()]);
       for(int i=0;i<words.length;i++)
       {
           
           for(int j=1;j<words[i].length();j++)
           {
               if(words[i].charAt(j) == words[i].charAt(j-1))
               {
            	   String temp = words[i];
                   list.add(temp);
            }
           }  
          }     
       
         return list;
         
        }
        }
     
 