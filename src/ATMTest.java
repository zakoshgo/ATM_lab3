import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
        ATM atm;


    @BeforeEach
    public void init() {
        atm = new ATM();
        atm.createAccount("ziad",1234);
        atm.login("ziad",1234);
    }

    class returnMoneyz{
        int giveMeMoney(int x){
            if(x>0)return x;
            else return -2;
        }
    }


    @Test
    public void withdrawStub(){
        returnMoneyz M = new returnMoneyz();
        assertEquals( atm.withdraw(M.giveMeMoney(500)),"their is not enough money dude");

    }
    @Test
        public void depositStub(){
        returnMoneyz M = new returnMoneyz();
        assertEquals( atm.deposit(M.giveMeMoney(500)),"successful operation");

    }







}