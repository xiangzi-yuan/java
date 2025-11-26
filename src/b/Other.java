package b;

import a.Parent;

public class Other {

    public void test() {
        Parent p = new Parent();

        System.out.println(p.pub);  // ✔ public
        // System.out.println(p.pro); // ❌ protected 跨包非子类不可访问
        // System.out.println(p.def); // ❌ default 跨包不可访问
        // System.out.println(p.pri); // ❌ private 永远不可访问
    }
}
