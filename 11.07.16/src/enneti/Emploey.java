package enneti;


public class Emploey {

    private String firstName;
    private String secondName;
    private int workHour;
    private int salaryHour;

    public Emploey() {
    }

    public Emploey(String firstName, String secondName, int workHour, int salaryHour) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.workHour = workHour;
        this.salaryHour = salaryHour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getSalaryHour() {
        return salaryHour;
    }

    public void setSalaryHour(int salaryHour) {
        this.salaryHour = salaryHour;
    }

    @Override
    public String toString() {
        return "Emploey{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", workHour=" + workHour +
                ", salaryHour=" + salaryHour +
                '}';
    }


}

