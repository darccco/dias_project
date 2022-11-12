package PipeAndFilter.Filter;

import PipeAndFilter.Filter.Filter;

public class takeDescription implements Filter<String> {
    @Override
    public String execute(String input) {

        if(input.equals("")){
            return "";
        }

        String[] descriptionArea= input.split(";");

        if(descriptionArea[2].equals("Транспортна служба") || descriptionArea[2].equals("·")){
            return "";
        }

        return input;
    }
}
