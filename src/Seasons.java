import java.util.Scanner;

public class Seasons {
        String Jaz;
        String Jai;
        String Kuz;
        String Kysh;

        public static void Seasons1(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir san beriniz: ");
            int resultSeasons = scanner.nextInt();
            if(resultSeasons>=3 && resultSeasons<=5){
                System.out.println("Jaz");
            }else if(resultSeasons>=6 && resultSeasons<=8){
                System.out.println("Jai");
            }else if(resultSeasons>=9 && resultSeasons<=11){
                System.out.println("Kuz");
            }else if(resultSeasons>=1 && resultSeasons<=2 || resultSeasons == 12){
                System.out.println("Kysh");
            }else{
                System.out.println("Komandany tuura teriniz!!!");
            }
        }

    }

