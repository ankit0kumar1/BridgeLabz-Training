public class EmployeeBonus {
    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; // [salary][years]
        for (int i = 0; i < employees; i++) {
            // 5-digit salary (10000 to 99999)
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            // Years of service (1 to 10)
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }
    //method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        int employees = data.length;
        double[][] result = new double[employees][2]; 
        for (int i = 0; i < employees; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }
    // Method to calculate totals and display table
    public static void displayReport(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("Total Old  Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
        System.out.printf("total  New Salary: %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {
		
        int employees = 10;
        int[][] employeeData = generateEmployeeData(employees);
        double[][] updatedData = calculateBonus(employeeData);
		
		//display report method for printing result
        displayReport(employeeData, updatedData);
    }
}