import java.util.HashSet;
import java.util.Scanner;


public class A {
    public static void main(String[] args) {
    HashSet<B> laptops = new HashSet<B>();
        
        B lp1 = new B("Ноутбук ASUS Laptop E210KA-GJ080W", "ASUS",4, 128, "Windows 11", 11.6, "черный");
        B lp2 = new B("Ноутбук ASUS Laptop 15 F515KA-BR110W", "ASUS", 4, 128, "Windows 11", 15.6, "серый");
        B lp3 = new B("Ноутбук HP 14s-dq3002ur", "HP", 4, 128, "Windows 10", 14.0, "черный");
        B lp4 = new B("Ноутбук ASUS VivoBook 15 F513EA-BQ2396W", "ASUS", 8, 256, "Windows 11", 15.6, "черный");
        B lp5 = new B("Ноутбук Lenovo IdeaPad 3 15ALC6", "Lenovo", 8, 512, "Windows 10", 15.6, "серый");
        B lp6 = new B("Ноутбук Apple MacBook Air Starlight (MLY23)","Apple", 8, 512, "macOS", 13.6, "золотистый");
        B lp7 = new B("Ноутбук Lenovo V14 ADA", "Lenovo", 16, 128, "Windows 10", 14.0, "серый");
        B lp8 = new B("Ноутбук Lenovo IdeaPad 3 15ALC6", "Lenovo", 8, 512, "Windows 11",15.6, "черный");
        B lp9 = new B("Ноутбук Acer TravelMate P2 TMP214-52-58ZN", "Acer", 8, 256, "Windows 11", 14.6, "черный");

        laptops.add(lp1);
        laptops.add(lp2);
        laptops.add(lp3);
        laptops.add(lp4);
        laptops.add(lp5);
        laptops.add(lp6);
        laptops.add(lp7);
        laptops.add(lp8);
        laptops.add(lp9);

        // for(B l : laptops){
        //     System.out.println(l);
        // }

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по оперативной памяти");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по бренду");
        Scanner sc = new Scanner(System.in);
        Integer choice = sc.nextInt();
        if(choice == 1){
            System.out.printf("Введите минимальный размер оперативной памяти в ГБ (4, 8, 16): ");
            Integer ram = sc.nextInt();
            if(ram <= 4){
                for(B l : laptops){
                    System.out.println(l);
                }
            }else if(ram > 4 && ram <= 8){
                System.out.printf(lp4.toString() + "\n" + lp5.toString() + "\n" + lp6.toString() + "\n" + lp7.toString() + "\n" + lp8.toString() + "\n" + lp9.toString());
            }else if(ram > 8 && ram < 16){
                System.out.printf(lp7.toString());
            }else if(ram >= 16){
                System.out.printf(lp7.toString());
            }else System.out.println("Таких ноутбуков нет!");
        }

        else if(choice == 2){ 
            System.out.printf("Введите минимальрый размер SSD в ГБ (128, 256, 512): ");
            Integer ssd = sc.nextInt();
            if(ssd >=512){
                System.out.printf(lp5.toString() + "\n" + lp6.toString() + "\n" + lp8.toString());
            }else if(ssd > 256 && ssd < 512){
                System.out.printf(lp5.toString() + "\n" + lp6.toString() + "\n" + lp8.toString());    
            }else if(ssd > 128 && ssd <= 256){
                System.out.printf(lp4.toString() + "\n" + lp5.toString() + "\n" + lp6.toString() + "\n" + lp8.toString() + "\n" + lp9.toString());
            }else if(ssd <= 128 ){
                for(B l : laptops){
                    System.out.println(l);
                    }
            }else System.out.println("Таких ноутбуков нет!");
        }

        else if(choice == 3){
            System.out.println("Введите название бренда(ASUS, HP, Acer, Lenovo, Apple): ");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("ASUS")){
                System.out.printf(lp1.toString() + "\n" + lp2.toString() + "\n" + lp4.toString());
            }else if(os.equals("HP")){
                System.out.printf(lp3.toString());
            }else if(os.equals("Acer")){
                System.out.printf(lp9.toString());
            }else if(os.equals("Lenovo")){
            System.out.printf(lp5.toString() + "\n" + lp7.toString() + "\n" + lp8.toString());
            }else if(os.equals("Apple")){
                System.out.printf(lp6.toString() );
            }else System.out.println("Таких ноутбуков нет!");
            sc1.close();
        }
        sc.close();
    }
}

        

