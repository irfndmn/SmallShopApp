package login;

import java.util.ArrayList;
import java.util.List;

public class ForRegisterUserInfo {
    public String name;
    public String eMail;
    public String userName;
    public String password;



    public static List<String> usernames=new ArrayList<>();
    public static List<String> emails=new ArrayList<>();
    public static List<String> passwords=new ArrayList<>();


    public void addInfoToList(){
        usernames.add(userName);
        emails.add(eMail);
        passwords.add(password);

    }

    public ForRegisterUserInfo(String name, String eMail, String userName, String password) {
        this.name = name;
        this.eMail = eMail;
        this.userName = userName;
        this.password = password;
        addInfoToList();
    }


}
