import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Aces extends Pile {
    private int suit;

    public Aces(int suit) {
        this.suit = suit;
    }

    public void canAddCard(Card c) {
        if (list.isEmpty() && c.getValue() == 1) {
            list.add(c);
        }
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
