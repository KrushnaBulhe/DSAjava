public class trappingrainwater {
    public static int totalwater(int Height[]) {
        // calculation of left max boundary by using array(auxillary array)
        int leftmax[] = new int[Height.length];
        leftmax[0] = Height[0];
        for (int i = 1; i < Height.length; i++) {
            leftmax[i] = Math.max(Height[i], leftmax[i - 1]);
        }
        // calculation of right max boundary by using array(auxillary array)
        int rightmax[] = new int[Height.length];
        rightmax[Height.length - 1] = Height[Height.length - 1];
        for (int i = Height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(Height[i], rightmax[i + 1]);
        }

        // loop
        int TrappedWater = 0;
        for (int i = 0; i < Height.length; i++) {
            // waterlevel = min(left_max_boundary,right_max_boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trapped water = waterlevel - height[i]
            TrappedWater += waterlevel - Height[i];

        }
        return TrappedWater;

    }

    public static void main(String[] args) {
        // int Height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int Height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("total water trapped in that columns are = " + totalwater(Height));

    }

}
