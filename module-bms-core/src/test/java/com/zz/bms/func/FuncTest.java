package com.zz.bms.func;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class FuncTest {


    public void println(String s){
        System.out.println(s);
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void proxy(String param,Consumer<String> cm){
        cm.accept(param);
    }


    public static void proxy1(String param, DoubleUnaryOperator cm1){
        /*cm1.apply(param);*/
    }


    public static void main(String[] args) {
        FuncTest ft = new FuncTest();
        proxy("1221212", (a)->{
            System.out.println(a);
        });


        /*proxy1("1221212", ()-> {

        });*/


        Consumer<String> cm = FuncTest::print;
        proxy("1221212",cm);
        FuncTest.print("12211");
    }




    public static void main1(String[] args) {
        //




    }

}
