package ComplexInheritance.main;

import character.characters.Elf;
import enums.Land;

/**
 * Main class which contains the main method.
 * It will do a very simple test on the Elf class.
 */
public class MainComplexInheritance {
  /**
   * Main method which will do a very simple test on the Elf class.
   * @param args the arguments.
   */
  @SuppressWarnings("checkstyle:IllegalCatch")
  public static void main(String[] args) {


    Elf elf = new Elf(Land.BOULDERFALL);

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