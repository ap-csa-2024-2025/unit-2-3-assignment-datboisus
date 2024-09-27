public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("con cac", 1));
  }
  public static String firstLastN(String word, int n)
  {
    String output = new String();
    String firstN = word.substring (0,n);
    int indexOfNthToLast = word.length() - n;
    String lastN = word.substring(indexOfNthToLast);

    output = firstN + lastN;
    return output;
  }
}
