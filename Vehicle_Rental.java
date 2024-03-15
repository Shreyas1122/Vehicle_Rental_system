//In java file handling is nothing but a writing and reading with the file

import java.io.*;

class file_handling {
    void writing_in_file(){
        try{
        File file =new File("sheyas.txt");
        FileWriter fileobj =new FileWriter(file);
       fileobj.write("hwello shreyas is here my dear friend go for it");
       fileobj.write("\nThis line is appended in the bhai");
       fileobj.write("\nhujghugufgyftftyftyf vbyhfgyuujggufyg");
       BufferedWriter objjjj=new BufferedWriter(fileobj);
       fileobj.flush(); //this fuction helps to update the data into the file
       fileobj.close(); //closing the file

       FileReader filre = new FileReader(file);
       BufferedReader buff=new BufferedReader(filre); //through buffer reader
     // System.out.println( buff.readLine()); //printing the lines of buffer readere
int r;
      do{
           r=filre.read();
          System.out.print((char)r);

      }while(r!=-1);
      filre.close();
        }
        catch(Exception e){

        }

    }
}
class executionally{
    public static void main(String args[]){
        file_handling object=new file_handling();
        object.writing_in_file();
    }
}
