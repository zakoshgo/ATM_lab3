//constructor
//deposit
//withdraw
//show balance
//account
//.. user name .. password
// atm will create account and then try to access it
import java.util.*;

public class ATM {
    String username;
    int password;
    Account obj;
    boolean createdAccountFlag = false;
    boolean loginAccountFlag = false;
    Scanner sc =  new Scanner(System.in);
    void createAccount(String username,int password){
        this.username = username;
        this.password = password;

        obj = new Account(username,password);
        createdAccountFlag = true;
    }


    String login(String username , int password){

        if(this.username == username && this.password == password && createdAccountFlag)
        {
            loginAccountFlag = true;
            return "success";
        }
        else return "invalid username or password or you have to create account first";

    }

    String withdraw(int Amount){
        if(loginAccountFlag){
            return obj.withdraw(Amount);
        }
        else
            return "you have to login first";
    }

    String deposit(int inputMoney){
        if(loginAccountFlag){
            return obj.deposit(inputMoney);
        }
        else
            return "you have to login first";
    }
    String showBalance(){
        if(loginAccountFlag){
            return obj.showBalance();
        }
        else
            return "you have to login first";
    }


}
