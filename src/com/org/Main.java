package com.org;

import models.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Being> being = new ArrayList<>();
        being.add(new Eagle("mukul",2,5,3,1,5,2));
        being.add(new Wolf("test",1,2,5,4,3));
        System.out.println(being);

    }
}
