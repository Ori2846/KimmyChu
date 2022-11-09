class College {

    private  String name;
    private  int    ar; // acceptance rate
    private  int    cost; // annual cost
    private  int    income; // median income 10 years after
    private  String type; // private or public
    private  int    satL;   // SAT score lower bound
    private  int    satH;  // SAT score upper bound


    College(String name, int ar, int cost, int income,
            String type, int satL, int satH){
        this.name   = name;
        this.ar     = ar;
        this.cost   = cost;
        this.income = income;
        this.type   = type;
        this.satL   = satL;
        this.satH   = satH;
    }

    public int getAR() {
        return this.ar;
    }
    public String getType() {
        return this.type;
    }
    public int getIncome() {
        return this.income;
    }
    public int getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }

    public String toString() {
        String s = "";
        s+=" **** "+name+"\n";
        s+="    * Income: "+income+"\n";
        return s;
    }
    public boolean equalz(College a) {
        return (Math.abs( a.ar-a.ar) < 5);


    }

}
