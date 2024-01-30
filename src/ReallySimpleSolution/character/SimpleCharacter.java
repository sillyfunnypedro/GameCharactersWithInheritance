package ReallySimpleSolution.character;

import enums.Land;
import enums.Type;
import exceptions.insufficientMagicException;
import exceptions.noPotionsLeftException;

/**
 * Abstract class for the different types of characters in the game.
 */
public class SimpleCharacter {
  private final double magicPerMile;

  // This is a protected variable, which means that it can be accessed by subclasses.

  private Type type;

  private Land land;

  private double magicRemaining;

  private int numberOfPotionsLeft = 3;

  /**
   *
   * The constructor for this class.   Notice that we do not include all of the private fields since
   * magicPerMile and magicRemaining are calculated based on the type of character.
   * @param land The type of land that the character lives in.
   * @param type The type of character.
   * @param magicPerMile The amount of magic that the character consumes per mile.
   * @param magicRemaining The amount of magic that the character has remaining.
   *
   */
  public SimpleCharacter(Land land, Type type, double magicPerMile, double magicRemaining) {
    this.land = land;
    this.type = type;
    this.magicPerMile = magicPerMile;
    this.magicRemaining = magicRemaining;
  }

  /**
   * This method is used to get the MagicPerMile for the character.
   *
   * @return The amount of magic that the character consumes per mile.
   */
  public double getMagicPerMile() {
    return magicPerMile;
  }

  /**
   * This method is used to get the land of the character.
   * @return The type of land that the character lives in.
   */
  public Land getLand() {
    return land;
  }

  /**
   * This method is used to get the magic remaining for the character.
   *
   * @return The amount of magic that the character has remaining.
   */
  public double getMagicRemaining() {
    return magicRemaining;
  }

  /**
   * Moves the character a certain number of miles.
   * @param miles The number of miles to move the character.
   * @throws insufficientMagicException If the character does not have enough magic to move.
   */
  public void move(double miles) throws insufficientMagicException {
    double magicRequired = miles * magicPerMile;
    if (magicRequired > magicRemaining) {
      throw new insufficientMagicException(String.format("You need %.2f magic to move, you only have %.2f magic remaining.", magicRequired, magicRemaining));
    }
    magicRemaining -= miles * magicPerMile;
    System.out.println("A character of type " + type + " has moved " + miles + " miles.");
  }

  /**
   * Drinks a potion to restore magic.  If the character has no potions left, throws an exception.
   * @param magic The amount of magic that the potion restores.
   * @throws noPotionsLeftException If the character has no potions left.
   */
  public void drinkPotion(double magic) throws noPotionsLeftException {
    if (numberOfPotionsLeft == 0) {
      throw new noPotionsLeftException("You have no potions left.");
    }
    numberOfPotionsLeft--;
    magicRemaining += magic;
  }

}

