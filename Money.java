public class Money {
    private int Dollars;
    private int Cents;

    public Money(int dollars, int cents)
    {
        if (dollars < 0)
        {
            dollars = 0;
        }
        if (cents < 0)
        {
            cents = 0;
        }
        while (cents >= 100)
        {
            dollars++;
            cents = cents - 100;
        }

        this.Dollars = dollars;
        this.Cents = cents;
    }
    public Money(int dollars)
    {
        if (dollars < 0)
        {
            dollars = 0;
        }

        this.Dollars = dollars;
        this.Cents = 0;
    }
    public Money()
    {

    }
    public int getDollars()
    {
        return Dollars;
    }
    public int getCents()
    {
        return Cents;
    }
    public void setDollars(int dollars)
    {
        this.Dollars = dollars;
    }
    public void setCents(int cents)
    {
        this.Cents = cents;
    }
    public String toString()
    {
        String returnString = "$" + Dollars;
        if (Cents < 10)
        {
            returnString = returnString + ".0" + Cents;
        }
        else
        {
            returnString = returnString + "." + Cents;
        }
        return returnString;
    }
    public boolean equals(Object other)
    {
        if ((other != null) && (other.getClass() == Money.class))
        {
            if ((this.getDollars() == ((Money) other).getDollars()) && (this.getCents() == ((Money) other).getCents()))
            {
                return true;
            }
        }   
        return false;
    }
    public static Money add(Money m1, Money m2)
    {
        int sumDollars, sumCents;
        sumDollars = m1.getDollars() + m2.getDollars();
        sumCents = m1.getCents() + m2.getCents();
        if (sumCents >= 100)
        {
            sumDollars++;
            sumCents = sumCents - 100;
        }
        Money m3 = new Money(sumDollars, sumCents);
        return m3;
    }
    public static Money subtract(Money m1, Money m2)
    {
        int differenceDollars, differenceCents;
        differenceDollars = m1.getDollars() - m2.getDollars();
        if (differenceDollars < 0)
        {
            differenceDollars = 0;
        }
        differenceCents = m1.getCents() - m2.getCents();
        if (differenceCents < 0)
        {
            differenceDollars--;
            differenceCents = differenceCents + 100;
        }
        Money m3 = new Money(differenceDollars, differenceCents);
        return m3;
    }
    public Money add(Money other)
    {
        int sumDollars, sumCents;
        sumDollars = this.getDollars() + other.getDollars();
        sumCents = this.getCents() + other.getCents();
        if (sumCents >= 100)
        {
            sumDollars++;
            sumCents = sumCents - 100;
        }
        Money m3 = new Money(sumDollars, sumCents);
        return m3;
    }
    public Money subtract(Money other)
    {
        int differenceDollars, differenceCents;
        differenceDollars = this.getDollars() - other.getDollars();
        differenceCents = this.getCents() - other.getCents();
        if (differenceDollars < 0)
        {
            differenceDollars = 0;
        }
        differenceCents = this.getCents() - other.getCents();
        if (differenceCents < 0)
        {
            differenceDollars--;
            differenceCents = differenceCents + 100;
        }
        Money m3 = new Money(differenceDollars, differenceCents);
        return m3;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome! This is World of Balances."); // Not handling invalid values if passed into anything with parameters
        Money suryaBalance = new Money(45, 80); 
        System.out.println("Player 1's (Surya) Balance Is: " + suryaBalance.toString());
        Money mrPolaccoBalance = new Money(90000, 80);
        System.out.println("Player 2's (Mr. P) Balance Is: " + mrPolaccoBalance.toString());

        Money spongebobBalance = new Money();
        spongebobBalance = suryaBalance.add(mrPolaccoBalance);
        suryaBalance.setDollars(0);
        suryaBalance.setCents(0);
        mrPolaccoBalance.setDollars(0);
        mrPolaccoBalance.setCents(0);
        System.out.println("Player 3, Spongebob, has stolen Surya and Mr. P's balances, and now has: " + spongebobBalance.toString());
        System.out.println("Are Mr. P and Surya's balances equal now? " + suryaBalance.equals(mrPolaccoBalance));

        suryaBalance.setDollars(200);
        mrPolaccoBalance.setDollars(500);
        Money suryaMrPolaccoBalance = Money.add(suryaBalance, mrPolaccoBalance);
        suryaBalance.setDollars(0);
        mrPolaccoBalance.setDollars(0);
        System.out.println("Surya has gained $200, and Mr. Polacco has gained $500, lets add them to suryaMrPolaccoBalance! That new balance now has: " + suryaMrPolaccoBalance.toString());
        
        Money apTestFee = new Money(199, 99);
        suryaMrPolaccoBalance = suryaMrPolaccoBalance.subtract(apTestFee);
        suryaMrPolaccoBalance = Money.subtract(suryaMrPolaccoBalance, apTestFee);
        System.out.println("Surya has to pay for his AP CS A exam test fees ($199.99) now, but CollegeBoard double charged him! He is upset. suryaMrPolaccoBalance is now: " + suryaMrPolaccoBalance.toString());
        System.out.println("That's it for now, World of Balances is over with Spongebob winning! He had final balance: " + spongebobBalance.toString());
    }
}
