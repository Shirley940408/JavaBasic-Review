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
### Binary Tree Path Sum
```Java
public class Solution {
    /*
     * @param root: the root of binary tree
     * @param target: An integer
     * @return: all valid paths
     */
    private List<List<Integer>> result = new ArrayList<>();
    private int sum = 0;
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
       // write your code here
       List<Integer> path = new ArrayList<>();
    //   int sum = 0;
       if(root == null){
           return result;
       }
       path.add(root.val);
       traverse(root, path,sum + root.val, target);
       return result;
   }
   public void traverse(TreeNode root, List<Integer>path,int sum, int target){
       if(root.left == null && root.right == null){
//           path.add(root.val);
           if(sum == target){
               result.add(new ArrayList<>(path));
           }
           return;
       }
       if(root.left != null){
           sum += root.left.val;
           System.out.println(sum);
           path.add(root.left.val);
           traverse(root.left,path, sum ,target);
           path.remove(path.size()-1);
           sum -= root.left.val;
       }
       if(root.right != null){
           sum += root.right.val;
           path.add(root.right.val);
           traverse(root.right, path, sum, target);
           path.remove(path.size()-1);
           sum-= root.right.val;
       }
   }
}
```
#### 易错点：所有需要在recursive中保留的基本数据类型必须放在recursive函数内部， 如此题中的sum，为什么需要减去最后一个加入的叶子节点的值，就是因为没有直接传进函数内部，导致函数recursive之后原来的函数中的sum 已经改变了，所以需要减去，其实本题的traverse可以改写为以下写法。

```Java
public class Solution {
    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Algorithm: Traverse
        // Use recursion to traverse the tree in preorder, pass with a parameter
        // `sum` as the sum of each node from root to current node.
        // Put the whole path into result if the leaf has a sum equal to target.
        
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        ArrayList<Integer> path = new ArrayList<Integer>();
        path.add(root.val);
        helper(root, path, root.val, target, result);
        return result;
    }
    
    private void helper(TreeNode root,
                        ArrayList<Integer> path,
                        int sum,
                        int target,
                        List<List<Integer>> result) {
                            
        // meet leaf
        if (root.left == null && root.right == null) {
            if (sum == target) {
                result.add(new ArrayList<Integer>(path));
            }
            return;
        }
        
        // go left
        if (root.left != null) {
            path.add(root.left.val);
            helper(root.left, path, sum + root.left.val, target, result);
            path.remove(path.size() - 1);
        }
        
        // go right
        if (root.right != null) {
            path.add(root.right.val);
            helper(root.right, path, sum + root.right.val, target, result);
            path.remove(path.size() - 1);
        }
    }
}
```
#### 给出的总结就是，基本数据类型可以用传入函数内部的方法保留当前步骤的值，引用数据类型则必须copy value， 不然留不下有效信息。
### Binary Tree Level Sum
#### Given a binary tree and an integer which is the depth of the target level.Calculate the sum of the nodes in the target level.
```Java
/*
Example
Example 1:

Input：{1,2,3,4,5,6,7,#,#,8,#,#,#,#,9},2
Output：5 
Explanation：
     1
   /   \
  2     3
 / \   / \
4   5 6   7
   /       \
  8         9
2+3=5
Example 2:

Input：{1,2,3,4,5,6,7,#,#,8,#,#,#,#,9},3
Output：22
Explanation：
     1
   /   \
  2     3
 / \   / \
4   5 6   7
   /       \
  8         9
4+5+6+7=22
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: the root of the binary tree
     * @param level: the depth of the target level
     * @return: An integer
     */
    private int sum = 0;
    public int levelSum(TreeNode root, int level) {
        // write your code here
        traverse(root, 1, level);
        return sum;
    }
    private void traverse(TreeNode root, int depth, int level){
        if(root == null){
            return;
        }
        if(depth == level){
            sum += root.val;
        }
        traverse(root.left, depth + 1, level);
        traverse(root.right, depth + 1, level);
    }
}
```
#### 总结： 凡是遍历点的停止条件都是if(root == null){return};traverse(root.left...);traverse(root.right);需要注意需要每一步保留记录的传为局部变量防止污染。
### Binary Tree Paths
#### Given a binary tree, return all root-to-leaf paths.

