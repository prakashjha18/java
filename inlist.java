class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
          List<Integer> intList = new ArrayList<Integer>();
        for (int i : arr)
        {
            intList.add(i);
        }
        
        //Sort the elements such that the element whose difference to x is less comes first
        intList.sort((a,b) ->  Integer.compare(Math.abs(a-x),Math.abs(b-x)));
        
        //Alternative
        // intList.sort((a,b) ->  Math.abs(a-x) - Math.abs(b-x));
        
        //Find sublist of k elements
        intList = intList.subList(0, k);
        
        //Sort them in natural order
        intList.sort(Comparator.naturalOrder());
        
        //Alternative
        //Collections.sort(intList);
        
        //Output
        return intList;
    }
}
