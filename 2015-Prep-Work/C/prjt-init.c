#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
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

    char *dirName = argv[1];
    int status;
    status = mkdir(dirName, 0755);

    int i;
    for (i = 2; i < argc; i++) {
        printf("%s\n", argv[i]);
    }

    return 0;
}

static void printUsage() {
    fprintf(stderr, "usage: prjt-init <Project Name> <Language 1> <Language 2>"
            " ...\n");
    exit(1);
}
