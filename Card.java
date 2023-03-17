package HW3;

import java.util.Scanner;

public class Card
{
    private String cardName, cardType, cardClass;

    public Card()
    {
        cardName = "";
        cardType = "";
        cardClass = "";
    }

    public Card(String newName, String newType, String newClass)
    {
        cardName = newName;
        switch(newClass)
        {
            case "warrior", "rogue", "druid", "shaman", "death knight",
                    "demon hunter", "priest", "paladin", "warlock", "mage" -> cardClass = newClass;
        }
        switch(newType)
        {
            case "common", "rare", "epic", "legendary" -> cardType = newType;
        }
    }

    public void setCardClass(String cardClass)
    {
        this.cardClass = cardClass;
    }
    public void setCardName(String cardName)
    {
        this.cardName = cardName;
    }
    public void setCardType(String cardType)
    {
        this.cardType = cardType;
    }

    public String getCardClass()
    {
        return cardClass;
    }
    public String getCardName()
    {
        return cardName;
    }
    public String getCardType()
    {
        return cardType;
    }

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the card name?");
        setCardName(keyboard.next().toLowerCase());
        System.out.println("What is the card type?");
        setCardType(keyboard.next().toLowerCase());
        System.out.println("What is the card class?");
        setCardClass(keyboard.next().toLowerCase());
    }

    public void writeOutput()
    {
        System.out.println("Name: " + getCardName());
        System.out.println("Type: " + getCardType());
        System.out.println("Class: " + getCardClass());
        System.out.println("-------------------------");
    }
}
