package bca;
class Prime {
    public static void main(String args[]) {
        int i,j;
        if(args.length<2) {
            System.out.println("No command line Argruments ");
            return;
        }
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        System.out.println("Prime number between"+num1+"and" +num2+" are:");
        for(i=num1;i<=num2;i++) {
            for(j=2;j<i;j++) {
                int n=i%j;
                if(n==0)
                {
                    break;
                }
            }
            if(i==j) {
                System.out.println(" "+i);
            }
        }
    }
}