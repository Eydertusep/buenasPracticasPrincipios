public class Dry {

    public boolean auth(String user, String password) {
        if (user.equals("user") || user.equals("admins") && password.equals("1234") || password.equals("abcd")){
            return true;
        }
        return false;
    }
}
