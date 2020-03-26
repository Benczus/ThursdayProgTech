package hu.uni.eszterhazy;

public class PhoneMesseger extends Messeger {
    @Override
    protected String displayMessage() {

        try{
            attemptToSendPhoneMessege(this.messege);
        }catch (Exception e){
            return (e.toString());
        }
        
        return("Message has been sent to Phone Messeger: " + this.messege);
    }

    private void attemptToSendPhoneMessege(String messege) {
    }
}
