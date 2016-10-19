package enneti;


import java.util.Arrays;

public class Department {

    private String nameOfDepartment;
    private Emploey [] ListOfEmployer = new Emploey[0];

    public Department() {
    }

    public Department(String nameOfDepartment, Emploey[] listOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
        this.ListOfEmployer = listOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public Emploey[] getListOfDepartment() {
        return ListOfEmployer;
    }

    public void setListOfDepartment(Emploey[] listOfDepartment) {
        this.ListOfEmployer = listOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameOfDepartment='" + nameOfDepartment + '\'' +
                ", listOfDepartment=" + Arrays.toString(ListOfEmployer) +
                '}';
    }


    public Emploey[] eddEmploey(Emploey[] list,Emploey emp){
        Emploey[] temp = new Emploey[list.length + 1];
        System.arraycopy(list, 0, temp, 0, list.length);
        temp[temp.length-1] = emp;
        return temp;
    }


}
