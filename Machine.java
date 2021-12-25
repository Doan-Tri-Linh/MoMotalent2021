public class Machine {
        private double money;

        public Machine(double money) {
                this.money = money;
        }
        public Machine(){}

        public double getMoney() {
                return money;
        }

        public void setMoney(double money) {
                this.money = money;
        }

        public double nap( double tiennap){
                money = money + tiennap ;
                return tiennap;
        }
        public double mua(double tienmua){
                money = money - tienmua;
                return money;
        }
}
