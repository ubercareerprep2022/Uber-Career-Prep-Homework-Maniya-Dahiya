# Author: Maniya Dahiya


# PROBLEM 1: isStringPermutation()

'''
Implement the function isStringPermutation() that takes two Strings as parameters and returns a 
Boolean denoting whether the first string is a permutation of the second string.

isStringPermutation(s1: “asdf”, s2: “fsda”) == true
isStringPermutation(s1: “asdf”, s2: “fsa”) == false
isStringPermutation(s1: “asdf”, s2: “fsax”) == false

Assumption: It is case-sensitive, but does care about white space.

'''

# Time Complexity: O(nlogn)
# Space complexity: O(1)


def isStringPermutation(s1: str, s2: str) -> bool:
    if (len(s2) != len(s1)):                            # O(1) (best case)
        return False
    return sorted(s1) == sorted(s2)                     # sorted() is an implementation of Tim Sort


'''
Test Cases to check the code (through examples provided in the solution)
'''
print(isStringPermutation("asdf", "fsda") == True)
print(isStringPermutation("asdf", "fsa") == False)
print(isStringPermutation("asdf", "fsax") == False)

'''
Additional test cases with more edge cases
'''
print(isStringPermutation("asdf", "fsda") == True)
print(isStringPermutation("el", "apple") == False)
print(isStringPermutation("asdf", "") == False)
print(isStringPermutation("", "fsda") == False)
print(isStringPermutation("", "") == True)
print(isStringPermutation("joifduewnq pdioqedunsqdiuqowdu",
      "qpdqdfduioqeowdudunsewiuq join") == True)




'''
(ง ͠° ͟ل͜ ͡°)ง
'''


# PROBLEM 2: pairsThatEqualSum()

'''
Implement the function pairsThatEqualSum() that takes an array of integers and a target 
integer and returns an array of pairs (i.e., an array of tuples) where each pair contains two numbers 
from the input array and the sum of each pair equals the target integer. (Order of the output does not matter).

Examples:
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 5) == [(1, 4), (2, 3)]
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 1) == []
pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 7) == [(2, 5), (3, 4)]

Assumption: if a number can pair with itself to give the target sum/

'''


# Time complexity: O(n)
# Space Complexity: O(n)

def pairsThatEqualSum(inputArray: list, targetSum: int) -> list:
    inputArraySet = set(inputArray)                             # converting list to a set: O(n)
    resultList = []
    for value in inputArray:                                    # Traversing: O(n)
        complementVal = targetSum - value
        if complementVal in inputArraySet:
            resultList.append((value, complementVal))           # appending a list: O(1)
        inputArraySet.remove(value)                             # removing from set: O(1)

    return resultList


'''
Test Cases to check the code (through examples provided in the solution)
'''
print(pairsThatEqualSum([1, 2, 3, 4, 5], 5) == [(1, 4), (2, 3)])
print(pairsThatEqualSum([1, 2, 3, 4, 5], 1) == [])
print(pairsThatEqualSum([1, 2, 3, 4, 5], 7) == [(2, 5), (3, 4)])

'''
Additional test cases
'''
print(pairsThatEqualSum([1, 2, 3, 4, 5], 0) == [])
print(pairsThatEqualSum([1, 2, 3, 4, 5], -1) == [])
print(pairsThatEqualSum([1, 2, 3, 4, 5], 8) == [(3, 5), (4, 4)])
print(pairsThatEqualSum([], 10) == [])
print(pairsThatEqualSum([2], 4) == [(2, 2)])
print(pairsThatEqualSum([10], 20) == [(10, 10)])
