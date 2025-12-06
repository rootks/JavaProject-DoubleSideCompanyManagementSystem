/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPackage.SalaryCalc;

import MainPackage.SalaryCalc.Employee;

/**
 *
 * @author user
 */
public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(double basicSalary, double allowance, double otherAllowance, double otHours) {
        super(basicSalary, allowance, otherAllowance, otHours);
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + allowance + otherAllowance + otHours;
    }

    @Override
    public double calculateEPF() {
        return 0; // No EPF
    }

    @Override
    public double calculateETF() {
        return 0; // No ETF
    }

    @Override
    public double calculateNetSalary(double welfare, double other) {
        return calculateGrossSalary() - (welfare + other);
    }
}

