import java.io.IOException;
import java.lang.ProcessBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {




            startCalculator();
            startExplorer();
            startNotepad();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 чтобы закрыть");
        int q=scanner.nextInt();

        if(q==1){
            System.out.println("\n=== ЗАВЕРШЕНИЕ ПРОЦЕССОВ ===");
            terminateProcess();

        }


    }

    private static Process startNotepad() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        System.out.println("Запуск Блокнота...");
        return pb.start();
    }


    private static Process startCalculator() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("calc.exe");
        System.out.println("Запуск Калькулятора...");
        return pb.start();
    }


    private static Process startExplorer() throws IOException {
      
        ProcessBuilder pb = new ProcessBuilder("mspaint.exe");
        System.out.println("Запуск Проводника...");
        return pb.start();
    }



    private static void terminateProcess () throws IOException {
            Runtime.getRuntime().exec("taskkill /f /im notepad.exe");
            Runtime.getRuntime().exec("taskkill /f /im CalculatorApp.exe");
            Runtime.getRuntime().exec("taskkill /f /im mspaint.exe");


        }

        }

