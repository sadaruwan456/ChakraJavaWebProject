/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author dsada
 */
public class OTPgen {
    public static char[] generatorOTP(int length) 
  { 
//    System.out.print("Your OTP is : "); 
              //Creating object of Random class
    Random obj = new Random(); 
    char[] otp = new char[length]; 
    for (int i=0; i<length; i++) 
    { 
      otp[i]= (char)(obj.nextInt(10)+48); 
    } 
    return otp; 
  } 
//  public static void main(String[] args) 
//  {  
//        char[] OTP = generatorOTP(4);
//        String ss = new String(OTP);
//        System.out.println(ss);
//  } 
    
    
}
