package com.example.demo.common;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author: zhangguofen
 * @date: 2023/1/13 12:24
 */
public class PoJoObj implements Cloneable {

    static {
//        System.out.println("init obj in static init block");
    }

    private int anInt;
    private Integer integer;
    private PoJoObj poJoObj;
    private int[] ints;
    private PoJoObj[] poJoObjs;

    {
//        System.out.println("init obj in init block");
    }

    public PoJoObj() {
//        System.out.println("init obj in constructor method");

        integer = 1;
        ints = bigInts();
    }

    private int[] bigInts() {
        int s = 1000;
        int[] ints1 = new int[s];
        for (int i = 0; i < s; i++) {
            ints1[i] = 1 + i;
        }
        return ints1;
    }

    private PoJoObj[] bigPoJos(PoJoObj poJoObj) {
        int s = 1000;
        PoJoObj[] poJoObj1 = new PoJoObj[s];
        for (int i = 0; i < s; i++) {
            poJoObj1[i] = poJoObj;
        }
        return poJoObj1;
    }

    public void setPoJoObj(PoJoObj poJoObj) {
        this.poJoObj = poJoObj;
        this.poJoObjs = bigPoJos(poJoObj);
    }

    public int[] getInts() {
        return ints;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PoJoObj copy = (PoJoObj) super.clone();

        copy.ints = ints == null ? null : ints.clone();
        copy.poJoObj = poJoObj == null ? null : (PoJoObj) poJoObj.clone();
        if (poJoObjs == null) {
            //finish copy
            return copy;
        }

        //array copy
        PoJoObj[] oldOjs = poJoObjs;
        PoJoObj[] newObjs = new PoJoObj[oldOjs.length];
        for (int i = 0; i < newObjs.length; i++) {
            PoJoObj obj = oldOjs[i];
            newObjs[i] = obj == null ? null : (PoJoObj) oldOjs[i].clone();
        }
        copy.poJoObjs = newObjs;

        return copy;

//        return super.clone();
    }

    @Override
    public String toString() {
        String s = super.toString();
        return new StringJoiner(", ", s + "[", "]")
                .add("anInt=" + anInt)
                .add("integer=" + integer)
                .add("poJoObj=" + poJoObj)
                .add("ints@" + addrString(ints.toString()) + Arrays.toString(ints))
                .add("poJoObjs@" + addrString(poJoObjs.toString()) + Arrays.toString(poJoObjs))
                .toString();
    }

    private String addrString(String s) {
        return s.substring(s.indexOf('@') + 1) + "=";
    }
}
