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
```Java
public class LinkedList {
    public static void runLinkedList(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        
        ListNode cur =node1;
        while (cur !=null){
            System.out.print(cur.val +" ");
            cur = cur.next;
        }
    }
    public static void main(String[] args){
        runLinkedList();
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
```
### custom java

```Java
public class MyLinkedList {
    private ListNode head;
    //create
    public void add(int location, int value){
        if(location > 0){
            ListNode pre = head;
            for(int i = 0; i < location -1; i++){
                pre = pre.next;
            }
            ListNode newNode = new ListNode(value);
            newNode.next = pre.next;
            pre.next = newNode;
        }else{
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
        }
    }

    //read
    public int get(int location){
        ListNode cur = head;
        for(int i = 0; i < location; i++){
            cur = cur.next;
        }
        return cur.val;
    }

    //update
    public void set(int location, int value){
        ListNode cur = head;
        for(int i = 0; i < location; i++){
            cur = cur.next;
        }
        cur.val = value;
    }


    //delete
    public int remove(int location){
        ListNode res = null;
        if(location > 0){
            ListNode pre = head;
            for(int i = 0; i < location -1; i++) {
                pre = pre.next;
            }
            res = pre.next;
            pre.next = pre.next.next;
        }else{
            head = head.next;
        }
        return res.val;
    }
}

```
#### MyLinkedList -- LinkedList的优化
- 引入dummy节点：让dummy节点作为整个linkedList的开始节点(实际上是节点的-1位置), 这时在add 跟 delete 中不需要分位置，所有的位置都是向中间插入节点，而在get跟set的位置直接把开始遍历的头节点设置为dummy.next, 此时代码更加简洁
```Java
public class MyLinkedList {
    private ListNode dummy = new ListNode(-1);
    //create
    public void add(int location, int value){

        ListNode pre = dummy;
        for(int i = 0; i < location; i++){
            pre = pre.next;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = pre.next;
        pre.next = newNode;

    }

    //read
    public int get(int location){
        ListNode cur = dummy.next;
        for(int i = 0; i < location; i++){
            cur = cur.next;
        }
        return cur.val;
    }

    //update
    public void set(int location, int value){
        ListNode cur = dummy.next;
        for(int i = 0; i < location; i++){
            cur = cur.next;
        }
        cur.val = value;
    }


    //delete
    public int remove(int location){
        ListNode res = null;
        ListNode pre = dummy;
        for(int i = 0; i < location; i++) {
            pre = pre.next;
        }
        res = pre.next;
        pre.next = pre.next.next;
        return res.val;
    }
}
```
### 什么是 Interface
###### Java接口(Interface)是一系列方法的声明，是一些方法特征的集合，一个接口只有方法的特征没有方法的实现，因此这些方法可以在不同的地方被不同的类实现，而这些实现可以具有不同的行为。打一个比方，接口好比一个戏中的角色，这个角色有一些特定的属性和操作，然后实现接口的类就好比扮演这个角色的人，一个角色可以由不同的人来扮演，而不同的演员之间除了扮演一个共同的角色之外，并不要求其它的共同之处。

