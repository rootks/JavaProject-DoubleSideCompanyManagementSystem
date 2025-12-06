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

    
public class PermanentEmployee extends Employee {

    public PermanentEmployee(double basicSalary, double allowance, double otherAllowance, double otHours) {
        super(basicSalary, allowance, otherAllowance, otHours);
    }

    @Override
    public double calculateGrossSalary() {
        return basicSalary + allowance + otherAllowance + otHours;
    }

    @Override
    public double calculateEPF() {
        return basicSalary * 0.08;
    }

    @Override
    public double calculateETF() {
        return basicSalary * 0.03;
    }

    @Override
    public double calculateNetSalary(double welfare, double other) {
        return calculateGrossSalary() - (calculateEPF() + welfare + other);
    }
}
