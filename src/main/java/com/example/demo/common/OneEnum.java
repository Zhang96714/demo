package com.example.demo.common;

public enum OneEnum implements OneEnumInf {

    ONE {
        @Override
        public void absMethod() {

        }
    },
    TWO {
        @Override
        public void absMethod() {

        }
    };

    public abstract void absMethod();
}
