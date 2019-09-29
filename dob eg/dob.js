var now = new Date();
var today = new Date(now.getYear(), now.getMonth(), now.getDate());
var yearNow = now.getYear();
var monthNow = now.getMonth();
var dateNow = now.getDate();
var dob = new Date("1990", "05", "28");  // Input : year - month - day
var yearDob = dob.getYear();
var monthDob = dob.getMonth()-1;
var dateDob = dob.getDate();
var age = {};
var yearAge = yearNow - yearDob;
if (monthNow >= monthDob)
    var monthAge = monthNow - monthDob;
else {
    yearAge--;
    var monthAge = 12 + monthNow - monthDob;
}
if (dateNow >= dateDob)
    var dateAge = dateNow - dateDob;
else {
    monthAge--;
    var dateAge = 31 + dateNow - dateDob;

    if (monthAge < 0) {
        monthAge = 11;
        yearAge--;
    }
}
var isLeap = 0;
if (yearNow % 4 == 0) {
    if (yearNow % 100 == 0) {
        if (yearNow % 400 == 0) {
            isLeap = 1;
        }
    } else {
        isLeap = 1;
    }
}

var totalDaysInYear = dateAge;
for (var i = 1; i <= monthAge; i++) {
    var nextMonth = (monthDob + i);
    if (nextMonth%11== 1 || nextMonth%11 == 3 || nextMonth%11 == 5 || nextMonth %11== 7 || nextMonth%11 == 8 || nextMonth%11 == 10) {
        totalDaysInYear += 31;
    } else {
        if(nextMonth%11 == 2 && isLeap == 1) {
            totalDaysInYear += 29
        } else {
            if(nextMonth%11 == 2) {
                totalDaysInYear += 28;
            } else {

                totalDaysInYear += 30;
            }
        }
    }
}

age = {
    years: yearAge,
    months: monthAge,
    days: dateAge,
    totalDays: totalDaysInYear
};
ageString = age.years + " Years " + age.totalDays + " days";
alert(age.years + " Years " + age.months + " months " + age.days+ " days " + " OR "+ageString);
