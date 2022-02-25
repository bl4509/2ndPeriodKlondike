import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Aces extends Pile {
    private int suit;

    public Aces(int suit, int x, int y) {
        this.x = x;
        this.y = y;
        this.suit = suit;
    }



    @Override
    public void draw(Graphics g) {
        list.get(list.size() - 1).draw(g);
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        if (list.isEmpty() && c.getValue() == 1) {
            list.add(c);
            return true;
        } else if (list.get(list.size() - 1).getSuit() == c.getSuit() && list.get(list.size() - 1).getValue() == c.getValue() - 1) {
            list.add(c);
            return true;
        }
        
        return false;
    }
    
}
