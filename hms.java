import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hms {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<patient> patients = new ArrayList<>();
    static ArrayList<appoint> appointments = new ArrayList<>();
    static ArrayList<mr> records = new ArrayList<>();
    static ArrayList<staff> staffList = new ArrayList<>();
    static HashMap<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Healthcare Management System ===");
            System.out.println("1. Patient Management");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            //System.out.println(". Staff Management");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> managePatients();
                case 2 -> manageAppointments();
                case 3 -> manageEHR();
                case 4 -> manageBilling();
                case 5 -> manageInventory();
                case 6 -> {
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // 1. Patient Management
    static void managePatients() {
        System.out.println("\n--- Patient Management ---");
        System.out.println("1. Register Patient");
        System.out.println("2. View Patients");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Patient ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();
            patients.add(new patient(id, name, age, address, phone));
            System.out.println("Patient registered successfully!");
        } else if (choice == 2) {
            System.out.println("Patient List:");
            for (patient p : patients) {
                System.out.println(p);
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // 2. Appointment Scheduling
    static void manageAppointments() {
        System.out.println("\n--- Appointment Scheduling ---");
        System.out.println("1. Schedule Appointment");
        System.out.println("2. View Appointments");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Appointment ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Patient ID: ");
            String patientId = sc.nextLine();
            System.out.print("Enter Doctor Name: ");
            String doctor = sc.nextLine();
            System.out.print("Enter Date (YYYY-MM-DD): ");
            String date = sc.nextLine();
            System.out.print("Enter Time (HH:MM): ");
            String time = sc.nextLine();
            appointments.add(new appoint(id, patientId, doctor, date, time));
            System.out.println("Appointment scheduled successfully!");
        } else if (choice == 2) {
            System.out.println("Appointments:");
            for (appoint a : appointments) {
                System.out.println(a);
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // 3. Electronic Health Records
    static void manageEHR() {
        System.out.println("\n--- Electronic Health Records ---");
        System.out.println("1. Add Medical Record");
        System.out.println("2. View Medical Records");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Patient ID: ");
            String patientId = sc.nextLine();
            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.nextLine();
            System.out.print("Enter Treatment: ");
            String treatment = sc.nextLine();
            System.out.print("Enter Prescription: ");
            String prescription = sc.nextLine();
            records.add(new mr(patientId, diagnosis, treatment, prescription));
            System.out.println("Medical record added successfully!");
        } else if (choice == 2) {
            System.out.println("Medical Records:");
            for (mr r : records) {
                System.out.println(r);
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // 4. Billing and Invoicing
    static void manageBilling() {
        System.out.println("\n--- Billing and Invoicing ---");
        System.out.print("Enter Patient ID for Billing: ");
        String patientId = sc.next();
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Invoice Generated:");
        System.out.println("Patient ID: " + patientId + ", Amount: $" + amount);
    }

    // 5. Inventory Management
    static void manageInventory() {
        System.out.println("\n--- Inventory Management ---");
        System.out.println("1. Add Inventory Item");
        System.out.println("2. View Inventory");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Item Name: ");
            String item = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
            System.out.println("Item added successfully!");
        } else if (choice == 2) {
            System.out.println("Inventory:");
            inventory.forEach((key, value) -> System.out.println(key + ": " + value));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}


