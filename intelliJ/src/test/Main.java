package test;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Object> a = new ArrayList<>();
        a.add(2);
        a.add(2.3);
        a.add("hello world");
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }

    }
}