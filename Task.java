class Student {
    private int id = 0;

    public void getter() {
        System.out.println(id);
    }

    public void setter(int num) {
        id = num;
    }
}

class Task {
    public static void main(String[] args) {
        Student student = new Student();
        student.setter(1200);
        student.getter(); 
    }
}