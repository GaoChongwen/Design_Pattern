package utils.test;


import utils.Enum.PlantType;

public class Store {
    public static void main(String args[]){
   final String num1 = "q";
   final String num6 = "w";
   final String num8 = "e";
   PlantType e1 = Enum.valueOf(PlantType.class, num1);
   PlantType e6 = Enum.valueOf(PlantType.class, num6);
   PlantType e8 = Enum.valueOf(PlantType.class, num8);
   System.out.println("字符转枚举： " + e1+"\t"+e6.toString()+"\t"+e8.name());
   if(e1.compareTo(e6)>0){
        System.out.println(e1.name()+">"+e6.name());
     }else {
       System.out.println(e1.name()+"<"+e6.name());
   }
   if(e6.compareTo(e8)>0){
     System.out.println(e6.name()+">"+e8.name());
     }else{
     System.out.println(e6.name()+"<"+e8.name());
 }
}
}
