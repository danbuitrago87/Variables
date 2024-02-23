public class Variables {
    public static void main (String [] args){
        byte b=127; //-128 a 127 3 digitos enteros ocupa un byte de la memoria ram
        short s=32767;//cinco digitos ocupa 2 bytes
        int n=1234567890; //diez digitos ocupa 4 bytes
        long nL=123456789012345L; //19 digitos ocupa 8 bytes con la L al final puedo identificar si la variable es de tipo Long
        System.out.println("Imprime: " +b);
        System.out.println("Imprime: " +s);
        System.out.println("Imprime: " +n);
        System.out.println("Imprime: " +nL);
        float f=3.141545654654F; //4 bytes 1.4E-45 3.4E+48
        double d=3.14166546546546; //8 bytes 4.9E-324 1.7E308 para calculos matemáticos con mayor precisión
        System.out.println("Imprime: " +f);
        System.out.println("Imprime: " +d);
        
    }

}