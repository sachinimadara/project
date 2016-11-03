/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdsmadara
 */

import java.util.Scanner;


public class Calculator implements CalDB {


    @Override
public int add(Scanner a, Scanner b) {
    int n1=Integer.parseInt(a.next());
    int n2=Integer.parseInt(b.next());
    return  (n1 + n2);
}
    
    public int sub(Scanner a, Scanner b) {
    int n1=Integer.parseInt(a.next());
    int n2=Integer.parseInt(b.next());
    return  (n1 - n2);
}
    
    public int divi(Scanner a, Scanner b) {
    int n1=Integer.parseInt(a.next());
    int n2=Integer.parseInt(b.next());
    return  (n1 / n2);
}
    
    public int multi(Scanner a, Scanner b) {
    int n1=Integer.parseInt(a.next());
    int n2=Integer.parseInt(b.next());
    return  (n1 * n2);
}
}






