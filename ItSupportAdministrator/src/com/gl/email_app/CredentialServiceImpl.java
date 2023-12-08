package com.gl.email_app;

import java.util.Random;

public class CredentialServiceImpl implements ICredentialService{

    @Override
    public String generateEmailAddress(String firstName, String lastName, int deptCode) {
        StringBuilder emailAddBuilder = new StringBuilder();
        emailAddBuilder.append(firstName.toLowerCase());
        emailAddBuilder.append(".");
        emailAddBuilder.append(lastName.toLowerCase());
        emailAddBuilder.append("@");
        emailAddBuilder.append(getDeptName(deptCode));
        emailAddBuilder.append(".gl.com");
        return emailAddBuilder.toString();
    }

    private String getDeptName(int deptCode) {
        String dept = null;
        switch(deptCode){
            case 1 : dept = "tech";
            break;
            case 2 : dept = "admin";
                break;
            case 3 : dept = "hr";
                break;
            case 4 : dept = "legal";
                break;
        }
        return dept;
    }

    @Override
    public String generatePassword() {
        // create a string of uppercase and lowercase characters and numbers
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "-_~!@#$%^&*()+|}{:?><";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers + specialChars;
        // create random string builder
        StringBuilder sb = new StringBuilder();
        // create an object of Random class
        Random random = new Random();
        // specify length of random string
        //int length = 8;

        for(int i = 0; i < 2; i++) {

          // generate random index number
          int index = random.nextInt(upperAlphabet.length());

          // get character specified by index from the string
          char randomChar = upperAlphabet.charAt(index);

          // append the character to string builder
          sb.append(randomChar);
        }

        for(int i = 0; i < 2; i++) {

            // generate random index number
            int index = random.nextInt(lowerAlphabet.length());

            // get character specified by index from the string
            char randomChar = lowerAlphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        for(int i = 0; i < 2; i++) {

            // generate random index number
            int index = random.nextInt(numbers.length());

            // get character specified by index from the string
            char randomChar = numbers.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        for(int i = 0; i < 2; i++) {

            // generate random index number
            int index = random.nextInt(specialChars.length());

            // get character specified by index from the string
            char randomChar = specialChars.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }


    String randomString = sb.toString();
        return randomString;
    }

    @Override
    public void displayCredentials(Employee emp) {
        System.out.println("Dear " + emp.firstName + " your generated cred are");
        System.out.println(emp.emailAddress);
        System.out.println(emp.password);
    }

}
