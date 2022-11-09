class Main{
    public static void main(String[] args) {

        // name, ar, cost, income, type, satL, satH)
        College ucla = new College("UCLA",14, 15000, 73000, "Public", 1300, 1530);

        College usc = new College("USC", 16, 33000, 83000, "Private", 1360, 1510);
/*
        College hmc= new College("Harvey Mudd", 33001, 109000,"Private", 18,1370,1510);
        College columbia = new College("Columbia",23999 ,93000,6, 1500,1560);
        College buw = new College("Boston University", 30000 ,76000,20, 1340,1460);
        College uiuc=new College("UIUC", 14321 ,71539,63, 1220,1450);
        College umaa=new College("University of Michigan Ann Arbor", 14878 ,75842,26, 1340,1520);
        College uofp=new College("University of the Pacific", 28380 ,74214,66, 1130,1360	);
        College uci=new College("UC Irvine", 12209 ,71961,30, 1230,1430);
        College ucb=new College("UC Berk.",  16,32 ,80364,17, 1310,1530);
        College csuf=new College("Cal State Fullerton", 8003 ,54586,68, 1000,1180);
        College cpp=new College("Cal Poly Pomona", 14304 ,63732,65, 1010,1250);
        College cpslo=new College("Cal Poly SLO", 20677 ,80643,34, 1240,1440);
        College csla=new College("Cal State LA", 3302 ,51997,91, 830 ,1060);
        College olin=new College("Olin", 15647,132969,16%,1460,1560);
        College mit=new College("MIT", 16407,111222,7, 1510,1570);
        College harvard=new College("Harvard", 13872,84918,5, 1460,1580);
        College stevns=new College("Stevens Tech", 37211 ,98159,40, 1320,1480);
        College stanford=new College("Stanford", 12894 ,97798,5, 1420,1570);
*/




        System.out.println(ucla);
        System.out.println(usc);

        System.out.println( better(ucla,usc));

        //System.out.println( ucla.equalz(ucla,usc));

    } // END psvm

    public static boolean equals( College a, College b) {
        return (Math.abs( a.getAR()-b.getAR()) < 5);


    }
    public static String better(College a, College b)
    {
        int College_a_Points =0;
        int College_b_Points =0;
        String max;
        int AcceptanceRatePoints = (a.getAR() <= b.getAR()) ? College_a_Points++ : College_b_Points;
        int Cost = (a.getCost() <= b.getCost()) ? College_a_Points++ : College_b_Points;
        int Income = (a.getIncome() >= b.getIncome()) ? College_a_Points++ : College_b_Points;
        if(a.getType().equals("Private"))
            College_a_Points++;
        else College_a_Points--;
        if(b.getType().equals("Private"))
            College_b_Points++;
        else College_b_Points--;

        max = (College_a_Points >= College_b_Points) ? "College "+a.getName() + College_a_Points :"College "+b.getName() + College_b_Points;
        System.out.println(College_a_Points);
        System.out.println(College_b_Points);
        return max;
    }


}

