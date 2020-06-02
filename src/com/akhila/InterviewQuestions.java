package com.akhila;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class InterviewQuestions {

    public void q121_lastkLines(int k)
    {
        File file = new File("/Users/akhilajana/Documents/Personal/projects2020/ProjectHelpers/randomTextFile");

        ArrayList<String> arrList = new ArrayList<String>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st=br.readLine()) != null)// Need more clarity
            {
                arrList.add(st);
            }
            for(int i=arrList.size()-k;i<arrList.size();i++){
                System.out.println(arrList.get(i));
            }

        }
        catch (Exception e)
        {
            System.out.println("Exception occurred while printing k lines "+e.getMessage());
        }

    }
}
