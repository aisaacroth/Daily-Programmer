#!/usr/bin/env python3
'''
Given two strings, write a method to decide if one is a permutation of the
other.

Author: Alex Roth
Date:   2015-01-20
'''
import sys

def detect_permutation(test_string, perm_string):
    return sorted(test_string) == sorted(perm_string)


def print_arguments(args):
    print('Usage: python3 {0} <string 1> <string 2>'.format(args[0]))
    sys.exit()


if __name__ == '__main__':
    if len(sys.argv) == 3:
        if(detect_permutation(sys.argv[1], sys.argv[2])):
            print('String "{0}" is a permutation of string "{1}"'.format(
                sys.argv[1], sys.argv[2]))
    else:
        print_arguments(sys.argv)
