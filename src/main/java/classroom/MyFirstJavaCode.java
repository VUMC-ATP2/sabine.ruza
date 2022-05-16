package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);
        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1000);

        System.out.printf("Average salary for Junior QA Engineer is: %d\n", salaryInEur);

        int chinaPopulation = 123456789;
        long currentWorldPopulation = 987654321;
        System.out.printf("Current world population: %d. Meanwhile china population: %d\n", currentWorldPopulation, chinaPopulation);
        float myCurrentWight = 70.6f;
        System.out.println(myCurrentWight);
        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        char firstLettersOfMyName = 'S';
        String myName = "Sabine";
        System.out.println(myName);
        String mySentence = "Hi, my name is Sabine.";
        String mySecondSentence = "I live in Riga.";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + " " + mySecondSentence);

        System.out.printf("%s %s\n", mySentence, mySecondSentence);


        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);


        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        System.out.println(7 + 7);
        System.out.println("7" + 7);
        System.out.println("7" + "7");

        boolean isAGreaterThanB = a > b;
    }
}