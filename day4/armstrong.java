class Armstrong{

    public static boolean strong(int num){
        int count = 0;
        for(int i=num; i>0; i/=10) count++;
        System.out.println(count);

        int strong = 0;

        for(int i=num; i>0; i/=10) strong +=  ((int)Math.pow(i%10, count));
        System.out.println(strong);

        if(num == strong) return true;
        else return false;
    }
    public static void main(String args[]) {
        
        int num = 153;

        System.out.println(strong(num) == true?"Is strong":"Not strong");
      
    }
}
