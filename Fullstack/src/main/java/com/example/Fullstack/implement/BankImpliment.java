package com.example.Fullstack.implement;

import java.util.List;

import com.example.Fullstack.blueprint.Bank;
import com.example.Fullstack.repository.BankInterface;
import com.example.Fullstack.service.BankService;

import org.springframework.stereotype.Service;

@Service
	public  class BankImpliment implements BankService{
		private BankInterface employeeInt;

		public BankImpliment(BankInterface employeeInt) {

			this.employeeInt = employeeInt;
		}

			@Override
			public List<Bank> fetchAllEmployee(){

				return employeeInt.findAll();//select * from learners_table
			}
	         @Override//for redable purpose
				public Bank saveEmployee(Bank obj) {//Restaurents-Salary
					return employeeInt.save(obj);  //insert query 
				}

				//get , find --> fetch only 1 rec on the basis id provided
				//findall
				
				@Override
				public Object viewEmployefromDB() {
					
					return employeeInt;
				}
				public Bank getEmployeeById(int id) {
					return	employeeInt.findById(id).get();
					}
					

				public void deleteEmployeeByid(int id) {
					employeeInt.deleteById(id);
					
				}
				

	}	