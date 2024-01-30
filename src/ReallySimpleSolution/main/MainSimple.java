package ReallySimpleSolution.main;


import ReallySimpleSolution.character.SimpleCharacter;
import enums.Land;
import enums.Type;

/**
 * Main class which contains the main method.
 * It will do a very simple test on the Elf class.
 */
public class MainSimple {
  /**
   * Main method which will do a very simple test on the Elf class.
   * @param args the arguments.
   */
  @SuppressWarnings("checkstyle:IllegalCatch")
  public static void main(String[] args) {


    SimpleCharacter elf = new SimpleCharacter( Land.BOULDERFALL, Type.ELF, 2.0, 12.0);

    System.out.println("Elf's land is " + elf.getLand());
    System.out.println("Elf's health is " + elf.getMagicRemaining());

    try {
      elf.move(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Elf's health is " + elf.getMagicRemaining());

    try {
      elf.move(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      elf.drinkPotion(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      elf.move(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Elf's health is " + elf.getMagicRemaining());
    try {
      elf.drinkPotion(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Elf's health is " + elf.getMagicRemaining());

    try {
      elf.move(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Elf's health is " + elf.getMagicRemaining());

    try {
      elf.drinkPotion(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Elf's health is " + elf.getMagicRemaining());


    try {
      elf.drinkPotion(3.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Elf's health is " + elf.getMagicRemaining());


  }
}