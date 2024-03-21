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
        String text = generateRndStr(10);
        System.out.println(text);



        int[] arr = {5,8,10,20,40,100,125};

        printArr(arr);
        System.out.println(rndInt(4,14));
        int[] rndArr = rndIntArr(10,20,5);
        printArr(rndArr);
        System.out.println( sumArr(rndArr) );
        System.out.println(avgArr(rndArr));
        String[] names = {"name","name1","name2"};
        long[] distancesInSpace = {6184156345661L,65486374634L,684683514564L,68465335446351L};
        printArr(names);
        printArr(distancesInSpace);
    }
    public static double avgArr(int[] arr){
        return (double) sumArr(arr) / arr.length;
    }
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] rndIntArr(int min, int max, int length){
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rndInt(min, max);
        }
        return arr;
    }
    public static int rndInt(int min, int max){
            return min + (int) Math.round(Math.random() *(max - min));
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(boolean[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArr(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(long[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
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