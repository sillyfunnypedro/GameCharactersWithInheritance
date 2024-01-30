# Character class for hypothetical game

On the 29th of January we had you think about how to represent a character in a hypothetical game.  
In the course of thinking about this you all came to the conclusion that there was no correct answer to this problem.

Here in this repository you will find two potential implementations of a character class.  The first you can see defined in ```Character.java``` and is called in ```MainShingleClass.java``` 
This is a very simple implementation where we take advantage of the type of character to set up the one variable that is different for each type of character.

The second implementation defines a Class CharacterAbstract as an abstract class and thus three derivate classes need to be defined.

## The single class solution.

When we did the analysis of the problem we identified that the difference between Elf, Fairy, and Troll 
can be summarized by a variable called ```magicPerMile``` so we need to have a method to set this value when a character is 
instantiated.  In order to do this we develop a constructor for the class that does not include the initial magic and the ```magicPerMile```
value.




## Subclass setting a value in the parent class. 

Notice that in this solution there is an AbstractCharacter class that is defined as abstract since we do not want to instantiate it. It has a method called setHealth that is abstract. 

In this case we defined a one parameter constructor for each of the derived classes that call into a Constructor 

```java
package character.characters;

import character.CharacterAbstract;
import enums.Land;
import enums.Type;

/**
 * Fairy class which extends CharacterAbstract.
 */
public class Fairy extends CharacterAbstract {
  /**
   * Fairy Constructor which takes land as a parameter.
   * @param land the land type of the character.
   */
  public Fairy(Land land) {
    super(3.0, 15.0, land);
    type = Type.FAIRY;
    this.land = land;

  }
}


```
In this case we are using the difference in constructors 