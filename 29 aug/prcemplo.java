class Employee{
    private double Di;
    private double rad;
    private String name,s ;

     public void setDiameter(double D){
        this.Di=D;
     }
     public double getDiameter(){
        return Math.floor(Di) 
        ;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name= n;

    }
    public void setId(double r){
        this.rad=r;
    }
   public  double getId(){
        return Math.PI*rad*rad;
    }

}
public class prcemplo {
    public static void main(String[] args) {
        Employee obj=new Employee();
        // obj.setId(50);
        obj.setName("kirn");
        System.out.println(obj.getName());
        obj.setId(4);
        System.out.println(obj.getId());
        obj.setDiameter(4);
        System.out.println(""+obj.getDiameter());
    }
    
}
