//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //ICustomerDal customerDal = new OracleCustomerDal(); //interface onu implement eden clasın yerını tutabilir.
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
            }
        }
