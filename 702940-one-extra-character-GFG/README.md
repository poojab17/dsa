# [One Extra Character](https://www.geeksforgeeks.org/problems/one-extra-character/1?page=3&category=Java&sortBy=submissions)
## Easy
Given two strings s1 and s2, both containing the same set of characters in any order, except that one of the strings contains exactly one extra character, find and return the extra character. The characters may appear multiple times, and the order of characters in the strings is not necessarily the same.
Examples:
Input: s1 = "abba", s2 = "baxab"
Output: 'x'
Explanation: Both strings contain the characters a, b, b, and a. String s2 has one additional character x.
Input: s1 = "aaaa", s2 = "aaa"
Output: 'a'
Explanation: Both strings contain the character 'a', but s1 contains it four times while s2 contains it three times. Therefore, the extra character is 'a'.
Constraints:1 ≤ |s1|, |s2| ≤ 103| |s1| - |s2| | = 1Both strings contain only lowercase English letters (a-z).