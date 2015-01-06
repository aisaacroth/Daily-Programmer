Ready... set... Set!
======
####Author: /u/Elite6809####

##Background##
A _set_ is a mathematical concept that represents a collection of other objects.
Those other objects can be numbers, words, operations, or even sets themselves;
for the (non-extension) purporse of the challenge they are integers only. A
_finite set_ is a set with only a fininte number of items (unlike, for example,
the set of all real number **R** which has uncountably infinite members).

A set is generally represented with curly brackets with the items separated by
commas. So, for example, the set containing `-3`, `6`, and `11` could be written
as `{ -3, 6, 11}`. This notation is called an _extensional definition_.

There are some distinctions between a set and the list/array data structure:

- Repeated items are ignore, so `{ -3, 6, 11}` is exactly the same as `{-3, -3,
6, 11}`. To understand why this is so, think less of a set being a container of
items, but rather the items are members of a set.

- Order doesn't matter - `{-3, 6, 11}` is exactly the same as `{-3, -3, 6, 11}`
and so on.

- Sets are generally seen as _immutable_, which means that rather than adding an
item **A** to a set **S**, you normally create a new set with all the members of
**S** _and_ **A**. Immutable data structures are quite a common concept so this
will serve as an intro to them if you've not come across them yet.

- A set can be empty - `{}`. This is called the empty set, oddly enough.

Sets have 3 operations.

- Union, with the symbol $\cup$. An item is a member of set **S**, where **S**
is the union of **A** and **B**, if it's a member of set **A** or **B**. For
example, let **A** = `{1, 4, 7}` and let **B** = `{-4, 7, 10}`. Then **A** union
**B** = `{-4, 1, 4, 7, 10}`.

- Intersection, with the symbol $\cap$. An item is a member of set **S**, where
**S** = **A** intersect **B**. An item is a member of set **S**, where **S** =
**A** intersect **B**, if it is a member of set **A** _and_ set **B**.

- Complement, with the symbol '. An item is a member of set **S**, where **S** =
**A**', if it's not a member of **A**. For example, let **A** = `{1, 4, 7}`.
Then, **A**' is _every integer_ except 1, 4, and 7.

##Specification##
You are to implement a class representing a set of integers.

- To hold its content, you can use an array, list, sequence or whatever fits the
language best. Consider encapsulating this (making it `private`) if your
language supports it.

- The class should expose a method `Contains`, which accepts an integer and
returns whether the set contains that integer or not.

- THe constructor of the class should accept any list/array of integers which
are to be the content of the set. Rembmer to ignore duplicates and order.
Consider making it a variadic constructor (variable number of arguments) if your
language supports it.

- The class should have static methods for `Union` and `Intersection`, which
both accept two sets and return another set containing the union or intersection
of those two sets respectively. Remember, our sets are _immutable_, so create a
new set rather than modifying an existing one. Consider making these as binary
operators (e.g., `+` for union and `*` for intersection) if your language
supports it.

- The class should have another static method for `Equals` or `equals`, which
accepts two sets and returns a boolean value. This determines if the two sets
contain the same items and nothing else.

Finally, the set should be convertible to a string in some way (e.g.,
`ToString`, `toString`, `to_a` depending on the language) which shows all items
in the set. It should show them in increasing order for readability.

If your language already has a class for sets, ignore it. The purpose of this
exercise is to learn from implementing the class, not use the pre-existing class
(although in most cases you would use the existing one).

###Making Use of Your Language###
The main challenge of this exercise is knowning your language and its features,
and adpating your solution to them. For example, in Ruby, you would not write a
`ToString` method - you would write a `to_s` method, as that is the standard in
Ruby. In C++ and C#, you would no necessarily write static `Union`,
`Intersection` methods - you have the ability to overload operators, and you
should do so if it produces idiomatic code. The reseach for this is part of the
task. You should also be writing clean, legible code. Follow the style guide of
your language, and use the correct naming/capitalization, which differ between
languages.

###Extension 1 (Intermediate)###
If you are feeling up to it, change your class for as et of integers and create
a generic set class (or, if your language has dynamic typing, a set of any
comparable type). Depending on your language you might need to specify that the
objects can be equated.

###Extension 2 (Hard)###
This will require some thinking on your end. Add a `Complement` static method to
your class, which accepts a set and returns another set containing everything
_except_ what's in the accepted set.

Of course, you can't have an array of every integer ever. You'll need to use
another method to solve this extension, and adapt the rest of the class
accordingly. Similarly, for the string conversion, you can't print an infinite
number of items. For this reason, a set containing everything except 3 and 5
should print something like `{3, 5}`' (note the '). You could similarly use an
overloaded operator fo this.
