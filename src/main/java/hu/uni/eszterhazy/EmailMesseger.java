package hu.uni.eszterhazy;

public class EmailMesseger extends Messeger {
    public EmailMesseger(Subject subject) {
        super(subject);
    }

    @Override
    protected String displayMessage() {
        try{
            attemptToSendEmail(this.state);
        }catch (Exception e){
            return (e.toString());
        }
        return ("Message has been sent to Email Messeger: " + this.state);
    }

    private void attemptToSendEmail(String messege) {
    }
}
