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
