class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        int count=0;
        if(rowIndex==count){
            num.add(1);
            return num;
        }
        num.add(1);
        list.add(new ArrayList<>(num));
        num.clear();
        for(int i=1;i<=rowIndex;i++){
            List<Integer> previous = list.get(list.size() - 1);
            num.add(1);
            for (int j = 1; j < previous.size(); j++) {
                int val = previous.get(j - 1) + previous.get(j);
                num.add(val);
            }
            num.add(1);
            list.add(new ArrayList<>(num));
            num.clear();
        }
        return list.get(rowIndex);
    }
}