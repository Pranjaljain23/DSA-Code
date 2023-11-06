class TrappedRainWater {

    static int TrappedWaterQuantity (int[] height) {
        int n = height.length;
        int TrappedWatter = 0;


        //Left max boundary for every element
        int[] LeftMax = new int[n];
        LeftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i - 1]);
        }


        //Right max boundary for every element
        int[] RightMax = new int[n];
        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            //Water Level for every bar
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);

            //Trapped water over every bar
            TrappedWatter += waterLevel - height[i];
        }

        return TrappedWatter;
    }
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappedWaterQuantity(height));
    }
}