package String;

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> nm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            nm.put(c, nm.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> kk=new ArrayList<>(nm.entrySet());
        Collections.sort(kk, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1, Map.Entry<Character,Integer> e2)
            {
                return e2.getValue()-e1.getValue();
            }
        });
        StringBuilder ans=new StringBuilder();
        for(Map.Entry<Character,Integer> itera: kk)
        {
            char key=itera.getKey();
            int val=itera.getValue();
            //System.out.println(key+" "+val);
            for(int i=1;i<=val;i++)
            {
                ans.append(key);
            }
        }
        return ans.toString();
    }
}