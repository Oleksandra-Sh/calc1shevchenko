package com.company;

public class Main {

    public static void main(String[] args) {
        Model m = new Model();
        Controller c = new Controller();
        View view = new View();
        m.x=1;
        m.y=3;
        int result = c.sum(m.x,m.y);
        view.display(result);
        int result1 = c.vsub(m.x,m.y);
        view.display(result1);
        int result2 = c.mult(m.x,m.y);
        view.display(result2);
        double result3 = c.div(m.x,m.y);
        view.displaydouble(result3);
    }
}
