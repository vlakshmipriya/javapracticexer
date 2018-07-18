package com.exertwo.code;

public class MemberVariable {

    public static String[] displayProperties(String[] strArr) {

        Member disObj = new Member();
        disObj.age = 30;
        disObj.name = "Harry Potter";
        disObj.sal = (float) 2500.3;
        String str = strArr[0].concat(disObj.name).concat(",").concat(strArr[1]).concat(Float.toString(disObj.sal))
                .concat(",").concat(strArr[2]).concat(Integer.toString(disObj.age));
        return str.split(",");
    }
}
