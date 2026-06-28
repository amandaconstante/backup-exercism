public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? (double)(100-15)/100 : 100/100;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary > 2000 ? 2000 : salary;
    } 
}
