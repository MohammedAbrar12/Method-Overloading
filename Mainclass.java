class insta
{
void status(int no)
{
System.out.println("how many images"+no);
}
void status(String str)
{
System.out.println(" which images and videos" +str);
}
void status(int no,String str)
{
System.out.println("how many images"+no+"  which images and videos" +str);
}}
class Mainclass
{
public static void main(String[]args)
{
insta i1=new insta();
i1.status(1);
i1.status("flowers");
i1.status(2,"rose");
}}





