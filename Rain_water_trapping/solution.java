
public class solution {
    public int trap(int[] height) {
        int lmax[] = new int[height.length];
        lmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            lmax[i]= Math.max(height[i],lmax[i-1]);
        }
        int rmax[] = new int[height.length];
        rmax[height.length-1]= height[height.length-1];
        for(int i = height.length-2;i>=1;i--){
            rmax[i]= Math.max(height[i],rmax[i+1]);
        }
        int trappedwater = 0,total = 0;
        for(int i=0;i<height.length;i++){
            int waterlevel = Math.min(lmax[i],rmax[i]);
            trappedwater =(waterlevel-height[i]);
            if(trappedwater<0)
            {
                trappedwater=0;
            }
            total= total+trappedwater;
        }
        return total;
    }
}
