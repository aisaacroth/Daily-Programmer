#!/usr/bin/env python3
'''
Implement an algorithm to determine if a string has all unique characters.

Author: Alexander Roth
Date:   2015-01-20
'''
import sys


def check_unique_str(origin_string):
    count_list = []

    for i in sorted(origin_string):

        if i in count_list:
            print('Duplicate letter "{0}" found in string "{1}"'.format(i,
                  origin_string))
            sys.exit()
        count_list.append(i)

    print('{0} contains no duplicates'.format(origin_string))


def print_arguments(args):
    print('python3 {0} <word>'.format(args[0]))
    sys.exit()


if __name__ == '__main__':
    if len(sys.argv) == 2:
        check_unique_str(sys.argv[1])
    else:
        print_arguments(sys.argv)
