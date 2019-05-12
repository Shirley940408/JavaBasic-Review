package com.company;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.LeafPropertyXsiLoader;

public class Variables {
    private static int addAToB(int a, int b){
        while(b != 0){
            int _a = a ^ b;
            int _b = (a & b) << 1;
            a = _a;
            b = _b;
        }
        return a;
    }
    private static int Revert_3_digit_number(int num){
        int new_num = 0;
        int unit;
        int len = String.valueOf(num).length();
        for(int i = 0; i < len; i++){
            unit = num % 10;
            num/=10;
            new_num = new_num * 10 + unit;
        }
//        while(num !=0){
//            unit = num % 10;
//            num/=10;
//            new_num = new_num * 10 + unit;
//        }
        return new_num;
    }
    private static int _a, _b;
    private static int AddAToB (int a, int b){
         _a = a ^ b;
         _b = (a & b) << 1 ;
          a = _a;
          if(_b == 0){
              return a;
          }
          b = _b;
          return AddAToB(a, b);
    }
    private static void LeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Yes, this year is a Leap year.\r") ;
        }else{
            System.out.println("No, this year is not a Leap year.") ;
        }
    }

       public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello, World");
        int num1 = 10;
        int num2 = 10/4; //2.5->2
        int num3 = -10/4; //-2.5->-|2.5->2|=-2
//        System.out.println(num1+" "+num2+" "+num3);
        int sum = addAToB(10, 7);
//        System.out.println(sum);
        int ans=Revert_3_digit_number(1234567);
//        System.out.println(ans);
           AddAToB(10, 7);
        System.out.println(AddAToB(10, 7));
        LeapYear(1994);
        LeapYear(2016);
        LeapYear(2000);
        LeapYear(2100);
    }
}
