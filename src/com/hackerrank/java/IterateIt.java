package com.hackerrank.java;

/**
 * Created by ejangpa on 10/17/2016.
 */


/*
*
* Consider the following pseudocode, run on an array  of length :

rep := 0
while A not empty:
    B := []
    for x in A, y in A:
        if x != y: append absolute_value(x - y) to B
    A := B
    rep := rep + 1
Given the values of  and array , compute and print the final value of  after the pseudocode above terminates; if the loop will never terminate, print -1 instead.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing the respective values of .

Constraints

Output Format

Print the final value of  after the pseudocode terminates; if the loop will never terminate, print -1 instead.

Sample Input

3
1 3 4
Sample Output

4
Explanation

After the first loop, A becomes [2,3,2,1,3,1]. After the second loop, the array only contains 's and 's. After the third loop, the array only contains 's. After the fourth loop, the array is empty. Because the value of  is incremented after each loop,  at the time the loop terminates. Thus, we print 4 as our answer.

*/
public class IterateIt {

}
