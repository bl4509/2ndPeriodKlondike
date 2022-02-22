import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class ThreeCards extends Pile {

    @Override
    public void draw(Graphics g) {
        int counter  = 0;
        for(Card c : list){
          list.draw(g, c.getX()+(i*2), c.getY()+(i*2));  
        }
        if(counter)
        
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
