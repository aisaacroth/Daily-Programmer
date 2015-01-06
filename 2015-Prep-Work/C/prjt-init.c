#include <stdio.h>
#include <stdlib.h>
#include "prjt-init.h"

/*
 * prjt-init.c - Creates a new directory based on project name, writes a Makefile,
 * creates a README.md, git inits the director, and creates language-specific 
 * sub-directories.
 *
 * Author: Alexander Roth
 * Date:   2015-01-06
 */
static void printUsage();

int main(int argc, char **argv) {
    if (argc < 2) {
        printUsage();
    }

    return 0;
}

static void printUsage() {
    fprintf(stderr, "usage: prjt-init <Project Name> <Language 1> <Language 2>"
            " ...\n");
    exit(1);
}
