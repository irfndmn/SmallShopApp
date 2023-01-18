package login;

import java.util.Scanner;

public class Register {


    public void register(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Your Name : ");
        String name =sc.nextLine();




        String username;
        boolean isExist;

        do{
            System.out.print("Your Username : ");
            username=sc.nextLine();
            isExist=ForRegisterUserInfo.usernames.contains(username);
            if(isExist){
                System.out.println("You Cannot Use This Username... This name has been used before ");
            }

        }while(isExist);

        String eMail;
        boolean isExistemail;
        boolean isValid;

        do{
            System.out.print("Your Email : ");
            eMail=sc.nextLine().trim();
             isValid=validEmail(eMail);
             isExistemail=ForRegisterUserInfo.emails.contains(eMail);
            if(isExistemail){
                System.out.println("You Cannot Use This Mail address... This mail address has been used before");
                isValid=false;
            }
        }while (!isValid);



        String psw;
        boolean isExis;
        boolean isPswValid;

        do {
            System.out.print("Your Password : ");
            psw=sc.nextLine();
            isPswValid=validPassword(psw);
            isExis=ForRegisterUserInfo.passwords.contains(psw);
            if(isExis){
                System.out.println("You Cannot Use This Password... This password has been used before");
                isPswValid=false;
            }

        }while (!isPswValid);


        ForRegisterUserInfo usId=new ForRegisterUserInfo(name,eMail,username,psw);
        System.out.println("Congratulations, your registration has been successfully completed");

            }




            public static boolean validEmail(String email){

         boolean isEmailControl;


            boolean isHaveSpace=email.contains(" ");
            boolean isContain=email.contains("@");
            if(isHaveSpace) {
                System.out.println("Email Can Not Contains Space");
                isEmailControl=false;
            } else if (!isContain) {
                System.out.println("Email has to contain @");
                isEmailControl=false;
            } else {

                String emaiLPart1="";
                String emaiLPart2="";
                if(!(email.startsWith("@")||email.endsWith("@"))){

                    emaiLPart1= email.split("@")[0];
                    emaiLPart2= email.split("@")[1];

                }
                    boolean first=emaiLPart1.replaceAll("[A-Za-z0-9-._]","").length()==0;
                    boolean endMail=emaiLPart2.equals("gmail.com")||
                            emaiLPart2.equals("hotmail.com")||
                            emaiLPart2.equals("yahoo.com");
                    if(!first){
                        System.out.println("Email cannot contains any character except letters,digit and -,.,_");

                    }else if(!endMail){
                        System.out.println("Email have to ends with gmail.com, hotmail.com, yahoo.com ");
                    }
                    isEmailControl=first&&endMail;

                }
            if(!isEmailControl){
                System.out.println("Invalid Mail Please Try Again...");

            }

                return isEmailControl;

            }


            public static boolean validPassword(String psw){
                boolean isPswControl;

                boolean space=psw.contains(" ");
                boolean characterNum=psw.length()>5;
                boolean lowCase=psw.replaceAll("[^a-z]","").length()>0;
                boolean upCase=psw.replaceAll("[^A-Z]","").length()>0;
                boolean digit=psw.replaceAll("[^0-9]","").length()>0;
                boolean symbol=psw.replaceAll("\\P{Punct}","").length()>0;
                if(space){
                    System.out.println("Psw can not contain space");
                }
                if(!characterNum){
                    System.out.println("Password must be at least 6 character");
                }
                if (!lowCase){
                    System.out.println("Password must contain at least one lowercase letter ");
                }
                if(!upCase){
                    System.out.println("Password must contain at least one uppercase letter ");

                }
                if(!digit){
                    System.out.println("Password must contain at least one digit ");

                }
                if(!symbol){
                    System.out.println("Password must contain at least one symbol ");

                }

                isPswControl=!space&&characterNum&&lowCase&&upCase&&digit&&symbol;

                if(!isPswControl){
                    System.out.println("Invalid Password please try again");
                }

                return isPswControl;

            }






}
