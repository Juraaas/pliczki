package com.company;

public class IntegerSet {
    private boolean[] tab;

    public IntegerSet() {
        tab = new boolean[100];
    }
    public static IntegerSet union(IntegerSet set, IntegerSet set1) {
        IntegerSet tmp = new IntegerSet();
        for (int i=1;i<100;i++) {
            if (set.tab[i] || set1.tab[i]) {
                tmp.tab[i] = true;
            }
        }
        return tmp;
    }
    public static IntegerSet intersection(IntegerSet set, IntegerSet set1) {
        IntegerSet tmp = new IntegerSet();
        for (int i=1;i<100;i++) {
            if (set.tab[i] && set1.tab[i]) {
                tmp.tab[i] = true;
            }
        }
        return tmp;
    }
    public void insertElement(int k) {
        tab[k] = true;
    }
    public void deleteElement(int k) {
        tab[k] = false;
    }
    public String toString(){
        String tmp = "";
        for (int i=1;i<100;i++){
            if (tab[i] == true){
                tmp += Integer.toString(i) + " ";
            }
        }
        return tmp;
    }
    public boolean equals(IntegerSet setTmp) {
        for (int i=1; i<100;i++) {
            if (tab[i] != setTmp.tab[i]) {
                return false;
            }
        }
        return true;
    }
}