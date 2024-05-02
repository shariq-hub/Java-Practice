publi class NumbersOfOccurence{
  public static void main(String[] args){
    //By Using HashMap To Find Numbers of Occurence
        String s = "helloworld";
        Map<Character, Integer> freqMap = new HashMap<> (); 

        for(char c: s.toCharArray()){
            if(freqMap.containsKey(c)){
                freqMap.put(c, freqMap.get(c)+1);
            }
            else{
                freqMap.put(c, 1);
            }
        }
        System.out.println(freqMap);



        //By Using Stream API To Find Numbers of Occurence
        List<Character> list=new ArrayList<>();
        list.add('h');
        list.add('e');
        list.add('l');
        list.add('l');
        list.add('o');
        list.add('w');
        list.add('o');
        list.add('r');
        list.add('l');
        list.add('d');


}
      Map<Object,Long>  data= list.stream()
        .collect(Collectors.groupingBy(p-> p, Collectors.counting()));

        System.out.println(data);
}
}
