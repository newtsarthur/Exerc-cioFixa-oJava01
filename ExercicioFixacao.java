public class Main
{
	public static void main(String[] args) {
	    String prod1 = "Computer1";
	    String prod2 = "Computer1";
	    
	    int age = 30;
	    int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
        
        System.out.printf("Computer, which price is $ %.2f reais%n", price1);
        System.out.printf("Office desk, which price is $ %.2f %n", price2);
        
        System.out.printf("Record: %d years old, code %d and gender: %s  %n",age, code, gender);
        
        System.out.printf("Measure with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places: %.3f %n", measure);
	}
}