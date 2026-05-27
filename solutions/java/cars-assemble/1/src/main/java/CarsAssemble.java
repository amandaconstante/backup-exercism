public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int quant = 221 * speed;
        double prodRate = quant;
        
        if (speed > 4 && speed < 9) {
            prodRate = prodRate * 0.9;
        } else if ( speed == 9 ) {
            prodRate = prodRate * 0.8;
        } else if ( speed == 10 ){
            prodRate = prodRate * 0.77;
        }
        return prodRate;
    }

    public int workingItemsPerMinute(int speed) {
        int prodHour = (int) this.productionRatePerHour(speed);
        return (int) prodHour / 60;
    }
}
