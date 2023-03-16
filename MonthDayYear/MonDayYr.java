import java.util.*;;

public class MonDayYr {
    public static void main(String args[]) {
        int inputMonth, inputDay, inputYear;
        String initialString, finalString;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a valid month: ");
        do {
            try {
                inputMonth = Integer.valueOf(scanner.nextLine());
                if ((inputMonth < 1) || (inputMonth > 12))
                {
                    throw new MonthException("Exception: month must be between 1 and 12!");
                }
                break;
            } catch (MonthException e) {
                System.out.println(e.getMessage());
                System.out.print("Enter a valid month input: ");
            }
        }
        while (true);

        System.out.print("Please enter a valid year: ");
        do {
            try {
                inputYear = Integer.valueOf(scanner.nextLine());
                if ((inputYear < 1000) || (inputYear > 3000))
                {
                    throw new YearException("Exception: year must be between 1000 and 3000!");
                }
                break;
            } catch (YearException e2) {
                System.out.println(e2.getMessage());
                System.out.print("Enter a valid year input: ");
            }
        }
        while (true);

        System.out.print("Please enter a valid day: ");
        do {
            try {
                inputDay = Integer.valueOf(scanner.nextLine());
                if (!validDay(inputDay, inputMonth, inputYear))
                {
                    throw new YearException("Exception: this is not within the date range for " + monthConverter(inputMonth) + "!");
                }
                break;
            } catch (YearException e2) {
                System.out.println(e2.getMessage());
                System.out.print("Enter a valid day input: ");
            }
        }
        while (true);

        scanner.close();
        System.out.println("Our original format was: " + inputMonth + "/" + inputDay + "/" + inputYear);
        System.out.println("Our final format is: " + monthConverter(inputMonth) + " " + inputDay + ", " + inputYear);
    } 

    public static String monthConverter(int month) {
        if (month == 1) return "January";
        else if (month == 2) return "February";
        else if (month == 3) return "March";
        else if (month == 4) return "April";
        else if (month == 5) return "May";
        else if (month == 6) return "June";
        else if (month == 7) return "July";
        else if (month == 8) return "August";
        else if (month == 9) return "September";
        else if (month == 10) return "October";
        else if (month == 11) return "November";
        else if (month == 12) return "December";
        else return "";
    }

    public static boolean validDay(int inputDay, int inputMonth, int inputYear) {
        if (inputDay < 1) {
            return false;
        }
        if (inputMonth == 1) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 2) {
            if (((inputYear % 100) == 0) && ((inputYear % 400) == 0)) {
                if (inputDay > 29) {
                    return false;
                }
            }
            if (inputDay > 28) {
                return false;
            }
        }
        if (inputMonth == 3) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 4) {
            if (inputDay > 30) {
                return false;
            }
        }
        if (inputMonth == 5) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 6) {
            if (inputDay > 30) {
                return false;
            }
        }
        if (inputMonth == 7) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 8) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 9) {
            if (inputDay > 30) {
                return false;
            }
        }
        if (inputMonth == 10) {
            if (inputDay > 31) {
                return false;
            }
        }
        if (inputMonth == 11) {
            if (inputDay > 30) {
                return false;
            }
        }
        if (inputMonth == 12) {
            if (inputDay > 31) {
                return false;
            }
        }

        return true;
    }
}



