package litec;

/**
 * @see "readme.md in this exercise folder for an explanation" * 
 */
public class Ex01Car
{
    public static void main(String[] args) {
      Car bmw = new Car("BMW", 0.0);
      Car opel = new Car("Opel" , 100.0);


      bmw.drive(1000);
      opel.drive(100);

        System.out.println(bmw.getName()+ "km total:" +bmw.getKmTotal()) ;
        System.out.println(opel.getName()+ "km total:"+opel.getKmTotal());

    }



}
