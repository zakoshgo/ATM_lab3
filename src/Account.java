public class Account {
    int balance;
    String username;
    int password;


    Account(String username,int password){
        this.username = username;
        this.password = password;
        balance =0;
    }

    String withdraw(int Amount){
        if(Amount > balance){
            return "their is not enough money dude";
        }
        balance -= Amount;
        return "successful operation";
    }

    String deposit(int inputMoney){
        if(inputMoney == 0){
            return "you have to input money first man";
        }
        balance += inputMoney;
        return "successful operation";
    }
    String showBalance(){
        return String.valueOf(balance) ;
    }



}
