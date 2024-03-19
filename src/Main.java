public class Main {
    public static void main(String[] args) {
        sayHi();
        sayHiTo("Joana");
        sayHiTo("Aivaras");
        String vardas = "Naglis";
        sayHiTo(vardas);
        sayHiTo("Vaida");
        /*
        po kapotu:
            sayHiTo(vardas);
            sayHiTo( kintamasis vardas atiduoda teksta);
            sayHiTo("Naglis")
         */
        printRndIntChoise(14,20);
        double result = simPI();
        System.out.println(result);

        System.out.println( simPI() );
        System.out.println(formatNameCase("nAGLIS"));
    }
    public static String formatNameCase(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static double simPI(){
        return  3.14;
    }
    public static void printRndIntChoise(int a, int b){
        if(Math.random() > 0.5){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public static void sayHi(){
        System.out.println("Labas rytas!");
    }
    public static void sayHiTo(String name){// viskas ka paduodame i funkcija pakrikstijam 'name'
        System.out.println("Labas rytas " + name + "!");
    }
}