class PracConstructor {
    String name, n = "Naagin";
    int id;
    double d;

    PracConstructor(String name, int id, double d) {

        // parameteried consttuctor
        this.name = name;
        this.id = id;
        this.d = d;

        System.out.println(name);
        System.out.println(id);
        System.out.println(d);

    }

    // by the help of the constructor we can save time to write codes on
    // everywhere.. iniitilaie it in main method
    public void First() {
        System.out.println(n);

    }

    public void Second() {

    }

    public void Third() {

    }

    public void Fourth() {

    }

    public static void main(String[] args) {

        PracConstructor obj = new PracConstructor("Kiran", 01, 20.0);
        obj.First();
        PracConstructor obj2 = new PracConstructor("Rohit", 2, 30.5);
        obj2.Second();

        PracConstructor obj3 = new PracConstructor("Chzncyz", 3, 45.0);
        obj3.Third();
        PracConstructor obj4 = new PracConstructor("Shamsher", 04, 50.0);
        obj4.Fourth();

    }
}