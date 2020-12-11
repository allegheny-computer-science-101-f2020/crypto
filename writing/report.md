# Report by Lex Caldwell

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

Include commands needed to run and test your project

## Description of the challenges that you faced and how you resolved them
Lex: One of the challenges I faced was attempting to implement a hashmap to use as a decoder. 
I'm not 100% sure about all of the ins and outs of how a hashmap works but it was definitely interesting to look into.
The hardest part about working with this specific project was turning the number to a letter and after many tries of attempting 
to figure out why it wasn't working. I somewhat figured it out but it is due tomorrow and I was only able to implement
only a small portion of actual working hashmap code before the due date. Other than that, working on the simplified version of 
the A1Z26 code was fairly easy although I did run into some fixable out of bounds errors that didn't deter me fully. 
## If worked in a team, description of the way in which you and your team members shared the project work

