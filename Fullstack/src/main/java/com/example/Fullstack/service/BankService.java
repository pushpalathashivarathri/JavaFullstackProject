package com.example.Fullstack.service;

import java.util.List;

import com.example.Fullstack.blueprint.Bank;

public interface BankService {
	Bank saveEmployee(Bank obj);//Restaurents-Employee
	List<Bank> fetchAllEmployee();
	Bank getEmployeeById(int id);
	 Object viewEmployefromDB();
	 void deleteEmployeeByid(int id);
	
}

	//Bank saveEmployee(Bank obj);//Restaurents-Employee
	//List<Bank> fetchAllEmployee();
	//Bank fetchById(int BankEmployeeId) throws Exception;
	//Bank updateEmployee(int BankEmployeeId, Bank newVal);
	//void deleteEmployee(int BankEmployeeId);
	//Object viewEmployefromDB();
	//Bank getEmployeeById(int id);
	//void deleteEmployeeByid(int id);



