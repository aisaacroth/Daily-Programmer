ISBN-Validator
======
###Author: /u/professorlamp####

##Description##
ISBN's (International Standard Book Numbers) are identifiers for books. Given
the correct sequence of digits, one book can be identified out of millions of
others thanks to this ISBN. But when is an ISBN not just a random slurry of
digits? That's for you to find out

##Rules##
GIven the following constraints of the ISBN number, you sould write a function
that can return `True` if a number is a valid ISBN and `False` otherwise.

An ISBN is a ten digit code which identifies a book. The first nine digist
represent the book and the last digit is used to make sure the ISBN is correct.

To verify an ISBN you:

- Obtain the sum of 10 times the first digit, 9 times the second digit, 8 times
the third digit... all the way till you add 1 times the last digit. If the sum
leaves no remainder when divided by 11 the code is a valid ISBN.

For example:
`0-7475-3269-9` is valid because
`(10 * 0) + (9 * 7) + (8 * 4) + (7 * 7) + (6 * 5) + (5 * 3) + (4 * 2) + (3 * 6)
+ (2 * 9) + (1 * 9) = 242` which can be dived by 11 and have no remaineder.

For the cases where the last digit has to eqaul to ten, the last digit is
written as X. For example `156881111X`.

##Bonus##
Write an ISBN generator. That is, a program that wil output a valid ISBN number
(bonus if you output an ISBN that is already in use)

##Finally##
Thanks to /u/TopLOL for the submission!
