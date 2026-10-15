class Solution {
    private int daysFrom1971(int year, int month, int days){
        int totalDays = 0;
        //find year first 
        totalDays += (year - 1971) * 365;
        for(int i=1972; i<year; i+=4){
            if(isLeapYear(i)) totalDays++;
        }

        int feb = isLeapYear(year)? 29 : 28;
        //Sum months and days
        switch(month){
            case 12:
                totalDays += 30;
            case 11:
                totalDays += 31;
            case 10:
                totalDays += 30;
            case 9:
                totalDays += 31;
            case 8:
                totalDays += 31;
            case 7:
                totalDays += 30;
            case 6:
                totalDays += 31;
            case 5:
                totalDays += 30;
            case 4:
                totalDays += 31;
            case 3:
                totalDays += feb;
            case 2:
                totalDays += 31;
            case 1:
                totalDays += days;
        }
        return totalDays;
    }
    private boolean isLeapYear(int year){
        // return (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0));
        return (year % 4 == 0) && ((year % 100 == 0 && year % 400 == 0) || year % 100 != 0);
    }
    public int daysBetweenDates(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0,4));
        int year2 = Integer.parseInt(date2.substring(0,4));

        int mon1 = Integer.parseInt(date1.substring(5,7));
        int mon2 = Integer.parseInt(date2.substring(5,7));

        int days1 = Integer.parseInt(date1.substring(8));
        int days2 = Integer.parseInt(date2.substring(8));
        // System.out.println(year1+", "+year2+", "+mon1+", "+mon2+", "+days1+", "+days2);
        
        
        return Math.abs(daysFrom1971(year1, mon1, days1) - daysFrom1971(year2, mon2, days2));
    }
}
