package les_4;

class Park{
    public Atr atr;
    class Atr{
        private String infoatr;
        private int timeon;
        private int timeoff;
        private int price;
        public Atr (String infoatr, int timeon, int timeoff, int price){
            this.infoatr = infoatr;
            this.timeon = timeon;
            this.timeoff = timeoff;
            this.price = price;
        }
        public void information(){
            System.out.println("Атракцион: " + infoatr + ". График работы: с " + timeon + " до " + timeoff
                    + ". Цена билета: " + price);
        }
    }
}

