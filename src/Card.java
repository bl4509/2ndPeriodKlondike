import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
 
/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable, Comparable <Card>{
 
  private char suit;
  private int value;
  private boolean isRed;
  private boolean facingUp;
  private int x, y;
  private int numdraws=0;
  private Image frontImage;
  private static Image backImage;

  //yes
  
  /** Must have this constructor.  You can add others*/
  public Card(char suit, int value, int x, int y){
    this.suit = suit;
    this.value = value;
    this.x = x;
    this.y = y;
    if(suit == 1 || suit == 3) { //diamond and hearts suit
        isRed = true;
    } else {
    isRed = false;
    }
    
    String s = "";

    s += suit;
    if(this.value <= 10) {
    s += value;
    } else if (this.value == 10) {
    s += "j";
    }  else if (this.value == 11) {
    s += "q";
    } else if (this.value == 12) {
    s += "k";
    } else {
    s += "1";
    }
    String imageID = "images/cards/" + s + ".png";
    try {
        if(backImage == null) {
            backImage = ImageIO.read(new File("images/cards/b1fv.png"));
        }
        frontImage = ImageIO.read(new File(imageID));
    } catch (IOException e) {
        e.printStackTrace();
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

  public boolean isFacingUp () {
      return facingUp;
  }

  public void flipUp() {
    facingUp = true;
  }

  public void flipDown() {
    facingUp = false;
  }

  @Override
  /** This method satisfies the Comparable interface which determines
  * if this Object is smaller than, greater than or equal to the
  * specified Card c
  * Formally, if this Card is smaller than c, a negative int is returned
  *           if this Card is larger than c, a positive int is returned
  *           if this Card is equal to c, zero is returned    */
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
    s += value + " of ";
    } else if (this.value == 10) {
    s += "Jack of ";
    }  else if (this.value == 11) {
    s += "Queen of ";
    } else if (this.value == 12) {
    s += "King of ";
    } else {
    s += "Ace of ";
    }

  if(this.suit == 'd') {
    s += "Diamond ";
    } else if (this.suit == 'c') {
    s += "Clubs";
    } else if (this.suit == 'h') {
    s += "Hearts";
    } else {
    s += "Spades";
  }

  return s;
  }


  @Override
  public void update(ActionEvent a) {
  // TODO Auto-generated method stub

  }

  @Override
  public void draw(Graphics g) {
    numdraws++;
    g.setColor(new Color(40, 155, 70));
    g.fillRect(0, 0, 3000, 2000);
    
    // this is just to test drawing a card
    g.drawImage(frontImage, this.x, this.y, null);

  }
}
