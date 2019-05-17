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
# coding-control flow
## Starting with an Array
```Java
public static void main(String[] args){
    int[] score = {90, 95, 92, 89, 100, 90};
    int firstScore = score[5];
    score[0] = 30;
    int sum;
    for(int i = 0; i < score.length; i++) {
        sum += score[i];
    }
}
//score.length is valid in Java, as score is an Array.
```
### multi-dimention Array
```Java
int[][] matrix = new int[][]{
{1, 4, 7},
{2, 15, 13},
{6, 8, 12},
};
int [][] anotherMatrix = new int[4][4];
```
# function, String, Object
## format of a function
```Java
 boolean findNumber(int[] array, int target){
    for(int i = 0; i < array.length; i++){
      if (target == array[i]){
          return true;
      }
    }
    return false;
 }
```
### something must have in a function:
#### - return type： boolean (if this function does not have a return value, then put void as is return type)
#### - function name -- lower camel case, always start with a verb
#### - every parameter type need to be settled: int [] array, int target
#### - if this function has a return value, then always written in the **outermost layer** of the function.(Something you have writen in the switch method like if(){...;return value;}, but it will cause error unless you write another return in the outermost layer)

#### Attention points:
- the main different in parameter of Java and JavaScript is that JavaScript does not need to have to initial all the parameters, but in Java you have to.
```JavaScript
const example = (a, b, c) =>({return a + b + c})
example(1,2);
//the output is undefined, cause c has not being initialized. But it will not cause error.
```
```Java
public static int example(int a, int b, int c){
 return a + b + c; 
}
public static main(String[] args){
System.out.println(example(1));//it will cause error, cause the type and number of parameters must be the same.
} 
```
## String
### get the length of a String

```java
String str = "a string";
System.out.println(str.length());
//length vs. length()
//.length is used in an Array, and length() is used in a String
```
### The traverse of String
```Java
String str ="a string";
for(int i = 0; i < str.length(); i++){
char ch =str.charAt(i);
//...
}
```
## What is Object - Oriented ?
- Object-Oriented is a kind of world view
- Object-Oriented is a way to design program
### as an Object, it always has two things:
- attritube--member parameter
- behavior -- member function
## what is class
- Class is the abstract of Object. Object is an instance of the class.
- type of class name -- upper camel case
### constructor function
- has the same name of class
- does not have the return type, for it does not have return value
- cannot be visited from outside
- constructor function is called automatically when the object being initialized.
- constructor function has the overload（重载）
### this
- to avoid the misleading of parameter brought from outside and the class attributes.
- let the attributes always point to this object 
```Java
public class Example {
    public static void main(String[] args){
        Student stu = new Student("Jack", 89);
        stu.speak();

    }
}

class Student{
    public String name;
    public int score;
    public Student(String name, int score){
        this.name = name;
        score = score;// it would not get the 89 from outside, cause this is missing.
    }
     public void speak(){
        System.out.println(name +" "+ score);
     }
}
```
# Reference, Data Structure
## The reservation model in Java
- #### We could imagine that Java memory space is just like an  array with limitation, all the defined variables are reserved in this memory space. That means Java need to separate the function space for different use. 
- #### There are two main class of memory: stack(栈), heap(堆)
- #### memory point: all the parameters inside of function are remained in stack, all the parameters outside of function are remained in heap. (方法内定义的变量全部在栈中，方法外定义的变量全部在堆中)

## Differenct assignment ways (赋值的不同方式)
- #### For basic data type -- copy value (Acutally there are two place using copy values, one is making value assignments for basic data type, another one is to assign value to function, it use copy value either. But if the parameter that itself is object, it means copy the reference, it would change the object)
- #### For object, -- copy the reference. Thus, if you assign one object to another, it means that both object has the same reference.
```Java
class Stu{
public String name;
//...
}
Stu stu1 = new Stu();
Stu stu2 = stu1;
stu2.name="Lucy";
//then both the stu1 and stu2 has the same name, for there references are the same.

```
- #### What is Reference -- It is the address of the variable.