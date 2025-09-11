class Solution {
    public String sortVowels(String s) {
        List<Character> ls=new ArrayList<>();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||
            ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') ls.add(ch);
        }
        Collections.sort(ls);
        //System.out.println(ls);
        int k=0;
        if(ls.size()<=0) return s;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||
            ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') str.setCharAt(i,ls.get(k++));
        }
        return str.toString();
    }
}