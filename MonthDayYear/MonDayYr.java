import java.util.*;
import java.text.*;

public class MonDayYr {
    public static void main(String args[]) {
        int inputMonth, inputDay, inputYear;
        String initialString, finalString;
        String dateSplit[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a date in format MONTH/DAY/YEAR: "); 
        initialString = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        do
        {
            try {
                dateFormat.parse(initialString);
                break;
            } catch (ParseException e) {
                System.out.print("Please follow the correct format! ");
                initialString = scanner.nextLine();
            }
        }
        while (true);

        dateSplit = initialString.split("/"); 
        
        do {
            try {
                inputMonth = Integer.valueOf(dateSplit[0]);
                break;
            } catch (NumberFormatException eA) {
                System.out.print("Please enter the proper data type (int) for the month! ");
                dateSplit[0] = scanner.nextLine();
            }
        }
        while (true);
        
        do {
            try {
                inputDay = Integer.valueOf(dateSplit[1]);
                break;
            } catch (NumberFormatException eA) {
                System.out.print("Please enter the proper data type (int) for the day! ");
                dateSplit[1] = scanner.nextLine();
            }
        }
        while (true);

        do {
            try {
                inputYear = Integer.valueOf(dateSplit[2]);
                break;
            } catch (NumberFormatException eA) {
                System.out.print("Please enter the proper data type (int! for the year ");
                dateSplit[2] = scanner.nextLine();
            }
        }
        while (true);

        if ((inputMonth < 1) || (inputMonth > 12))
        {
            System.out.print("Exception: month must be between 1 and 12! Enter a valid month input: ");
            do {
                try {
                    do {
                        try {
                            inputMonth = Integer.valueOf(scanner.nextLine());
                            break;
                        } catch (NumberFormatException eA) {
                            System.out.print("Please enter the proper data type! ");
                        }
                    }
                    while (true);

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
        }

        if ((inputYear < 1000) || (inputYear > 3000))
        {
            System.out.print("Exception: year must be between 1000 and 3000! Enter a valid year input: ");
            do {
                try {
                    do {
                        try {
                            inputYear = Integer.valueOf(scanner.nextLine());
                            break;
                        } catch (NumberFormatException eA) {
                            System.out.print("Please enter the proper data type! ");
                        }
                    }
                    while (true); 

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
        }

        if (!validDay(inputDay, inputMonth, inputYear))
        {
            System.out.print("Exception: this is not within the date range for " + monthConverter(inputMonth) + "! Enter a valid day input: ");
            do {
                try {
                    do {
                        try {
                            inputDay = Integer.valueOf(scanner.nextLine());
                            break;
                        } catch (NumberFormatException eA) {
                            System.out.print("Please enter the proper data type! ");
                        }
                    }
                    while (true);          

                    if (!validDay(inputDay, inputMonth, inputYear))
                    {
                        throw new YearException("Exception: this is not within the date range for " + monthConverter(inputMonth) + "!");
                    }
                    break;
                } catch (YearException e3) {
                    System.out.println(e3.getMessage());
                    System.out.print("Enter a valid day input: ");
                }
            }
            while (true);
        }
        
        scanner.close();
        initialString = inputMonth + "/" + inputDay + "/" + inputYear;

        System.out.println("Our original format was: " + initialString);
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
            else {
                if (inputDay > 28) {
                    return false;
                }
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



