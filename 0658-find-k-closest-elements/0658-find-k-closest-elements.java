class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        int lb = arr.length;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target)
            {
                high = mid - 1;
                lb = Math.min(lb,mid);
            }
            else
            {
                low = mid + 1;
            }
            
        }
        int i = lb-1;
        int j = lb;

        while(k != 0)
        {
            if(i < 0)
            {
                list.add(arr[j]);
                j++;
            }
            else if(j>arr.length-1)
            {
                list.add(arr[i]);
                i--;
            }
            else
            {
                int diff1 = Math.abs(arr[i] - target);
                int diff2 = Math.abs(arr[j] - target);
                if(diff1 == diff2)
                {
                    if(arr[i] < arr[j])
                    {
                        list.add(arr[i]);
                        i--;
                    }
                    else
                    {
                        list.add(arr[j]);
                        j++;
                    }
                }
                else if(diff1 < diff2)
                {
                    list.add(arr[i]);
                    i--;
                }
                else 
                {
                    list.add(arr[j]);
                    j++;
                }
                
            }
            k--;
        }
        Collections.sort(list);
        return list;
    }
}