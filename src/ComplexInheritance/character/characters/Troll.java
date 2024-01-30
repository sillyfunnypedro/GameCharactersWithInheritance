package character.characters;

import character.CharacterAbstract;
import enums.Land;
import enums.Type;

/**
 * Troll class which extends CharacterAbstract.
 */
public class Troll extends CharacterAbstract {
  /**
   * Troll Constructor which takes land as a parameter.
   * @param land the land type of the character.
   */
  public Troll(Land land) {
    super(4.0, 18.0, land);
    type = Type.TROLL;
    this.land = land;

  }
}
