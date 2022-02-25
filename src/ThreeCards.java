public class ThreeCards extends Pile {
 
    private int x;
    private int y;
 
 
    public ThreeCards(int x, int y){
        this.x = x;
        this.y = y;
    }
 
    @Override
    public void draw(Graphics g) {
        int counter  = 0;
        for(Card c : list){
          c.draw(g,x+10, y);//the +10 shifts the card over so it is visble
          counter ++;
          if(counter == 3)
          break;
        }
     
       
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
