/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejenum;

/**
 *
 * @author Angel BG
 */
public class EjEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Valores de la enumeracion
        System.out.println("Valor 1:"+Dias.LUNES);
        //Hacemos un test del diautiliado
        indicarDia(Dias.VIERNES);
        //Utilizamos la enumeracionde paises
        System.out.println("Continente no. 4: "+Continentes.AMERICA);
        System.out.println("Paises en America: "+Continentes.AMERICA.getPaises());
        //Hacemos el test del nume ro de paisespor continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        //Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dia){
        switch(dia) {
        //Podemos usar algunvalor constante de la
        //enumeraciondirectamente
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
           default:
                System.out.println("Y asiseguimos con los demas dias");
        }
    }
    public static void indicarPaises(Continentes continentes) {
        switch(continentes) {
            //Podemos usar algunvalor constante
            //de la enumeraciondirectamente
            case AFRICA:
                System.out.println("No. Paises en:"
                +continentes +": "+continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demás contienentes");
        }
    }
    public static void imprimirContinentes(){
        //Utilizamos un forEach
        for(Continentes c:Continentes.values()){
            System.out.println("Continente:"+c +" contiene "
            +c.getPaises() +" paises.");
        }
    }
    
    
}
