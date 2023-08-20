public class AreaDoCirculo {
    double raio;
    static final double PI = 3.1415;

    AreaDoCirculo(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return raio * raio * PI;
    }
}
