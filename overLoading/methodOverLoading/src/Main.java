import java.awt.desktop.SystemEventListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(90,25));
        System.out.println(dortIslem.topla(19,23,65));
    }
}

// bu duruma overloading deniyor yani aşırı yükleme
