package BudgetPlannerApp_4;

public class ExpenseTracker implements Comparable<ExpenseTracker>{


    private String expenseName;
    private  int amount;
    private String category;
    private String paymentMethod;
    private int date;
    private int time;
    private String location;
    private String budgetLimit;
    private String recurrence; // e.g., Monthly
    private String notes;

    public ExpenseTracker(String expenseName, int amount, String category, String paymentMethod, int date, int time, String location, String budgetLimit, String recurrence, String notes) {
        this.expenseName = expenseName;
        this.amount = amount;
        this.category = category;
        this.paymentMethod = paymentMethod;
        this.date = date;
        this.time = time;
        this.location = location;
        this.budgetLimit = budgetLimit;
        this.recurrence = recurrence;
        this.notes = notes;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBudgetLimit() {
        return budgetLimit;
    }

    public void setBudgetLimit(String budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int compareTo(ExpenseTracker other) {

        return Integer.compare(this.amount, other.amount);
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseName='" + expenseName + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", budgetLimit='" + budgetLimit + '\'' +
                ", recurrence='" + recurrence + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
