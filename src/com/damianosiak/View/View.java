package com.damianosiak.View;

import com.damianosiak.Controller.Controller;
import com.damianosiak.Model.Student;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This class is responsible for displaying all views who  is exist in this application
 */

public class View {
    //Controller controller = new Controller();

    /**
     * This method is responsible for displaying panel with all application author information
     */
    public static void displayAuthorInformation(){
        Controller.clearConsole();
        System.out.println("==================================");
        System.out.println("CRUDconsoleApp");
        System.out.println("==================================");
        System.out.println("Author:");
        System.out.println("----------------------------------");
        System.out.println("Full Name: Damian Osiak");
        System.out.println("University: WSB University in Cieszyn");
        System.out.println("Student no.: 40843");
        System.out.println("Field of study: Computer Science");
        System.out.println("Part-time studies");
        System.out.println("Semester: 3 (Fail semester)");
        System.out.println("----------------------------------");
        System.out.println("Creation date: 10.12.2020");
        System.out.println("==================================");
        Controller.pressAnyKeyToContinue();
    }


    /**
     * This method is responsible for displaying form for creating new student
     */
    public static void displayCreateStudentForm(){
        Controller.clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Create new student");
        System.out.println("==================================");
        System.out.print("1. Enter student First Name: ");
        String formStudentFirstName = scanner.nextLine();
        System.out.print("2. Enter student Last Name: ");
        String formStudentLastName = scanner.nextLine();
        System.out.print("3. Enter student City: ");
        String formStudentCity = scanner.nextLine();
        System.out.print("4. Enter student Address: ");
        String formStudentAddress = scanner.nextLine();
        System.out.print("5. Enter student Phone Number: ");
        String formStudentPhoneNumber = scanner.nextLine();
        System.out.print("6. Enter student Birthday Year: ");
        Integer formStudentBirthdayYear = scanner.nextInt();
        System.out.print("7. Enter student Birthday Day: ");
        Integer formStudentBirthdayDay = scanner.nextInt();
        System.out.print("8. Enter student Birthday Month: ");
        Integer formStudentBirthdayMonth = scanner.nextInt();
        Controller.createStudent(formStudentFirstName,formStudentLastName,formStudentCity,formStudentAddress,formStudentPhoneNumber,formStudentBirthdayYear,formStudentBirthdayDay,formStudentBirthdayMonth);
        System.out.println("Student was created");
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying specific student information panel by given id
     * @param id
     */
    public static void displayReadStudentPanel(Integer id){
        Controller.clearConsole();
        try{
            System.out.println("==================================");
            System.out.println("Student {"+id+"} information");
            System.out.println("==================================");
            System.out.println("1. First Name: "+Controller.readStudent(id).getStudentFirstName());
            System.out.println("2. Last Name: "+Controller.readStudent(id).getStudentLastName());
            System.out.println("3. City: "+Controller.readStudent(id).getStudentCity());
            System.out.println("4. Address: "+Controller.readStudent(id).getStudentAddress());
            System.out.println("5. Phone Number: "+Controller.readStudent(id).getStudentPhoneNumber());
            System.out.println("6. Birthday Year: "+Controller.readStudent(id).getStudentBirthdayYear());
            System.out.println("7. Birthday Day: "+Controller.readStudent(id).getStudentBirthdayDay());
            System.out.println("8. Birthday Month: "+Controller.readStudent(id).getStudentBirthdayMonth());
            System.out.println("==================================");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Student with id {"+id+"} doesn't exist!");
        }
        Controller.pressAnyKeyToContinue();
    }


    /**
     * This method is responsible for displaying panel about all students who exist in database
     */
    public static void displayReadAllStudentsPanel(){
        Controller.clearConsole();
        System.out.println("==================================");
        System.out.println("All students information");
        System.out.println("==================================");
        Integer i=0;
        for(Student student: Controller.students){
            System.out.println("----------------------------------");
            System.out.println("StudentID: "+i);i++;
            System.out.println("1. First Name: "+student.getStudentFirstName());
            System.out.println("2. Last Name: "+student.getStudentLastName());
            System.out.println("3. City: "+student.getStudentCity());
            System.out.println("4. Address: "+student.getStudentAddress());
            System.out.println("5. Phone Number: "+student.getStudentPhoneNumber());
            System.out.println("6. Birthday Year: "+student.getStudentBirthdayYear());
            System.out.println("7. Birthday Day: "+student.getStudentBirthdayDay());
            System.out.println("8. Birthday Month: "+student.getStudentBirthdayMonth());
            System.out.println("----------------------------------");
        }
        System.out.println("==================================");
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for updating information about specific student by given id
     * If user enter "0" value then previous value is still unchanged exist
     * @param id
     */
    public static void displayUpdateStudentForm(Integer id){
        Controller.clearConsole();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==================================");
            System.out.println("Update student");
            System.out.println("==================================");
            System.out.println("1. First Name: " + Controller.readStudent(id).getStudentFirstName());
            System.out.println("2. Last Name: " + Controller.readStudent(id).getStudentLastName());
            System.out.println("3. City: " + Controller.readStudent(id).getStudentCity());
            System.out.println("4. Address: " + Controller.readStudent(id).getStudentAddress());
            System.out.println("5. Phone Number: " + Controller.readStudent(id).getStudentPhoneNumber());
            System.out.println("6. Birthday Year: " + Controller.readStudent(id).getStudentBirthdayYear());
            System.out.println("7. Birthday Day: " + Controller.readStudent(id).getStudentBirthdayDay());
            System.out.println("8. Birthday Month: " + Controller.readStudent(id).getStudentBirthdayMonth());
            System.out.println("==================================");
            System.out.println("ENTER '0' (zero) TO REMAIN CURRENT VALUE!");
            System.out.println("----------------------------------");

            System.out.print("1. Enter student First Name: ");
            String formStudentFirstName = scanner.nextLine();
            if (formStudentFirstName.equals("0")) {
                formStudentFirstName = Controller.readStudent(id).getStudentFirstName();
            }

            System.out.print("2. Enter student Last Name: ");
            String formStudentLastName = scanner.nextLine();
            if (formStudentLastName.equals("0")) {
                formStudentLastName = Controller.readStudent(id).getStudentLastName();
            }

            System.out.print("3. Enter student City: ");
            String formStudentCity = scanner.nextLine();
            if (formStudentCity.equals("0")) {
                formStudentCity = Controller.readStudent(id).getStudentCity();
            }

            System.out.print("4. Enter student Address: ");
            String formStudentAddress = scanner.nextLine();
            if (formStudentAddress.equals("0")) {
                formStudentAddress = Controller.readStudent(id).getStudentAddress();
            }

            System.out.print("5. Enter student Phone Number: ");
            String formStudentPhoneNumber = scanner.nextLine();
            if (formStudentPhoneNumber.equals("0")) {
                formStudentPhoneNumber = Controller.readStudent(id).getStudentPhoneNumber();
            }

            System.out.print("6. Enter student Birthday Year: ");
            Integer formStudentBirthdayYear = scanner.nextInt();
            if (formStudentBirthdayYear.toString().equals("0")) {
                formStudentBirthdayYear = Controller.readStudent(id).getStudentBirthdayYear();
            }

            System.out.print("7. Enter student Birthday Day: ");
            Integer formStudentBirthdayDay = scanner.nextInt();
            if (formStudentBirthdayDay.toString().equals("0")) {
                formStudentBirthdayDay = Controller.readStudent(id).getStudentBirthdayDay();
            }

            System.out.print("8. Enter student Birthday Month: ");
            Integer formStudentBirthdayMonth = scanner.nextInt();
            if (formStudentBirthdayMonth.toString().equals("0")) {
                formStudentBirthdayMonth = Controller.readStudent(id).getStudentBirthdayMonth();
            }

            Controller.updateStudent(id, formStudentFirstName, formStudentLastName, formStudentCity, formStudentAddress, formStudentPhoneNumber, formStudentBirthdayYear, formStudentBirthdayDay, formStudentBirthdayMonth);
            System.out.println("Student was updated");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Student with id {"+id+"} doesn't exist!");
        }
        //Controller.pressAnyKeyToContinue();
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying form for deleting given student by id
     * @param id
     */
    public static void displayDeleteStudentForm(Integer id){
        Controller.clearConsole();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("==================================");
            System.out.println("Delete student:");
            System.out.println("==================================");
            System.out.println("1. First Name: " + Controller.readStudent(id).getStudentFirstName());
            System.out.println("2. Last Name: " + Controller.readStudent(id).getStudentLastName());
            System.out.println("3. City: " + Controller.readStudent(id).getStudentCity());
            System.out.println("4. Address: " + Controller.readStudent(id).getStudentAddress());
            System.out.println("5. Phone Number: " + Controller.readStudent(id).getStudentPhoneNumber());
            System.out.println("6. Birthday Year: " + Controller.readStudent(id).getStudentBirthdayYear());
            System.out.println("7. Birthday Day: " + Controller.readStudent(id).getStudentBirthdayDay());
            System.out.println("8. Birthday Month: " + Controller.readStudent(id).getStudentBirthdayMonth());
            System.out.println("==================================");
            System.out.println("Are you sure? Enter '1' for YES or '0' for NO");
            System.out.println("----------------------------------");
            System.out.print("Select: ");
            Integer selectValue = scanner.nextInt();
            switch (selectValue) {
                case 0:
                    System.out.println("Process aborted!");
                    Controller.pressAnyKeyToContinue();
                    break;
                case 1:
                    Controller.deleteStudent(id);
                    System.out.println("Student was deleted!");
                    Controller.pressAnyKeyToContinue();
                    break;
                default:
                    System.out.println("Wrong select!");
                    Controller.pressAnyKeyToContinue();
                    break;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Student with id {"+id+"} doesn't exist!");
        }
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying panel information about all class
     */
    public static void displayAllClassInformation(){
        Controller.clearConsole();
        System.out.println("==================================");
        System.out.println("All class information");
        System.out.println("==================================");
        for(Student.StudentClass studentClass: Student.StudentClass.values()){
            System.out.println("CLASS ID: "+studentClass.name());
            System.out.println("Class Teacher: "+studentClass.getClassTeacher());
            System.out.println("Class Profile: "+studentClass.getClassProfile());
            System.out.println("Class Building: "+studentClass.getClassBuilding());
            System.out.println("----------------------------------");
        }
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying form for adding given student to specific class
     * @param id
     */
    public static void displayAddStudentToClassForm(Integer id){
        Controller.clearConsole();
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("==================================");
            System.out.println("Add student to class:");
            System.out.println("==================================");
            System.out.println("Class ID: ");
            for(Student.StudentClass studentClass: Student.StudentClass.values()){
                System.out.println(studentClass.name());
            }
            System.out.println("==================================");
            System.out.print("Select: ");
            String selectValue=scanner.next();
            Controller.addStudentToClass(id,selectValue);
            System.out.println();System.out.println("Student was added to class");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Student with id {"+id+"} doesn't exist!");
        }
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying class information panel for specific student by given student id
     * @param id
     */
    public static void displayStudentClassPanel(Integer id){
        Controller.clearConsole();
        try {
            System.out.println("==================================");
            System.out.println("Student class panel:");
            System.out.println("==================================");
            System.out.println("Student ID: " + id);
            System.out.println("Student First Name: " + Controller.readStudent(id).getStudentFirstName());
            System.out.println("Student Last Name: " + Controller.readStudent(id).getStudentLastName());
            System.out.println("----------------------------------");
            if (Controller.readStudent(id).getStudentClass() != null) {
                System.out.println("Class ID: " + Controller.readStudent(id).getStudentClass().name());
                System.out.println("Class Teacher: " + Controller.readStudent(id).getStudentClass().getClassTeacher());
                System.out.println("Class Profile: " + Controller.readStudent(id).getStudentClass().getClassProfile());
                System.out.println("Class Building: " + Controller.readStudent(id).getStudentClass().getClassBuilding());
            } else {
                System.out.println("Student is not in any class!");
            }
            System.out.println("==================================");
            Controller.pressAnyKeyToContinue();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Student with id {"+id+"} doesn't exist!");
        }
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying form for deleting all students from database
     */
    public static void displayDeleteAllStudentsForm(){
        Controller.clearConsole();
        Scanner scanner = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("Delete ALL of student:");
        System.out.println("==================================");
        System.out.println("Are you sure? Enter '1' for YES or '0' for NO");
        System.out.println("----------------------------------");
        System.out.print("Select: ");
        Integer selectValue = scanner.nextInt();
        switch(selectValue){
            case 0:
                System.out.println("Process aborted!");
                Controller.pressAnyKeyToContinue();
                break;
            case 1:
                Controller.students.clear();
                System.out.println("Students was deleted!");
                Controller.pressAnyKeyToContinue();
                break;
            default:
                System.out.println("Wrong select!");
                Controller.pressAnyKeyToContinue();
                break;
        }
    }

    /*
    public static void displayAutogenerateStudentsForm(){
        Controller.clearConsole();
        Scanner scanner = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("Autogenerate (6) students:");
        System.out.println("==================================");
        System.out.println("Enter '1' for YES or '0' for NO");
        System.out.println("----------------------------------");
        System.out.print("Select: ");
        Integer selectValue = scanner.nextInt();
        switch(selectValue){
            case 0:
                System.out.println("Process aborted!");
                Controller.pressAnyKeyToContinue();
                break;
            case 1:
                Controller.autogenerateStudents();
                System.out.println("Success - autogenerated students was added to DB");
                Controller.pressAnyKeyToContinue();
                break;
            default:
                System.out.println("Wrong select!");
                Controller.pressAnyKeyToContinue();
                break;
        }
    }*/

    /**
     * This method contains form for autogenerate student
     * Method also contains loop for generate multiple students or specific or no gender
     */
    public static void displayAutogenerateStudentForm(){
        Controller.clearConsole();
        Scanner scanner = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("Autogenerate student:");
        System.out.println("==================================");
        System.out.println("Enter '1' for YES or '0' for NO");
        System.out.println("----------------------------------");
        System.out.print("Select: ");
        Integer selectValue = scanner.nextInt();
        switch(selectValue){
            case 0:
                System.out.println("Process aborted!");
                Controller.pressAnyKeyToContinue();
                break;
            case 1:
                Controller.clearConsole();
                System.out.print("Enter a number of students to be generated: ");
                Integer numberOfAutogeneratedStudents = scanner.nextInt();
                if(numberOfAutogeneratedStudents>0){
                    System.out.println("Select students gender: ");
                    System.out.println("1. Male");
                    System.out.println("2. Female");
                    System.out.println("3. Mix (50/50)");
                    System.out.println("4. Mix (Random)");
                    System.out.print("Select: ");
                    selectValue = scanner.nextInt();
                    switch(selectValue){
                        case 1:
                            for(int i=1;i<=numberOfAutogeneratedStudents;i++){
                                Controller.generateStudent("Male");
                            }
                            System.out.println("\nSuccess - All autogenerated students was added to DB!");
                            Controller.pressAnyKeyToContinue();
                            break;
                        case 2:
                            for(int i=1;i<=numberOfAutogeneratedStudents;i++){
                                Controller.generateStudent("Female");
                            }
                            System.out.println("\nSuccess - All autogenerated students was added to DB!");
                            Controller.pressAnyKeyToContinue();
                            break;
                        case 3:
                            Integer numberOfMaleStudents=(int)Math.ceil(numberOfAutogeneratedStudents/(double)2);
                            Integer numberOfFemaleStudents=(int)Math.floor(numberOfAutogeneratedStudents/(double)2);
                            for(int i=1;i<=numberOfMaleStudents;i++){
                                Controller.generateStudent("Male");
                            }
                            for(int i=1;i<=numberOfFemaleStudents;i++){
                                Controller.generateStudent("Female");
                            }
                            System.out.println("\nSuccess - All autogenerated students was added to DB!");
                            Controller.pressAnyKeyToContinue();
                            break;
                        case 4:
                            for(int i=1;i<=numberOfAutogeneratedStudents;i++){
                                List<String> genders = List.of("Male","Female");
                                Random rand = new Random();
                                Controller.generateStudent(genders.get(rand.nextInt(genders.size())));
                            }
                            System.out.println("\nSuccess - All autogenerated students was added to DB!");
                            Controller.pressAnyKeyToContinue();
                            break;
                        default:
                            System.out.println("Wrong select!");
                            Controller.pressAnyKeyToContinue();
                            break;
                    }
                }else{
                    System.out.println("Wrong number!");
                }
                Controller.pressAnyKeyToContinue();
                break;
            default:
                System.out.println("Wrong select!");
                Controller.pressAnyKeyToContinue();
                break;
        }
    }

    /**
     * This method is responsible for displaying import database from file panel
     */
    public static void displayImportDBPanel(){
        Controller.clearConsole();
        Scanner scanner = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("Import DB panel:");
        System.out.println("==================================");
        System.out.println("Enter '1' for YES or '0' for NO");
        System.out.println("----------------------------------");
        System.out.print("Select: ");
        Integer selectValue = scanner.nextInt();
        switch(selectValue) {
            case 0:
                System.out.println("Process aborted!");
                Controller.pressAnyKeyToContinue();
                break;
            case 1:
                try {
                    System.out.print("Enter DB filename (without .json): ");
                    String filename = scanner.next();
                    System.out.print("Clear actual DB? Type '1' if YES or '0' if NO: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            Controller.loadDB(true, filename + ".json");
                            break;
                        case 0:
                            Controller.loadDB(false, filename + ".json");
                            break;
                        default:
                            System.out.println("Wrong select!");
                            break;
                    }
                    Controller.pressAnyKeyToContinue();
                } catch (Exception e) {
                    System.out.println("Error: check your DB file or filename");
                    Controller.pressAnyKeyToContinue();
                }
                break;
            default:
                System.out.println("Wrong select!");
                Controller.pressAnyKeyToContinue();
                break;
        }
    }

    /**
     * This method is responsible for displaying help panel with basic information about application
     */
    public static void displayHelp(){
        Controller.clearConsole();
        System.out.println("==================================");
        System.out.println("Help panel:");
        System.out.println("==================================");
        System.out.println("Application name: CRUDconsoleApp");
        System.out.println("Built on Java version: 15");
        System.out.println("Author: Damian Osiak");
        System.out.println("----------------------------------");
        System.out.println("\nRuntime arguments:");
        System.out.println("no runtime arguments <-- help");
        System.out.println("-h <-- help");
        System.out.println("-m <-- main menu");
        System.out.println("-c <-- new student creation form");
        System.out.println("-r <-- read all students form");
        System.out.println("-x <-- generate (six) predefined students");
        System.out.println("-g <number> <-- autogenerate <number> number of random students");
        System.out.println("-db <file name> (without .json) <-- import database from file");
        System.out.println("----------------------------------");
        System.out.println("\nApplication functions: ");
        System.out.println("- CREATE student");
        System.out.println("- READ specific student");
        System.out.println("- READ all students");
        System.out.println("- UPDATE student");
        System.out.println("- DELETE student");
        System.out.println("- display all class information");
        System.out.println("- view student class");
        System.out.println("- add student to class");
        System.out.println("- delete all students");
        System.out.println("- autogenerate specific number of random students");
        System.out.println("- save database to file");
        System.out.println("- import database from file");
        System.out.println("- view author information");
        System.out.println("----------------------------------");
        System.out.println("==================================");
        Controller.pressAnyKeyToContinue();
    }

    /**
     * This method is responsible for displaying main menu and choosing menu options
     */
    public static void displayMenu(){
        Controller.clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Menu:");
        System.out.println("==================================");
        System.out.println("1. Create new student");
        System.out.println("2. Read student");
        System.out.println("3. Read all students");
        System.out.println("4. Update existing student");
        System.out.println("5. Delete specific student");
        System.out.println("----------------------------------");
        System.out.println("6. Display all class information");
        System.out.println("7. View student class");
        System.out.println("8. Add student to class");
        System.out.println("----------------------------------");
        System.out.println("9. Delete all students");
        System.out.println("10. Autogenerate student (without adding to class)");
        System.out.println("----------------------------------");
        System.out.println("11. Save database to file");
        System.out.println("12. Load database from file");
        System.out.println("----------------------------------");
        System.out.println("13. View help");
        System.out.println("14. View author information");
        System.out.println("----------------------------------");
        System.out.println("0. Exit");
        System.out.println("==================================");
        System.out.print("Select: ");
        try{
            Integer selectValue = scanner.nextInt();
            switch(selectValue){
                case 1:
                    displayCreateStudentForm();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    displayReadStudentPanel(scanner.nextInt());
                    break;
                case 3:
                    displayReadAllStudentsPanel();
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    displayUpdateStudentForm(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter student ID: ");
                    displayDeleteStudentForm(scanner.nextInt());
                    break;
                case 6:
                    displayAllClassInformation();
                    break;
                case 7:
                    System.out.print("Enter student ID: ");
                        displayStudentClassPanel(scanner.nextInt());
                    break;
                case 8:
                    System.out.print("Enter student ID: ");
                    displayAddStudentToClassForm(scanner.nextInt());
                    break;
                case 9:
                    displayDeleteAllStudentsForm();
                    break;
                case 10:
                    //displayAutogenerateStudentsForm();
                    displayAutogenerateStudentForm();
                    break;
                case 0:
                    System.out.println("Exiting...\nSee you later! :-)");
                    System.exit(0);
                    break;
                case 11:
                    System.out.print("Enter a filename to save DB (without .json): ");
                    Controller.saveDB(scanner.next());
                    break;
                case 12:
                    displayImportDBPanel();
                    break;
                case 13:
                    displayHelp();
                case 14:
                    displayAuthorInformation();
                    break;
                default:
                    System.out.println("Wrong select!");
                    Controller.pressAnyKeyToContinue();
                    break;
            }
        }catch(InputMismatchException e){
           System.out.println("Wrong select!");
           Controller.pressAnyKeyToContinue();
        }
    }
}
