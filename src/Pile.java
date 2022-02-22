
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;

/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    private int x, y;
    protected static ArrayList<Card> list = new ArrayList<Card>();

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void draw (){

        for(Card c: list){
            c.draw(g,x,y);
        }
    }

    public void setLoc(int x, int y){
       this.x = x;
       this.y = y; 
    }

    public void shuffle(){
        Collections.shuffle(list);
    }

    public Card deal() {
        Card c = list.remove(0);
        return c;
    }

    public int size(){
        return list.size();
    }

    public void clear(){
        list.clear();
    }

    public void addPile(Pile p) {
        while (p.size()>0) {
            this.add(p.deal());
        }
    }

    public boolean isEmpty(){
        if(list.size() == 0){
            return true;
        }
        else return false;
    }

    public void add(Card c){
        list.add(c);
    }

    public String toString() {
        String s = "";
        for (Card c : list) {
            s += "" + c;
            s += "\n";
        }
        return s;
    }




}
