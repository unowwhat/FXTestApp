public class ExcExample {
    private class TooBigExc extends Throwable{
        String customMessage;

        TooBigExc(String customMessage){
            this.customMessage = customMessage;
        }

        public String info() {
            return this.customMessage;
        }
    }
    public void checkNumber(int number){
        try{
            System.out.println(number);
            if (number > 5) throw new TooBigExc("Число больше пяти");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } catch (TooBigExc tooBigExc){
            System.out.println("number > 5");
            System.out.println(tooBigExc.info());
        } finally {
            System.out.println("finally");
        }

    }

}
