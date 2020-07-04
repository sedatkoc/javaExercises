package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
        for(BaseLogger logger:loggers){
            logger.log("Log Message");
        }
        System.out.println("Dynamicly change where you want to save the log");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
