package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0 && salary <= 10000){
            System.out.println(salary * 0.85);
        }
        if (salary > 10000 && salary <= 20000){
            System.out.println(salary * 0.82);
        }
        if (salary > 20000){
            System.out.println(salary * 0.8);
        }
        if(salary < 0){
            System.out.println("wrong input!");
        }
    }
}
