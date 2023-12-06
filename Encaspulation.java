class Test {
    ///we cana chieve encapsulation by using getter setter method

    private int a;
    public void setID(int id){
    a=id;

    
}
public int getId(){
    return a;
}
public class Encaspulation {

    public static void main(String[] args) {
        Test obj=new Test();
        obj.setID(10);
        System.out.println("The value of a"+obj.getId());
    

    }
}
}
