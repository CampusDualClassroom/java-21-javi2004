package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hasShet = new HashSet<>();
        hasShet.add("ELEMENT KPRBC");
        hasShet.add("ELEMENT YPBTM");
        hasShet.add("ELEMENT AADXU");
        hasShet.add("ELEMENT RXCGJ");
        hasShet.add("ELEMENT WYMVD");
        hasShet.add("ELEMENT WFGEJ");
        hasShet.add("ELEMENT TYGBS");
        hasShet.add("ELEMENT MAPTK");
        hasShet.add("ELEMENT GJXVE");
        hasShet.add("ELEMENT BAFGL");
        return hasShet;
    }

    public static Set<String> createTreeSet() {
        Set<String> treeShet = new TreeSet<>();
        treeShet.add("ELEMENT KPRBC");
        treeShet.add("ELEMENT YPBTM");
        treeShet.add("ELEMENT AADXU");
        treeShet.add("ELEMENT RXCGJ");
        treeShet.add("ELEMENT WYMVD");
        treeShet.add("ELEMENT WFGEJ");
        treeShet.add("ELEMENT TYGBS");
        treeShet.add("ELEMENT MAPTK");
        treeShet.add("ELEMENT GJXVE");
        treeShet.add("ELEMENT BAFGL");
        return treeShet;
    }

    private static void printSet(Set<String> customSet) {
        for (String element:customSet){
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        printSet(createHashSet());
        printSet(createTreeSet());
        addElementToSet(createHashSet(),"ELEMENT AAA");
        addElementToSet(createTreeSet(),"ELEMENT AAA");
        printSet(createHashSet());
        printSet(createTreeSet());


    }

}
