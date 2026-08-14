
public class HighestLowestSalaryExpenditure {

	public static void main(String[] args) {
		int[] salary= {12000,25000,120000,44000,70000,9000};
		
		int highest=salary[0];
		int lowest=salary[0];
		int totalsalaries=0;
		for(int salaries:salary) {
			if(salaries>highest) {
				highest=salaries;
			}
			if(salaries<lowest) {
				lowest=salaries;
			}
			totalsalaries=totalsalaries+salaries;
		}
		System.out.println("The lowest salaries: "+lowest);
		System.out.println("The highest salaries: "+highest);
		System.out.println("The total salaries: "+totalsalaries);
	}

}
