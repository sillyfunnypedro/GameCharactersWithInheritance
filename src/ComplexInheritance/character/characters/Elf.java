package character.characters;

import character.CharacterAbstract;
import enums.Land;
import enums.Type;

/**
 * Elf class which extends CharacterAbstract.
 */
public class Elf extends CharacterAbstract {
  /**
   * Elf Constructor which takes land as a parameter.
   * @param land the land type of the character.
   */
  public Elf(Land land) {
    super(2.0, 12.0, land);
    type = Type.ELF;
    this.land = land;

  }
}
