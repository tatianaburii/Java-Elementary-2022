package ua.hillel.tatiana.elementary_homework_4;

public class Machine {
    public static double COUNT;
    private double volume;
    private double gasoline;
    private double fuelConsumption;


    public Machine(double volume, double gasoline, double fuelConsumption) {
        this.volume = volume;
        this.gasoline = gasoline;
        this.fuelConsumption = fuelConsumption;
        COUNT = gasoline;
    }

    public double fillFullTank() {//заправка до повношо баку
        System.out.println("Заправили: " + (volume - gasoline) + "л, бак повний!");
        COUNT += volume - gasoline;
        return gasoline = volume;
    }

    public double calculateTheRestGasoline(int N) {// розрахунок залишку палива
        if (N * fuelConsumption / 100 >= gasoline) {
            System.out.println("Бензину не вистачить до наступної АЗС, ви не можете вирушити в дорогу!");
            fillFullTank();
            gasoline -= N * fuelConsumption / 100;

            return gasoline;
        } else {
            System.out.println("Після подолання шляху " + N + " залишок у баку:" +
                    (gasoline -= N * fuelConsumption / 100) + "л");
        }
        return gasoline;
    }

    public double calculateAndPrintAddGasoline(int N) {//розрахунок необхідної кількості палива, щоб подолати відстань N
        if (N * fuelConsumption / 100 <= gasoline) {
            System.out.println("Палива вистачить!");
            return 0;
        }
        System.out.println("Необхідно: " + ((N * fuelConsumption / 100) - gasoline));
        return ((N * fuelConsumption / 100) - gasoline);

    }
    public double getCOUNT(){
        return COUNT;
    }


}
