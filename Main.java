public class Main {
   public static void main(String[] args) {
    int y = 0;
    int x = 0;
    while (x<1000)
{
    if (x%3==0 || x%5==0) 
    {
        y+=x;
    }
   
    x++;
}
System.out.println(y);

}
}
