// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Valor: " + a + b + " Reais!");
        System.out.println("Valor: " + (a + b) + " Reais!");

        boolean valor = true;
        String texto1 = String.valueOf(valor);
        System.out.println("Convertendo boolean para String: " + texto1);

        char valor1 = 'c';
        String texto2 = String.valueOf(valor1);
        System.out.println("Convertendo char para String: " + texto2);

        int valor2 = new Integer("12");
        System.out.println("Convertendo int em Integer: " + valor2);
        String texto3 = String.valueOf(valor2);
        System.out.println("Convertendo int para String: " + texto3 + "\n");

        System.out.println("Tipos de dados em Java: \n" +
                "\nMenor Byte: " + Byte.MIN_VALUE +
                "\nMaior Byte: " + Byte.MAX_VALUE +
                "\nMenor Short Int: " + Short.MIN_VALUE +
                "\nMaior Short Int: " + Short.MAX_VALUE +
                "\nMenor Int: " + Integer.MIN_VALUE +
                "\nMaior Int: " + Integer.MAX_VALUE +
                "\nMenor Long: " + Long.MIN_VALUE +
                "\nMaior Long: " + Long.MAX_VALUE +
                "\nMenor Float: " + Float.MIN_VALUE +
                "\nMaior Float: " + Float.MAX_VALUE +
                "\nMenor Double: " + Double.MIN_VALUE +
                "\nMaior Double: " + Double.MAX_VALUE);

        String nome = "Kalebe";

        switch (nome){
            case "Calebe":
                System.out.println("Nome correto!");
                break;
            case "calebe":
                System.out.println("Nome Correto");
                break;
            case "Kalebe":
                System.out.println("Nome incorreto");
                break;
        }

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " elefante incomoda muita gente!");
        }


        //Use "Alt + Shift + F10"
        for(String obj: args){
            System.out.println(obj);
        }
        System.out.println("___");
        for(int i = 0; i < args.length; i++){
            String ag = args[i];
            System.out.println(ag);
        }

        for(String obj: args){
            Integer num = new Integer(obj);
            if(num < 12){
                System.out.println(num + "Criança");
            }else if(num < 18){
                System.out.println(num +"Adolescentes");
            }else if(num < 30){
                System.out.println(num +"Jovem");
            }else if(num < 60){
                System.out.println(num +"Adulto");
            }else{
                System.out.println(num +"Idoso");
            }
        }

        }

    }