package animal;


public class main {
    public static void main(String[] args){
       dog dog1 = new dog(1, "Chó ta", "đen", 10,1);
       cat cat1 = new cat(1, "mèo ta", "trắng", 1, 1);

       if(dog1.weight> cat1.weight){
           dog1.sua();
           cat1.chay();
       }else {
           cat1.cao();
           dog1.chay();
       }
    }
}