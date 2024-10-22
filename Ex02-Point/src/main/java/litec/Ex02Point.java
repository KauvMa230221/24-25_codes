package litec;

/**
 * @see "readme.md in this exercise folder for an explanation"
 * 
 */
public class Ex02Point
{
    public static void main(String[] args)
    {
       Point p = new Point(1,2);

        System.out.println("Position: (" +p.getXPos() +"," +p.getYPos() +")");

        p.movePoint(1,1);
        System.out.println("Move Position (" +p.getXPos()+"," +p.getYPos()+")") ;
        System.out.println("disToOrigin" +p.disToOrigin());

    }
}
