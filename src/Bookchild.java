public class Bookchild extends Book{
    static final String bookname="Java is Good";

    public static void main(String args[]){
        Bookchild bcojb=new Bookchild();
        //bookname is declared as static final and it's value can't be changed
        bcojb.bookname="";
        //Bookchild inherits Book's 2.0 price, not 0.9 price from Product
        System.out.println(bcojb.getFormattedPrice(20.0));
    }

}
