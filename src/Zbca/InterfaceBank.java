package Zbca;
interface Bank{
    float rateOfInterest();
}
class SBI implements Bank{
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB implements Bank{
    public float rateOfInterest()
    {
        return 9.7f;
    }
}
class Testinterface2{
    public static void main(String[] args){
        Bank b1=new SBI();
        System.out.println("ROI of SBI: "+b1.rateOfInterest());
        Bank b2=new PNB();
        System.out.println("ROI of PNB: "+b2.rateOfInterest());
    }
}