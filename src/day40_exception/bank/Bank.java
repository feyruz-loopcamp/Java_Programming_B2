package day40_exception.bank;

public class Bank {

    double balance;


    // login - username & password
    public void login (String username, String password) throws InvalidCredentialsException {

        if(!username.equals("loopcamp")){
            //System.out.println("Invalid username");
            throw new InvalidCredentialsException ("Invalid Username");
        }


        if (!password.equals("123456!@#")) {
            throw new InvalidCredentialsException ("Invalid Password");
        }

    }


    // withdraw -- >  single parameter
    public void withdraw(double withdrawalAmount) throws NotEnoughBalanceException {
        if(withdrawalAmount>balance){
            throw new NotEnoughBalanceException("Not enough funds");
        }
    }

}
