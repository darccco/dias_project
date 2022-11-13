package PipeAndFilter.Filter;

import PipeAndFilter.Filter.Filter;

public class AddressFilter implements Filter<String> {
    @Override
    public String execute(String input) {

            String[] location = input.split(";");

            if (location[3].startsWith("X") || location[3].startsWith("·") || Character.isDigit(location[3].charAt(0))) {
                return "";
            }
            return input;
    }
}
