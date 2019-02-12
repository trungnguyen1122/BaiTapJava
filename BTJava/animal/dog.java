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
public class dog {
     public int ID;
    public String type;
    public String color;
    public int weight;
    public int age;
    //Contractor
    public dog(int ID,String type,String color,int weight,int age){
        this.ID = ID;
        this.age=age;
        this.color=color;
        this.weight=weight;
        this.type=type;
    }

    dog(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void sua(){
        System.out.print("Sủa");
    }
     public void an(){
        System.out.print("Ăn");
    }
      public void chay(){
        System.out.print("Chạy");
    }
}
