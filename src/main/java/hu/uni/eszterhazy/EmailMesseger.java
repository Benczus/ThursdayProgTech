package hu.uni.eszterhazy;

public class EmailMesseger extends Messeger {
    @Override
    protected String displayMessage() {
        try{
            attemptToSendEmail(this.messege);
        }catch (Exception e){
            return (e.toString());
        }
        return ("Message has been sent to Email Messeger: " + this.messege);
    }

    private void attemptToSendEmail(String messege) {
    }
}
