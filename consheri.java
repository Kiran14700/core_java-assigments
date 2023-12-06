class base {
    base() {
        System.out.println("I m an base constructor");
    }
    base(int a){
      
        System.out.println("A VALUE: "+a);
       

    }

}

class derived extends base {
    derived() {
        super(0);
        System.out.println("I m an derived constructor");

    }

}

public class consheri {
    public static void main(String[] args) {
        derived obj = new derived();

    }
}
