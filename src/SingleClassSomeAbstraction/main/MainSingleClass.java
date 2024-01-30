package SingleClassSomeAbstraction.main;

import enums.Land;
import enums.Type;
import SingleClassSomeAbstraction.character.Character;


/**
 * Main class which contains the main method.
 * It will do a very simple test on the Elf class.
 */
public class MainSingleClass {
  /**
   * Main method which will do a very simple test on the Elf class.
   * @param args the arguments.
   */
  @SuppressWarnings("checkstyle:IllegalCatch")
  public static void main(String[] args) {


    Character elf = new Character( Land.BOULDERFALL, Type.ELF);

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