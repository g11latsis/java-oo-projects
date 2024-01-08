package gr.aueb.ch14;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {

        try {

            Class<?> clazz  = Class.forName("gr.aueb.ch14.Student");

            Constructor<?> defaultCtr = clazz.getDeclaredConstructor();
            defaultCtr.setAccessible(true);
            Student student = (Student) defaultCtr.newInstance();

        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
