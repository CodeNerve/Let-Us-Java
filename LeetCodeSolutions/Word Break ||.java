// https://leetcode.com/problems/word-break-ii/

class Solution {
    
    public void genWords(Set<String> set,String s,int index,List<String> res,List<String> list){
        // System.out.println(index);
        if(index==s.length()){
            
            String sentence="";
            int n=list.size();
            
            for(int i=0;i<n-1;i++){
                sentence+=list.get(i);
            }
            
            sentence+=list.get(n-1).trim();
            res.add(sentence);
            return;
        }
        
        for(int i=index;i<s.length();i++){
            String sub=s.substring(index,i+1);
            if(set.contains(sub)){
                // System.out.println(sub);
                list.add(sub+" ");
                genWords(set,s,i+1,res,list);
                list.remove(list.size()-1);
            }
        }
    }
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        List<String> res=new ArrayList<>();
        genWords(set,s,0,res,new ArrayList<>());
        return res;
    }
}
