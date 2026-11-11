class User{
    private int amount = 0;

    void getter(){
        System.out.println(amount);
    }

    void setter(int num){
        amount = num;
    }

}

class Main{
    public static void main(String[]args){
        User us = new User();
        us.setter(1000);
        us.getter();
    }
}