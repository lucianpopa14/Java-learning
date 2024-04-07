package src.main.Collections.TakeoutProject;

public interface IntUserInputRetriever <T>{
    public T produceOutputOnUserInput(int selection) throws IllegalArgumentException;
}