```Java
/*
Example 1:

Input：{1,2,3,#,5}
Output：["1->2->5","1->3"]
Explanation：
   1
 /   \
2     3
 \
  5
Example 2:

Input：{1,2}
Output：["1->2"]
Explanation：
   1
 /   
2 
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: the root of the binary tree
     * @return: all root-to-leaf paths
     */
    private List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        String path = "";
        if (root == null){
            return result;
        }
        path += root.val;
        traverse(root, path);
        return result;
    }
    private void traverse(TreeNode root, String path){
        if(root.left == null && root.right == null){
            result.add(path);
            return;
        }
        if(root.left != null){
            traverse(root.left, path + "->" + root.left.val);
        }
        if(root.right != null){
            traverse(root.right, path + "->" + root.right.val);
        }
    }
}
```
### 总结：
#### 如果是查找路径的，套路则是在调用traverse函数之前先要把跟节点的值写入,即path += root.val，然后把这个path作为参数传入traverse函数中，同样需要注意不要造成污染。
### Invert a binary tree -- Left and right subtrees exchange.
```Java
/*
Example
Example 1:

Input: {1,3,#}
Output: {1,#,3}
Explanation:
	  1    1
	 /  =>  \
	3        3
Example 2:

Input: {1,2,3,#,#,4}
Output: {1,3,2,#,4}
Explanation: 
	
      1         1
     / \       / \
    2   3  => 3   2
       /       \
      4         4
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        TreeNode temp;
        if(root == null){
            return;
        }
        if(root.left != null || root.right != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertBinaryTree(root.left);
            invertBinaryTree(root.right);
        }
    }
}
```
### Minimum Depth of Binary Tree
#### Given a binary tree, find its minimum depth.
```Java
/*
Example 1:

Input: {}
Output: 0
Example 2:

Input:  {1,#,2,3}
Output: 3	
Explanation:
	1
	 \ 
	  2
	 /
	3    
it will be serialized {1,#,2,3}
Example 3:

Input:  {1,2,3,#,#,4,5}
Output: 2	
Explanation: 
      1
     / \ 
    2   3
       / \
      4   5  
it will be serialized {1,2,3,#,#,4,5}
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree
     * @return: An integer
     */
    private int min = 65535;
    public int minDepth(TreeNode root) {
        // write your code here
        if(root == null){
            return 0;
        }
        traverse(root, 1);
        return min;
    }
    private void traverse(TreeNode root, int depth){
        if(root.right == null && root.left == null){
            min = Math.min(min, depth);
            return;
        }
        if(root.left != null){
            traverse(root.left, depth + 1);
        }
        if(root.right != null){
            traverse(root.right, depth + 1);
        }
    }
}
```
## BFS(宽度优先搜索)
### 二叉树的宽度优先遍历：分层遍历
```Java
public class BFSByLevel {
    public void breadthFirstTraverseByLevel(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                TreeNode cur = queue.poll();
                System.out.print(cur.val + " ");
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            System.out.println();
        }
    }
}
```
#### 分层遍历跟不分层遍历的区别是分层遍历多一层循环
### 二叉树的宽度优先遍历
- 时间复杂度 O(n)
- 空间复杂度 -- 由节点最多的层的节点数决定， O(n) 

### Binary Tree Level Order Traversal
#### Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
```java
/*
Example 1:

Input：{1,2,3}
Output：[[1],[2,3]]
Explanation：
  1
 / \
2   3
it will be serialized {1,2,3}
level order traversal
Example 2:

Input：{1,#,2,3}
Output：[[1],[2],[3]]
Explanation：
1
 \
  2
 /
3
it will be serialized {1,#,2,3}
level order traversal
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue <TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> temp = new LinkedList<>();
            for(int i = 0; i < n; i++){
                TreeNode cur = queue.poll();
                temp.add(cur.val);
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
```
#### 易错点： 1.在while循环内跟for循环外面要创建一个新的Linked List，每到一个层级清空，而queue结构是一个临时存储空间，只是为了遍历到每一个节点用的。2. queue.size() 一直在变化， 必须在每次每层入队列之前取长度，否则直接作为循环条件写入出错。

