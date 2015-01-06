/*
 * prjt-init.h - The header for prjt-init.c
 *
 * Author: Alexander Roth
 * Date:   2015-01-06
 */

#ifndef __PRJTINIT_H__
#define __PRJTINIT_H__

char *getPath(char *dirName, char *fileType);
void writeRdMe(FILE *rdMe, char *dirName);
void mkLangDirs(int argc, char **argv, char *dirName);
FILE *mkFile(char *path);
void writeMakefile(FILE *makefile, char *dirName);
void createDir(char *dirName);


#endif
