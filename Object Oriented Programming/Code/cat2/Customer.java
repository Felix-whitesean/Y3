public class Customer extends User{
    int customerId;
    Customer(String userName, int natId, String pass, int cId){
        super(userName, natId, pass);
        customerId = cId;
    }
}
