public abstract class Voertuig {

  public abstract void stoppen();
  public abstract void starten();
  
  public String toString() {
    return "Voertuig";
  }
}

class VoertuigApp {
  public static void main(String args[]){
    Voertuig v = new Voertuig();
  }
}