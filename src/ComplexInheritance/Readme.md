# Character class for hypothetical game

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