## Divide and Conquer(分治)

### Same Tree
#### Check if two binary trees are identical. Identical means the two binary trees have the same structure and every identical position has the same value.

```Java
/*
Example 1:

Input:{1,2,2,4},{1,2,2,4}
Output:true
Explanation:
        1                   1
       / \                 / \
      2   2   and         2   2
     /                   /
    4                   4

are identical.
Example 2:

Input:{1,2,3,4},{1,2,3,#,4}
Output:false
Explanation:

        1                  1
       / \                / \
      2   3   and        2   3
     /                        \
    4                          4

are not identical.
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if(a == null && b == null){
            return true;
        }else if(a == null || b == null){
            return false;
        }
        
        if(a.val != b.val){
            return false;
        }
        
        return isIdentical(a.left, b.left) && isIdentical(a.right, b.right);
    }
}
```
#### 总结： 用递归来做分治的一大特点是：子问题与原问题是同一类问题

### Balanced Binary Tree
#### Given a binary tree, determine if it is height-balanced. For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than  1.

```java
/*
Example  1:
	Input: tree = {1,2,3}
	Output: true
	
	Explanation:
	This is a balanced binary tree.
		  1  
		 / \                
		2  3

	
Example  2:
	Input: tree = {3,9,20,#,#,15,7}
	Output: true
	
	Explanation:
	This is a balanced binary tree.
		  3  
		 / \                
		9  20                
		  /  \                
		 15   7 

	
Example  3:
	Input: tree = {1,#,2,3,4}
	Output: false
	
	Explanation:
	This is not a balanced tree. 
	The height of node 1's right sub-tree is 2 but left sub-tree is 0.
		  1  
		   \                
		   2                
		  /  \                
		 3   4
	
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root == null){
            return true;
        }
        if(!isBalanced(root.left)){
            return false;
        }
        if(!isBalanced(root.right)){
            return false;
        }
        
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }
    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}

```
### Given a binary tree, determine if it is a valid binary search tree (BST).
#### Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.
- A single node tree is a BST
```java
/*
Example 1:

Input:  {-1}
Output：true
Explanation：
For the following binary tree（only one node）:
	      -1
This is a binary search tree.
Example 2:

Input:  {2,1,4,#,#,3,5}
Output: true
For the following binary tree:
	  2
	 / \
	1   4
	   / \
	  3   5
This is a binary search tree.
*/
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean helper(TreeNode root, long minVal, long maxVal){
        if(root == null){
            return true;
        }
        if(root.val <= minVal || root.val >= maxVal){
            return false;
        }
        return helper(root.left, minVal, root.val) && helper(root.right, root.val, maxVal);
    }
}
```
#### 思路及总结： 思路是判断每个子节点是不是平衡树，即左子树是否小于根节点是否小于右子树，之后以此类推，利用 同时是true && true 才返回true， 只要有一个是false的话一定返回false.
#### 记忆点： 平衡树上对于每一个点来说，左子树小于其本身的值，右子树大于其本身的值。也就是说中序遍历是严格升序的。

