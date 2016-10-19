package ressors;


import enneti.Department;
import enneti.Emploey;
import enneti.Enterprise;

import java.util.Scanner;

public class Menu {

    Emploey employer = new Emploey();
    Scanner scanner = new Scanner(System.in);
    Department department = new Department();
    Enterprise enterprise = new Enterprise();
    EnMassege massege = new EnMassege();

    public Menu(){
        }
    private String getChoice(){
        String choice = scanner.nextLine();
        return choice;
        }

    public void start (){
        System.out.println(massege.MENU);

        while (true){
            int choiceInt = Integer.parseInt(getChoice());
            switch (choiceInt){
                case 1:
                    createEnterprise();
                    break;
                case 2:
                    createDepartment(enterprise);
                    break;
                case 3:
                    createEmployer(enterprise, department);
                    break;
                case 4:
                    createEmployer(enterprise,department);
                    break;
                case 5:
                    removeEmployer();
                    break;
                case 6:
                    System.exit(0);


            }
        }


    }


    public void createEnterprise(){
        System.out.println(massege.GREETINGS);
        System.out.println(massege.CREATE_ENTERPRISE_NAME);
        enterprise.setNameOfInterprise(getChoice());
        System.out.println(enterprise);
        createDepartment(enterprise);
        createEmployer(enterprise, department);
    }

    public void createDepartment(Enterprise ent){
        System.out.println(massege.CREATE_DEPARTMENT_NAME);
        department.setNameOfDepartment(getChoice());
        Department[]  listOfDep = ent.addDepartment(ent.getListOfDepartment(), department);
        ent.setListOfDepartment(listOfDep);
    }

    public void createEmployer(Enterprise ent, Department dep){
        System.out.println(massege.CREATE_EMPLOYEE_FIRSTNAME);
        employer.setFirstName(getChoice());
        System.out.println(massege.CREATE_EMPLOYEE_SECOND_NAME);
        employer.setSecondName(getChoice());
        System.out.println(massege.CREATE_EMPLOYEE_SALARYOFHOUR);
        employer.setSalaryHour(Integer.parseInt(getChoice()));
        System.out.println(massege.CREATE_EMPLOYEE_WORKHOUR);
       employer.setWorkHour(Integer.parseInt(getChoice()));
        System.out.println(employer);

      Emploey [] emplist = dep.getListOfDepartment();
        dep.eddEmploey(emplist, employer);
        dep.setListOfDepartment(emplist);



    }

public void removeEmployer (){

}

}
