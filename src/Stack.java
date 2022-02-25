import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Stack extends Pile {

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
        if (list.isEmpty() && c.getValue() == 13) {
            list.add(c);
            return true;
        } else if (list.get(list.size() - 1).getSuit() == c.getSuit() && list.get(list.size() - 1).getValue() == c.getValue() - 1) {
            list.add(c);
            return true;
        }
        
        return false;
    }
    }
    
}
