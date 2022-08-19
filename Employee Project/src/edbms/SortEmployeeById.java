package edbms;

import java.util.Comparator;

class SortEmployeeById implements Comparator<Employee> {
	@Override
	public int compare(Employee x,Employee y){
		return x.getId()-y.getId();
	}

}
