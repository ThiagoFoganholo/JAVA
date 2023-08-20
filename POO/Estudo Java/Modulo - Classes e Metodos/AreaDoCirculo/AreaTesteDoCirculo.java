public class AreaTesteDoCirculo {
    public static void main(String[] args) {
        
        //AreaDoCirculo.pi = 3.14;
        
        AreaDoCirculo a1 = new AreaDoCirculo(10);
        //a1.pi = 10;
        
        AreaDoCirculo a2 = new AreaDoCirculo(0);
        //a2.pi = 0;

        System.out.printf("Pi = %.5f\n",AreaDoCirculo.PI);
        System.out.println(a1.area());
        System.out.println(a2.area());
    }
    
}
