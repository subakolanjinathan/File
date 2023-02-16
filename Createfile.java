import java.io.*;
public class Createfile
{
public static void main(String args[])
{
File fe=new File("/home/suba/abc.txt");
boolean result;
try
{
result=fe.createNewFile();
if(result)
{
System.out.println("file created"+fe.getCanonicalPath());
}
else
{
System.out.println("file already exits at location"+fe.getCanonicalPath());
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
