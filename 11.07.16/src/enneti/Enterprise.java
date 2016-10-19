package enneti;

import java.util.Arrays;

public class Enterprise {


    private String nameOfInterprise;
    private Department[] listOfDepartment = new Department[0];

    public Enterprise() {
    }

    public Enterprise(String nameOfInterprise, Department[] listOfDepartment) {
        this.nameOfInterprise = nameOfInterprise;
        this.listOfDepartment = listOfDepartment;
    }

    public String getNameOfInterprise() {
        return nameOfInterprise;
    }

    public void setNameOfInterprise(String nameOfInterprise) {
        this.nameOfInterprise = nameOfInterprise;
    }

    public Department[] getListOfDepartment() {
        return listOfDepartment;
    }

    public void setListOfDepartment(Department[] listOfDepartment) {
        this.listOfDepartment = listOfDepartment;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "nameOfInterprise='" + nameOfInterprise + '\'' +
                ", listOfDepartment=" + Arrays.toString(listOfDepartment) +
                '}';
    }
    public Department[] addDepartment (Department[] list, Department dep){
        Department[] temp = new Department[list.length + 1];
        System.arraycopy(list, 0, temp, 0, list.length );
        temp[temp.length -1] = dep;
            return  temp;
    }

}


