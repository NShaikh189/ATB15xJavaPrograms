package ENUM;

public enum Months {


    JAN("Januray"),
    FEB("Febuaray"),
    MAR("March"),
    APR("April"),
    MAY("May");

    private String monthName;

    Months(String monthName)
    {
        this.monthName = monthName;
    }

    public String getMonthName()
    {
        return  this.monthName;
    }

}


