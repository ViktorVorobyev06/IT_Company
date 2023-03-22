public class Manager extends Employee{
    private int bonus = 0;
    private final int dalyBonus = 1;
    private int workedDays = 0;

    @Override
    public void startWork() {
        System.out.println("Manager started work.");
        bonus += dalyBonus;
    }

    @Override
    public void endWork() {
        System.out.println("Manager ended work.");
        workedDays += 1;
    }

    @Override
    public double calculateRating() {
        double totalDays = (double) workedDays;
        double weekdays = 0.0;
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day != DayOfWeek.TUESDAY && day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                weekdays += 1.0;
            }
        }
        return weekdays / totalDays * bonus;
    }

}
