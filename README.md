# DSA

Roman to Integer — Java Solution

Date: 10/05/2025

📘 Problem Statement

Seven symbols represent Roman numerals:

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numerals, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Solution: Understand that Roman numerals are generally written in descending order of value, and their values are added.
File: [**roman_to_int.java**](./roman_to_int.java)




🔢 String to Integer (atoi) — Java Solution

Date: 10/06/2025

📘 Problem Statement

Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

🧠 Algorithm Steps

Whitespace: Ignore any leading whitespace (" ").

Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positive if neither is present.

Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached.

If no digits were read, return 0.

Rounding: Clamp the value within the 32-bit signed integer range [-2³¹, 2³¹ - 1].

If the number is less than -2³¹, return -2³¹.

If the number is greater than 2³¹ - 1, return 2³¹ - 1.

Return: Output the final integer result.

💡 Solution Approach

Iterate through the string once, handling whitespace, sign, digits, and overflow checks in a single pass.

Use a long or double variable during conversion to detect overflow before final clamping.

📂 File

➡️ [**string_to_int.java**](./string_to_int.java)  





🔢 Implement Stack using Queues — Java Solution

Date: 10/07/2025

📘 Problem Statement

Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:

You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

Example 1:

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False

🧠 Algorithm Steps

__init__ Method:

Initialize a new instance of the MyStack class.
Create an empty deque named q to store the stack elements.
push Method:

Accept an integer x as input.
Append the input integer x to the right end of the deque q.
Loop for the number of times equal to the length of the deque minus one (length - 1).
In each iteration, remove an element from the left end of the deque (popleft) and immediately append it back to the right end.
This loop ensures that the last added element is at the front of the deque, simulating the behavior of a stack.
pop Method:

Remove and return the element from the left end of the deque q.
This operation effectively mimics the behavior of popping an element off the stack.
top Method:

Return the element at the left end of the deque q without removing it.
This operation provides the top element of the stack without altering the stack itself.
empty Method:

Check if the length of the deque q is equal to 0.
If the length is 0, the stack is empty, so return True; otherwise, return False.

📂 File

➡️ [**stack_using_queue.java**](./stack_using_queue.java)  







🔢 Implement Queue using Stacks — Java Solution

Date: 10/08/2025

📘 Problem Statement

Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
Notes:

You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 

Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false

🧠 Algorithm Steps

Initialization:

self.input and self.output are two stacks represented as lists.
Push Operation:

Simply append the element to the input stack. This operation is O(1).
Pop Operation:

If the output stack is empty, call peek() to transfer elements from input to output.
Pop the top element from the output stack. This operation is amortized O(1).
Peek Operation:

If the output stack is empty, transfer all elements from input to output.
Return the top element of the output stack. This operation is amortized O(1).
Empty Operation:

Return True if both stacks are empty. This operation is O(1).


📂 File

➡️ [**queue_using_stack.java**](./queue_using_stack.java)  


