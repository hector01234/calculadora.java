public class PruebaCalculadora {
    public static void main(String [ ] args) {
        System.out.println("ingrese el primer numero a operar");
        int dato1=Integer.parseInt( System.console().readLine());      
        System.out.println("ingrese el segundo numero a operar");
        int dato2= Integer.parseInt(System.console().readLine());
    
       Calculadora a = new Calculadora( dato1, dato2);
       System.out.println(a);
       a.suma();
       a.division();
       a.multiplicacion();
       a.resta();


        

    }
}
