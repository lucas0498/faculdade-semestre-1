/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author McLOVIN
 */
public class testevetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int total = 0;
int c[] = new int[10];
for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
}
for (int i = 0; i<c.length; i++) {
	total += c[i];
}
System.out.println(total);


int v0 = 3;
int v1 = v0++;
int v2 = ++v1;
v1 += v0;
v2 += --v1;
        System.out.println(v0+" "+v1+" "+ v2);
        
        int x, y;
double z;

x = 5;
y = 2;
z = x / y;
System.out.println(z);


for (int i = 1; i < 5; i++) {
	if (i==2) continue;
	System.out.println("i =" + i); 
}
    }
    
    
    
    
    
}
