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
### classification of different valiabilities
```Java
int year = 2018; //-(2^31) to 2^31
long big = 10000000000L; //-(2^63) to 2^63
double doubleNum = floatNum 
// small range could be changed automaticly 
float floatNum = (float) doubleNum; 
//large range cannot be changed to small range type unless using force change.
```
