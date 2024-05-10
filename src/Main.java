public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");

        int a = 33333; /// задание 1
        byte b = 33;
        short c = -333;
        long d = 3444333777L;
        float e = 0.13f;
        double f = 3.1415926535;
        System.out.println("int="+ a + ", byte=" + b + ", short=" + c + ", long=" + d + ", float=" + e + ", double=" + f);

        float e1 = 27.12f; /// задание 2
        long d1 = 987678965549L;
        float e2 = 2.786f;
        short c1 = 569;
        short c2 = -159;
        short c3 = 27897;
        byte b1 = 67;

        byte ludmilaStudent = 23; /// задание 3
        byte annaStudent = 27;
        byte ekaterinaStudent = 30;
        byte students = (byte) (ludmilaStudent + annaStudent + ekaterinaStudent);
        short paper = 480;
        short paperForStudent = (short) (paper / students);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        byte spmh = 16; /// задание 4
        byte time = 2;
        byte spmhForMin = (byte) (spmh / time);
        byte time20Min = 20;
        short timeSutki = 24*60;
        int time3Day = (int) (timeSutki*3);
        int timeMonth = (int) (timeSutki*31);
        System.out.println("За " + time20Min + " мин машина произвела " + (time20Min*spmhForMin) + " штук бутылок");
        System.out.println("За " + timeSutki + " мин (сутки) машина произвела " + (timeSutki*spmhForMin) + " штук бутылок");
        System.out.println("За " + time3Day + " мин (3 дня)  машина произвела " + (time3Day*spmhForMin) + " штук бутылок");
        System.out.println("За " + timeMonth + " мин (месяц) машина произвела " + (timeMonth*spmhForMin) + " штук бутылок");

        byte dye = 120; /// задание 5
        byte whiteFor1 = 2;
        byte brownFor1 = 4;
        byte classroms = (byte) (dye/(whiteFor1+brownFor1));
        System.out.println("В школе, где " + classroms +" классов, нужно " + classroms*whiteFor1 + " банок белой краски и " + classroms*brownFor1 + " банок коричневой краски");

        byte banans = 5; /// задание 6
        short banansGr = 80;
        banansGr = (short) (banans*banansGr);
        short milk = 200;
        float milkGr = 1.05f;
        milkGr = (float) (milkGr*milk);
        byte icecream = 2;
        short icecreamGr = 100;
        icecreamGr = (short) (icecream*icecreamGr);
        byte egg = 4;
        short eggGr = 70;
        eggGr = (short) (egg*eggGr);
        float breakfast = banansGr+milkGr+icecreamGr+eggGr;
        System.out.println("Калорийный бум в граммах " + breakfast + ", а в кг " + breakfast/1000);

        short target = 7*1000; /// задание 7
        short gr250 = 250;
        gr250 = (short) (target/gr250);
        short gr500 = 500;
        gr500 = (short) (target/gr500);
        System.out.println("Потребуется " + gr250 + " дней при условии, что спортсмен худеет на 250 грамм в день, " + gr500 + " дней если на 500 гр в день");

        int masha = 67760; /// задание 8
        float mashaPlus = (float) (masha* 0.10);
        System.out.println("Машина зарплата в мес после прибаки "+ (masha+mashaPlus) + " руб., а разница в год после повышения составила " + mashaPlus*12 + " руб.");
        int denis = 83690;
        float denisPlus = (float) (denis* 0.10);
        System.out.println("Зарплата Дениса в мес. после прибаки "+ (denis+denisPlus) + " руб., а разница в год после повышения составила " + denisPlus*12 + " руб.");
        int kristina = 76230;
        float kristinaPlus = (float) (kristina* 0.10);
        System.out.println("Зарплата Кристины в мес. после прибаки "+ (kristina+kristinaPlus) + " руб., а разница в год после повышения составила " + kristinaPlus*12 + " руб.");
    }
}