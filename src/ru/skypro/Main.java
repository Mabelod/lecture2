package ru.skypro;

public class Main {
    public static void main(String[] args) {
        work1();
        work2();
        work3();
        work4();
        work5();
    }
    public static void work1(){
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        }else{
            System.out.println("Ты не можешь водить");
        }
    }
    public static void work2(){
        int age = 21;
        boolean canNotGoToSchool = age < 7 || age > 18;
        if (age >= 18 && age < 21){
            System.out.println("Ты достаточно взрослый, чтобы водить, но недостаточно взрослый чтобы пить алкоголь");
        }
        if (canNotGoToSchool){
            System.out.println("Я думаю ты не ходишь в школу");
        }
    }
    public static void work3(){
        int age = 19;
        boolean skyIsClear = true;
        if (skyIsClear){
            System.out.println("Небо чистое");
        }
    }
    public static void work4(){
        int age = 15;
        if (age > 18){
            System.out.println("Ты должен праздновать");
            if (age < 21){
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");}
            } else if (age > 7){
                    System.out.println("Иди в школу");
                } else {
                    System.out.println("Иди в детский сад");
                }
            }
    public static void work5(){
        int age = 7;
        if (age == 18){
            System.out.println("С окончанием школы");
        } else if (age == 21){
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age == 7){
            System.out.println("Иди в школу");
        }else {
            System.out.println("Пока сказать нечего");
        }
    }

    }

