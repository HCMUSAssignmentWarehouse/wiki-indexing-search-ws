package main.java;

import main.java.lucene.LuceneTester;
import org.apache.lucene.queryparser.classic.ParseException;

import java.io.IOException;

/**
 * Created by Genius Doan on 4/20/2017.
 */
public class Application
{
    public static void main(final String[] args) throws Exception {
        LuceneTester tester;
        try {
            tester = new LuceneTester();
            tester.createIndex();
            tester.search("Mohan");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}