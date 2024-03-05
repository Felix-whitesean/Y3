public class Admin extends User {
    int adminId;
    Admin(String userName, int natId, String pass, int adId){
        super(userName, natId, pass);
        adminId = adId;
    }
}
