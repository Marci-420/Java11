public class SIM {
    private String number, pin, puk;

    public SIM(String number, String pin, String puk) throws Exception {
        this.setNumber(number);
        this.setPin(pin);
        this.setPuk(puk);
    }

    public String getNumber() {
        return number;
    }

    private void setNumber(String number) throws NumberFormatException, Exception {
        if(number.length() != 9){
            throw new Exception("A telefonszám csak 9 numerikus karakterekből állhat!");
        }
        for(int i = 0; i < number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                throw new NumberFormatException("A telefonszám csak numerikus karakterekből állhat!");
            }
        }
        this.number = number;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) throws NumberFormatException{
        if(this.isPinPuk(pin)){
            this.pin = pin;
        }
        else {
            throw new NumberFormatException("Helytelen PIN kód!");
        }
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) throws NumberFormatException{
        if(this.isPinPuk(puk)) {
            this.puk = puk;
        }
        else{
            throw new NumberFormatException("Helytelen PUK kód!");
        }
    }

    private boolean isPinPuk(String PinPuk){
        if (PinPuk.length() < 4 || PinPuk.length() > 8){
            return false;
        }
        for (int i = 0; i < PinPuk.length(); i++){
            if(!Character.isDigit(PinPuk.charAt(i))){
                return false;
            }
        }
        return true;
    }


    public String toString() {
        return "SIM{" +
                "number='" + this.getNumber() + '\'' +
                ", pin='" + this.getPin() + '\'' +
                ", puk='" + this.getPuk() + '\'' +
                '}';
    }
}
