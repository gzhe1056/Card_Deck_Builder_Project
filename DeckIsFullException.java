package HW3;

public class DeckIsFullException extends Exception
{
    public DeckIsFullException()
    {
        super("Exception: Deck is full!");
    }
    public DeckIsFullException(String message)
    {
        super(message);
    }
}
