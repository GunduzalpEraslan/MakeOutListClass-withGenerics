public class Main {
    public static void main(String[] args) {
        List<Integer> List = new List<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);
        List.add(80);
        List.add(90);

        System.out.println("Number of elements in the array: "+List.size());

         System.out.println("Array Capacity: "+List.getCapacity());

         System.out.println("Value at the entered index: "+List.get(1));

         System.out.println("After deletion : "+ List.remove(4));

         System.out.println("After replacing the element in the index :"+List.set(2, 500));

         System.out.println("My list: "+List.toString());

         System.out.println("index of entered data in array "+List.indexOf(90));

        System.out.println("last index of: "+List.lastIndexOf(80));

         System.out.println(List.isEmpty());

         Object[] array=List.toArray();
          System.out.println(array[0]);

         System.out.println(List.subList(1, 1));

         System.out.println(List.contains(8));

    }

}
