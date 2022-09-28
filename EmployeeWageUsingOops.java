package com.bdglabz.day8;

class EmployeeWageUsingOops {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMPLOYE_RATE_PER_HOUR = 20;
    public static final int NUM_WORKING_DAYS = 20;
    public static final int HOUR_IN_MONTH = 100;

    public static void attendance() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Not Present");
        }
    }

    public static void dailyWage() {
        int EmployeWages = 0, employeHour = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            employeHour = 8;
        } else {
            employeHour = 0;
        }
        EmployeWages = employeHour * EMPLOYE_RATE_PER_HOUR;
        System.out.println("Employewage: " + EmployeWages);
    }

    public void checkWage() {
        int employeWages = 0, employeHour = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            employeHour = 8;
        } else if (empCheck == IS_PART_TIME) {
            employeHour = 8;
        } else {
            employeHour = 0;
        }
        employeWages = employeHour * EMPLOYE_RATE_PER_HOUR;
        System.out.println("Employewage: " + employeWages);
    }

    public void usingSwitch() {
        int employeWages = 0, employeHour = 0;
        int employeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeCheck) {
            case IS_FULL_TIME:
                employeHour = 8;
                break;
            case IS_PART_TIME:
                employeHour = 4;
                break;
            default:
                employeHour = 0;
        }
        employeWages = employeHour * EMPLOYE_RATE_PER_HOUR;
        System.out.println("Employewage: " + employeWages);
    }

    public void getMonthlyWage() {
        int employeWages = 0, employeHour = 0, totalEmployeWage = 0;
        for (int day = 0; day < NUM_WORKING_DAYS; day++) {
            int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmployeCheck) {
                case IS_FULL_TIME:
                    employeHour = 8;
                    break;
                case IS_PART_TIME:
                    employeHour = 4;
                    break;
                default:
                    employeHour = 0;
            }
            employeWages = employeHour * EMPLOYE_RATE_PER_HOUR;
            totalEmployeWage += employeWages;
            System.out.println("Employewage: " + employeWages);
        }
        System.out.println("TotalEmployewage: " + totalEmployeWage);
    }

    public void getMonthlyWageCondition() {
        int employeWages = 0, totalEmployeHour = 0, totalEmployeWage = 0, totalWorkingDays = 0;
        while (totalWorkingDays < NUM_WORKING_DAYS && totalEmployeHour <= HOUR_IN_MONTH) {
            int employeHour = 0;
            totalWorkingDays++;
            int employeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeCheck) {
                case IS_FULL_TIME:
                    employeHour = 8;
                    break;
                case IS_PART_TIME:
                    employeHour = 4;
                    break;
                default:
                    employeHour = 0;
            }
            totalEmployeHour += employeHour;
            employeWages = employeHour * EMPLOYE_RATE_PER_HOUR;
            totalEmployeWage += employeWages;
            System.out.println("Employewage: " + employeWages);
        }
        System.out.println("TotalEmployewage: " + totalEmployeWage);
    }

    public static void main(String[] args) {
        EmployeeWageUsingOops worker = new EmployeeWageUsingOops();
        worker.attendance();
        worker.dailyWage();
        worker.checkWage();
        worker.usingSwitch();
        worker.getMonthlyWage();
        worker.getMonthlyWageCondition();
    }

}