public class BonusMilesService {
    public int calculate(int price) {
        int rub = 20;
        int my = price / rub;
        int result;
        if (price > rub) {
           result = 0;
       } else {
           result = price / rub;
       }
       return result = my;
    }

}