### 有哪些面试常用的Interface
- ##### Set: 无重复数据
Hashset
```Java
  Set<String> set = new HashSet<>();
  System.out.println();
  for(int i = 0; i < 6; i++){
      set.add(i + " ");
  }
  set.add(null + " ");
  set.add(1 + " ");
  for(Iterator i = set.iterator(); i.hasNext();){
      System.out.print(i.next());
//0 5 4 3 null 2 1 数据输出无序，可以加入空值, 不能加入重复元素
  }
```
TreeSet
```Java
  Set<String> set = new TreeSet<>();
  for (int i = 1; i < 6; i ++) {
    set.add(i + "");
  }
  set.add("1"); //不会重复写入数据
  //set.add(null);//不可以写入空数据
  Iterator<String> iter = set.iterator();
  while (iter.hasNext()) {
    system.out.print(iter.next() + " ");//数据有序
  }// 输出(有序)为 1 2 3 4 5
```
- ##### Map: key,value映射关系, key 不能重复，value可以重复
HashMap
```Java
public class Solution {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();
        for (int i = 5; i > 0; i --) {
            map.put(i + "", i + "");
        }
        map.put("1","1");//key无重复
        map.put("11","1");//value可以重复
        map.put(null, null);//可以为空
        for (Iterator i = map.keySet().iterator(); i.hasNext(); ) {
            String key = (String)i.next();
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
//输出
/*
key = 11, value = 1
key = null, value = null
key = 1, value = 1
key = 2, value = 2
key = 3, value = 3
key = 4, value = 4
key = 5, value = 5
*/
//输出顺序与输入顺序无关

```
TreeMap
```Java
        Map<String, String> map = new TreeMap<>();
        for (int i = 5; i > 0; i --) {
            map.put(i + "", i + "");
        }
        map.put("1","1");//key无重复
        map.put("11","1");//value可以重复
        //map.put(null, null);//不可以为空
        for (Iterator i = map.keySet().iterator(); i.hasNext(); ) {
            String key = (String)i.next();
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
```
- ##### List：元素有序，可以重复, 可以为空
一个 List 是一个元素有序的、可以重复(这一点与Set和Map不同)、可以为 null 的集合，List的实现类在面试中常用是：LinkedList 和 ArrayList
- LinkedList -- 基于链表实现
- ArrayList -- 基于动态数组实现
- LinkedList 与 ArrayList 对比：
> 对于随机访问get和set，ArrayList绝对优于LinkedList，因为LinkedList要移动指针
> 对于新增和删除操作add和remove，LinedList比较占优势，因为ArrayList要移动数据

### Queue
队列是一种比较重要的数据结构，它支持FIFO(First in First out)，即尾部添加、头部删除（先进队列的元素先出队列），跟我们生活中的排队类似。
- ##### PriorityQueue
>基于堆(heap)实现
>非FIFO(最先出队列的是优先级最高的元素)
- ##### LinkedList
>基于链表实现
>FIFO

### Algorithm
#### 1. Reverse Linked List
```Java
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode pre = null;
        ListNode temp;
        while(head != null){
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
```
##### Remember to traverse all the LinkedList from head, if your are using a dummy point, then from dummy.next.
#### 2.Merge Two Sorted Lists
##### Merge two sorted (ascending) linked lists and return it as a new sorted list. The new sorted list should be made by splicing together the nodes of the two lists and sorted in ascending order.
```Java
/*
Example 1:
	Input: list1 = null, list2 = 0->3->3->null
	Output: 0->3->3->null


Example 2:
	Input:  list1 =  1->3->8->11->15->null, list2 = 2->null
	Output: 1->2->3->8->11->15->null
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        ListNode lastNode = dummy;
        
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                lastNode.next = l1;
                l1 = l1.next;
            }else{
                lastNode.next = l2;
                l2 = l2.next; 
            }
            lastNode = lastNode.next;
        }
        if(l1 != null){
            lastNode.next = l1;
        }else{
            lastNode.next = l2;
        }
        
    return dummy.next;    
    }
}
```
#### 3.Remove Linked List Elements
##### Remove all elements from a linked list of integers that have value val.
```Java
/*
Example 1:

Input: head = 1->2->3->3->4->5->3->null, val = 3
Output: 1->2->4->5->null
Example 2:

Input: head = 1->1->null, val = 1
Output: null
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: a ListNode
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode lastNode = dummy;
        while(lastNode.next != null){
            if(lastNode.next.val == val){
                lastNode.next = lastNode.next.next;
            }else{
                lastNode = lastNode.next; 
            }
        }
        return dummy.next;
    }
}
```
#### 4. Insert Node in Sorted Linked List
```Java
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        ListNode newNode = new ListNode(val);
        dummy.next = head;
        ListNode lastNode = dummy;
        while(lastNode.next != null && lastNode.next.val <= val){
            lastNode = lastNode.next;
        }
        newNode.next = lastNode.next;
        lastNode.next = newNode;
        return dummy.next;
        
    }
}
```
##### Remember how to insert a node into a linkedList
1. newNode.next = preNode.next.next;
// It is not newNode = preNode.next.next -- **wrong way**
3. preNode.next = newNode;
## Stack
- push
- pop
- peek(getTop)
- isEnmpty
 ## Custom Stack with LinkedList
 ```Java
import java.util.NoSuchElementException;
public class MyStack {
    private ListNode head;
    public void push(int value){
        ListNode newhead = new ListNode(value);
        newhead.next = head;
        head = newhead;
    }
    public int pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int ret = head.val;
        head = head.next;
        return ret;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return head.val;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void clear(){
        head = null;
    }
}
 ```
 #### By the way, Java has the encapsulated Stack
 ```Java
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(-3);
        stack.push(0);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
 ```
 #### 函数中的函数调用本身就是栈的数据结构，先进入的后弹出（先执行的后返回）
  ### Custom a Queue with LinkedList
 ```Java
import java.util.NoSuchElementException;

public class MyQueueBasedLinkedList {
    private ListNode head;
    private ListNode tail;

    public boolean isEmpty(){
        return head == null;
    }
    public void clear(){
        head = tail = null;
    }
    public int poll(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            int value = head.val;
            head = head.next;
            if(head == null){
                tail = null;
            }
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else{
            return head.val;
        }
    }
    public void offer(int val){
        if(tail == null){
            head = tail = new ListNode(val);
        }else{
            tail.next = new ListNode(val);
            tail = tail.next;
        }
    }
}
 ```
 #### Some Fundamental Points
 
