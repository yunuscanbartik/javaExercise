//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BaseLoanManager[] baseLoanManager = new BaseLoanManager[]{new TeacherLoanManager(), new AgriculturelLoanManager(), new StudentLoanManager()};
        for(BaseLoanManager credit:baseLoanManager ){
            System.out.println(credit.hesapla(1000));
        }
    }
}