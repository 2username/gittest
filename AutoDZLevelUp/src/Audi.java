
public class Audi extends Germany{

    @Override
    String getDeveloper() {
        return null;
    }

    @Override
    String setmark() {
        return null;
    }



    @Override
    public void increaseGas() {

    }

    @Override
    public void slowGo() {

    }

    @Override
    public void breaking() {

    }

    @Override
    public void increaseStop() {

    }

    @Override
    public void decreasePrice() {

    }

    @Override
    public void fastGo() {

    }

    @Override
    public void highPrice() {

    }

    @Override
    public void highGas() {

    }

    @Override
    void go(int year, String nameCountry) {
        nameCountry = this.nameCountry;
        super.go(year, nameCountry);
    }
}
