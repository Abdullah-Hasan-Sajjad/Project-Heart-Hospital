package project.heart.hospital;

import java.io.File;
import java.util.Scanner;

public class Heart_Hospital {

    public static void main(String[] args) {

        Scanner rafi = new Scanner(System.in);
        Boolean loop_run = true;
        int passread;

        LoadingPage a = new LoadingPage();
//heart hospital print
        System.out.println(a.word_HEART());
        System.out.println("");
        System.out.println(a.word_HOSPITAL());

//end
//Loading 
        a.process1();
        System.out.println("");
        String o = rafi.nextLine();
//Loading end

        while (loop_run == true) {

            Boolean loop_run_for_admin = false;
            Boolean loop_run_for_doctor = false;
            Boolean new_doctor = false;
            Boolean new_patient = false;
            Boolean admin_pass_check = false;

            System.out.println("Admin Login 1");
            System.out.println("Doctor's Login 2");
            System.out.println("Quit program 0");
            int x = rafi.nextInt();
            if (x == 1) {

                while (admin_pass_check == false) {
                    System.out.println("Give Amin Password: ");
                    System.out.println("Quit 0");
                    passread = rafi.nextInt();
                    if (passread == 0) {
                        admin_pass_check = true;
                        loop_run_for_admin = false;
                    } else {
                        //read pass
                        try {
                            File file = new File("C:/Users/Dell/Project Heart Hospital/Admin Pass/Admin Pass.txt");
                            Scanner sc = new Scanner(file);
                            while (sc.hasNext()) {

                                if (sc.nextInt() == passread) {
                                    admin_pass_check = true;
                                    loop_run_for_admin = true;
                                    loop_run_for_doctor = false;
                                } else {
                                    admin_pass_check = false;
                                    System.out.println("Wrong password");

                                }
                            }

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }

                }

                //loop_run_for_admin = true;
                //loop_run_for_doctor = false;
            } else if (x == 2) {
                loop_run_for_doctor = true;
                loop_run_for_admin = false;
            } else if (x == 0) {
                loop_run = false;
            } else {
                System.out.println("Please enter a valid number 1 or 2");
            }
            while (loop_run_for_admin == true) {
                System.out.println("Okay if you are admin\nInput a doctor 1\nInput a patient 2\nDoctor's detail 3\nPatient detail 4\nQuit 0");
                int y = rafi.nextInt();
                if (y == 1) {
                    new_doctor = true;
                    new_patient = false;
                } else if (y == 2) {
                    new_patient = true;
                    new_doctor = false;
                } else if (y == 0) {
                    loop_run_for_admin = false;
                } else if ((y != 3) && (y != 4)) {
                    System.out.println("Please enter a valid number 1,2 or 0");
                }
                while (new_doctor == true) {

                    System.out.println("Okay if you are sure you want to input an doctor then press 1\nQuit 0");
                    int z = rafi.nextInt();
                    if (z == 1) {
                        //code for create new doctor's profile
                        Doctor doctor = new Doctor();
                        System.out.println("Give an username");
                        String username = rafi.next();
                        for (int i = 1; i <= 1000000000; i++) {
                        }
                        doctor.doctor_account_creator(username);
                        //end
                    } else if (z == 0) {
                        new_doctor = false;
                    } else {
                        System.out.println("Please enter a valid number 1 or 0");
                    }
                }
                while (new_patient == true) {
                    System.out.println("Okay if you are sure you want to input a patient then press 1\nQuit 0");
                    int z = rafi.nextInt();
                    if (z == 1) {
                        //code for create new patient
                        Patient patient = new Patient();
                        System.out.println("Give an username");
                        String username = rafi.next();
                        patient.patient_account_creator(username);
                        //end 
                    } else if (z == 0) {
                        new_patient = false;
                    } else {
                        System.out.println("Please enter a valid number 1 or 0");
                    }
                }
                while (y == 3) {
                    System.out.print("Give doctor's id");
                    int z = rafi.nextInt();
                    Doctor doctor = new Doctor();
                    doctor.doctor_account_printDetail(z);
                    y = 50;
                }
                while (y == 4) {
                    System.out.print("Give patient's id");
                    int z = rafi.nextInt();
                    Patient patient = new Patient();
                    patient.patient_account_printDetail(z);
                    y = 50;
                }
            }
            while (loop_run_for_doctor == true) {
                System.out.println("Okay if you are doctor\nSee patient detail 1\nSee doctor's profile 2\nQuit 0");
                int z = rafi.nextInt();
                if (z == 1) {
                    //code for see patient details
                    Patient patient = new Patient();
                    System.out.println("Give patient id");
                    int k = rafi.nextInt();
                    patient.patient_account_printDetail(k);
                    //end 
                } else if (z == 2) {
                    //code for see doctor details
                    Doctor doctor = new Doctor();
                    System.out.println("Give doctor's id");
                    int k = rafi.nextInt();
                    doctor.doctor_account_printDetail(k);
                    //end
                } else if (z == 0) {
                    loop_run_for_doctor = false;
                } else {
                    System.out.println("Please enter a valid number 1,2 or 0");
                }
            }
        }

    }
}
