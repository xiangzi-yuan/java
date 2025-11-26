package b;

import a.Parent;

public class Child extends Parent {

    public void test() {
        System.out.println(pub);  // ✔ public
        System.out.println(pro);  // ✔ protected（跨包子类可访问）

        // System.out.println(def); // ❌ default 跨包不可访问
        // System.out.println(pri); // ❌ private 永远不可访问

        Parent p = new Parent();
        // System.out.println(p.pro); // ❌ 跨包子类不能通过父类引用访问 protected
    }
}
