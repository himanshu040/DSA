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

➡️ (./string_to_int.java)  
