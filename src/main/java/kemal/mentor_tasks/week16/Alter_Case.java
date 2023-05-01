package kemal.mentor_tasks.week16;

import java.io.*;

public class Alter_Case {


    public void alterCase(String mainPath,String outputFileName,String inputFileName){

        StringBuilder sb = new StringBuilder();

        try {
            sb = withBufferedReader(mainPath+inputFileName);
        }catch (IOException e){
            e.printStackTrace();
        }

        boolean flag=true;

        for(int i = 0; i<sb.length();i++){
            if(Character.isLetter(sb.charAt(i))){
                if (flag){
                    sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
                    flag=false;
                }else {
                    sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
                    flag=true;
                }
            }
        }

        sb.setLength(sb.length() - 1);
        withBufferedWriter(mainPath+outputFileName,sb);

    }

    public StringBuilder withBufferedReader(String readFilePath) throws IOException {
        File file = new File(readFilePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String ls = System.getProperty("line.separator");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }

    private void withBufferedWriter(String writePath,StringBuilder writeContent) {
        File file = new File(writePath);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(writeContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