### Convert Sorted Array to Binary Search Tree
[Leetcode-address](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
```java
/*
Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {  
        // write your code here
        return traverse(nums, 0, nums.length - 1);
    }
    private TreeNode traverse(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int num = (start + end) / 2;
        TreeNode root = new TreeNode(nums[num]);
        root.left = traverse(nums, start, num - 1);
        root.right = traverse(nums, num + 1, end);
        return root;
    }
}```

### Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
```java
//A solution rather than DFS
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
//简单的树的遍历，点i为根的树高度，等于高度最大的子树的高度+1。
```
## Sorting

#### 三大普通排序算法
- 选择排序(Selection sort)
- 冒泡排序
- 插入排序
时间复杂度为O(n^2);
空间复杂度为O(1);
### 选择排序
```java
// Java program for implementation of Selection Sort 
void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
```
### 插入排序
```java
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
```
### Bubble Sort
```java
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    }
```

### Merge Sort
#### 归并排序(merge sort) -- 分治
- 把数组均分成左右两办；
- 将左右两半分别排序(递归)
- 将两个排好序的半个数组合并
### The idea of merge
```java
class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null || B == null) {
            return null;
        }
        
        int[] result = new int[A.length + B.length];
        int i = 0, j = 0, index = 0;
        
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                result[index++] = A[i++];
            } else {
                result[index++] = B[j++];
            }
        }
        
        while (i < A.length) {
            result[index++] = A[i++];
        }
        while (j < B.length) {
            result[index++] = B[j++];
        }
        
        return result;
    }
}
```

### Merge Sort
```java
    public int[] mergeSortedArray(int[] array, int left, int right){
        int[] result = new int [right - left + 1];
        int mid = left + (right - left) / 2;
        int[] A = Arrays.copyOfRange(array, left, mid );
        int[] B = Arrays.copyOfRange(array, mid, right + 1);
        if(A == null || B == null){
            return null;
        }
        int i = 0, j = 0, index = 0;
        while(i < A.length && j < B.length){
            if(A[i] < B[j]){
                result[index++] = A[i++];
            }else{
                result[index++] = B[j++];
            }
        }
        while(i < A.length){
            result[index++] = A[i++];
        }
        while(j < B.length){
            result[index++] = B[j++];
        }
        for (int k = 0; k < right - left + 1; k++){
            array[left + k] = result[k];
        }
        return array;

    }
    public int[] mergeSort(int[] array){
        return mergeSortHelper(array, 0, array.length - 1);
    }
    private int[] mergeSortHelper(int[] array, int left, int right){
        if (left >= right){
            return null;
        }
        int mid = left + (right - left)/2;
        mergeSortHelper(array, left, mid);
        mergeSortHelper(array,mid + 1, right);
        return mergeSortedArray(array, left, right);
    }
```
#### 易错点 分中心点和merge的步骤都要在一个array里面完成，实际上是在一个array的同一个地址上面不停的改顺序，由小到大最后完成。
### QuickSort
- 选择一个pivot
- 定义两个指针从数组的头尾同时查，让左边小于pivot，右边大于pivot，然后指针向内移动，保证左指针小于等于右指针，然后如果碰到等于或超过pivot限制范围的情况停下来，等两边都停下来了交换数组中的两者位置，然后继续查,直到不满足左指针小于等于右指针
- 此时已经出现了左边数组小于右边数组的情况，注意此时一定是右指针在前，越过了做指针，然后递归剩余的数组，也就是说原有的右指针成为了左边数组的右边界，原有的做指针成为了右边数组的左边界
```Java
public class QuickSort {
    public void quickSort(int[] array){
        quickSortHelper(array, 0, array.length - 1);
    }
    public void swap(int[] array,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    private void quickSortHelper(int[] array, int left, int right){
        if(left >=right ){
            return;
        }
        int i = left, j = right;
        int pivot = array[left + (right - left) / 2];
        while( i <= j ){
            while( i <= j && array[i] < pivot){
                ++i;
            }
            while( i <= j && array[j] > pivot){
                --j;
            }
            if(i <= j){
                swap(array, i++, j--);
                //注意这一步是先传参再执行++，——
                //完成执行之后的j<=i,所以有后面的left到j, right到i
            }
        }
        quickSortHelper(array, left, j);
        quickSortHelper(array, i, right);
    }
}
```
### How to write a testcase
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestCase {
    public void testQuickSort(){
        int len = 100;
        int[] array = new int[len];
        Random random = new Random();
        Map<Integer, Integer> freq = new HashMap<>();
        int number;
        for(int i = 0; i < len; ++i){
            number = random.nextInt();
            array[i] = number;
            if(freq.containsKey(number)){
                freq.put(number, freq.get(number) + 1);
            }else{
                freq.put(number, 1);
            }
        }
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array);

        Map<Integer, Integer> newFreq = new HashMap();
        for(int i = 0; i < len; ++i){
             number = array[i];

             if(newFreq.containsKey(number)){
                 newFreq.put(number, freq.get(number) + 1);
             }else{
                 newFreq.put(number, 1);
             }
        }
        //比较元素是否数量一致
        if(!freq.equals(newFreq)){
            System.out.println("Failed");
            return;
        }
        //比较是否是有序的
        //两者都通过则为正确，否则错误
        for (int i = 1; i < array.length; i++){
            if(array[i] > array [i-1]){
                System.out.println("Success");
            }else{
                System.out.println("Failed");
            }
        }
    }
}
```
Assignment：
1.[LintCode 领扣](https://www.lintcode.com/problem/reverse-pairs/description)

利用归并排序的思想求逆序对，复杂度O(nlogn)
当然也可以用树状数组或者线段树求解
```java
public class Solution {
    /**
     * @param A an array
     * @return total of reverse pairs
     */
    public long reversePairs(int[] A) {
        return mergeSort(A, 0, A.length - 1);
    }
    
