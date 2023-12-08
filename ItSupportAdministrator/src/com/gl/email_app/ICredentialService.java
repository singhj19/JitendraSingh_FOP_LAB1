package com.gl.email_app;

public interface ICredentialService {
    String generateEmailAddress(String firstName, String lastName, int deptCode);
    String generatePassword();

    void displayCredentials(Employee emp);
}
