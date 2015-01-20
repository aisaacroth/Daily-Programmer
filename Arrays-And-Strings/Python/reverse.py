#!/usr/bin/env python3
'''
Implement a function which reverses a string.

Author: Alex Roth
Date:   2015-01-20
'''
import sys


def reverse(string):
    return string[::-1]


def print_arguments(args):
    print('Usage: python3 {0} <string>'.format(args[0]))
    sys.exit()


if __name__ == '__main__':
    if len(sys.argv) == 2:
        print("The reversed string is {0}".format(reverse(sys.argv[1])))
    else:
        print_arguments(sys.argv)
