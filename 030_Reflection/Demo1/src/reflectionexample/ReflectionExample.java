/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionexample;

import java.lang.reflect.Method;

/**
 *
 * @author silent
 */
public class ReflectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            Class cls = Class.forName("java.lang.Object");
            Method methods[] = cls.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.toString());
            }
        } catch(Throwable e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
    }
    
}
