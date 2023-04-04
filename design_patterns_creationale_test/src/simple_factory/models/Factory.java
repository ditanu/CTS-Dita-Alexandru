package simple_factory.models;

public class Factory {
    public PersonalSpital createObject(TipPersonalSpital tipPersonalSpital, String nume) {
        switch (tipPersonalSpital) {
            case MEDIC:
                return new Medic(nume);
            case ASISTENT:
                return new Asistent(nume);
            case BRANCARDIER:
                return new Brancardier(nume);
            default:
                return null;
        }
    }

    public PersonalSpital createObject(TipPersonalSpital tipPersonalSpital, String nume, int nrPacienti) {
        switch(tipPersonalSpital) {
            case ANESTEZIST:
                return new Anestezist(nume, nrPacienti);
            default:
                return this.createObject(tipPersonalSpital, nume);
        }
    }

}
