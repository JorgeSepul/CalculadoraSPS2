import java.io.*;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LanzarCalculadora {

    public void lanzarCalculadora() {
        Scanner sc = new Scanner(System.in);
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("java -jar Calculadora.jar");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
                 OutputStreamWriter osw = new OutputStreamWriter(p.getOutputStream())) {
                String linea;

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);


                    osw.write(sc.nextInt()+"\n");
                    osw.flush();
                    linea = br.readLine();
                    System.out.println(linea);


                    osw.write(sc.nextInt()+"\n");
                    osw.flush();

                    linea = br.readLine();
                    System.out.println(linea);
                    osw.write(sc.nextInt()+"\n");
                    osw.flush();

                    linea = br.readLine();
                    System.out.println(linea);
                }

            }
            }catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
        System.out.println("Calculadora erronea.");

}

    }
    public static void main(String[] args) {
LanzarCalculadora calc = new LanzarCalculadora();
calc.lanzarCalculadora();
    }
}