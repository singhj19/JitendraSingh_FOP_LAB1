package com.gl.email_app;

public class EmailApplicationUtils {
    public static boolean validateDepartment(int department) {
        if (department >=1 && department <=4 ) {
            return true;
        }
        else {
            return false;
        }
    }
}
