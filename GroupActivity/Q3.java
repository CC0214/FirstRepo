package JAVA;



interface pen
{

void write();
void refill();
}



interface pencil
{
void write();
void sharpen();
}



class Student implements pen,pencil
{
public void displayStudent() {
System.out.println("Student is writing");
}

@Override
public void sharpen() {
// TODO Auto-generated method stub

}



@Override
public void refill() {
// TODO Auto-generated method stub

}



@Override
public void write() {
// TODO Auto-generated method stub

}
}
public class Q3{
public static void main(String arg[])
{
Student obj = new Student();
obj.displayStudent();
}
}