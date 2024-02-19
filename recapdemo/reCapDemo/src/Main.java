//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
            int sonuc1 = dortIslem.Topla(3,4);
        int sonuc2 = dortIslem.Cikarma(3,4);
        int sonuc3 = dortIslem.bolme(3,4);
        int sonuc4 = dortIslem.carpma(3,4);

            System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
}