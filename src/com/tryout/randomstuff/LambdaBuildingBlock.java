package com.tryout.randomstuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.tryout.randomstuff.support.Employee;

//they created new functions in a package - java.util.functions
//more than 50+ functional interfaces
//6 categories - predicate --- if condition, (T)-> boolean
//function --- transformation map --function (T,R)-> R very important --> this is map
// consumer ----consumer -- for loop        (T)-> void
//supplier -----factory			()-> R
//BinaryOperator will take 2 inputs of same type and return same type (T,T) -> T very important --> this is reduce
//UnaryOperator will take 1 type as input and output  (T)->T

public class LambdaBuildingBlock {
	
	public static void main(String args[]){
		
		LambdaBuildingBlock lbObj = new LambdaBuildingBlock();
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee(1,"google",100.00);
		Employee emp2 = new Employee(1,"pypl",200.00);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(new Employee(1,"yahoo",300.00));
		empList.add(new Employee(1,"chargebee",400.00));
		empList.add(new Employee(1,"alti",100.00));
		empList.add(new Employee(1,"solliton",500.00));
		
		// this is behavioral paratermization 
		Predicate<Employee> preOne = (em)-> em.getSalary()<200;		
		printEmp(empList, preOne);
		
		//method references -instance::methodNames, className::staticMethodName
		printEmp(empList, lbObj::getSalLess);
		
		// this is behavioral paratermization 
		Predicate<Employee> preTwo = (em)-> em.getOrgName().startsWith("pa");
		printEmp(empList, preTwo);
		
		// higher order function
		printEmp(empList, preOne.and(preTwo));
		
		//binary operator
		BinaryOperator<Double> binaryOp = (e1,e2)-> e1+e2;
		binaryOp.apply(emp1.getSalary(),emp2.getSalary());
		
		BinaryOperator<Employee> binaryOp2 = (e1,e2)-> new Employee(2,"232",e1.getSalary()+e2.getSalary());
		binaryOp2.apply(emp1,emp2);
		
		//find sum of salaries of google employees
		Optional<Double> optionalSumSalOfPYPL = empList.stream().filter(preTwo).map((em)->em.getSalary()).reduce(binaryOp);
		
		//parallel streams
		Optional<Double> optionalSumSalOfPYPLByParallel= empList.stream().parallel().filter(preTwo).map((em)->em.getSalary()).reduce(binaryOp);
		
		//method references
	}
	
	// this is behavioral paratermization 
	public static void printEmp(List<Employee> empList, Predicate<Employee> predicate){
		for(Employee emp: empList){
			if(predicate.test(emp)){
				System.out.println(emp.getOrgName());
			}
		}
		
		//using consumer - this can be reused
		Consumer<Employee> empConsumer = (emp)->{
			if(predicate.test(emp)){
				System.out.println(emp.getOrgName());
			}
		};
		empList.forEach(empConsumer);
	}
	
	
	public boolean getSalLess(Employee employee){
		return employee.getSalary()<200;
	}

}
