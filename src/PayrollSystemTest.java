import java.util.Calendar;

public class PayrollSystemTest{
    public static void main(String[] args){
        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        // Employee array
        Employee[] employees = new Employee[2];
        //here i used this month for result (salary+bonus)
        employees[0] = new PieceWorker(
                "Bishal", "Thapa", "bishal@centria.fi", "46743348787", 16.75f, 40.0f, 6, 3, 1883);
        employees[1] = new PieceWorker(
                "Masom", "Miah","masom@centria.fi", "064774773428", 20.25f, 52.0f, 5, 3, 1883);


        System.out.println("Employees processed polymorphically:\n");

        for(Employee currentEmployee : employees){
            System.out.println(currentEmployee);




            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthday().getMonth() == currentMonth) ?
                            currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }


        for(int j=0; j<employees.length; j++){
            System.out.printf("Employee %d is a %s\n",
                    j, employees[j].getClass().getName());
        }
    }
}