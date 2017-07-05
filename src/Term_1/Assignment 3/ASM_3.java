import java.util.Scanner;

public class ASM_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int month;
        int day;
        String[] days = {"idiot","first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteen", "fourteen", "fifteen", "sixteen", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first",};
        String[] months = {"idiot","January","February","March","April","May","June","July","August","September","October","November","December"};

        System.out.println("On what day of the month were you born? (number)");
        day = scan.nextInt();

        System.out.println("In which month were you born? (number)");
        month = scan.nextInt();


        if (month <= 0 || month >=13){
            System.out.println("error");
        }else if (day <=0 || day>=32){
            System.out.println("error");
        }else {
            switch (month) {
                case 1:
                    if (day <= 19) {
                        System.out.println("Your sign is Capricorn");
                    } else {
                        System.out.println("Your sign is Aquarius");
                    }
                    break;
                case 2:
                    if (day <= 18) {
                        System.out.println("Your sign is Aquarius");
                    } else {
                        System.out.println("Your sign is Pisces");
                    }
                    break;
                case 3:
                    if (day <= 20) {
                        System.out.println("Your sign is Pisces");
                    } else {
                        System.out.println("Your sign is Aries");
                    }
                    break;
                case 4:
                    if (day <= 19) {
                        System.out.println("Your sign is Aries");
                    } else {
                        System.out.println("Your sign is Taurus");
                    }
                    break;
                case 5:
                    if (day <= 20) {
                        System.out.println("Your sign is Taurus");
                    } else {
                        System.out.println("Your sign is Gemini");
                    }
                    break;
                case 6:
                    if (day <= 20) {
                        System.out.println("Your sign is Gemini");
                    } else {
                        System.out.println("Your sign is Cancer");
                    }
                    break;
                case 7:
                    if (day <= 22) {
                        System.out.println("Your sign is Cancer");
                    } else {
                        System.out.println("Your sign is Leo");
                    }
                    break;
                case 8:
                    if (day <= 22) {
                        System.out.println("Your sign is Leo");
                    } else {
                        System.out.println("Your sign is Virgo");
                    }
                    break;
                case 9:
                    if (day <= 22) {
                        System.out.println("Your sign is Virgo");
                    } else {
                        System.out.println("Your sign is Libra");
                    }
                    break;
                case 10:
                    if (day <= 22) {
                        System.out.println("Your sign is Libra");
                    } else {
                        System.out.println("Your sign is Scorpio");
                    }
                    break;
                case 11:
                    if (day <= 21) {
                        System.out.println("Your sign is Scorpio");
                    } else {
                        System.out.println("Your sign is Sagittarius");
                    }
                    break;
                case 12:
                    if (day <= 21) {
                        System.out.println("Your sign is Sagittarius");
                    } else {
                        System.out.println("Your sign is Capricorn");
                    }

                    break;
            }
            System.out.println("Your birthday is: " + months[month] + " " + days[day]);
            System.out.println("Horoscope: Expect lots of hard work, but also lots of laughs this month.");
        }

    }
}