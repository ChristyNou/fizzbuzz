package com.christina;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{

/*
    public void changeList(ArrayList<String> num) {
        for (int i = 0; i < num.size(); i++) {
            num.set(i, convert(Integer.parseInt(num.get(i))));
        }
    }
*/
    public void print(int n, ArrayList<String> num){

        StringBuilder builder = new StringBuilder();
        for (String value : num) {
            builder.append(value + " ");
        }
        String text = builder.toString();
        System.out.print(text);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
