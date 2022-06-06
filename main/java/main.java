import org.w3c.dom.Entity;
import pets.Cate;
import pets.Doggo;
import pets.Pet;


import java.awt.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void addComponent(String component, Container container  ) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clazz= Class.forName(component);
        Object obj=clazz.getConstructor().newInstance();
        container.add((Component) obj);
    }
    public static Map<String,Integer> siruri(String[] tablou){
        Map<String,Integer> map=new HashMap<>();
        for (String string:tablou)
        {
            if (map.get(string)!=null)
            {
                int currCount=map.get(string);
                currCount++;
                map.replace(string,map.get(string),currCount);
            }
            else
                map.put(string,1);
        }
        return map;
    }
    public static void main(String[] args) throws IOException {
//       int a=3;
//       int b=(a=2)*a;//4
//       int c=b*(b=5);//20
//        System.out.println(a+" "+b+" "+" "+c);
//
//        Set<Pet> pets=new HashSet<>();
//        pets.add(new Doggo("Spark",12));
//        pets.add(new Doggo("doggo",20));
//        pets.add(new Cate("Eugenia",2));
//        List<Pet> tempList = new ArrayList<>(pets);
//       // Collections.sort(tempList,(u,v)-> Math.max(u.getAge(), v.getAge()));
//        tempList.sort(Comparator.comparing(Pet::getAge).reversed()  );
//        System.out.println(tempList);
//        System.out.println(        siruri(new String[]{"a","abc","a"}));
        File file=new File("E:\\AN2\\ProiectePA\\test\\src\\persoane.txt");
        FileReader fileReader=new FileReader(file);
        InputStream inputStream=new FileInputStream( file);
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        bufferedReader.lines().forEach(line-> System.out.println(line));

    }
}
