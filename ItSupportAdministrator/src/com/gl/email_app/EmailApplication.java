package com.gl.email_app;

import java.util.Scanner;

public class EmailApplication {
    public void init() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first name");
        String firstName = input.nextLine();

        System.out.println("Enter you last name");
        String lastName = input.nextLine();

        System.out.println("Enter your department");
        System.out.println("Specify the following department code values");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int dep = input.nextInt();

        if (EmailApplicationUtils.validateDepartment(dep)) {

            CredentialServiceImpl credentialService = new CredentialServiceImpl();
            String email = credentialService.generateEmailAddress(firstName, lastName, dep);
            String password = credentialService.generatePassword();

//            System.out.println(email);
//            System.out.println(password);

            Employee emp = new Employee(firstName, lastName, email);
            emp.setPassword(password);

            credentialService.displayCredentials(emp);
        }
        else {
            System.out.println("Invalid Department code");
            System.out.println("Enter valid code between 1-4");
            System.out.println("Please try again...");
        }

    }
}
