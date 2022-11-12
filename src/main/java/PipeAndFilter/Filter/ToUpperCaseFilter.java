package PipeAndFilter.Filter;

import PipeAndFilter.Filter.Filter;

public class ToUpperCaseFilter implements Filter<String> {

    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
}
