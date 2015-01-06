#
#
# Author: Alexander Roth
# Date:   2015-01-06

CC = gcc
CFLAGS = -g -Wall
LDFLAGS = -g

prjt-init: prjt-init.o
	$(CC) $(LDFLAGS) prjt-init.o -o prjt-init

prjt-init.o: prjt-init.c prjt-init.h
	$(CC) -c $(CFLAGS) prjt-init.c

.PHONY: clean
clean:
	rm -f *.o *~ a.out prjt-init

.PHONY: all
all: clean prjt-init
