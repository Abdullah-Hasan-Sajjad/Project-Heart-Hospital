package project.heart.hospital;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class Patient {

    String patient_name, patient_age, patient_sex, patient_address, patient_phoneNumber, patient_primaryCarePhysician, patient_case;
    Scanner rafi = new Scanner(System.in);
    static int patient_file_Counter = 0;
    int patientId;

    public void patient_account_creator(String patient_user_name) {
        patient_file_Counter++;
        patientId = patient_file_Counter;

//Storing patient's id and the username to file Patient's id.txt
        try {
            FileWriter x = new FileWriter("C:/Users/Dell/Project Heart Hospital/Patient/Patient's id.txt", true);
            BufferedWriter y = new BufferedWriter(x);
            PrintWriter z = new PrintWriter(y);
            z.print(patientId);
            z.println(" " + patient_user_name);

            z.close();

        } catch (Exception e) {
            System.out.println(e);
        }

//creating file for  new patient
        try {
            Formatter c = new Formatter("C:/Users/Dell/Project Heart Hospital/Patient/" + patient_user_name + ".txt");

//patient's name taking
            System.out.println("Patient's ID is: " + patientId);
            System.out.print("Name: ");
            patient_name = rafi.nextLine();

//patient's age taking
            System.out.print("Age: ");
            patient_age = rafi.nextLine();
//patient's sex taking
            System.out.print("Sex: ");
            patient_sex = rafi.nextLine();

//patient's address taking
            System.out.print("Address: ");
            patient_address = rafi.nextLine();

//patient's phone no. taking
            System.out.print("Phone number: ");
            patient_phoneNumber = rafi.nextLine();

//patient's Primary care physician taking
            System.out.print("Primary care physician: ");
            patient_primaryCarePhysician = rafi.nextLine();

//patient's case taking
            System.out.println("Case of the patient: ");
            patient_case = rafi.nextLine();

//writing patient's information in file
            c.format("%s %s\r\n", "Name: ", patient_name);
            c.format("%s %s\r\n", "ID: ", patientId);
            c.format("%s %s\r\n", "Age: ", patient_age);
            c.format("%s %s\r\n", "Sex: ", patient_sex);
            c.format("%s %s\r\n", "Address: ", patient_address);
            c.format("%s %s\r\n", "Phone number: ", patient_phoneNumber);
            c.format("%s %s\r\n", "Primary care physician: ", patient_primaryCarePhysician);
            c.format("%s %s\r\n", "Case: ", patient_case);

            c.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public void patient_account_printDetail(int a) {

        try {
            File file = new File("C:/Users/Dell/Project Heart Hospital/Patient/Patient's id.txt");
            Scanner sc = new Scanner(file);
            int id_checker = 1;
            while (sc.hasNext() && id_checker != 0) {
                int id = sc.nextInt();
                String username = sc.next();
                if (id == a) {
                    try {
                        id_checker = 0;
                        File dr_profile_reader = new File("C:/Users/Dell/Project Heart Hospital/Patient/" + username + ".txt");
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
