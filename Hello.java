class Hello 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int x;
        x=5;
        System.out.println(x);
        x=2*x+5;
        System.out.println(x);
        
        int y=f(x); 
        System.out.println(y);
    }
    
    public static int f(int x)
    {
        int ans=2*x+5;
        return ans;
    }
}