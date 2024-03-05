public class PremiumCustomer extends Customer {
    int customerRating;
    PremiumCustomer(String userName, int natId, String pass, int cId, int cR){
        super(userName, natId, pass, cId);
        customerRating = 5;
    }
}
