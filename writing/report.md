<<<<<<< HEAD
# Report by Add Your Name(s)
zackery devers, peter snipes, alexis caldwell
=======
# Report by Lex Caldwell, zackery devers, and peter snipes
>>>>>>> 01ce117d00021d64bd0c40c4e7f6022c29e664a1

## Design of your Program
The design of our program is the user being prompted to type in a message and then being able to choose
between the three implemented cyphers that we chose and their message being outputted regardless of whether
it is a number or a letter, their message gets changed.
## Implementation of your Program
For the implementation of this project, we split the project up into four files. We have a main, decoder, railfence,
and a backup. Our main file, of course, holds all of our prompted messages and system out puts for the user. It also contains
Objects from our specific files to actually decode the user's message. The decoder file is the cypher A1Z26(all that is , is
A=1, B=2, ...Z=26). The letterToNumber method just contains a simple for loop that looks at the index of the inputted string and
gives back the index of that letter from the private variable alphabet. The numberToLetter does the exact opposite given the user
a number rather than a letter at the specified index.

## Evaluation and Testing of your Program

Include program input and output and output of test cases in code blocks
```
> Task :run
Hello world!
Enter a message:

xoxoxoxoxoxoxoxo

<=====<========<<=========----> 75% EXECUTING [9s]

Would you like to use Upper/Lowercase(0) or Decoder(1) or RailFence(2)

<<=========----> 75% EXECUTING [12s]

Please enter the number (2) again:

<=========----> 75% EXECUTING [12s]

xxxxxxxxoooooooo

BUILD SUCCESSFUL in 14s
2 actionable tasks: 1 executed, 1 up-to-date
root@22384f4dbd21:/project#
```
This is an example of my code running with its test case, with the railFenceCipher having the xoxoxoxoxoxoxoxo run through the program and outputted with the encoded cipher : xxxxxxxxoooooooo.

Include commands needed to run and test your project

the only commands needed to run our test is the user imputs and answers to the questions.

## Description of the challenges that you faced and how you resolved them
Lex: One of the challenges I faced was attempting to implement a hashmap to use as a decoder.
I'm not 100% sure about all of the ins and outs of how a hashmap works but it was definitely interesting to look into.
The hardest part about working with this specific project was turning the number to a letter and after many tries of attempting
to figure out why it wasn't working. I somewhat figured it out but it is due tomorrow and I was only able to implement
only a small portion of actual working hashmap code before the due date. Other than that, working on the simplified version of
the A1Z26 code was fairly easy although I did run into some fixable out of bounds errors that didn't deter me fully.

Peter: One of the challenges I faced during this group project was getting my code to switch from upper to lower and lower to upper.
I met with Megan and she explained to me how a string StringBuffer worked and that's what I ended up using to develop my code it it worked out
for me.

Zackery: one of the challenges i faced during this group project was making the code i wrote work with the way my team had their setup. My code was originally designed to intake a int but it was a str argument that out team decided on. With the help of the TA megan i was able to make the str the user inputted to be swtiched into an integer and then printed back into the Str output.
## If worked in a team, description of the way in which you and your team members shared the project work
<<<<<<< HEAD
=======
We all developed our own code and made them work together to do different things in the program.
>>>>>>> 01ce117d00021d64bd0c40c4e7f6022c29e664a1
