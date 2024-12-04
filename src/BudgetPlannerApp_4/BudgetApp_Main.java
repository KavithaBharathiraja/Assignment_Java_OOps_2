package BudgetPlannerApp_4;

import java.util.ArrayList;
import java.util.Collections;

public class BudgetApp_Main {


    public static void main(String[] args) {

        ArrayList<ExpenseTracker> expenses = new ArrayList<>();
        expenses.add(new ExpenseTracker("Groceries", 200, "Food", "Credit Card", 20231119, 1400, "Supermarket", "500", "Monthly", "Weekly supplies"));
        expenses.add(new ExpenseTracker("Gym Membership", 50, "Health", "Cash", 20231101, 1200, "Gym", "100", "Monthly", "Renewed annually"));
        expenses.add(new ExpenseTracker("Electricity Bill", 150, "Utilities", "Debit Card", 20231115, 1800, "Home", "300", "Monthly", "Last month usage"));

        Collections.sort(expenses);

        for (ExpenseTracker expense : expenses) {
            System.out.println(expense);
        }

    }
}
