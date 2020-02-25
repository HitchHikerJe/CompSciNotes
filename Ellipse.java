public class Ellipse{
   private double major, minor, centerToFoci;
   public Ellipse(double maj, double min){
      major=maj;
      minor=min;
      centerToFoci=Math.sqrt(Math.pow(maj/2,2)-Math.pow(min/2,2));
   }
   public static void main(String[] args){
      Ellipse stuff = new Ellipse(26,10);
      System.out.println("Major Axis: "+stuff.major+"\nMinor Axis: "+stuff.minor+"\nDistance to Foci from Center: "+stuff.centerToFoci);
   }
}