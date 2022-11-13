package PipeAndFilter.Filter;

import PipeAndFilter.Filter.Filter;

public class DescriptionFilter implements Filter<String> {
    @Override
    public String execute(String input) {

        if(!input.equals("")){
            String[] descriptionArea= input.split(";");

            if(descriptionArea[2].equals("Транспортна служба") || descriptionArea[2].equals("·")){
                return "";
            }
        }

        return input;
    }
}
