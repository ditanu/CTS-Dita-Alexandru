package factory_method.models;

public class FactoryBrancardieri implements Factory {
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Brancardier(nume);
    }
}
