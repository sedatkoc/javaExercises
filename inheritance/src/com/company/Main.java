package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CreditUI credit = new CreditUI();
        credit.creditCalc(new TeacherCreditManager());//reference type
    }
}
