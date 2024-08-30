class WeekDays {
    public static void main(String args[]) {
    int day = 4;
    String weekdayString;
    switch (day){
    case 1: weekdayString = "Monday";
    break;
    case 2: weekdayString = "Tuesday";
    break;
    case 3: weekdayString = "Wednesday";
    break;
    case 4: weekdayString = "Thursday";
    break;
    case 5: weekdayString = "Friday";
    break;
    case 6: weekdayString = "Saturday";
    break;
    case 7: weekdayString = "Sunday";
    break;
    }
    weekdays n = new weekDay();
    System.out.println(" The day of the week is " + weekdayString);
    }
    }
