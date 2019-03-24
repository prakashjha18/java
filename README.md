# java
# Find All Anagrams in a String

Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

```
Input:

s: "cbaebabacd" p: "abc"

Output:

[0, 6]

Explanation:

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".


```

Example 2:

```

Input:

s: "abab" p: "ab"

Output:

[0, 1, 2]

Explanation:

The substring with start index = 0 is "ab", which is an anagram of "ab".

The substring with start index = 1 is "ba", which is an anagram of "ab".

The substring with start index = 2 is "ab", which is an anagram of "ab".

```

## Solution
https://github.com/prakashjha18/java/blob/master/anagramsub.java

# convert dd/mm/yyyy to weekday
```
Input:
08 05 2015
Output:
WEDNESDAY
```
## Solution
https://github.com/prakashjha18/java/blob/master/Datetime.java

# Java Substring Comparisons
Sample Input 
```
welcometojava
3
```
Sample Output 
```
ava
wel
```
explanation 
```
String S= 'welcometojava' has the following lexicographically-ordered substrings of length :k=3

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
```
## Solution
https://github.com/prakashjha18/java/blob/master/Strcomp.java

# Java Regex
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
```
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
```
Some valid IP address:
```
000.12.12.034
121.234.12.12
23.45.12.56
```
Some invalid IP address:
```
000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip
```
In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String . The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)

Sample Input
```
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
```
Sample Output
```
true
true
true
false
false
false
```
## Solution
https://github.com/prakashjha18/java/blob/master/regexip.java

# Java String Token

Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format
```
A single string, .
```
Output Format
```
On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
```
Sample Input
```
He is a very very good boy, isn't he?
```
Sample Output
```
10
He
is
a
very
very
good
boy
isn
t
he
```
Explanation
```
We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .
```
## Solution
https://github.com/prakashjha18/java/blob/master/stringtoken.java
```
