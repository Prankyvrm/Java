package com.pankaj.lambdas.unit2;

public class ThisReferenceExample {
    public void completeProcess(int i, Process p) {
        p.process(i);
    }
    public void execute() {
        completeProcess(1,a-> System.out.println(this));
    }

    public static void main(String[] args) {
        //completeProcess(1,a->System.out.println(this));//this cannot be referenced from static block

        ThisReferenceExample thisReferenceExample =  new ThisReferenceExample();
        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "ThisReferenceExample class";
    }
}


