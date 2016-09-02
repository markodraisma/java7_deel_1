import java.util.*;

class Generics4 {

  public static void main(String args[])
  {
    Collection<Float> prijzen = new Vector<Float>();
    prijzen.add(4.5f);
    prijzen.add(2.3f);
    toonTotaal(prijzen);

    Collection<Integer> priem = new Vector<Integer>();
    priem.add(5);
    priem.add(7);
    toonTotaal(priem);
  }


  public static <T extends Number> void toonTotaal(Collection<T> c)
  {
    float totaal=0;
    Iterator<T> i = c.iterator();
    while(i.hasNext())
    {
      totaal+=i.next().floatValue();
    }
      System.out.println(totaal);
  }

}