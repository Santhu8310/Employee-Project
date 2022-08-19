package edbms;

import java.util.Comparator;

class SortEmployeeByAge implements Comparator<Employee>{
	@Override
	public int compare(Employee x,Employee y){
		return x.getAge()-y.getAge();
	}

}
