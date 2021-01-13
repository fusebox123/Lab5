package com.exceptionhandling;
/**
 * 1.Validate the age of a person and display proper message by using user defined exception.
 * 	 Age of a person should be above 15.
 * 
 * 2.Write a Java Program to validate the full name of an employee. Create and throw a user 
 * 	 defined exception if firstName and lastName is blank.
 * 
 * 3.Create an Exception class named as “EmployeeException”(User defined Exception) in a 
 *   package named as “com.cg.eis.exception” and throw an exception if salary of an 
 *   employee is below than 3000. Use Exception Handling mechanism to handle exception 
 *   properly
 *   
 * @author Joel
 *
 */

public class Main {
	
	static void ValidateAge(int age) throws InvalidAgeException{
		
		if(age<15)
		{
			throw new InvalidAgeException("Invalid Age");
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
	
	static void ValidateName(String fname,String lname) throws InvalidNameException{
		if(fname.isEmpty() ||  lname.isEmpty())
		{
			throw new InvalidNameException("Invalid Name");
		}
		else
		{
				System.out.println("Valid Name");
		}
	}

	static void ValidateSalary(int salary) throws EmployeeException {
		if(salary < 3000)
		{
			throw new EmployeeException ("Salary should not be less than 3000");
		}
		else
		{
			System.out.println("Valid salary");
		}
	}
	
	public static void main(String[] args) throws EmployeeException {
		
		try {
			ValidateAge(22);
			ValidateName("joel","philip");
			ValidateSalary(1800);

		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InvalidNameException e)
		{
			System.out.println(e.getMessage());

		}
		 catch(EmployeeException e)
        {
			System.out.println(e.getMessage());

        }
	    
		
		
	}

}

	


