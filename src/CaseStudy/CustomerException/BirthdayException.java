package CaseStudy.CustomerException;

public class BirthdayException extends Exception {
    public BirthdayException (String messenger){
        super(messenger);
    }
}