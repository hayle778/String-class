

class StringDemo
{

public static void main(String arg[]){
    String str = new String("   Hello");
    System.out.println(str);
    System.out.println( str.length()) ;
    System.out.println( str.indexOf( "H" ) );
    System.out.println("Character at = "  + str.charAt( 4 ));
    System.out.println( str.toUpperCase() );
     System.out.println( str.toLowerCase() );
   System.out.println( str.compareTo( "hello" ) );

    System.out.println( str.trim(  ) );

}








}
