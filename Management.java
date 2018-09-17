import java.io.*;
class Management
{
    
    
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

 public void addRecords() throws IOException
 {
 
 PrintWriter pw = new PrintWriter(new BufferedWriter(new
 FileWriter("student.txt",true)));
 String name,branch,year,Semester;
 int age;
 float Previous_Semester_Score;
 String s;
 boolean add = false;
 do
 {
  System.out.print("name: ");
  name = br.readLine();
  System.out.print("branch ");
  branch = br.readLine();
  System.out.print("year");
  year = br.readLine();
  System.out.print("Semester ");
  Semester = br.readLine();
  System.out.print("Age ");
  age = Integer.parseInt(br.readLine());
  System.out.print("Previous Year Score in %");
  Previous_Semester_Score = Float.parseFloat(br.readLine());
  pw.println(name);
  pw.println(branch);
  pw.println(year);
  pw.println(Semester);
  pw.println(age);
  pw.println(Previous_Year_Score);
  
  System.out.print("\n want add more records ? (y/n) : ");
  s = br.readLine();
  if(s.equalsIgnoreCase("y"))
  {
   add = true;
   System.out.println();
  }
  else
   add = false;
 }
 while(add);
 pw.close();
 showMenu();
 }
 public void readRecords() throws IOException
 {
 try
 {
  BufferedReader file = new BufferedReader(new
  FileReader("student.txt"));
  String name;
  int i=1;
  while((name = file.readLine()) != null)
  {
   System.out.println("S.No. : " +(i++));
   System.out.println("Name: " +name);
   System.out.println("branch : "+file.readLine());
   System.out.println("year : "+file.readLine());
   System.out.println("Semester" "+file.readLine());
   System.out.println("Age: "+Integer.parseInt(file.readLine()));
   System.out.println("Previous_Year_Score: "+Float.parseFloat(file.readLine()));
   System.out.println();
  }
  file.close();
  showMenu();
 }
 catch(FileNotFoundException e)
 {
  System.out.println("\nERROR file not found");
 }
 }
 public void clear() throws IOException
 {
 PrintWriter pw = new PrintWriter(new BufferedWriter(new
 FileWriter("student.txt")));
 pw.close();
 System.out.println("\nAll Records cleared ");
 for(int i=0;i<1000;i++)
 showMenu();
 }
 public void showMenu() throws IOException
 {
 System.out.print("1 : Add Records\n2 : Display Records\n3 : Clear All Records\n4 : Exit\n\nYour Choice : ");
 int choice = Integer.parseInt(br.readLine());
 switch(choice)
 {
  case 1:
   addRecords();
   break;
  case 2:
   readRecords();
   break;
  case 3:
   clear();
   break;
  case 4:
   System.exit(1);
   break;
  default:
   System.out.println("\nInvalid Choice !");
   break;
 }
 }
 public static void main(String args[]) throws IOException
 {
 Management call = new Management();
 call.showMenu();
 }
    }

