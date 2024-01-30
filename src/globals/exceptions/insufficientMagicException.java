package exceptions;

/**
 * Exception for when a character does not have enough magic to move.
 */

public class insufficientMagicException extends Exception {
  public insufficientMagicException(String message) {
    super(message);
    }
}