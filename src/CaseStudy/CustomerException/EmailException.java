package CaseStudy.CustomerException;

public class EmailException extends Exception{
    public EmailException(String messenger){
        super(messenger);
    }
}