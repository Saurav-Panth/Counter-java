import java.util.Scanner;
public class JavaDemo {
        public static void main(String[] args){

            ArrayEdit obj = new ArrayEdit();

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter String");
            String passd = myObj.nextLine();

            System.out.println(obj.counter(passd));


    }
}
