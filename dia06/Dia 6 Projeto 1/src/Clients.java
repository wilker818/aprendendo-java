public class Clients {
    String firstName;
    int age;

    //constructor
    float balance;
    Clients(){
        balance = 10;
    }

    void newAccount(){
        System.out.println(firstName + " Account Created!");
        System.out.format("The new balance is $%f", balance);
    }

}