1. To start a queue, you need not only the head point, but also the tail for the insert function for better time complexity (O(n)).
 
2. For poll() function, once the last element has been polled to the queue, it could cause the head turn to tail's next, which could cause error for next operations. Thus, we need if(head == null){ tail = null };

#### Java has encapsulated queue
```Java
  Queue<Integer> que = new LinkedList<>();
  que.offer(10);
  que.offer(20);
  que.offer(-3);
  que.offer(0);

  while (!que.isEmpty()){
      System.out.print(que.peek() + " ");
      que.poll();
  }
```
### Set details -- 集合中存储非重复的无序数据
- insert(插入)
- find(查找)
- delete(删除)

#### HashSet -- 基于平衡树 O(logN)
#### TreeSet -- O(1)

### List details -- 可以重复，无序

### Index(索引) -- key-value pairs
### Set details -- 集合中存储非重复的无序数据
- insert(插入)
- find(查找)
- delete(删除)

#### HashSet -- 基于平衡树 O(logN)
#### TreeSet -- O(1)

### List details -- 可以重复，无序

### Index(索引) -- 无序 key-value pairs -- key不可重复，value可以重复

### Algorithm
#### 1. Implement Queue by Two Stacks

```Java
public class MyQueue {
    Stack<Integer> stack1 ;
    Stack<Integer> stack2 ;
    public MyQueue() {
        // do intialization if necessary
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.pop();   
        }else{
            throw new NoSuchElementException();
        }
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
            }
        }
        if(!stack2.isEmpty()){
            return stack2.peek();
        }else{
            throw new NoSuchElementException();
        }
    }
}
```
#### 易错点：
1.while循环容易写成(!stack1.isEmpty()&& stack2.isEmpty()){stack2.push(stack1.pop())};但是这样会导致连续push 两个数，第二个数由于stack1和stack2都不空，所以push不进stack2然后出错。 所以!stack1.isEmpty()跟stack2.isEmpty()必须写在两个判断条件里面
2.if跟while在理论上谁在外面都行，但是如果while在外面(见下图)，会导致每循环一次都需要判断一次if, 效率降低。所以应该改为if在外层。
3.由于这个if-while组合在pop()跟top()中都要用，改为一个内置private函数更为合适
```Java
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
            }
        }
        /*not effective way
        while(!stack1.isEmpty()){
            if(stack2.isEmpty()){
            stack2.push(stack1.pop());
            }
        }
        */
        
```
### 2.Valid Parentheses
#### Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
```Java
public class Solution {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    private Stack<Character> leftParenthese = new Stack<>();
    public boolean isValidParentheses(String s) {
        // write your code here
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '('||s.charAt(i) == '{'||s.charAt(i) == '['){
                leftParenthese.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(leftParenthese.isEmpty()||leftParenthese.pop() != '(')
                return false;
            }
            if(s.charAt(i) == '}'){
                if(leftParenthese.isEmpty()||leftParenthese.pop() != '{')
                return false;
            }
            if(s.charAt(i) == ']'){
                if(leftParenthese.isEmpty()||leftParenthese.pop() != '[')
                return false;
            }
        }
        return leftParenthese.isEmpty();
    }
}
```
#### 思路：借用stack的数据结构的优势，无论是"{[()]}"还是"(){}[]",合格的括号组合必须对称，不会出现不同组合交错的情况，比如"{(})",所以要借用stack的数据结构，所有左括号的情况入栈，所有右括号的情况出栈，如果不是对应的左括号则返回false.要注意的情况是最后要查看是否是空栈，如果不是也是false，比如这种情况"({"自然也不是合格的括号。
### 2.Implement Stack by Two Queues
```Java
public class Stack {
    /*
     * @param x: An integer
     * @return: nothing
     */
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    private void moveElements(){
        while(queue1.size() > 1){
            queue2.offer(queue1.peek());
            queue1.poll();
        }
    } 
    private void swapQueues(){
        Queue<Integer> temp;
        temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }
    public void push(int x) {
        // write your code here
        queue1.offer(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        // write your code here
        moveElements();
        int element = queue1.poll();
        swapQueues();
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        moveElements();
        int element = queue1.poll();
        // queue1 = queue2;
        // queue2 = new LinkedList<>();
        swapQueues();
        queue1.offer(element);
        return element;
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        // write your code here
        return queue1.size() == 0;
    }
}
```
#### 易错点: 很容易忘记在top（）中执行完取回最后一个元素的情况忘记把这个元素推回去，造成错误
开始写的时候在top()跟pop()直接把queue2重新赋值为空linkedlist，但是这会造成存储空间的浪费。所以交换两者的值更好
```Java
    public int top() {
        // write your code here
        moveElements();
        int element = queue1.poll();
        // queue1 = queue2;
        // queue2 = new LinkedList<>();
        swapQueues();
        queue1.offer(element);//Easily being forgotten!
        return element;
    }
```
### 5. Min Stack
```java
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        stack.push(number);
        if (minStack.empty() == true)
            minStack.push(number);
        else if (minStack.peek() >= number) // 这里考虑的相等的情况也会继续push
            minStack.push(number);
    }

    public int pop() {
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        return stack.pop();
    }

    public int min() {
        return minStack.peek();
    }
}```
### 思路及易错点：
让minStack push当前最小的数，保持一定是最小的数在上面
当需要弹出时， 比较当前的数和stack中的数的大小是否相等，相等则一起弹出
在这里很容易忽略如果minstack顶层数的大小跟入stack相等的情况，这里一定要进minstack, 否则会导致 min() 中不同时期进入元素有可能判为equal导致出错

## (Recursive) traverse tree
### 深度优先遍历时间复杂度(DFS)
- 函数会执行 2n+1 次
- 算法的时间复杂度为O(n)
- 空间复杂度在 [O(logn), O(n)]]之间
### Binary Tree Leaf Sum
```Java
public class Solution {
    /**
     * @param root: the root of the binary tree
     * @return: An integer
     */
    private int sum = 0;  
    public int leafSum(TreeNode root) {
        // write your code here
        traverse(root);
        return sum;
    }
    private void traverse(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            sum += root.val;
            // return;
        }
        traverse(root.left);
        traverse(root.right);
    }
}
```
### Maximum Depth of Binary Tree
```Java
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    private int height = 0;
    public int maxDepth(TreeNode root) {
        // write your code here
        helper(root, 1);
        return height;
    }
    private void helper(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(height < depth){
            height = depth;
        }
        helper(root.left, depth +1);
        helper(root.right, depth +1);
    }
}