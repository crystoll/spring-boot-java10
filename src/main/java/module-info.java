module fi.solita.java10demo {

    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;

    exports fi.solita.java10demo;
    exports fi.solita.java10demo.hello;

    opens fi.solita.java10demo;
    opens fi.solita.java10demo.hello;
}