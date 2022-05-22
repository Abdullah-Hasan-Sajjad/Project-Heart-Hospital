package project.heart.hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws IOException {

        Scanner rafi = new Scanner(System.in);
        /* for (int i = 1; i <= 2; i++) {
            Doctor a = new Doctor();
            System.out.println("Give an username");
            String username = rafi.nextLine();
            a.doctor_account_creator(username);
            System.out.println("Give an id");
            int k=rafi.nextInt();
            a.doctor_account_printDetail(k);
        }
       //a.doctor_account_printDetail(rafi.nextInt());
        
            try {

                Formatter c = new Formatter("C:/Users/Dell/Project Heart Hospital/Doctors/Doctor's id.txt");
                c.format("%s %s\r\n","Id: ",2);
                c.close();
            } catch (Exception e) {
                System.out.println(e);
            }
         
        
        //Storing Doctor's id and the username to file Doctor's id.txt
        try {
            FileWriter x = new FileWriter("C:/Users/Dell/Project Heart Hospital/Doctors/Doctor's id.txt", true);
            BufferedWriter y = new BufferedWriter(x);
            PrintWriter z = new PrintWriter(y);
            z.print(doctorId);
            z.println(user_name);
            z.println("now you go please leave me alone ");

            z.close();

        } catch (Exception e) {
            System.out.println(e);
        }
         
        
        
        
        
        try {
            File file = new File("C:/Users/Dell/Project Heart Hospital/Doctors/Doctor's id.txt");
            Scanner sc = new Scanner(file);
            int id_checker = 1;
            while (sc.hasNext() && id_checker != 0) {
                int id  =   sc.nextInt();
                String username =   sc.next();
                if (id  ==  2) {
                    try {
                        id_checker = 0;
                        File dr_profile_reader = new File("C:/Users/Dell/Project Heart Hospital/Doctors/" + username + ".txt");
                        Scanner sc2 = new Scanner(dr_profile_reader);
                        System.out.println("ID: " + id + " Usernamae: " + username);
                        while (sc2.hasNext()) {

                            System.out.println(sc2.nextLine());

                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                }

            }

            // if enter wrong id
            //the id_checker would not updated to 0
            if (id_checker  ==  1) {
                System.out.println("you entered wrong id");
            }
        } catch (Exception  e){
            System.out.println  (e);
        }

        String time_schedule;
        try {
            File file = new File("C:/Users/Dell/Project Heart Hospital/Doctors/Time Schedule/"+doctor_type+"/"+doctor_JobType+"/"+doctor_rank+"/Time Schedule.txt");
            Scanner sc = new Scanner(file);
            int c = sc.nextInt();
            if (c == 0) {

                try {
                    time_schedule = "aS1";
                    c++;
                    Formatter l = new Formatter("C:/Users/Dell/Project Heart Hospital/Doctors/Thoracic Surgeon.txt");
                    l.format("%s \r\n", c);
                    //l.format("%s %s %s\r\n", "doctorId", "user_name", "aS1");
                    l.format("%s %s %s\r\n",doctorId,user_name,"aS1");
                    l.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {

                try {

                    
                    int id = sc.nextInt();
                    String username = sc.next();
                    time_schedule = sc.next();
                    if (time_schedule == "aS1") {
                        time_schedule = "bS1";

                    } else if (time_schedule == "bS1") {
                        time_schedule = "aS2";
                    } else if (time_schedule == "aS2") {
                        time_schedule = "bS2";
                    } else if (time_schedule == "bS2") {
                        time_schedule = "aS3";
                    } else if (time_schedule == "aS3") {
                        time_schedule = "bS3";
                    } else {
                        time_schedule = "aS1";
                    }

                    
                   
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
//C:\Users\Dell\Project Heart Hospital\Doctors\Time Schedule\General\General Cardiologist\1st Grade Medical Officer
        //"C:/Users/Dell/Project Heart Hospital/Doctors/Time Schedule/"+doctor_type+"/"+doctor_JobType+"/"+doctor_rank+"/Time Schedule.txt"
        String time_schedule = "";
        String office_hour;
        if (time_schedule == "aS1") {
            office_hour = "(9:00am-5:00pm)";

        } else if (time_schedule == "bS1") {
            office_hour = "(9:00am-5:00pm)";
        } else if (time_schedule == "aS2") {
            office_hour = "(5:00pm-1:00am)";
        } else if (time_schedule == "bS2") {
            office_hour = "(5:00pm-1:00am)";
        } else if (time_schedule == "aS3") {
            office_hour = "(1:00am-9:00am)";
        } else {
            office_hour = "(1:00am-9:00am)";
        }

    }

        Patient b = new Patient();
        System.out.println("Give an username");
        String username = rafi.nextLine();
        b.patient_account_creator(username);

        System.out.println("Give an id");
        int k = rafi.nextInt();
        b.patient_account_printDetail(k);
         

        for (int i = 1; i <= 10; i++) {
            System.out.print("[|");
            for (int j = 1; j <= 1000000000; j++) {
                for (int k = 1; k <= 1000000000; k++) {
                }
            }
        }
         */
        final String ANSI_RESET = "\u001B[0m";

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        /*
        System.out.println(ANSI_BLACK_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_RED_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_CYAN_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_WHITE_BACKGROUND + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println("\u001b[41;1m" + "This text has red text but a default background!" + ANSI_RESET);
         
        System.out.print("\n\n\n\n\n\n                                                            ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET);
            System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET);
            //System.out.print(ANSI_WHITE_BACKGROUND+" "+ ANSI_RESET);
            //System.out.print(ANSI_GREEN_BACKGROUND+" "+ ANSI_RESET);
            for (int j = 1; j <= 1000000000; j++) {
                for (int k = 1; k <= 1000000000; k++) {
                }
            }
        }
        for (int i = 1; i <= 4; i++) {
            System.out.print(ANSI_GREEN_BACKGROUND + "  " + ANSI_RESET);
            System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET);
        }
        System.out.println("");
        System.out.print("                                                            ");
         
        LoadingPage a = new LoadingPage();
        final String Black = "\u001b[30m";
        final String Red = "\u001b[31m";
        final String Green = "\u001b[32m";
        final String Yellow = "\u001b[33m";
        final String Blue = "\u001b[34m";
        final String Magenta = "\u001b[35m";
        final String Cyan = "\u001b[36m";
        final String White = "\u001b[37m";
        final String Reset = "\u001b[0m";
//end

        System.out.println(a.word_HEART());
        System.out.println("");
        System.out.println(a.word_HOSPITAL());
        a.process1();

    }*/
        //Scanner rafi = new Scanner(System.in);
    }
}
