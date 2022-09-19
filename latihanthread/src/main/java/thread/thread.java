/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static java.lang.Thread.sleep;
/**
 *
 * @author USER
 */
public class thread {
    
    public static void main(String[] args) {
        //TODO code application logic here
        Thread t1=new Proses1();
        Thread t2=new Proses2();
        
        t1.start();
        t2.start();
    }
}


class Proses1 extends Thread{
    @Override
    public void run(){
        try{
            sleep(300);
        }catch (InterruptedException e){
}
        System.out.println("Proses 1 Berjalan");
    }
}

class Proses2 extends Thread{
    @Override
    public void run(){
        System.out.println("Proses 2 Berjalan");
    }
}