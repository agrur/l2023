import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("test.txt"));
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
