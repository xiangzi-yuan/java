package a;

public class SamePackage {

    public void test() {
        Parent p = new Parent();

        System.out.println(p.pub);  // ✔ public
        System.out.println(p.pro);  // ✔ protected（同包可访问）
        System.out.println(p.def);  // ✔ default 同包可访问
        // System.out.println(p.pri); // ❌ private 不可访问
    }
}
