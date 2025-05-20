public class IntroducirVariableExplicativa {
    public static void main(String [] args) {
        double precioBase = 100;
        double impuestos = 21;
        double descuento = 10; 

        // antes: double total = precioBase + (precioBase * impuestos / 100)

        //despues: con variable explicativa 


        double impuestosCalculados = precioBase * impuestos / 100;
        double total = precioBase + impuestosCalculados - descuento ;

        System.out.println("Total a pagar: " + total + "$");
    }
}