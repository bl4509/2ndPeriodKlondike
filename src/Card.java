import java.awt.Graphics;
import java.awt.event.ActionEvent;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable, Comparable <Card>{

  private int suit;
  private int value;
  private boolean isRed;
 
 /** Must have this constructor.  You can add others*/
	public Card(int suit, int value){
    this.suit = suit;
    this.value = value;
    if(suit == 1 || suit == 3) { //diamond and hearts suit
        isRed = true;
    } else {
        isRed = false;
    }
	}
	
  // add getters
  public int getSuit() {
    return this.suit;
  }

  public int getValue() {
    return this.value;
  }

  public boolean isRed() {
      return this.isRed();
  }

	@Override
	/** This method satisfies the Comparable interface which determines
	 * if this Object is smaller than, greater than or equal to the 
	 * specified Card c
	 * Formally, if this Card is smaller than c, a negative int is returned
	 *           if this Card is larger than c, a positive int is returned
	 *           if this Card is equal to c, zero is returned	*/
	public int compareTo(Card c){

    if(this.value - c.value == 1 && this.isRed != c.isRed) {
        return 1;
    } else {
        return -1;
    }

	}


	
	// represents this Card in the following manner
	// if the card is the Ace of Spades, then 
	// it returns "Ace of Spades". 2 - 10 can be represented
	// as "2 of Hearts" or "Two of Hearts".  Your choice.
	@Override
	public String toString(){
		String s = "";
    if(this.value <= 10) {
      s += value;
    } else if (this.value == 10) {
      s += "Jack";
    }  else if (this.value == 11) {
      s += "Queen";
    } else if (this.value == 12) {
      s += "King";
    } else {
      s += "Ace";
    }

    if(this.suit == 1) {
      s += " of Diamonds";
    } else if (this.suit == 2) {
      s += " of Clubs";
    } else if (this.suit == 3) {
      s += " of Hearts";
    } else {
      s += " of Spades";
    }
    
		
		return s;
	}

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }
}
