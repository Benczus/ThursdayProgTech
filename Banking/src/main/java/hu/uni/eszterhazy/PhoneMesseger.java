package hu.uni.eszterhazy;

public class PhoneMesseger extends Messeger {
    public PhoneMesseger(Subject subject) {
        super(subject);
    }

    @Override
    protected String displayMessage() {

        try{
            attemptToSendPhoneMessege(this.state);
        }catch (Exception e){
            return (e.toString());
        }
        
        return("Message has been sent to Phone Messeger: " + this.state);
    }

    private void attemptToSendPhoneMessege(String messege) {
    }
}
