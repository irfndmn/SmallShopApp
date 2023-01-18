package login;

import java.util.Scanner;

public class CheckSignInfo {



    public  void logIn() {
        String userEntry;
        boolean isContainsMail;
        boolean isContiansUser;


              Scanner sc = new Scanner(System.in);

             System.out.print("Enter UserName or Mail : ");
             userEntry = sc.nextLine();

            isContainsMail = ForRegisterUserInfo.emails.contains(userEntry);
            isContiansUser = ForRegisterUserInfo.usernames.contains(userEntry);

            if (isContiansUser || isContainsMail) {

                boolean isCheckPsw;
                int idx;

                do{
                    isCheckPsw=true;
                    System.out.print("Please Enter Password : ");
                    String userPsw=sc.nextLine().trim();

                    if(isContainsMail){
                        idx=ForRegisterUserInfo.emails.indexOf(userEntry);

                    } else {
                        idx=ForRegisterUserInfo.usernames.indexOf(userEntry);

                    }
                    String validPsw=ForRegisterUserInfo.passwords.get(idx);
                    if(userPsw.equals(validPsw)){
                       SmallShop sh=new SmallShop();
                    }else{
                        System.out.println("It is invalid password please try again");
                        isCheckPsw=false;
                    }


                }while(!isCheckPsw);


            }else{
                System.out.println("Invalid UserName or E mail... If you are not registered, please register ...");

            }


    }


}
