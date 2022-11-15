package com.tns.exception;

public class Email extends Exception {
	int emailConditionViolated = 0;
	public Email(int conditionViolated)
    {
        super("Invalid Email: ");
        emailConditionViolated = conditionViolated;
    }
	public String printMessage()
    {
       
        switch (emailConditionViolated) {
        case 1:
            return ("Email length should be" + " 6 characters");  // Password should contain// at least one digit(0-9)
        case 2:
            return ("Email should not"+ " contain any space");  // Password should not contain any space
        case 3:
            return ("Email should contain  "+ " one special character"); // one special character ( @ )
        case 4:
            return ("Email should contain at"+ " least three uppercase letter(A-Z)"); // one uppercase letter(A-Z)
        case 5:
            return ("Email should contain at" + " least two lowercase letter(a-z)");  // one lowercase letter(a-z)
        }
        return ("");
    }
}