package HW3;

public class DeckIsEmptyException extends Exception
{
    public DeckIsEmptyException()
    {
        super("Exception: Deck is empty!");
    }
    public DeckIsEmptyException(String message)
    {
        super(message);
    }
}
