
package claire;

import java.util.Scanner;

public class Claire {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
     grades[] gr = new grades [100];
       System.out.println("Enter no. of students: ");
       
       
       int nums = sc.nextInt();
        
        for (int i=0; i< nums; i++){
            
            System.out.println("Enter details of student "+(i+1)+":");
            
            System.out.print("ID:");
            int id = sc.nextInt();
            System.out.print("Name:");
            String name = sc.next();
            System.out.print("Prelim:");
            double pr = sc.nextDouble();
            System.out.print("Midterm:");
            double md = sc.nextDouble();
             System.out.print("Prefinal:");
             double pf = sc.nextDouble();
            System.out.print("Final:");
            double fn = sc.nextDouble();
            
             gr[i] = new grades();
           gr[i].addGrades(id, name, pr, md, pf, fn);
        }
        
        for(int i=0; i< nums; i++){
            gr[i].viewGrades();
        
        
     
                   
//        grades gr = new grades();
//        gr.addGrades(1011,"Claire", 1.2, 1.4,1.3, 1.2);
//        gr.viewGrades();
        
//        netpay np = new netpay();
//        np.getPay();
//        
    //    product pr = new product();
     //   pr.addProduct(10011,"soap", 20, 30, 20);
      //  pr.viewProduct();
     
       //  Scanner sc = new Scanner(System.in);
       // Account account = new Account(1, "firstname", "lastname", "email", "username", "password");
       // account.displayAccountInfo();
        
       //  System.out.println("id: \n");
        // sc.nextInt();
        //System.out.println("first name: \n");
        // sc.nextInt();
        //System.out.println("last name: \n");
      //   sc.nextInt();
      //  System.out.println("email: ");
      //   sc.nextInt();
     ///   System.out.println("username: ");
      //   sc.nextInt();
     //   System.out.println("password: ");
     //    sc.nextInt();
     //   System.out.println("-----------------------");
       
       // Salary Salary = new Salary();
     //   Salary.addsalaries(101, " Claire", 20.0, 20,100.0);
      //  Salary.getsalaries();

     //   Salaries Salaries = new Salaries();
       // Salaries.addsalaries(101, "Claire", 60.0, 35,150.0);
     //   Salaries.getsalaries();

     
     
   
   
    

    
    
        }
    }
}