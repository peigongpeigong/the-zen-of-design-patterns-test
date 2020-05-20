package com.peigong.patterns.chapter25_visitor;

public interface Visitor {

    void visit(CommonEmployee employee);

    void visit(Manager manager);

}
