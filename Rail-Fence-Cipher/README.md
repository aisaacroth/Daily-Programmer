Rail Fence Cipher
======
####Author: /u/Elite6809####

##Description##
Before the days of computerized encryption, cryptography was done manually by hand. This means the methods of encryption were usually much simpler as they had to be done reliably by a person, possibly in wartime scenarios.

One such method was the [rail-fence cipher](http://en.wikipedia.org/wiki/Rail_fence_cipher). This involved choosing a number (we'll choose 3) and writing our message as a zig-zg with that height (in this case, 3 lines high). Let's say our message is `REDDITCOMRDAILYPROGRAMMER`. We would write out message like this:

```
R   I   M   I   R   A   R
 E D T O R A L P O R M E
  D   C   D   Y   G   M
```

See how it goes up and down? Now, to get the cipher text, instead of reading with the zigzag, just read along the lines instead. The top line has `RIMIRAR`, the second line has `EDTORALPORME` and the last line has `DCDYGM`. Putting those together gives you `RIMIRAREDTORALPORMEDCDYGM`, which is the ciphertext.

You can also decrypt (it would be pretty useless if you couldn't!). This involves putting the zig-zag shape in beforehand and filling it in along the lines. So, star tthe zig-zag shape:

```
?   ?   ?   ?   ?   ?   ?
 ? ? ? ? ? ? ? ? ? ? ? ?
  ?   ?   ?   ?   ?   ?
```

The first line has 7 spaces, so take the first 7 characters (`RIMIRAR`) and fill them in.
```
R   I   M   I   R   A   R
 ? ? ? ? ? ? ? ? ? ? ? ?
  ?   ?   ?   ?   ?   ?
```

The next line has 12 spaces, so take 12 more characters (`EDTORALPORME`) and fill them in.
```
R   I   M   I   R   A   R
 E D T O R A L P O R M E
  ?   ?   ?   ?   ?   ?
```

Lastly the final line has 6 spaces so take the remaining 6 characters (`DCDYGM`) and fill them in.
```
R   I   M   I   R   A   R
 E D T O R A L P O R M E
  D   C   D   Y   G   M
```

Then, read along the fence-line (zig-zag) and you're done!

###Input Description###
You will accept lines in the format:
`enc # PLAINTEXT`
or
`dec # CIPHERTEXT`
where `enc #` encodes `PLAINTEXT` with a rail-fence cipher using `#` lines, and `dec #` decodes `CIPHERTEXT` using `#` lines.
