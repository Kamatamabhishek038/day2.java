class Employee{
    void salary(int a){
        System.out.println("function 1");
    }
     void salary(){
        System.out.println("function 2");
    }
     void salary(int a,int b){
        System.out.println("function 3");
    
    }
     void salary(double a){
        System.out.println("function 4");
    }

}

class Main{
    public static void main(String[]args){
        Employee emp = new Employee();
        emp.salary();
        emp.salary(100);
        emp.salary(100,200);
        emp.salary(20000.45);

    }

}