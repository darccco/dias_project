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

        DescriptionFilter desc=new DescriptionFilter();
        AddressFilter addr=new AddressFilter();


        pipe.addFilter(addr);

        pipe.addFilter(desc);



        Scanner scanner = new Scanner(new File("/Users/darko/Desktop/podatoci.csv"));

        scanner.useDelimiter(";");


      while (scanner.hasNextLine()){
            String line = pipe.runFilter(scanner.nextLine());
            if (!line.equals(""))
                System.out.println(line);
        }
    }
}
