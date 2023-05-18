package Special_Classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelperClasses {

    public static void main(String[] args)
    {

//        // Scanner class to take the input from the user
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("enter your string");
//        String str1= scanner.nextLine();
//        int num1= scanner.nextInt();
//        System.out.println(str1);
//        System.out.println(num1);
//
//        //Universal Unique Identifier (UUID)(to generate random ID)
//        System.out.println(UUID.randomUUID());
//
//        //StringBuilder to create modifiable string so if we concatenate to this string it will modify in this object not to create another object
//        StringBuilder stringBuilder= new StringBuilder("hi");
//        stringBuilder.append("salma");
//        System.out.println(stringBuilder);
//
//        //reverse srting
//        String s1="salma";
//        char[] c= s1.toCharArray();
//        for(int i=s1.length()-1; i>=0;i--)
//        {
//            System.out.print(c[i]);
//        }
//        System.out.println("---------------------");
//
//        //Enhanced for loop (this will print every element in the array)
//        for(char c1: c)
//        {
//            System.out.print(c1);
//        }
//
//        //Array of object(it can accept different types of data)
//        Object[] arr={"salma",23,3.4};

        //Arraylist(we use it if we need to create array without defining the length(Dynamic Array) and also using another methods)
//        ArrayList<String> str= new ArrayList<String>();
//        str.add("hi");
//        str.add("salma");
//        str.contains("tarek");
//        System.out.println(str.get(1));
//        str.set(1,"shafik");
//        List<String> str2 =str.subList(0,1);
//        System.out.println(str.contains("hi"));
//        System.out.println(str2);
//        System.out.println(str);
//
//        //ListIterator
//        ListIterator<String> itr= str.listIterator();
//        ListIterator<String> itr1= str.listIterator(str.size());
//
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        while(itr1.hasPrevious())
//        {
//            System.out.println(itr1.previous());
//        }
//
//        //LinkedList
//
//        LinkedList<Integer> list= new LinkedList<Integer>();
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//
//        // to display the head and the tail of the linkedlist
//        System.out.println(list.peekFirst());
//        System.out.println(list.peekLast());
//
//        // to delete the head and the tail of the linkedlist
//        System.out.println(list.pollFirst());
//        System.out.println(list.pollLast());
//        System.out.println(list);
//
//        //HashSet (it is like ArrayList but it can't have duplicate values and it doesn't return the data in order)
//        HashSet<String> hashSet=new HashSet<String>();
//        HashSet<String> hashSet2=new HashSet<String>();
//        hashSet.add("salma");
//        hashSet.add("tarek");
//        hashSet.add("shafik");
//        hashSet2.add("salma");
//        hashSet2.add("mohamed");
//        hashSet2.add("shafik");
//
//        System.out.println(hashSet);
//
//        // union of hashSet and hashSet2
//        hashSet.addAll(hashSet2);
//        System.out.println(hashSet);
//
//        //Intersection of hashSet and hashSet2
//        hashSet.retainAll(hashSet2);
//        System.out.println(hashSet);
//
//        //LinkedHashSet is an ordered version of HashSet
//        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
//        linkedHashSet.add("s");
//        linkedHashSet.add("a");
//        linkedHashSet.add("l");
//        linkedHashSet.add("m");
//
//        System.out.println(linkedHashSet);

        //TreeSet (the data is sorted on it ascending)
//        Set<Integer> set = new TreeSet<Integer>();
//        set.add(50);
//        set.add(100);
//        set.add(0);
//        set.add(30);
//
//        System.out.println(set);

        //HashMap (It stores data in key and value pairs)

        HashMap<Integer,String> map= new HashMap<Integer,String>();

        map.put(1,"salma");
        map.put(2,"noor");
        map.put(3,"mohamed");

        Set set1= map.keySet();
        Set set2= map.entrySet();
        Collection<String> set3= map.values();

        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // to iterate in entryset in map
        for(Map.Entry<Integer,String> x : map.entrySet())
        {
            System.out.println(x);
        }

        /********** Regular Expression *************/
        String s1= "abc*"; // c should be exist 0 or more times
        String s3= "abc+"; // c should be exist 1 or more times
        String s4= "abc?"; // c may be exist or not
        String s5= "abc{3}"; // c should be exist 3 times
        String s6= "abc(de){2,5}"; // de should be exist at least 2 times and max 5 times
        String s2= "abcdedededede";
        System.out.println(s2.matches(s6));

        /* \\d to present single digit
           \\w to present single digit , word , _
           \\s to present single whitespace
           \\D to present anything other than digits
           \\W to present special character
        */

        String patt = "\\d{4}";
        String sttr1= "5789";
        System.out.println(sttr1.matches(patt));

        String patt1 = "[abcd]ef"; // means any character inside the brackets should come first then ef
        String patt2 = "[a-zA-Z]{3}"; // means any character from a-z or from A-Z
        String patt3 = "[^a-zA-Z]{3}"; // means anything except from a-z or from A-Z
        String sttr2= "0@#";
        System.out.println(sttr2.matches(patt3));

        /*
         // . Dot means any single character
         // .* means any number of characters
        */

        // to find some pattern from a string
        String strr3= "it costs $24.00 and then the discount is $5.5";
        String patt4= "\\${1}\\d{1,}\\.\\d{1,}";
        Pattern p = Pattern.compile(patt4);
        Matcher m = p.matcher(strr3);
        while (m.find())
        {
            System.out.println(m.group());
        }






    }

}
