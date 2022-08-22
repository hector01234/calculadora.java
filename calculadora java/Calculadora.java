//un objeto de una calculadora
public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora (int a, int b){
        this.num1 = a;
        this.num2 =b;
    }
    public int getnum1(){
        return num1;
    }
    public int getnum2(){
        return num2;
    }
    
    //funcion de suma
    public void suma(){         
        System.out.println( " primer numero a sumar " + num1);     
        System.out.println( " segundo numero a sumar " + num2);
        System.out.println( "este es el resultado de la suma " + (num1 + num2));
    } //funcion de resta

    public void resta(){         
        System.out.println(" primer numero a restar  "   + num1);            
        System.out.println( " segundo numero a restar "  + num2);
        System.out.println( "este es el resultado de la resta " + (num1 - num2));
    } 
    
    //funcion de multiplicacion

    public void multiplicacion(){         
        System.out.println(" primer numero a multiplicar "  + num1);     
        System.out.println(" segundo numero a multiplicar " + num2);
        System.out.println( "este es el resultado de la multiplicacion " + (num1 * num2));
    }
    
    //funcion de division

    public void division(){         
        System.out.println( " primer numero a dividir " + num1);     
        System.out.println( " segundo numero a dividir " + num2);
        System.out.println( "este es el resultado de la division " + (num1  / num2));
    }
 //metodo tostring
    public String toString(){
        return "Esta calculadora hace operaciones llamando a la funcion deseada "
            + " (multiplicacion, division, suma o resta)";
    }
}
