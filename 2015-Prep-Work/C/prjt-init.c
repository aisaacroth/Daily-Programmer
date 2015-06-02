#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/stat.h>
#include "prjt-init.h"

#define MKFILE "Makefile"
#define README "README.md"

/*
 * prjt-init.c - Creates a new directory based on project name, writes a 
 * Makefile, creates a README.md, git inits the director, and creates 
 * language-specific sub-directories.
 *
 * Author: Alexander Roth
 * Date:   2015-01-06
 */
static void printUsage();
static void die(char *msg);

int main(int argc, char **argv) {
    if (argc < 2) {
        printUsage();
    }

    char *dirName = argv[1];
 
    createDir(dirName);
    
    char *rdMe = getPath(dirName, README);
    FILE *readMeFile = mkFile(rdMe);
    free(rdMe);

    writeRdMe(readMeFile, dirName);
    fclose(readMeFile);
    
    mkLangDirs(argc, argv, dirName);

    char *mkPath = getPath(dirName, MKFILE);
    FILE *makefile = mkFile(mkPath);
    free(mkPath);

    writeMakefile(makefile, dirName);

    fclose(makefile);

    printStats(dirName, argc, argv);
    return 0;
}

static void printUsage() {
    fprintf(stderr, "usage: prjt-init <Project Name> <Language 1> <Language 2>"
            " ...\n");
    exit(1);
}

static void die(char *msg) {
    perror(msg);
    exit(1);
}

void createDir(char *dirName) {
    int status = mkdir(dirName, 0755);

    if (status == -1) {
        die("Directory failed to be created.");
    }
}
 
char *getPath(char *dirName, char *fileType) {
    char *path = malloc(strlen(dirName) + 1 + strlen(fileType) + 1);
    strcpy(path, dirName);
    strcat(path, "/");
    strcat(path, fileType);
    return path;
}

void writeRdMe(FILE *rdMe, char *dirName) {
    fprintf(rdMe, "%s\n", dirName);
    fprintf(rdMe, "======\n");
}

void mkLangDirs(int argc, char **argv, char *dirName) {
    int i;
    for (i = 2; i < argc; i++) {
        char *path = malloc(strlen(dirName) + 1 + strlen(argv[i]) + 1);
        strcpy(path, dirName);
        strcat(path, "/");
        strcat(path, argv[i]);
        createDir(path);
        free(path);
    }
}

FILE *mkFile(char *path) {
    FILE *newFile = fopen(path, "w");
    if (newFile == NULL) {
        die("Error opening file.\n");
    }
    return newFile;
}

void writeMakefile(FILE *makefile, char *dirName) {
    fprintf(makefile, "# Automates the build and cleaning of the %s project\n",
            dirName);
    fprintf(makefile, "#\n");
    fprintf(makefile, "# Author:\n");
    fprintf(makefile, "# Date:\n");
    fprintf(makefile, "\n");
    fprintf(makefile, ".PHONY: clean\n");
    fprintf(makefile, "clean:\n");
    fprintf(makefile, "\trm -f *~\n");
    fprintf(makefile, "\n");
    fprintf(makefile, ".PHONY: all\n");
    fprintf(makefile, "all: clean\n");
}

void printStats(char *dirName, int argc, char **argv) {
    printf("Created project directory: %s\n", dirName);
    printf("\n");
    printf("Created language directories\n");
    printf("---------------------------\n");

    int i;
    for (i = 2; i < argc; i++) {
        printf("%s\n", argv[i]);
    }

    printf("\n");
    printf("Created README.md\n");
    printf("Created Makefile\n");
}
    

