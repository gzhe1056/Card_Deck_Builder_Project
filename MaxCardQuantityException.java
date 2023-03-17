package HW3;

public class MaxCardQuantityException extends Exception
{
    public MaxCardQuantityException()
    {
        super("Exception: Max card quantity reached!");
    }
    public MaxCardQuantityException(String message)
    {
        super(message);
    }
}
