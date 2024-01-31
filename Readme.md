# Character class for hypothetical game

On the 29th of January we had you think about how to represent a character in a hypothetical game.  
In the course of thinking about this you all came to the conclusion that there was no correct answer to this problem.

When we did the analysis of the problem we identified that the difference between Elf, Fairy, and Troll
can be summarized by a variable called ```magicPerMile``` so we need to have a method to set this value when a character is
instantiated.  In order to do this we develop a constructor for the class that does not include the initial magic and the ```magicPerMile```
value.

Here in this repository you will find two potential implementations of a character class.  In this repo you will see three working 
implementations of a Character Class and/or some derived classes.  Each of these solutions has a main() method that instantiates an 
elf object and calls ```move()``` and ```drinkPotion()```.  You will notice that the code in main kind of looks like
some of the unit tests that we have been writing.  In fact, you can think of this as a unit test for the Character class.  
In some situations when you are experimenting with code a simple test harness like this can be very useful.  But this never
substitutes for the requirement to write unit tests for your code when you are developing it in a professional setting.

### The single class solution.

The constructor takes all four parameters for the character.  

- You can find this code in the ```src/ReallySimpleSolution.character.SimpleCharacter``` class.  
- The associated main is in 
```src/ReallySimpleSolution.main.Main```

### A single class that computes the values of magicPerMile and remaiingMagic.

- You can find this code in the ```src/SingleClassSomeAbstraction.character.Character``` class.  
- The associated main is in 
```src/SingleClassSomeAbstraction.main.MainSingleClass```

### A class hierarchy that uses inheritance to define the different types of characters.

- You can find this code in the ```src/ComplexInheritance.character.CharacterAbstract``` class.  
- The associated main is in 
```src/ComplexInheritance.main.MainComplexInheritance```


## What do you do about this.

As a team download the code and study it.  You will benefit from discussing amongst yourselves.

- What are the advantages and disadvantages of each of these solutions?
- Where can programmers make mistakes in each of these solutions?
- Can you think of another solution that is better than these three?
- What are the advantages and disadvantages of your solution?