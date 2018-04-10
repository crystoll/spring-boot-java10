module fi.solita.java10demo {

    // Spring core and web require these
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;
    // Spring Data JPA requires these
    requires spring.beans;
    requires slf4j.api;
    requires spring.context;
    requires spring.data.commons;
    requires hibernate.jpa;

    exports fi.solita.java10demo;
    exports fi.solita.java10demo.hello;

    opens fi.solita.java10demo;
    opens fi.solita.java10demo.hello;
}