public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de temperatura");

        int temperaturaCelsiu = 40;
        double temperaturaFahrenheit = (temperaturaCelsiu * 1.8) + 32;

        System.out.println("A conversão de " + temperaturaCelsiu + " graus Celsius é igual a " + temperaturaFahrenheit + " graus fahrenheit");
    }
}