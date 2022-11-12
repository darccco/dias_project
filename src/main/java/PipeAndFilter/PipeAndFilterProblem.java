package PipeAndFilter;

import PipeAndFilter.Filter.ToUpperCaseFilter;
import PipeAndFilter.Filter.addressFilter;
import PipeAndFilter.Filter.takeDescription;
import PipeAndFilter.Pipe.Pipe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PipeAndFilterProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();

        ToUpperCaseFilter toUpperCaseFilter=new ToUpperCaseFilter();
       // pipe.addFilter(toUpperCaseFilter);

        takeDescription desc=new takeDescription();
        addressFilter addr=new addressFilter();


        pipe.addFilter(addr);

        pipe.addFilter(desc);



        Scanner scanner = new Scanner(new File("/Users/darko/Desktop/podatoci.csv"));

        scanner.useDelimiter(";");


        while (scanner.hasNextLine()){
            if (!scanner.equals(""))
            System.out.println(pipe.runFilter(scanner.nextLine()));
        }
    }
}
