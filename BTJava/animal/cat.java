/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Admin
 */
public class cat {
    public int ID;
    public String type;
    public String color;
    public int weight;
    public int age;
    public cat(int ID,String type,String color,int weight,int age){
        this.ID = ID;
        this.age=age;
        this.color=color;
        this.weight=weight;
        this.type=type;
    }

    cat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void cao(){
        System.out.print("Cào");
    }
     public void an(){
        System.out.print("Ăn");
    }
      public void chay(){
        System.out.print("Chạy");
    }
    
}
