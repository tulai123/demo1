public class bai20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        try{
            int c= a/b;
            System.out.println("c=" +c);
        }
        catch(ArithmeticException ex) {
            System.out.println("Loi roi");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println("Loi");
            ex.printStackTrace();
        }
        finally{
            System.out.println("Co loi roi ");
        }
        System.out.println("Doan code phia sau");
    }
}
