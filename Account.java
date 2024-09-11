
package claire;

public class Account {
    
       int id;
         String firstname;
         String lastname;
         String email;
         String username;
         String password;

    public Account(int id, String firstname, String lastname, String email, String username, String password){
      
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.password = password;
    }
 public void displayAccountInfo(){
       
        System.out.println("ID: " + id);
        System.out.println("first name: " + firstname);
        System.out.println("last name: " + lastname);
        System.out.println("email: " + email);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("-----------------------");
    }
}