    private int mergeSort(int[] A, int start, int end) {
        if (start >= end) {
            return 0;
        }
        
        int mid = (start + end) / 2;
        int sum = 0;
        sum += mergeSort(A, start, mid);
        sum += mergeSort(A, mid+1, end);
        sum += merge(A, start, mid, end);
        return sum;
    }
    
    private int merge(int[] A, int start, int mid, int end) {
        int[] temp = new int[A.length];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int index = start;
        int sum = 0;
        
        while (leftIndex <= mid && rightIndex <= end) {
            if (A[leftIndex] <= A[rightIndex]) {
                temp[index++] = A[leftIndex++];
            } else {
                temp[index++] = A[rightIndex++];
                sum += mid - leftIndex + 1;
            }
        }
        while (leftIndex <= mid) {
            temp[index++] = A[leftIndex++];
        }
        while (rightIndex <= end) {
            temp[index++] = A[rightIndex++];
        }
        
        for (int i = start; i <= end; i++) {
            A[i] = temp[i];
        }
        
        return sum;
    }
}
```
2.https://www.jiuzhang.com/solution/insertion-sort-list

与数组普通插入排序一样的做法。

```java
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        // 这个dummy的作用是，把head开头的链表一个个的插入到dummy开头的链表里
        // 所以这里不需要dummy.next = head;

        while (head != null) {
            ListNode node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }

        return dummy.next;
    }
}
```
3.https://www.lintcode.com/problem/sort-integers-ii/description

快速排序实现

```java
public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers2(int[] A) {
        quickSort(A, 0, A.length - 1);
    }
    
    private void quickSort(int[] A, int start, int end) {
        if (start >= end) {
            return;
        }
        
        int left = start, right = end;
        // key point 1: pivot is the value, not the index
        int pivot = A[(start + end) / 2];

        // key point 2: every time you compare left & right, it should be 
        // left <= right not left < right
        while (left <= right) {
            while (left <= right && A[left] < pivot) {
                left++;
            }
            while (left <= right && A[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                
                left++;
                right--;
            }
        }
        
        quickSort(A, start, right);
        quickSort(A, left, end);
    }
}
```
4. https://www.jiuzhang.com/solution/partition-array


快速选择算法
```java
public class Solution {
    /** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int left = 0, right = nums.length - 1;
        while (left <= right) {

            while (left <= right && nums[left] < k) {
                left++;
            }

            while (left <= right && nums[right] >= k) {
                right--;
            }

            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;
                right--;
            }
        }
        return left;
    }
}
```
5.https://www.jiuzhang.com/solution/sort-list


Sort a linked list in O(n log n) time using constant space complexity.


详细题解请见九章算法微博: http://weibo.com/3948019741/ByB4LtgnG
快速排序算法可以在链表中使用
```java
// version 1: Merge Sort
public class Solution {            
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }    

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMiddle(head);

        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);

        return merge(left, right);
    }
}

// version 2: Quick Sort 1
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = findMedian(head); // O(n)
        
        ListNode leftDummy = new ListNode(0), leftTail = leftDummy;
        ListNode rightDummy = new ListNode(0), rightTail = rightDummy;
        ListNode middleDummy = new ListNode(0), middleTail = middleDummy;
        while (head != null) {
            if (head.val < mid.val) {
                leftTail.next = head;
                leftTail = head;
            } else if (head.val > mid.val) {
                rightTail.next = head;
                rightTail = head;
            } else {
                middleTail.next = head;
                middleTail = head;
            }
            head = head.next;
        }
        
        leftTail.next = null;
        middleTail.next = null;
        rightTail.next = null;
        
        ListNode left = sortList(leftDummy.next);
        ListNode right = sortList(rightDummy.next);
        
        return concat(left, middleDummy.next, right);
    }
    
    private ListNode findMedian(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    private ListNode concat(ListNode left, ListNode middle, ListNode right) {
        ListNode dummy = new ListNode(0), tail = dummy;
        
        tail.next = left; tail = getTail(tail);
        tail.next = middle; tail = getTail(tail);
        tail.next = right; tail = getTail(tail);
        return dummy.next;
    }
    
    private ListNode getTail(ListNode head) {
        if (head == null) {
           return null;
        } 
       
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}

// version 3: Quick Sort 2
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
class Pair {
    public ListNode first, second; 
    public Pair(ListNode first, ListNode second) {
        this.first = first;
        this.second = second;
    }
}

public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = findMedian(head); // O(n)
        Pair pair = partition(head, mid.val); // O(n)
        
        ListNode left = sortList(pair.first);
        ListNode right = sortList(pair.second);
        
        getTail(left).next = right; // O(n)
        
        return left;
    }
    
    // 1->2->3 return 2
    // 1->2 return 1
    private ListNode findMedian(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // < value in the left, > value in the right
    private Pair partition(ListNode head, int value) {
        ListNode leftDummy = new ListNode(0), leftTail = leftDummy;
        ListNode rightDummy = new ListNode(0), rightTail = rightDummy;
        ListNode equalDummy = new ListNode(0), equalTail = equalDummy;
        while (head != null) {
            if (head.val < value) {
                leftTail.next = head;
                leftTail = head;
            } else if (head.val > value) {
                rightTail.next = head;
                rightTail = head;
            } else {
                equalTail.next = head;
                equalTail = head;
            }
            head = head.next;
        }
        
        leftTail.next = null;
        rightTail.next = null;
        equalTail.next = null;
        
        if (leftDummy.next == null && rightDummy.next == null) {
            ListNode mid = findMedian(equalDummy.next);
            leftDummy.next = equalDummy.next;
            rightDummy.next = mid.next;
            mid.next = null;
        } else if (leftDummy.next == null) {
            leftTail.next = equalDummy.next;
        } else {
            rightTail.next = equalDummy.next;
        }
        
        return new Pair(leftDummy.next, rightDummy.next);
    }
    
    private ListNode getTail(ListNode head) {
        if (head == null) {
           return null;
        } 
       
        while (head.next != null) {
            head = head.next;
        }
        return head;
    }
}
```
6. https://www.jiuzhang.com/solution/kth-largest-element
在数组中找到第 k 大的元素。
```java
//九章算法强化班里讲过的标准 Parition 模板。
class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length){
            return -1;
        }
        return partition(nums, 0, nums.length - 1, nums.length - k);
    }
    
    private int partition(int[] nums, int start, int end, int k) {
        if (start >= end) {
            return nums[k];
        }
        
        int left = start, right = end;
        int pivot = nums[(start + end) / 2];
        
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
        
        if (k <= right) {
            return partition(nums, start, right, k);
        }
        if (k >= left) {
            return partition(nums, left, end, k);
        }
        return nums[k];
    }    
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
};
//标准的 Quick Select 算法
class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {

        // write your code here
        int low = 0, high = nums.length -1;
        while(low <= high){
            int index = low-1;
            for(int i = low; i < high; i++){
                if(nums[i] > nums[high]){
                    swap(nums, i, ++index);
                }
            }
            swap(nums, ++index, high);
            if(index == k - 1){
                return nums[index];
            }
            if(index < k -1){
                low = index + 1;
            }else{
                high = index - 1;
            }
        }
        return -1;
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
};```