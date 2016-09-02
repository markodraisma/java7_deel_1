class VariableArgs {

    public static void toonNamen(String... namen)  {
 
       for (String naam: namen)              
          System.out.println(naam); 
    } 
 
    public static void main( String args[] ) 
    {
      toonNamen("Kwik", "Kwek", "Kwak");
    } 
}