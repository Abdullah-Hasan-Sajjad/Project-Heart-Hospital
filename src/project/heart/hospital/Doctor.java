package project.heart.hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Doctor {

    Scanner rafi = new Scanner(System.in);
    static int Doctor_file_Counter = 0;

    public String doctor_name, doctor_type, doctor_JobType, doctor_rank, time_schedule, office_week, office_hour;
    int doctorId;

    public void doctor_account_creator(String user_name) {
        Doctor_file_Counter++;
        doctorId = Doctor_file_Counter;

//Storing Doctor's id and the username to file Doctor's id.txt
        try {
            FileWriter x = new FileWriter("C:/Users/Dell/Project Heart Hospital/Doctors/Doctor's id.txt", true);
            BufferedWriter y = new BufferedWriter(x);
            PrintWriter z = new PrintWriter(y);
            z.print(doctorId);
            z.println(" " + user_name);

            z.close();

        } catch (Exception e) {
            System.out.println(e);
        }

//creating file for  new doctor
        try {
            Formatter c = new Formatter("C:/Users/Dell/Project Heart Hospital/Doctors/" + user_name + ".txt");

//doctor's name taking
            System.out.println("Doctor's ID is: " + doctorId);
            System.out.print("What's the name of the new doctor? ");
            doctor_name = rafi.nextLine();

//doctor's type taking
            int doctor_type_checker;
            for (doctor_type_checker = 0; doctor_type_checker == 0;) {
                System.out.println("What's the Type of the new doctor?\nIf he is a General Cardiologist then Press 1 \nIf he is a Specialist then Press 2\nOr if he is a Surgeon then press 3");
                doctor_type_checker = rafi.nextInt();

                if (doctor_type_checker == 1) {
                    doctor_type = "General";
                } else if (doctor_type_checker == 2) {
                    doctor_type = "Specialist";

                } else if (doctor_type_checker == 3) {
                    doctor_type = "Surgeon";

                } else {
                    System.out.println("Please press the vaid number 1,2 or 3");
                    doctor_type_checker = 0;
                }
            }

//doctor's JobType taking
            for (int doctor_JobType_checker = 0; doctor_JobType_checker == 0;) {

                if (doctor_type_checker == 1) {
                    doctor_JobType = "General Cardiologist";
                    System.out.println("Okay I've understood that he is a General Cardiologist");
                    doctor_JobType_checker = 1;
                } else if (doctor_type_checker == 2) {
                    System.out.println("What Type of Specialist he is?\nIf he is an Interventional Cardiologist then Press 1 \nIf he is a Invasive Cardiologist then Press 2\nIf he is a Noninvasive Cardiologist then press 3\nIf he is a Pediatric Cardiologist then press 4\nIf he is a Cardiac Electrophysiologist then press 5");
                    doctor_JobType_checker = rafi.nextInt();
                    if (doctor_JobType_checker == 1) {
                        doctor_JobType = "Interventional Cardiologist";
                    } else if (doctor_JobType_checker == 2) {
                        doctor_JobType = "Invasive Cardiologist";
                    } else if (doctor_JobType_checker == 3) {
                        doctor_JobType = "Noninvasive Cardiologist";
                    } else if (doctor_JobType_checker == 4) {
                        doctor_JobType = "Pediatric Cardiologist";
                    } else if (doctor_JobType_checker == 5) {
                        doctor_JobType = "Cardiac Electrophysiologist";
                    } else {
                        System.out.println("Please press the vaid number 1,2,3,4 or 5");
                        doctor_JobType_checker = 0;
                    }
                } else if (doctor_type_checker == 3) {
                    System.out.println("What Type of Surgeon he is?\nIf he is an Cardiothoracic Surgeon then Press 1 \nIf he is a Thoracic Surgeon then Press 2\n Or If he is a Vascular Surgeon then press 3");
                    doctor_JobType_checker = rafi.nextInt();
                    if (doctor_JobType_checker == 1) {
                        doctor_JobType = "Cardiothoracic Surgeon";
                    } else if (doctor_JobType_checker == 2) {
                        doctor_JobType = "Thoracic Surgeon";
                    } else if (doctor_JobType_checker == 3) {
                        doctor_JobType = "Vascular Surgeon";
                    } else {
                        System.out.println("Please press the vaid number 1,2 or 3");
                        doctor_JobType_checker = 0;
                    }

                } else {

                }
            }

// doctor's rank taking
            for (int doctor_rank_checker = 0; doctor_rank_checker == 0;) {

                if (doctor_type_checker == 1) {
                    System.out.println("What is the grade of the doctor?\nIf he is a Professor then press 1\nIf he is an Associate Professor then press 2\nIf he is a 1st Grade Medical Officer then press 3\nIf he is a 2nd Grade Medical Officer then press 4");
                    doctor_rank_checker = rafi.nextInt();
                    if (doctor_rank_checker == 1) {
                        doctor_rank = "Professor";
                    } else if (doctor_rank_checker == 2) {
                        doctor_rank = "Associate Professor";
                    } else if (doctor_rank_checker == 3) {
                        doctor_rank = "1st Grade Medical Officer";
                    } else if (doctor_rank_checker == 4) {
                        doctor_rank = "2nd Grade Medical Officer";
                    } else {
                        System.out.println("Please press the vaid number 1,2,3 or 4");
                        doctor_rank_checker = 0;
                    }

                } else {

                    System.out.println("What is the grade of the doctor?\nIf he is a Professor then press 1\nOr if he is an Associate Professor then press 2");

                    doctor_rank_checker = rafi.nextInt();
                    if (doctor_rank_checker == 1) {
                        doctor_rank = "Professor";
                    } else if (doctor_rank_checker == 2) {
                        doctor_rank = "Associate Professor";
                    } else {
                        System.out.println("Please press the vaid number 1 or 2");
                        doctor_rank_checker = 0;

                    }
                }
            }
//Doctor's Time Schedule creating
            try {
                File file = new File("C:/Users/Dell/Project Heart Hospital/Doctors/Time Schedule/" + doctor_type + "/" + doctor_JobType + "/" + doctor_rank + "/Time Schedule.txt");
                Scanner sc = new Scanner(file);
                int p = sc.nextInt();
                if (p == 0) {

                    try {
                        time_schedule = "aS1";
                        p++;
                        Formatter l = new Formatter("C:/Users/Dell/Project Heart Hospital/Doctors/Time Schedule/" + doctor_type + "/" + doctor_JobType + "/" + doctor_rank + "/Time Schedule.txt");
                        l.format("%s \r\n", p);
                        l.format("%s %s %s\r\n", doctorId, user_name, "aS1");
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
            //System.out.println(time_schedule);

//Doctor's office week
            if (time_schedule == "aS1") {
                office_week = "Friday Saturday Sunday Monday Tuesday";

            } else if (time_schedule == "bS1") {
                office_week = "Sunday Monday Tuesday Wednesday Thursday";
            } else if (time_schedule == "aS2") {
                office_week = "Friday Saturday Sunday Monday Tuesday";
            } else if (time_schedule == "bS2") {
                office_week = "Sunday Monday Tuesday Wednesday Thursday";
            } else if (time_schedule == "aS3") {
                office_week = "Friday Saturday Sunday Monday Tuesday";
            } else {
                office_week = "Sunday Monday Tuesday Wednesday Thursday";
            }

//Doctor's Office Hour 
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

//writing doctor's information in file
            c.format("%s %s\r\n", "Name: ", doctor_name);
            c.format("%s %s\r\n", "ID: ", doctorId);
            c.format("%s %s\r\n", "Doctor type: ", doctor_type);
            c.format("%s %s\r\n", "Doctor job type: ", doctor_JobType);
            c.format("%s %s\r\n", "Rank: ", doctor_rank);
            c.format("%s %s\r\n", "Office week: ", office_week);
            c.format("%s %s\r\n", "Office hour: ", office_hour);

            c.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public void doctor_account_printDetail(int a) {
        try {
            File file = new File("C:/Users/Dell/Project Heart Hospital/Doctors/Doctor's id.txt");
            Scanner sc = new Scanner(file);
            int id_checker = 1;
            while (sc.hasNext() && id_checker != 0) {
                int id = sc.nextInt();
                String username = sc.next();
                if (id == a) {
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
            if (id_checker == 1) {
                System.out.println("you entered wrong id");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
