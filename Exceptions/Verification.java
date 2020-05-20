/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author s
 */
public class Verification {
    public boolean number (String s)
{
 for(int i =0;i<s.length();i++)   
 {
 if(Character.isDigit(s.charAt(i))==false&&s.isEmpty()==false)
     return false;
 }
        return true;
}
    public boolean text (String s)
    {
    for(int i =0;i<s.length();i++)   
 {
 if(Character.isLetter(s.charAt(i))==false&&s.isEmpty()==false)
     return false;
 }
        return true;
    } 
    public boolean email(String s){
        String x="@";
        String x2=".com";
        return s.contains(x)==true&&s.endsWith(x2)==true&&s.isEmpty()==false;
        
    }
    public boolean number2(String s){
    {
 for(int i =0;i<s.length();i++)   
 {
 if(Character.isDigit(s.charAt(i))==false&&s.isEmpty()==false&&s.length()>11)
     return false;
 }
        return true;

    
    }}
}