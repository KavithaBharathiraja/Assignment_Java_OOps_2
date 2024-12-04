package EducationApp_3;

public class Education extends CourseBase implements Comparable<Education> {

    private String category;
    private String difficulty;
    private int duration;
    private int enrolledStudents;
    private int oldStudents;
    private int newStudents;
    private int price;
    private int rating;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getOldStudents() {
        return oldStudents;
    }

    public void setOldStudents(int oldStudents) {
        this.oldStudents = oldStudents;
    }

    public int getNewStudents() {
        return newStudents;
    }

    public void setNewStudents(int newStudents) {
        this.newStudents = newStudents;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // implementation of abstract methods
    @Override
    public int calculateRevenue() {
        return enrolledStudents * price;
    }


    @Override
    public void displayDetails() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructor: " + getInstructor());
        System.out.println("Category: " + category);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Price: $" + price);
        System.out.println("Revenue: $" + calculateRevenue());
    }



    // implementation for sorting
    @Override
    public int compareTo(Education education) {
        if (this.newStudents != education.newStudents) {
            return Integer.compare(this.newStudents, education.newStudents);
        } else {
            return Integer.compare(this.enrolledStudents, education.enrolledStudents);
        }
    }
}
