package HW3;

import java.util.Scanner;

public class HearthStoneDeck
{
    private String gamerTag;
    private Card[] myDeck = new Card[30];
    private int position;

    public void setGamerTag(String newTag)
    {
        gamerTag = newTag;
    }

    public String getGamerTag()
    {
        return gamerTag;
    }

    public void buildDeck()
    {
        Scanner keyboard = new Scanner(System.in);
        while (position <= 29)
        {
            System.out.println("Would you like to: ");
            System.out.println("(a) Add a card");
            System.out.println("(r) Remove a card");
            System.out.println("(p) Print your current deck");
            System.out.println("(q) Quit");
            char choice = keyboard.next().charAt(0);
            switch (choice)
            {
                case 'a' ->
                {
                    Card character = new Card();
                    character.readInput();
                    addCard(character);
                }
                case 'r' ->
                {
                    removeCard();
                }
                case 'p' ->
                {
                    for (int i = 0; i < position; i++)
                    {
                        myDeck[i].writeOutput();
                    }
                }
                case 'q' ->
                {
                    System.out.println("Quitting the program");
                    System.exit(0);
                }
                default ->
                {
                    System.out.println("Sorry, please pick a valid option");
                }
            }
        }
    }

    public void addCard(Card c)
    {
        try
        {
            int number = getCardCount(c.getCardName());
            if (number >= 2 |
                    (c.getCardType().equalsIgnoreCase("legendary") && number >= 1))
            {
                throw new MaxCardQuantityException();
            }
            myDeck[position] = c;
            position++;
        }
        catch (MaxCardQuantityException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void removeCard()
    {
        try {
            if (position == 0)
            {
                throw new DeckIsEmptyException();
            }
            position--;
            myDeck[position] = null;
        }
        catch (DeckIsEmptyException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Unable to do that action, please try again");
        }
    }

    public int getCardCount(String name)
    {
        int count = 0;
        for(int i = 0; i < position; i++)
        {
            if(name.equals(myDeck[i].getCardName()))
            {
                count++;
            }
        }
        return count;
    }

    public static void main (String[]args)
    {
        HearthStoneDeck d1 = new HearthStoneDeck();
        d1.setGamerTag("Velocity9");
        d1.buildDeck();
    }
}
