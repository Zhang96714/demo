package com.example.demo.common;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author: zhangguofen
 * @date: 2023/1/13 12:24
 */
public class PoJoObj implements Cloneable, Comparable<PoJoObj> {

    public static final int CODE_1 = 0x00000001;
    public static final int CODE_2 = 0x00000002;
    public static final int CODE_3 = 0x00000004;
    public static final int CODE_4 = 0x00000008;

    public static final int CODE_11 = 0x00000010;
    public static final int CODE_22 = 0x00000100;
    public static final int CODE_33 = 0x00001000;
    public static final int CODE_44 = 0x00010000;

    static {
        //only init once
        System.out.println("init obj in static init block");
    }

    private int code;
    private PoJoObj.MObject mObject = new MObject() {
        @Override
        public String toString() {
            return super.toString();
        }
    };
    private int anInt;
    private Integer integer;
    private PoJoObj poJoObj;
    private int[] ints;
    private PoJoObj[] poJoObjs;

    {
        System.out.println("init obj in init block");
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

    public static void main(String[] args) {
//        new PoJoObj().func();

        System.out.println("-new line-");
        MObject mObject1 = new PoJoObj().mObject;
        System.out.println(mObject1.getClass());
        System.out.println(MObject.class);

//        System.out.println(mObject1.getClass().isMemberClass());//false
//        System.out.println(mObject1.getClass().isMemberClass());//false
//        System.out.println(mObject1.getClass().isAnonymousClass());//true

//        System.out.println(MObject.class.isMemberClass());//true
//        System.out.println(MObject.class.isAnonymousClass());//false
//        System.out.println(MObject.class.isLocalClass());//false

//        PoJoObj poJoObj1=new PoJoObj();
//        poJoObj1.code=CODE_1 |CODE_2|CODE_4|CODE_11;
//        System.out.println(poJoObj1.hasCode(CODE_1));//true
//        System.out.println(poJoObj1.hasCode(CODE_3));//false
//        System.out.println(poJoObj1.hasCode(CODE_11));//true
    }

    public boolean hasCode(int code) {
        return (this.code & code) == code;
    }

    @Override
    public int compareTo(PoJoObj o) {
        if (null == o)
            return 1;
        return this.anInt - o.anInt;
    }

    public void func() {
        class PImpl1 extends PPObject {

            @Override
            void ppMethod() {
                super.ppMethod();
                //局部类
                System.out.println("getClass().isLocalClass():" + (getClass().isLocalClass()));
            }
        }

        PPObject ppObject = new PImpl1();
        ppObject.ppMethod();

        System.out.println("---");
        new PPObject() {

            @Override
            void ppMethod() {
                super.ppMethod();
                //匿名类
                System.out.println("getClass().isAnonymousClass():" + getClass().isAnonymousClass());
            }
        }.ppMethod();
    }

    static abstract class MObject {
    }

    abstract class PPObject {

        void ppMethod() {
            System.out.println(getClass());
        }
    }
}
