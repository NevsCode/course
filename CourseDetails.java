/*
*name: neville 
*surname: mpiana
*student number: 20128656
*/
import java.util.Random; // 

import javax.swing.JOptionPane;//


public class CourseDetails {
    /*
    *declaring that it going to be used through the program
    *declaring the variables as static so that it can be used in any called method
    */
    static String nameS;
    static String nameW;
    static String nameD;
    
    static int studentsnumberS;
    static int studentsnumberW;
    static int studentsnumberD;
    
    static String lecturernameS;
    static String lecturernameW;
    static String lecturernameD;
    
    static int venues;
   
    /*
    *setting and geting the variable for variables i declared
    *get the variable so that it can be called and print out  
    */
    public void SetcourseName(String Name)
    {
        nameS = Name;
    }
    public String GetcourseName()
    {
        return nameS;
    }
    public void SetnameW(String Name)
    {
        nameW = Name;
    }
    public String GetnameW()
    {
        return nameW;
    }
    public void SetothercourseName(String Name)
    {
        nameD = Name;
    }
    public String GetothercourseName()
    {
        return nameD;
    }
    public void SetStudentsNumber(int Number)
    {
        studentsnumberS = Number;
    }
    public int GetStudentsNumber()
    {
        return studentsnumberS ;
    }
    public void Setnumber(int Number)
    {
        studentsnumberW = Number;
    }
    public int Getnumber()
    {
        return studentsnumberW;
    }
    public void SetstdNumber(int Number)
    {
       studentsnumberD = Number; 
    }
    public int GetstdNumber()
    {
        return studentsnumberD;
    }
    public void SetlecturerName(String Name)
    {
        lecturernameS = Name;
    }
    public String GetlecturerName()
    {
        return lecturernameS ;
    }
    public void SetProNameW(String Name)
    {
        lecturernameW = Name;
    }
    public String GetProNameW()
    {
        return lecturernameW;
    }
    public void SetTCHName(String Name)
    {
        lecturernameD = Name;
    }
    public String GetTCHName()
    {
        return lecturernameD;
    }
  
public static void AssignVanue()   //calling a method 
{
/*
*declarering the array to ramdomly generater venue between number three 
*out puting the venue and also assigning the venue to the randomer 
*/    
    Random Randomuser = new Random();
    venues = Randomuser.nextInt(3)+1;
    System.out.println(venues);
}
public static void main(String[]args)
{   
    /*
    *declaring variables 
    */
    String response , r;
    r = "n";
  /*
  *using the while loop to check what the users enter it 
  */
 while(!"y".equals(r))
        
    {
       /*
        *if the use enter it not equal to y the while will output the switch statement 
        *if not the use input it not y the program ends
        */
        response = JOptionPane.showInputDialog(null,"select from the following to view the course details:" + "\n 1)" 
        + "DISD" + "\n 2)" +"DIWD"+ "\n 3)"+ "DIDM");
        /*
        *the switch statement going to check on the enter response and output the result 
        */ 
    switch (response) 
    {
        case "1":
            System.out.println();
            Disp();
            break;
        case "2":
            System.out.println();
            Dwid();
            break;
        case "3":
            System.out.println();
            Didm();
            break;
        default:
            System.out.println("you have enter a wrong number continue to try again");
            
        
    }
    /*
    * the user's enter it going to be assign to variable
    */
    r = JOptionPane.showInputDialog("would you like to exit the application?" +
    "Enter " + "(y)" + "to use the exit or any other key to continue");
        
    }
    System.out.println("you have use the exit \nthank you bye"); //the emd of the program
   
      
}
/*
*calling the method
*/
public static void Disp()
{
   
    CourseDetails course = new CourseDetails(); //calling coursedetails so that can get and set the variables
                
    System.out.println("COURSE REPORT");
    
    System.out.println("**********************************************");
    /*
    *set and get the variables that i did set 
    *also outputing it 
    */
    course.SetcourseName("Dipoma Software Development");
    course.SetStudentsNumber(35);
    course.SetlecturerName("Mr Jones");
    
    System.out.println("COURSE: " + course.GetcourseName());
    System.out.println("STUDENT NUMBER: " + course.GetStudentsNumber());
    System.out.println("LECTURER: " + course.GetlecturerName());
    System.out.print("VENUE: ");
    AssignVanue();
    
    System.out.println("***********************************************");
    
}
/*
*calling a method
*/
public static void Dwid()
{
    CourseDetails course = new CourseDetails();
    System.out.println("COURSE REPORT");
    /*
    *set and get the variables that i did set 
    *also outputing it 
    */
    System.out.println("##############################################");
    course.SetnameW(" Diploma in Wed Development");
    course.Setnumber(28);
    course.SetProNameW("Mrs Smith");
    
    System.out.println("COURSE: " + course.GetnameW());
    System.out.println("STUDENT NUMBER: " + course.Getnumber());
    System.out.println("LECTURER: " + course.GetProNameW());
    System.out.print("VENUE: ");
    AssignVanue();
    
    System.out.println("##############################################");

    
}
/*
**calling a method
*/
public static void Didm()
{
    CourseDetails course = new CourseDetails();
    System.out.println("COURSE REPORT");
    
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    /*
    *set and get the variables that i did set 
    *also outputing it
    */
    course.SetothercourseName("Diploma in Data Metrics");
    course.SetstdNumber(39);
    course.SetTCHName("Mr Ntsinga");
    
    System.out.println("COURSE: " + course.GetothercourseName());
    System.out.println("STUDENT NUMBER: " + course.GetstdNumber());
    System.out.println("LECTURER: " + course.GetTCHName());
    System.out.print("VENUE: ");
    AssignVanue();
    
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
}

}

    


    

