package com.fsoftdev.nullcheck;

import java.util.ArrayList;

public class Grocery {

    ArrayList<String> groceryList;

    public ArrayList<String> getGroceryList() {

        if(groceryList!=null)
            return groceryList;
        return new ArrayList<>();
    }



    public ArrayList<String> getGroceryList2() {

        ArrayList<String> groceryList=new ArrayList<>();
        for (String groceryItem : groceryList) {
            groceryList.add(groceryItem);
        }

        return groceryList;

    }





}
