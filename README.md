# variable
## The beginning of Java
### File format 
- package name, 
- class name (need to be the same with file name, for it is .java doc)
- if you need this file itself to be executable:
```Java
package com.company;

public class Variable {
  public static void main(String[] args) {
  // write your code here
  System.out.println("Hello World");
  int num1 = 10;
  int num2 = 10/4; //2.5->2 
  int num3 = -10/4; //-2.5->-|2.5->2|=-2
  //int: for Java is a Static type language.
  }
}
  /*Common classification of language:
  Static type: Java, C++, C#,
  Dynamic type： JavaScript, Python,
  */
```
### The classification of different valiabilities
- byte, (-2^7, 2^7 - 1)
- int, (-2^31, 2^31 - 1)
- short, (-2^15, 2^15 - 1)
- long, (-2^63, 2^63 - 1)
- float, single precision
- double, double precision
- char, saved as interger called "unicode" in bottom layer
- boolean, true or false
```Java
int year = 2018; //-(2^31) to 2^31
long big = 10000000000L; //-(2^63) to 2^63
double doubleNum = floatNum 
//a small range could be changed automatically 
float floatNum = (float) doubleNum; 
//large range cannot be changed to small range type unless using force change method.
boolean switchOne = true;
boolean switchTwo = false;
char ch1 ='a';
char ch2 =' ';
char ch3 =',';
//the char above is called "normal character".
//the char below is called "Escape character"
char ch4 ='\n';//enter after print
char ch5 ='\t';
char ch6 ='\r';
int uniNum = ch1;//uniNum->97
//char character is being saved in interger called unicode in the bottom layer of computer. When it is //given to an interger type variability, the num would appear.
```
#### e.g. Calculate whether a year is the leap year or not.
```Java
private static void LeapYear(int year){
  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
      System.out.println("Yes, this year is a Leap year.") ;
  }else{
      System.out.println("No, this year is not a Leap year.") ;
  }
}
```
