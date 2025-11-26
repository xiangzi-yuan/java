package a;

public class Parent {

    public int pub = 1;
    protected int pro = 2;
    int def = 3;      // default
    private int pri = 4;

    public void testAccess() {
        System.out.println(pub);  // ✔
        System.out.println(pro);  // ✔
        System.out.println(def);  // ✔
        System.out.println(pri);  // ✔
    }
}
