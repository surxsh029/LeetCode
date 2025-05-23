class Solution {

    private List<Integer> row(int row){
        long ans =1;

        List <Integer> ansRow=new ArrayList<>();

        ansRow.add(1);

        for(int i =1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            list.add(row(i));
        }
      return list;

    }
}
