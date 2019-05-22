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

### ArrayList
#### The difference between ArrayList and LinkedList
- ArrayList
ArrayList：内部使用数组的形式实现了存储，实现了RandomAccess接口，利用数组的下面进行元素的访问，因此对元素的随机访问速度非常快。
因为是数组，所以ArrayList在初始化的时候，有初始大小10，插入新元素的时候，会判断是否需要扩容，扩容的步长是0.5倍原容量，扩容方式是利用数组的复制，因此有一定的开销；
另外，ArrayList在进行元素插入的时候，需要移动插入位置之后的所有元素，位置越靠前，需要位移的元素越多，开销越大，相反，插入位置越靠后的话，开销就越小了，如果在最后面进行插入，那就不需要进行位移；

- LinkedList
LinkedList：内部使用双向链表的结构实现存储，LinkedList有一个内部类作为存放元素的单元，里面有三个属性，用来存放元素本身以及前后2个单元的引用，另外LinkedList内部还有一个header属性，用来标识起始位置，LinkedList的第一个单元和最后一个单元都会指向header，因此形成了一个双向的链表结构。
LinkedList是采用双向链表实现的。所以它也具有链表的特点，每一个元素（结点）的地址不连续，通过引用找到当前结点的上一个结点和下一个结点，即插入和删除效率较高，只需要常数时间，而get和set则较为低效。
LinkedList的方法和使用和ArrayList大致相同，由于LinkedList是链表实现的，所以额外提供了在头部和尾部添加/删除元素的方法，也没有ArrayList扩容的问题了。另外，ArrayList和LinkedList都可以实现栈、队列等数据结构，但LinkedList本身实现了队列的接口，所以更推荐用LinkedList来实现队列和栈。

- In a conclusion, ArrayList is implied based on array, while LinkedList is base on doubly linked list -- a data structure that need another two info besides yourself(the reference of the element ahead of you and the reference of the element later than you). Thus, the search and update effective of Arraylist is higher, while the add and delete effective of LinkedList is highter.
[Java基础 ArrayList与LinkedList区别 - 简书](https://www.jianshu.com/p/30a8195f0b81)

### LinkedList
#### What is LinkedList structure?
- ##### Linked list is a list combined by nodes.
- ##### linked node has a linear structure.
###### The linkedList has been encapsulated in Java, but I recommend you to rebuild one by yourself for better interview performance.