public class countdigit {
    public static void main(String[] args) {
        int n = 30005;
        System.out.println(count(n));
        
    }

    static int count =0;
    public static int count(int n){
        
        if(n==0){
            return count;
        }
        int rem = n%10;

        if(rem==0){
            count++;
        }

        return count(n/10);
        
        
    }
    
}
