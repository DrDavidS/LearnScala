public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();


        System.out.println("==============================");
        // 多态
        // 多态性是允许你将父对象设置成为一个或更多的他的子对象相等的技术
        Person person = new Worker();
        System.out.println(person.name);  // 属性是静态绑定的
        person.hello();  // 这里输出的是 Hello Worker，方法调用是动态绑定
        // person.hi();  // error
    }
}

class Person {
    String name = "Person";

    public void hello() {
        System.out.println("Hello Person");
    }
}

class Worker extends Person {
    String name = "Worker";

    public void hello() {
        System.out.println("Hello Worker");
    }

    public void hi() {
        System.out.println("Hi Worker");
    }
}