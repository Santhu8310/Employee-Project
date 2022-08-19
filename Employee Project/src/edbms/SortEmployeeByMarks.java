package edbms;

import java.util.Comparator;

class SortEmployeeByMarks implements Comparator<Employee> {
	@Override
	public int compare(Employee x,Employee y){
		return x.getSalary().compareTo(y.getSalary());
	}

}
