public abstract class GameCalculater {
    public abstract void hesapla();      //abstract sınıflar asla newlenemez.Bu fonksiyon override edilmek zorunda.
    public final void gameOver(){
        System.out.println("oyun bitti");
        }
    }

