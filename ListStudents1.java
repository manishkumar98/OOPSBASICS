public class ListStudents1
{ 
    public static void main (String[] args) 
    { 
        // declares an Array of integers. 
        Student1[] arr; 
  
        // allocating memory for 5 objects of type Student. 
        arr = new Student1[5]; 
  
        // initialize the first elements of the array 
        arr[0] = new Student1(1,"aman","2017AAPS1409H"); 
  
        // initialize the second elements of the array 
        arr[1] = new Student1(2,"vaibhav","2017AAPS1409H"); 
  
        // so on... 
        arr[2] = new Student1(3,"shikar","2017AAPS1409H"); 
        arr[3] = new Student1(4,"dharmesh","2017AAPS1409H"); 
        arr[4] = new Student1(5,"mohit","2017AAPS1409H"); 
  
        // accessing the elements of the specified array 
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Element at " + i + " : " + 
                       " "+arr[i].year+" "+arr[i].roll_no +" "+ arr[i].name); 
    } 
} 