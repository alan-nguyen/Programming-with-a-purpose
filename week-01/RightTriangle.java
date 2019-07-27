public class RightTriangle
{
    public static void main(String[] args)
    {
        boolean isRightTriangle;
        boolean isPositive;
        boolean isEqualSum;
        int side0 = Integer.parseInt(args[0]);
        int side1 = Integer.parseInt(args[1]);
        int side2 = Integer.parseInt(args[2]);
        
        isPositive = (side0 > 0) && (side1 > 0) && (side2 > 0);
        isEqualSum = (side0*side0 == side1*side1 + side2*side2) || 
                     (side1*side1 == side0*side0 + side2*side2) || 
                     (side2*side2 == side1*side1 + side0*side0);
        isRightTriangle = isPositive && isEqualSum;
        System.out.println(isRightTriangle);
    }
}