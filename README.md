# Card_Deck_Builder_Project
This is a Java programming porject where the user can create a game card deck.

Card.java - sets the base variables that HearthStoneDeck.java will use to 
create an array.

MaxCardQuantityException - sets the exception message when more than two of 
the same card are added to the deck or when a legendary card is added more
than once.

DeckIsFullException - sets the exception message when more cards cards are
added to the deck than is possible.

DeckIsEmptyException - sets the exception message when the user tries to
remove a card from an empty deck.

HearthStoneDeck - created methods to build a deck such as add, remove and print
a deck. 